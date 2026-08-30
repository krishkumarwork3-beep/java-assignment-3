public class University {
    static abstract class Student {
        protected String name;
        protected int rollNumber;
        protected double marks;
        public Student(String name, int rollNumber, double marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }
        public abstract String calculateGrade();
        public void displayResult() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
        }
    }
    static class EngineeringStudent extends Student {
        public EngineeringStudent(String name, int rollNumber, double marks) {
            super(name, rollNumber, marks);
        }
        public String calculateGrade() {
            if (marks >= 90) return "A";
            else if (marks >= 75) return "B";
            else if (marks >= 60) return "C";
            else if (marks >= 40) return "D";
            else return "F";
        }
        public void displayResult() {
            super.displayResult();
            System.out.println("Stream: Engineering");
            System.out.println("Grade: " + calculateGrade());
        }
    }
    static class MedicalStudent extends Student {
        public MedicalStudent(String name, int rollNumber, double marks) {
            super(name, rollNumber, marks);
        }
        public String calculateGrade() {
            if (marks >= 85) return "A";
            else if (marks >= 70) return "B";
            else if (marks >= 55) return "C";
            else if (marks >= 40) return "D";
            else return "F";
        }
        public void displayResult() {
            super.displayResult();
            System.out.println("Stream: Medical");
            System.out.println("Grade: " + calculateGrade());
        }
    }
    static class ManagementStudent extends Student {
        public ManagementStudent(String name, int rollNumber, double marks) {
            super(name, rollNumber, marks);
        }
        public String calculateGrade() {
            if (marks >= 80) return "A";
            else if (marks >= 65) return "B";
            else if (marks >= 50) return "C";
            else if (marks >= 40) return "D";
            else return "F";
        }
        public void displayResult() {
            super.displayResult();
            System.out.println("Stream: Management");
            System.out.println("Grade: " + calculateGrade());
        }
    }
    public static void main(String[] args) {
        Student[] students = {
            new EngineeringStudent("abc", 1234, 85),
            new MedicalStudent("pqr", 5678, 70),
            new ManagementStudent("xyz", 9123, 60)
        };
        for (Student s : students) {
            s.displayResult();
        }
    }
}