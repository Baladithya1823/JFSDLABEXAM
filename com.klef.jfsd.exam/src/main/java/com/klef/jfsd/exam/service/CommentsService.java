package com.klef.jfsd.exam.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class CommentsService {
    private static final String JSON_PLACEHOLDER_API = "https://jsonplaceholder.typicode.com/comments";

    public List<Map<String, Object>> fetchAllComments() {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object>[] response = restTemplate.getForObject(JSON_PLACEHOLDER_API, Map[].class);
        return Arrays.asList(response);
    }
}
