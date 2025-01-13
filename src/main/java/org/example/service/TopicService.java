package org.example.service;

import org.example.model.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Java Intro", "Spring Intro Description"),
            new Topic("Javascript", "Javascript Framework", "Javascript Framework Description")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }
}
