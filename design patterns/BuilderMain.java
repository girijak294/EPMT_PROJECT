public class BuilderMain {
    public static void main(String[] args) {
        // Customer 1: Wants a bicycle with gears and a double seat
        Bicycle bike1 = new Bicycle.Builder()
                .setGears(true)
                .setDoubleSeat(true)
                .build();
        System.out.println(bike1);

        // Customer 2: Wants a bicycle with a double stand, carrier, and gears
        Bicycle bike2 = new Bicycle.Builder()
                .setGears(true)
                .setDoubleStand(true)
                .setCarrier(true)
                .build();
        System.out.println(bike2);

        // Customer 3: Wants a simple bicycle with no extra fittings
        Bicycle bike3 = new Bicycle.Builder().build();
        System.out.println(bike3);
    }
}
