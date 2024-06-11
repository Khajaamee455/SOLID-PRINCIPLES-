
// Single responsibility principle states that a class should be have only one reason to chenge 
// means calss should have only one responsibility ...

// Befor single responisibility principle
class User {

    public String name;
    public String email;


    public void saveToDatabase(){
        System.out.println("data saved to database..");
    }

    public void sendEmail(){
        System.out.println("Email sent to user...!");
    }
    
}



// After single responisbility principle 

class Userr{
    public String Name;
    public String Email;
}

class UserRepository {
    public void saveTodatabase(User user){
        System.out.println("data saved to database..!");

    }
}

class EmailService{

    public void sendemail(Userr userr){
        System.out.println("Email sent successfully..!");
    }
}


// This is a clear and accurate demostration of single responsibility principel how we can use it ....