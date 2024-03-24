package io.gg.foa.bluearchivestudentapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.gg.foa.bluearchivestudentapi.model.StudentRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class ApiController {

    @Autowired
    private DataController dataController; // Lets Spring handle the dependency

    @GetMapping("")
    public String getAllStudents() {
        return dataController.getStudentData();
    }

    @GetMapping("/id/{id}")
    public String getStudentById(@PathVariable Integer id) throws JsonProcessingException {
        String rawStudentData = dataController.getStudentData();
        ObjectMapper objectMapper = new ObjectMapper();
        List<StudentRoot> responseObject = objectMapper.readValue(rawStudentData, new TypeReference<>() {}); // StudentRoot being the student objects based on the json response
        Optional<String> studentMatch = responseObject.stream() // Get the name of the student from the ID, TODO: Have this return the entire StudentRoot
                .filter(student -> id.equals(student.getId()))
                .map(StudentRoot::getName).findFirst();
        String result = studentMatch // Unwrap optional
                .map(Object::toString)
                .orElse("Student not found");
        return result;
    }

    // TODO: Many more endpoints
}
