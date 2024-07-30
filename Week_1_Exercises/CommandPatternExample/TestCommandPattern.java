package CommandPatternExample;

public class TestCommandPattern {
    public static void main(String[] args) {
        // Create the receiver
        Light livingRoomLight = new Light("Living Room");

        // Create the command objects
        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);

        // Create the invoker
        RemoteControl remoteControl = new RemoteControl();

        // Turn the light on
        remoteControl.setCommand(lightOnCommand);
        System.out.println("Pressing the remote control button:");
        remoteControl.pressButton();

        // Turn the light off
        remoteControl.setCommand(lightOffCommand);
        System.out.println("\nPressing the remote control button:");
        remoteControl.pressButton();
    }
}
