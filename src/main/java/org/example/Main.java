package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class  Vehicle{
    ;
    int numberOfWheels;
    String color;
    float engineSize;
    String fuelType;

    public Vehicle(  int numberOfWheels, String color,float engineSize, String fuelType){

        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public void introduce(){

        System.out.println("it has " + numberOfWheels + " wheels, " + color + ", weighs" + engineSize + ", and has " + fuelType + "fuel type." );

    }
}

class Car extends Vehicle{
    String brand;



    public Car (int numberOfWheels, String color,float engineSize, String fuelType, String brand){
        super( numberOfWheels, color, engineSize, fuelType );
        this.brand = brand;
    }
    public void name(){
        introduce();
        System.out.println("The car's price is $" + brand+ "." );
    }
}
public class Main{
    public static void main (String[] args){
        Car car = new Car(4, "Blue", 100.90f, "gas" , "Toyota");
        car.name();
    }
}
