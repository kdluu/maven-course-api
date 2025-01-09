package org.example.controller;

import org.example.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getlAllTopics(){

        return Arrays.asList(
                new Topic("Spring","Spring Framework","Spring Framework Description"),
                new Topic("Java","Java Intro","Spring Intro Description"),
                new Topic("Javascript","Javascript Framework","Javascript Framework Description")
        );
    }
}
