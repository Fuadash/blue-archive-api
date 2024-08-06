package io.gg.foa.bluearchivestudentapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.gg.foa.bluearchivestudentapi.model.StudentRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class ApiController {

    @Autowired
    private DataController dataController; // Lets Spring handle the dependency

    @GetMapping(value = "", produces = "application/json")
    public String getAllStudents() { // TODO: Why does this return a String but the other endpoint returns a ResponseEntity?
        return dataController.getStudentData();
    }

    @GetMapping(value = "/id/{id}", produces = "application/json")
    public ResponseEntity<String> getStudentById(@PathVariable Integer id) throws JsonProcessingException {
        String rawStudentData = dataController.getStudentData();
        ObjectMapper objectMapper = new ObjectMapper();
        List<StudentRoot> responseObject = objectMapper.readValue(rawStudentData, new TypeReference<>() {}); // StudentRoot being the student objects based on the json response
        Optional<StudentRoot> studentMatch = responseObject.stream() // Get the matching student from the ID
                .filter(student -> id.equals(student.getId())).findFirst();
        return studentMatch // Unwrap optional
                .map(student -> {
                    try {
                        return ResponseEntity.status(HttpStatus.OK).body(objectMapper.writeValueAsString(student)); // Converts java object to json format
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing student data");
                    }
                })
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found"));
    }

    @GetMapping(value = "/givenName/{name}", produces = "application/json")
    public ResponseEntity<String> getStudentsByGivenName(@PathVariable String name) throws JsonProcessingException {
        String rawStudentData = dataController.getStudentData();
        ObjectMapper objectMapper = new ObjectMapper();
        List<StudentRoot> responseObject = objectMapper.readValue(rawStudentData, new TypeReference<>() {});
        List<StudentRoot> studentMatch = responseObject.stream() // Get the matching students from the name
                .filter(student -> name.equals(student.getPersonalName())).collect(Collectors.toList());
        if (!studentMatch.isEmpty()) {
            try {
                return ResponseEntity.status(HttpStatus.OK).body(objectMapper.writeValueAsString(studentMatch)); // Converts java object to json format
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing student data");
            }
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
        }
    }

    // TODO: Many more endpoints
    // TODO: Consider having it break more elegantly when out of sync with Schale DB for whatever reason
    // TODO: For the above, maybe a local copy of students.json based on the last successful request would be useful
    // TODO: More robust logging
    // TODO: Some tests, also look up what kind of tests are usually written for APIs
}
