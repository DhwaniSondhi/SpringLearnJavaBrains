package org.learn.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.learn.demo.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring","Spring Framework","Spring Framework Description"),
				new Topic("java","Core Java","Core Java Description"),
				new Topic("javascript","Javascript","Javascript Description")
				);
	}
}
