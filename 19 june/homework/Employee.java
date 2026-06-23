class Employee {
    String name, department;

    { System.out.println("Employee Registration Started"); }

    Employee() { this("Unknown", "Not Assigned"); }
    Employee(String name) { this(name, "General"); }

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}