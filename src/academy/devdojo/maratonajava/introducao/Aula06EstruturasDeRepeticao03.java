package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 numeros de um dado valor
        int maxValue = 50;
        for (int i = 0; i <= maxValue; i++) {
            if (i > 25) break;
            System.out.println(i);
        }
    }
}
