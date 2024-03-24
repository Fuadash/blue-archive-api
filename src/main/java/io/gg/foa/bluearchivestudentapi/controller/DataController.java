package io.gg.foa.bluearchivestudentapi.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DataController {
    private final RestTemplate restTemplate = new RestTemplate();
    @Cacheable("schaleCache")
    public String getStudentData() {
        String jsonUrl = "https://schale.gg/data/en/students.json";
        return restTemplate.getForObject(jsonUrl, String.class);
    }
}
