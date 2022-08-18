package day22_multiDimensionalArray;

public class C11_AyniIndexTopla {
    public static void main(String[] args) {


        int[][] arr = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    for (int l = 0; l < arr2[k].length; l++) {
                        if (i == k && j == l) {
                            toplam = arr2[k][l] + arr[i][j];
                            System.out.println(toplam);
                        }
                    }

                }
            }

        }



    }
}


