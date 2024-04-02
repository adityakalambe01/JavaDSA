package arrays;

public class D2Array {
    public static void main(String[] args) {
        int[][] twoDArray = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                twoDArray[i][j] = i+j;
            }
        }

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j]);
            }
            System.out.println();
        }
    }
}
