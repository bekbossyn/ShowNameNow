package kz.systemx.learnjava;

import java.util.ArrayList;

public class MyClass {

    public static void main(String[] args) {
        String[] names = {"James", "Georgina", "Enrique"};

        int[] newArray = new int[4];

        String[] newNames = new String[5];

        newArray[0] = 12;
        newArray[1] = 13;
        newArray[2] = 23;
        newArray[3] = 43;

        newNames[0] = "Aiya";
        for (int i = 0; i < 4; i++) {
//            System.out.println(newArray[i]);
            System.out.println(newNames[i]);
        }

        // Array lists
//        ArrayList <String> name = new ArrayList<>(); // better do like that
        ArrayList name = new ArrayList();
        name.add(23);
        name.add("sdf");
        name.add("sdf");
        name.remove(0);
//        for (int i = 0;i <name.le)
        System.out.println(name);
    }
}
//    Employee employee = new Employee();
//        employee.setFirstName("James");
//        employee.setLastName("Bond");
//        employee.setAge(45);
//        employee.setId(23);
//        employee.setAnnualSalary(323322);
//
//        System.out.println(employee.getAnnualSalary());
//
//        System.out.println(employee.getFirstName());
//
//    Manager manager = new Manager();
//        manager.setFirstName("Manager George");
//        manager.setLastName("Kilos");
//        manager.setAge(24);
//        manager.setId(23344);
//        manager.setAnnualSalary(8888);
//
//        System.out.println(manager.getAnnualSalary() + " , " + manager.getFirstName());
//        String name = "Georgina";
//        Microphone microphone = new Microphone("Blue Yeti", "Blue", 22234);
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

//        microphone.turnOn();
//        microphone.setVolume();
//        microphone.turnOff();
//        System.out.println(microphone.showDescription());
//
////        Microphone newMic = new Microphone("new Mic", "Green", 1422);
//        Microphone newMic = new Microphone();
//        Microphone otherMic = new Microphone();
//        otherMic.setColor("Orange");
//        System.out.println(otherMic.getColor());
//        gHMic.turnOn();
//        gHMic.setVolume();
//        gHMic.turnOff();

//        System.out.println("hello, u're a programmer.");
//    }
//
