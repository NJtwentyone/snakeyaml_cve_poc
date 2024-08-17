package com.example.snakeyaml;
import java.util.*;

public class Student extends Person {
    private long id;
    private String department;
    private List<Course> courses;
    public Object objectField;
    // Getters and setters
    public void setId(int newId) {
        this.id = newId;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
    
    public void setCourses(List<Course> newCourses) {
        this.courses = newCourses;
    }
    
    public void setObjectField(Object obj){
    	this.objectField = obj;
    }

    public long getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Object getObjectField(){
	return objectField;
    }
}
