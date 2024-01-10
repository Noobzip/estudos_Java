package Ex3_While;

import java.util.Scanner;

public class ClassAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;
        int gradeCounter = 1;

/*        while (gradeCounter <= 1) {
            System.out.print("Enter grade: ");
            double grade = input.nextDouble();

                if (grade <= 10) {
                    total = total + grade;
                    gradeCounter++;
                } else {
                    System.out.println("A nota inserida não é válida. Certifique-se " +
                            "de digitar um valor entre 0 e 10.");
                }
        }*/

        double average = total / 10.00;
        double continha = 4;
        int counter = 0;

        while (continha > 0) {
            double x = continha;
        }

        System.out.printf("%nTotal de 10 notas é %f%n", total);
        System.out.printf("A média da classe é: %f%n", average);
        System.out.print("Faça o L: " + continha);

        // 5*4 = x*3 = x*2 = x*1
    }

}
