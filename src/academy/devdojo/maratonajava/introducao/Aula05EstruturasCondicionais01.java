package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isCanBuyDrink = age >= 18;

        if (isCanBuyDrink) {
            System.out.println("Pode comprar bebida alcoolica.");
        } else {
            System.out.println("Não pode comprar bebida alcoolica.");
        }
    }
}
