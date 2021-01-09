
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author timja
 */
public class UserInterface {

    private Scanner scanner;
    private Grade grades;

    public UserInterface(Scanner scanner, Grade grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void Start() {

        System.out.println("Enter a point totals, -1 stops:");

        while (true) {

            int grade = Integer.valueOf(scanner.nextLine());

            if (grade == -1) {
                break;
            }

            grades.AddGradeToList(grade);

        }

        System.out.println("Point average (all): " + grades.GetAverageGrades());
        System.out.println("Point average (passing): " + grades.GetPassingAverageGrades());
        System.out.println("Pass percentage: " + grades.GetPassPercentage());
        grades.PrintGradeDistribution();


    }

}
