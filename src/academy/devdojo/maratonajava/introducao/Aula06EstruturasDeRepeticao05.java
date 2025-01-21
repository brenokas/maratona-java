package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição: valor da parcela >= 1000

        Scanner sc = new Scanner(System.in);
        double carValue = sc.nextDouble();

        for (int i = (int) carValue; i >= 1; i--) {
            double installmentValue = carValue / i;
            if (installmentValue < 1000) continue;
            System.out.printf("Installment: %d $%.2f%n", i, installmentValue);
        }

        sc.close();

    }
}
