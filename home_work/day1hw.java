class Student {
    int studentId;
    String name;
    int totalMarks;
    double average;
    char grade;

    void setDetails(int id, String studentName, int m1, int m2, int m3, int m4, int m5) {
        studentId = id;
        name = studentName;

          

        totalMarks = m1 + m2 + m3 + m4 + m5;
        average = totalMarks / 5.0;
           
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    void displayResult() {
        System.out.println(name + " (ID: " + studentId + ") - Total: " + totalMarks + ", Average: " + average + ", Grade: " + grade);

    }

}



public class day1hw {
    public static void main(String[] args) {


        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

           

        s1.setDetails(101, "Alice", 90, 85, 95, 92, 88);
        s2.setDetails(102, "Bob", 70, 65, 80, 75, 72);
        s3.setDetails(103, "Charlie", 50, 60, 55, 62, 58);
        s4.setDetails(104, "David", 95, 98, 92, 96, 94);
        s5.setDetails(105, "Emma", 40, 45, 50, 38, 42);



        System.out.println("--- ALL RESULTS ---");
        s1.displayResult();
        s2.displayResult();
        s3.displayResult();
        s4.displayResult();
        s5.displayResult();
          

        Student highest = s1;

        if (s2.totalMarks > highest.totalMarks) highest = s2;
        if (s3.totalMarks > highest.totalMarks) highest = s3;
        if (s4.totalMarks > highest.totalMarks) highest = s4;
        if (s5.totalMarks > highest.totalMarks) highest = s5;

        Student lowest = s1;

        if (s2.totalMarks < lowest.totalMarks) lowest = s2;
        if (s3.totalMarks < lowest.totalMarks) lowest = s3;
        if (s4.totalMarks < lowest.totalMarks) lowest = s4;
        if (s5.totalMarks < lowest.totalMarks) lowest = s5;


        double classAverage = (s1.totalMarks + s2.totalMarks + s3.totalMarks + s4.totalMarks + s5.totalMarks) / 5.0;


        System.out.println("\n--- CLASS STATS ---");
        System.out.println("Highest Scorer: " + highest.name + " (" + highest.totalMarks + " marks)");
        System.out.println("Lowest Scorer: " + lowest.name + " (" + lowest.totalMarks + " marks)");
        System.out.println("Class Average Marks: " + classAverage);

    }

} 

