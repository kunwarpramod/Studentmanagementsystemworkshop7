package studentmanagement;

//Main.java
public class Main {
 public static void main(String[] args) {
     System.out.println("Student Management System - Week 8 Practice");
     
     // create a student and print their info
     Student s = new Student("pramod", 20);
     System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
     GradeCalculator gc = new GradeCalculator();
     int[] grades = {85, 92, 78}; double avg = gc.calculateAverage(grades); 
     System.out.println("Average: " + avg + " | Letter: " + gc.toLetterGrade(avg));
     
 }
}