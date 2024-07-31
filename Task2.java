import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total number of subjects: ");
        int num = in.nextInt();
        int total = 0;

        int[] marks = new int[num];

        for (int sub = 0; sub < marks.length; sub++){
            System.out.print("Enter marks for subject " + (sub+1) + " : ");
            marks[sub] = in.nextInt();
                while (marks[sub] > 100 || marks[sub] < 0){
                    System.out.println("Enter valid marks.");
                    System.out.print("Enter marks for subject " + (sub+1) + " : ");
                    marks[sub] = in.nextInt();
                }
            total += marks[sub];
        }
        System.out.println("Total marks: " + total);

        float average_marks = ((float)total / num);
        System.out.println("Average marks = " + average_marks);

        if (average_marks >= 90){
            System.out.println("Overall Grade: O");
        } else if (average_marks >= 75) {
            System.out.println("Overall Grade: A+");
        } else if (average_marks >= 65) {
            System.out.println("Overall Grade: A");
        } else if (average_marks >= 55) {
            System.out.println("Overall Grade: B+");
        } else if (average_marks >= 50) {
            System.out.println("Overall Grade: B");
        } else if (average_marks >= 45) {
            System.out.println("Overall Grade: C");
        } else if (average_marks >= 40) {
            System.out.println("Overall Grade: P");
        } else {
            System.out.println("Overall Grade: F");
        }
    }
}
