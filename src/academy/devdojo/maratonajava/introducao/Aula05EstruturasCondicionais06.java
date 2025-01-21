package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dado os valores de 1 a 7, imprima se é dia útil ou final de semana, considerando 1 como domingo
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        String day = switch (number) {
            case 1, 7 -> day = "Weekend";
            case 2, 3, 4, 5, 6 -> day = "Weekday";
            default -> "Invalid input!";
        };

        System.out.println(day);
        sc.close();
    }
}
