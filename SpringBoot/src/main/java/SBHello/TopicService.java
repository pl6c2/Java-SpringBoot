package SBHello;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private  List<Topics> topics=Arrays.asList(
				new Topics(1,"bad","is the best thing world"),
				new Topics(2,"good","good topic but boring"));

	public List<Topics> getTopics() {
		return topics;
	}
	
	public Topics getTopic(String name)
	{
		return topics.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}
	
	
}
