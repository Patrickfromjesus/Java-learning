package poo.composition;

import java.util.ArrayList;
import java.util.List;

public class Course {
  public String name;
  public List<Student> students = new ArrayList<>();

  Course(String name) {
    this.name = name;
  }

  public String toString() {
    return this.name;
  }

  public List<Student> getStudents() {
    return this.students;
  }

  public boolean addStudent(Student student) {
    student.getCourses().add(this);
    return this.students.add(student);
  }

  public boolean removeStudent(Student student) {
    student.getCourses().remove(this);
    return this.students.remove(student);
  }
}
