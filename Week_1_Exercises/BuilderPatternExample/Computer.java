package BuilderPatternExample;

public class Computer {

    // Required parameters
    private String cpu;
    private String ram;

    // Optional parameters
    private String storage;
    private String graphicsCard;
    private String operatingSystem;
    private String powerSupply;

    // Private constructor to enforce object creation through Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
        this.powerSupply = builder.powerSupply;
    }

    // Getters for attributes
    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    // String representation of the Computer object
    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage 
               + ", Graphics Card=" + graphicsCard + ", Operating System=" 
               + operatingSystem + ", Power Supply=" + powerSupply + "]";
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private String cpu;
        private String ram;

        // Optional parameters - initialized to default values
        private String storage = "256GB SSD";
        private String graphicsCard = "Integrated";
        private String operatingSystem = "Windows 10";
        private String powerSupply = "500W";

        // Builder constructor with required parameters
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        // Methods to set optional parameters
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        // Build method to create the Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}
