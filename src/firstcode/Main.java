package firstcode;

class main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int n = 5;
        int[] num = {1,2,3,4,5};

        int m = 100;
        int[] bar = new int[m];

        for (int i = 0; i < m; i++){
            bar[i] = i;
        }

        System.out.println(countEvenNum(num, n));
        System.out.println(countEvenNum(bar, m));
    }


    public static int countEvenNum(int[] arr, int size){
        int count = 0;

        for (int i = 0; i < size; i++){
            if (arr[i] % 2 == 0){
                count++;

            }

        }
        return count;
    }
    }