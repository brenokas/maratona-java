package academy.devdojo.maratonajava.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double annualSalary = sc.nextDouble();
        double tax;

        if (annualSalary <= 34712) {
            tax = 9.70 / 100;
        } else if (annualSalary <= 68507){
            tax = 37.35 / 100;
        } else {
            tax = 49.50 / 100;
        }

        double taxFinalValue = tax * annualSalary;
        System.out.printf("Your tax will be: $%.2f", taxFinalValue);

        sc.close();
    }
}
