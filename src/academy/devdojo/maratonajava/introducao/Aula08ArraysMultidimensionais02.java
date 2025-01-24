package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        int[] subArray2 = {
                1000, 1, 23
        };

        arrayInt[0] = new int[2];
        arrayInt[1] = subArray2;
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {
                {0, 0},
                {1, 2, 3},
                {1, 2, 3, 4, 5, 6}
        };

        for(int[] casas : arrayInt2) {
            for(int num : casas) {
                System.out.print(num + " ");
            }
            System.out.println("\n-----------");
        }
    }
}
