
//Open /Close principle states that the class should open for extensions and close for 
// modifications...

// Before open / close principle ....

 class Rectangle {

    public double length;
    public double width;
   
}

class AreaCalculator{

    public double calculateRectangleAria(Rectangle rectangle){

        return rectangle.length * rectangle.width ;

    }
}

//AFTER OPEN / CLOSE PRINCIPLE 
interface Shape {

    double calculateArea();

}

class Rectanglee implements Shape{

    public double length;
    public double width;

    @Override
    public double calculateArea(){
        return length * width;
    }

}

class Circle implements Shape{

    public double radius;

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius ;
    }
}

class AreaCalculatorr{
    public double calculateArea(Shape shape){

        return shape.calculateArea();

    }
}