
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author timja
 */
public class Grade {

    private final int minimumGrade = 0;
    private final int maximumGrade = 100;
    private final int passingGrade = 50;

    private ArrayList<Integer> grades = new ArrayList<>();

    public Grade() {
       
    }

    public void AddGradeToList(int grade) {
        if (grade >= minimumGrade && grade <= maximumGrade) {
            grades.add(grade);
        }
    }

    public double GetAverageGrades() {
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public double GetPassingAverageGrades() {
        double total = 0;
        int timesPast = 0;
        for (int grade : grades) {
            if (grade >= passingGrade) {
                total += grade;
                timesPast++;
            }
        }
        return total / timesPast;
    }

    public double GetPassPercentage() {
        double timesPast = 0;
        for (int grade : grades) {
            if (grade >= passingGrade) {
                timesPast++;
            }
        }
        return 100 * timesPast / grades.size();

    }

    public void PrintGradeDistribution() {
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int foor = 0;
        int five = 0;

        for (int grade : grades) {
            if (grade < 50) {
                zero++;
            } else if (grade < 60) {
                one++;
            } else if (grade < 70) {
                two++;
            } else if (grade < 80) {
                three++;
            } else if (grade < 90) {
                foor++;
            } else {
                five++;
            }
        }

        int[] arr = {zero, one, two, three, foor, five};

        
            System.out.println("Grade distribution: ");
            System.out.print("5: ");
            PrintStars(arr[5]);
            System.out.print("4: ");
            PrintStars(arr[4]);
            System.out.print("3: ");
            PrintStars(arr[3]);
            System.out.print("2: ");
            PrintStars(arr[2]);
            System.out.print("1: ");
            PrintStars(arr[1]);
            System.out.print("0: ");
            PrintStars(arr[0]);


    }

    public static void PrintStars(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
