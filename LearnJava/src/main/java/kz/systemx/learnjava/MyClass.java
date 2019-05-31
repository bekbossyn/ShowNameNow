package kz.systemx.learnjava;

public class MyClass {

    public static void main(String[] args) {

//        String name = "Georgina";
        Microphone microphone = new Microphone("Blue Yeti", "Blue", 22234);
//        microphone.name = "Blue Yeti";
//        microphone.color = "Blue";
//        microphone.model = 23332;

//        microphone.setModel("23");

//        Microphone gHMic = new Microphone("GHZB", "Red", 543);
////        gHMic.name = "GHZB";
////        gHMic.model = 465;
////        gHMic.color = "Red";

//        System.out.println(name);
//        System.out.println(microphone);
//        System.out.println(gHMic);

        microphone.turnOn();
        microphone.setVolume();
        microphone.turnOff();
        System.out.println(microphone.showDescription());

//        Microphone newMic = new Microphone("new Mic", "Green", 1422);
        Microphone newMic = new Microphone();
        Microphone otherMic = new Microphone();
        otherMic.setColor("Orange");
        System.out.println(otherMic.getColor());
//        gHMic.turnOn();
//        gHMic.setVolume();
//        gHMic.turnOff();

//        System.out.println("hello, u're a programmer.");
    }

}
