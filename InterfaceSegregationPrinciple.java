
//  Interface segrigation principle states that client should not be force to depends on interfaces 
// they do not use ...

// BEFORE INTERFACE SEGRIGATION PRINCIPLE 

interface Worker{
    
    public void work();
    public void eat();
}


class HumanWorker implements Worker{

    @Override
    public void work(){
        System.out.println("Humans are working in their hole life ..");
    }

    @Override
    public void eat(){
        System.out.println("They can eat every 3 hours ..");
    }
}


class RobotWorker implements Worker{

    @Override
    public void work(){
        System.out.println("Robots are working ..");
    }

    @Override
    public void eat(){
        throw new UnsupportedOperationException("Robots never eat..");
    }
}



//**************************** */ AFTER INTERFACE SEGREGATION PRINCIPLE ********************************************

interface  Workable{

    public void work();
}


interface Eatable {

    public void eat();
}


class HumanWorkerrs implements Workable , Eatable{

    @Override
    public void work(){
        System.out.println("Humans are working ...");
    }

    @Override
    public void eat(){
        System.out.println("Humans eat 3 times in a day..");
    }
}

class Robots implements Workable{


    @Override
    public void work(){
        System.out.println("In working Robots are better than humans..");
    }
}