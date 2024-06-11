
//  Dependency inversion principle states that high level modules should not be depends on low 
// level modules they both depends on abstraction ..


// BEFORE DEPENDENCY INVERSION PRINCIPLE..

class LightBulb {

    public void turnOn(){
        System.out.println("Bulb is on now ....");
    }

    public void turnOff(){
        System.out.println("Bulb is off now ..");
    }
}

class Switch {

    private LightBulb lightBulb ;

    public Switch(){
        this.lightBulb = new LightBulb();

    }

    public void operate(){
        lightBulb.turnOn();
    }
}

// *******************AFTER DEPENDENCY INVERSION PRINCIPLE **************************

interface Switchable{

    void turnOn();
    void turnOff();
}

class LightBulbb implements Switchable{


    @Override
    public void turnOn(){
        System.out.println("Bulb is on now ...");
    }

    @Override
    public void turnOff(){
        System.out.println("Bulb is off now ..");
    }
}

class UshaFans implements Switchable{

    @Override
    public void turnOn(){
        System.out.println("Turn on the ushafan ");
    }
  
    @Override
    public void turnOff(){
        System.out.println("turn off the ushanfan ...");
    }
}

class Switchh {


    private Switchable devices;

    public Switchh(Switchable devices){
        this.devices = devices;
    }

    public void operate(){
        devices.turnOn();
    }

}