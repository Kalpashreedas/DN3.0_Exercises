package Employee_Management_System;

public class EmployeeManagementSystem {
        private Employee[] employees;
        private int size;
        
        public EmployeeManagementSystem(int capacity) {
            employees = new Employee[capacity];
            size = 0;
        }
    
        // Add an employee
        public void addEmployee(Employee employee) {
            if (size < employees.length) {
                employees[size++] = employee;
            } else {
                System.out.println("Array is full, cannot add more employees.");
            }
        }
    
        // Search for an employee by ID
        public Employee searchEmployee(int employeeId) {
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeId() == employeeId) {
                    return employees[i];
                }
            }
            return null;
        }
    
        // Traverse and print all employees
        public void traverseEmployees() {
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }
        }
    
        // Delete an employee by ID
        public void deleteEmployee(int employeeId) {
            int indexToDelete = -1;
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeId() == employeeId) {
                    indexToDelete = i;
                    break;
                }
            }
    
            if (indexToDelete == -1) {
                System.out.println("Employee not found.");
                return;
            }
    
            // Shift elements to the left
            for (int i = indexToDelete; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[size - 1] = null; // Clear the last element
            size--;
        }

}
