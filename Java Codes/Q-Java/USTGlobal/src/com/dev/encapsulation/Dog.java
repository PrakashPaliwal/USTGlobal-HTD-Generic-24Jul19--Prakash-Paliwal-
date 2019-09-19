package com.dev.encapsulation;

public class Dog implements Comparable<Dog>{
	
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + ", color=" + color + ", breed=" + breed + "]";
	}
	private int age;
	private String name;
	private String color;
	private String breed;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public int compareTo(Dog d) {
		return (this.age - d.age);
	}

}
