package poo.composition;

public class StudentMain {
  public static void main(String[] args) {
    Student student1 = new Student("Marcos", "student1@test.com", 'M', 20);
    Student student2 = new Student("Ronald", "student2@test.com", 'M', 25);
    Student student3 = new Student("Maria", "student3@test.com", 'F', 21);
    Student student4 = new Student("Márcia", "student4@test.com", 'F', 18);
    Student student5 = new Student("Nadja", "student5@test.com", 'F', 27);
    Student student6 = new Student("Henrique", "student6@test.com", 'M', 39);

    Course course1 = new Course("Medicina");
    Course course2 = new Course("Engenharia de Software");
    Course course3 = new Course("Direito");

    course1.addStudent(student6);
    course1.addStudent(student5);
    course1.addStudent(student1);

    course2.addStudent(student4);
    course2.addStudent(student1);
    course2.addStudent(student2);
    course2.addStudent(student3);

    course3.addStudent(student2);
    course3.addStudent(student3);

    System.out.println(course1.getStudents());
    System.out.println(course2.getStudents());
    System.out.println(course3.getStudents());

    System.out.println(student1.getCourses());
    System.out.println(student2.getCourses());
    System.out.println(student3.getCourses());

  }
}
