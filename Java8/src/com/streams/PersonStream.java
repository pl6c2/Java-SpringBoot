package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

class Person
{
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}
public class PersonStream {

	public static void main(String[] args) {
		
		ArrayList<Person> a=new ArrayList<>();
//		a.add(new Person(1,"prem",23));
//		a.add(new Person(2,"premchand",34));
//		a.add(new Person(3,"preml",45));
//		
//		a.stream().forEach(s-> System.out.println(s.getAge()+ " "+ s.getId()+" "+ s.getName()));
//     	List<Person> l= a.stream().filter(s-> s.getAge()>30).collect(Collectors.toList());
//     	l.stream().forEach(s-> System.out.println(s.getAge()+ " "+ s.getId()+" "+ s.getName()));
//     	
//     	System.out.println(a.stream().filter(s-> s.getAge()>30).count());
     	
     	System.out.println(a.stream().min(Comparator.comparing(Person::getAge)).get().getAge());
     	
     	System.out.println(a.stream().min( (a1,b1) -> a1.age<b1.age ? -1: 1).get().getId());
     	
     	Optional<Optional<Person>> l1= Optional.ofNullable(a.stream().max(Comparator.comparing(Person::getAge)));
     	System.out.println(l1.get());
//     	
//     	Map<Integer,String> m=new HashMap<>();
//     	
//     	m.put(1, "hi");
//     	m.put(2, "hello");
//     	
//     	for(Entry<Integer, String> m1:m.entrySet())
//     	{
//     		System.out.println(m1.getKey()+ " "+ m1.getValue());
//     	}
//
//     	m.entrySet().stream().forEach(s-> System.out.println(s.getKey()+ " "+ s.getValue()));
	}

}
