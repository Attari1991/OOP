package abstraction;

public abstract class ModernCar {//because of abstract keyword this class will be named abstracte class
    //abstract class: which is not fully abstract
    String modernCarBrand="Audi";
    double modernCarSuggestedPrice=750000;
    //we can declare and assign value in abstract class


    //Abstract method:
    public abstract void cameras();
    public abstract void autoLaneControl();
    public abstract void selfDriven();
    public abstract void autoPark();
    public abstract void gps();
    public abstract void emergencyBreak();


    //static and non static methods are allowed in abstract class
    public void remoteStart(){//we can declare a nn static method
        System.out.println("modern car has Remote start feature");
    }
    public static void dualClimateControl(){
        System.out.println("modern car has dual Climate Control feature");
    }





}
