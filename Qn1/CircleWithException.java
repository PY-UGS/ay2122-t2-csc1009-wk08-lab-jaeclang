package Qn1;

import java.util.Scanner;


public class CircleWithException {
    static final double PI = 3.1415;
    double radius;

    public CircleWithException(){

    }
    public CircleWithException(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) throws IllegalArgumentException{
        if(radius > 0){
            this.radius = radius;
        }
        else{
            throw new IllegalArgumentException("Input Radius is a negative number! Radius cannot be negative number!");
        }

    }
    public double getArea() throws Exception{
        double area = this.radius * PI * PI;
        if(area > 1000){
            throw new Exception("Area cannot be bigger than 1000!");
        }
        return area;
    }

    public double getDiameter(){
        return 2 *PI;
    }

    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Input the Radius of the Circle: ");
            double input_radius = scan.nextDouble();
            try{
                CircleWithException myCircle = new CircleWithException();
                myCircle.setRadius(input_radius);
                System.out.println("Radius: " + myCircle.getRadius());
                System.out.println("Area: " + myCircle.getArea());
            }
            catch(IllegalArgumentException e) {
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
