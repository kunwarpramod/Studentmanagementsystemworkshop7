package studentmanagement;

//GradeCalculator.java
public class GradeCalculator {

 // Calculate average of an array of grades (0-100)
 public double calculateAverage(int[] grades) {
     if (grades == null || grades.length == 0) {
         throw new IllegalArgumentException("Grades list cannot be empty");
     }
     int sum = 0;
     for (int g : grades) {
         sum += g;
     }
     return sum / (double) grades.length;
 }

 // Letter grade from average
 public String toLetterGrade(double average) {
     if (average >= 90) return "A";
     if (average >= 80) return "B";
     if (average >= 70) return "C";
     if (average >= 60) return "D";
     return "F";
 }
}
