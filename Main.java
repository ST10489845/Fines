
    public class Main {
        public static void main(String[] args) {
            int[][] speedingFines = {
                    {128, 135, 139}, //km
                    {155, 129, 175}, //km
                    {129, 130, 185}, //km
                    {195, 155, 221} //km
            };
            String[] months = {"JAN", "FEB", "MAR"};
            String[] cities = {"JHB", "DBN", "CTN", "PE"};

            System.out.println("********************** SPEEDING FINES REPORT **********************");
            System.out.printf("%-17s", "");
            for (String month : months) {
                System.out.printf("%-7s", month);
            }
            System.out.println();

            for (int i = 0; i < speedingFines.length; i++) {
                System.out.printf("%-17s", cities[i]);
                for (int j = 0; j < speedingFines[i].length; j++) {
                    System.out.printf("%-7d", speedingFines[i][j]);
                }
                System.out.println();
            }

            int max = speedingFines[0][0];
            int min = speedingFines[0][0];

            for (int[] row : speedingFines) {
                for (int value : row) {
                    if (value > max) max = value;
                    if (value < min) min = value;
                }
            }

            System.out.println("********************** SPEEDING FINES STATISTICS **********************");
            System.out.println("Maximum Speed Captured: " + max);
            System.out.println("Minimum Speed Captured: " + min);
        }
    }
