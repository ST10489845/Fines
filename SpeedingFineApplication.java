import java.util.Scanner;
public class SpeedingFineApplication {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the person name: ");
            String name = scanner.nextLine();
            System.out.print("Enter the speed: ");
            int speed = scanner.nextInt();
            SpeedingFines speedingFines = new SpeedingFines(name, speed);
            speedingFines.PrintFine();


            scanner.close();

        }

    }

