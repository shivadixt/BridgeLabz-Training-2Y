interface LightAction {
    void activate();
}

public class smarthomelight {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Lights ON - Motion Detected!");
        LightAction timeTrigger = () -> System.out.println("Dim Lights - It's Night Time!");
        LightAction voiceTrigger = () -> System.out.println("Color Mode Activated - Voice Command!");

        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}
