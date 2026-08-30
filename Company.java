public class Company {
    static class Employee {
        protected String name;
        protected int employeeId;
        protected double basicSalary;
        public Employee(String name, int employeeId, double basicSalary) {
            this.name = name;
            this.employeeId = employeeId;
            this.basicSalary = basicSalary;
        }
        public double calculateSalary() {
            return basicSalary;
        }
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Total Salary: " + calculateSalary());
        }
    }
    static class Manager extends Employee {
        private static final double MANAGERIAL_ALLOWANCE = 0.20;
        public Manager(String name, int employeeId, double basicSalary) {
            super(name, employeeId, basicSalary);
        }
        public double calculateSalary() {
            return basicSalary + (basicSalary * MANAGERIAL_ALLOWANCE);
        }
        public void displayDetails() {
            System.out.println("Manager Details");
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Managerial Allowance (20%): " + (basicSalary * MANAGERIAL_ALLOWANCE));
            System.out.println("Total Salary: " + calculateSalary());
        }
    }
    static class Developer extends Employee {
        private static final double technicalAllowance = 0.15; // 15%
        public Developer(String name, int employeeId, double basicSalary) {
            super(name, employeeId, basicSalary);
        }
        public double calculateSalary() {
            return basicSalary + (basicSalary * technicalAllowance);
        }
        public void displayDetails() {
            System.out.println("Developer Details");
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Technical Allowance (15%): " + (basicSalary * technicalAllowance));
            System.out.println("Total Salary: " + calculateSalary());
        }
    }
        public static void main(String[] args) {
        Manager m1 = new Manager("abc", 1234, 20000);
        Developer d1 = new Developer("pqr", 5678, 10000);
        m1.displayDetails();
        System.out.println();
        d1.displayDetails();
    }
}