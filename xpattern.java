public class xpattern {
        public static void main(String[] args) {
            int size = 5;
    
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (j == i || j == size - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
