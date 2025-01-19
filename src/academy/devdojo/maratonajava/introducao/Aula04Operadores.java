package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Aritmeticos
        int number01 = 10;
        int number02 = 20;
        int sum = number01 + number02;
        int sub = number01 - number02;
        double div = number01 / (double) number02;
        System.out.println(sum + " " + sub + " " + div);

        //Resto
        int rest = 20 % 2;
        System.out.println(rest);

        //Operadores relacionais (sempre retornam valores booleanos)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte = " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte = " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte = " + isDezIgualVinte);
        System.out.println("isDezDiferenteQueVinte = " + isDezDiferenteQueVinte);
    }
}
