package poo.composition;

import java.util.HashSet;
import java.util.Set;

public class Student {
  public String name;
  public String email;
  public char gender;
  public int age;
  public Set<Course> courses = new HashSet<>();

  Student(String name, String email, char gender, int age) {
    this.name = name;
    this.email = email;
    this.gender = gender;
    this.age = age;
  }

  public String toString() {
    return this.name;
  }

  public Set<Course> getCourses() {
    return this.courses;
  }

  public boolean addCourse(Course course) {
    course.getStudents().add(this);
    return this.courses.add(course);
  }

  public boolean removeCourse(Course course) {
    course.getStudents().remove(this);
    return this.courses.remove(course);
  }

}
