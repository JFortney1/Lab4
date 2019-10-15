/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jfortney
 */
public class CarClass {

    private int yearModel;
    private String make;
    private int speed;

    public CarClass() {
        this.yearModel = 2005;
        this.make = "Ford";
        this.speed = 0;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed -= 5;
    }

    public static void main(String[] args) {

        CarClass car = new CarClass();
        for (int i = 0; i < 5; ++i) {
            car.accelerate();
            System.out.println("Speed of the car: " + car.getSpeed());
        }
        for (int i = 0; i < 5; ++i) {
            car.brake();
            System.out.println("Speed of the car: " + car.getSpeed());
        }
    
    }
}
