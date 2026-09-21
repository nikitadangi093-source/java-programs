class Student {
    String name;
    int rollNo;
    int marks;

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating first object
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.rollNo = 101;
        s1.marks = 85;

        // Creating second object
        Student s2 = new Student();
        s2.name = "Priya";
        s2.rollNo = 102;
        s2.marks = 92;

        // Creating third object
        Student s3 = new Student();
        s3.name = "Amit";
        s3.rollNo = 103;
        s3.marks = 78;

        // Displaying details
        s1.display();
        s2.display();
        s3.display();
    }
}
