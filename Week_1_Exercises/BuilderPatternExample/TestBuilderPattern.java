package BuilderPatternExample;

public class TestBuilderPattern {
    public static void main(String[] args) {
        // Create a basic computer with required parameters
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();

        System.out.println("Basic Computer Configuration:");
        System.out.println(basicComputer);

        // Create a high-end gaming computer with additional configurations
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 11")
                .setPowerSupply("750W")
                .build();

        System.out.println("\nGaming Computer Configuration:");
        System.out.println(gamingComputer);

        // Create a computer with custom configurations
        Computer customComputer = new Computer.Builder("AMD Ryzen 7", "16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("AMD Radeon RX 6700 XT")
                .setOperatingSystem("Ubuntu 20.04")
                .setPowerSupply("650W")
                .build();

        System.out.println("\nCustom Computer Configuration:");
        System.out.println(customComputer);
    }
}
