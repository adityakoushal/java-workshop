class StudentAdmission {
    String college, student, course;

    { college = "ABC College"; System.out.println("Admission Process Started"); }

    StudentAdmission() { this("Unknown", "Not Assigned"); }
    StudentAdmission(String student) { this(student, "BCA"); }

    StudentAdmission(String student, String course) {
        this.student = student;
        this.course = course;
        System.out.println("College: " + college);
        System.out.println("Student: " + student);
        System.out.println("Course: " + course);
    }
}