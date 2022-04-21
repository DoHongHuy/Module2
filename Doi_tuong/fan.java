package com.Doi_tuong;

public class fan {

    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private String color = "blue";
    private double radius = 5;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn(){
        return on;
    }
    public String getColor(){
        return color;
    }
    public double getRadius(){
        return radius;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public fan(){

    }
    public fan(int speed,boolean on, String color,double radius){
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public String toString(){
        String state = "";
        if(this.isOn()){
            state += ("Fan is on\n");
            state += ("Speed: " + this.speed + "\n");
        }else {
            state += ("Fan is off \n");
        }
        state += ("Color: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }
    public static void main(String[] args) {
        fan fan1 = new fan(3,true,"Yellow",10);
        fan fan2 = new fan(2,false,"Blue",5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

}