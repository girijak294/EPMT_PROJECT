public class Bicycle {
    // Final fields to prevent changes after the bicycle is built
    private final boolean hasGears;
    private final boolean hasDoubleStand;
    private final boolean hasDoubleSeat;
    private final boolean hasCarrier;

    // Private constructor to be used by the builder
    private Bicycle(Builder builder) {
        this.hasGears = builder.hasGears;
        this.hasDoubleStand = builder.hasDoubleStand;
        this.hasDoubleSeat = builder.hasDoubleSeat;
        this.hasCarrier = builder.hasCarrier;
    }

    // Getters to access the properties
    public boolean hasGears() {
        return hasGears;
    }

    public boolean hasDoubleStand() {
        return hasDoubleStand;
    }

    public boolean hasDoubleSeat() {
        return hasDoubleSeat;
    }

    public boolean hasCarrier() {
        return hasCarrier;
    }

    @Override
    public String toString() {
        return "Bicycle [Gears: " + hasGears + ", Double Stand: " + hasDoubleStand +
                ", Double Seat: " + hasDoubleSeat + ", Carrier: " + hasCarrier + "]";
    }

    // Static Builder class
    public static class Builder {
        // Builder fields with default values
        private boolean hasGears = false;
        private boolean hasDoubleStand = false;
        private boolean hasDoubleSeat = false;
        private boolean hasCarrier = false;

        // Methods to set options
        public Builder setGears(boolean hasGears) {
            this.hasGears = hasGears;
            return this;
        }

        public Builder setDoubleStand(boolean hasDoubleStand) {
            this.hasDoubleStand = hasDoubleStand;
            return this;
        }

        public Builder setDoubleSeat(boolean hasDoubleSeat) {
            this.hasDoubleSeat = hasDoubleSeat;
            return this;
        }

        public Builder setCarrier(boolean hasCarrier) {
            this.hasCarrier = hasCarrier;
            return this;
        }

        // Method to build the final Bicycle object
        public Bicycle build() {
            return new Bicycle(this);
        }
    }
}
