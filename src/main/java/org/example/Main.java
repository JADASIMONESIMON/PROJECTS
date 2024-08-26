package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Vechicle{
    String brand;

    public Vechicle(String brand){
        this.brand = brand;
    }

    public void introduce(){
        System.out.println("This Vechicle is " + brand + ".");
    }
}

class Car extends Vechicle{
    int price;

    public Car(String brand, int price){
        super(brand);
        this.price = price;
    }
    public void sale(){
        introduce();
        System.out.println("The car's price is $" + price + "." );
    }
}
public class Main{
    public static void main (String[] args){
        Car car = new Car("Toyota", 12000);
        car.sale();
    }
}
