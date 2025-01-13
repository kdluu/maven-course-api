package org.example.service;

import org.example.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Java Intro", "Spring Intro Description"),
            new Topic("Javascript", "Javascript Framework", "Javascript Framework Description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(topic -> topic.getId().toLowerCase().equals(id)).findFirst().orElse(null);
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
