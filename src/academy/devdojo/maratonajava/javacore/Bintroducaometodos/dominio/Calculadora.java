package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num, int num2) {
        System.out.println(num*num2);
    }
    
    public double divideDoisNumeros(double num, double num2) {
        if (num2 == 0) return 0;
        return num / num2;
    }

    public double divideDoisNumeros2(double num, double num2) {
        if (num2 != 0) {
            return num / num2;
        } else return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero.");
            return;
        }
        System.out.println(num / num2);
    }
}
