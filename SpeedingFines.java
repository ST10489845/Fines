public class SpeedingFines extends Fine {

    private int speed;
    private double fine;


    public SpeedingFines(String citizenName, int speed) {
        super(citizenName);
        this.speed = speed;
        calculateFine();

    }


    private void calculateFine() {
        if (speed > 120) {
            fine = (speed - 120) * 10;
        } else {
            fine = 0;

        }
    }
    @Override

    public void PrintFine() {
        System.out.println("PERSON: " + citizenName);
        System.out.println("SPEED: " + speed + "km");
        System.out.println("FINE PAYABLE: R " + fine);

    }

}
