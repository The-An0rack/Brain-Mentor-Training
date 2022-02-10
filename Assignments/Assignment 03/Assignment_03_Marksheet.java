import java.util.Scanner;

public class Assignment_03_Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Student");
        String name = sc.nextLine();
        StringBuilder new_name = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if (i == 0 || name.substring(i - 1, i).compareTo(" ") == 0) {
                new_name.append(name.substring(i, i + 1).toUpperCase());
            } else {
                new_name.append(name.substring(i, i + 1).toLowerCase());
            }
        }

        int[] marks = new int[3];
        System.out.println("Enter marks in subject 1: ");
        marks[0] = sc.nextInt();
        System.out.println("Enter marks in subject 2: ");
        marks[1] = sc.nextInt();
        System.out.println("Enter marks in subject 3: ");
        marks[2] = sc.nextInt();

        int totalMarks = 0;
        for (int i = 0; i < 3; i++) {
            totalMarks += marks[i];
        }
        float percentage = totalMarks / 3.0f;
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage < 90 && percentage >= 80) {
            grade = 'B';
        } else if (percentage < 80 && percentage >= 70) {
            grade = 'C';
        } else if (percentage < 70 && percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("***************************");
        System.out.println("Name: " + new_name);
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + " marks: " + marks[i]);
        }
        System.out.println("Percentage: " + percentage + " %");
        System.out.println("Grade: " + grade);
        System.out.println("***************************");

        sc.close();
    }
}
