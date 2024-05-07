public class Lesson5 {
    public static void main(String[] args) {
        int[] ar = {12,32,6,-2,34,65,-43,6,0};
        //triangle1();
        //triangle2();
        //triangle3();
        triangle4();
    }
    public static void triangle4() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i==10 || j==i && j>5|| i+j==10 && j<6 )
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void triangle3() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (j==10 || j==i && j>=5|| i+j==10 && j>=6)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }


    public static void triangle2() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (j==0 || i==j && j<6 || i+j==10 && j<6 )
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void triangle1 () {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == j || j == 10 - i || i >= 6 || i==0)
                    System.out.print(" * ");
                else
                    System.out.print("   ");


            }
            System.out.println();
        }
    }

    public static void bobble (int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length-1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = tmp;
                }
            }
        }

    }

    public static void select (int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length-1; j++) {
                if (ar[i] > ar[j + 1]) {
                    int tmp = ar[i];
                    ar[j] = ar[j+1];
                    ar[j+1] = tmp;
                }
            }
        }

    }
    public static void insertSort (int[] ar) {
        int n = ar.length;
        for (int i = 1; i < n; ++i) {
            int key = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                j = j - 1;
            }
            ar[j + 1] = key;

        }
    }
    public static void print (int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
