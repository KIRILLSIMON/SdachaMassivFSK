import java.util.Arrays;

        public class Main {
            public static void main(String[] args) {
                System.out.println("r-e 1y ZADACHI 2MassivsLesson!");
                int[] arr = generateRandomArray();
                System.out.println(Arrays.toString(arr));
                System.out.println("r-e 2y ZADACHI 2MassivsLesson!");
                double sum = 0;
                for (double paymentPerDay : arr) {
                    sum += paymentPerDay;

                    System.out.println("Сумма трат за месяц составила " + sum + " руБЛИЩ!");
                }
                int min = 200_001;
                int max = 99_999;
                int[] ar = generateRandomArray();
                for (int paymentPerDay : ar) {
                    if (paymentPerDay < min) {
                        min = paymentPerDay;
                    }
                    if (paymentPerDay > max) {
                        max = paymentPerDay;

                        System.out.println("Mин-я сумма трат в день равна " + min + "  руБЛИЩ!Макс. сумма трат в день равна " + max + " руБЛИЩ!");
                        double average = (double) sum / arr.length;

                        System.out.println("Средняя сумма трат за 30дней это " + average + "  руБЛИЩ!");

                    }
                }

                char[] RFN = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                for (int y = RFN.length - 1; y >= 0; y--) {
                    System.out.print(RFN[y]);
                }

            }

            public static int[] generateRandomArray() {
                java.util.Random random = new java.util.Random();
                int[] arr = new int[30];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt(100_000) + 100_000;
                }
                return arr;
            }

        }

