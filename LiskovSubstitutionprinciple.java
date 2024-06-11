//Liskov substitution principle states that subtypes must be substitution for their base types...


// BEFORE LISKOV SUBSTITUTION PRINCIPLE 

class Bird{

    public void fly(){
        System.out.println("bird is fying in the sky.. ");
    }
}

class Ostrich extends Bird{

    @Override
    public void fly(){
        System.out.println("ostrich never fly..");
        throw new UnsupportedOperationException("ostrich never fly..");
    }
}


// AFTER LISKOV SUBSTITUTION PRINCIPLE 

class Birdd{
    
    public void flyy(){
        System.out.println("bird is flying in the sky..!");
    }
}
class FlyingBird extends Birdd{


    @Override
    public void flyy(){
        System.out.println("bird flying in the sky..");
    }
}

class Ostrichh extends Birdd{

    public void flying(){

        System.out.println("ostrich never fly in the sky...");

    }
}