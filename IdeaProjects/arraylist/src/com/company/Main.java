package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Sujit", 1));
        studentList.add(new Student("Siddharth", 2));
        studentList.add(new Student("Karanpreet", 3));
        studentList.add(4,new Student("Hari", 4));
        studentList.add(3, new Student("Tricha", 5));
    }
}
