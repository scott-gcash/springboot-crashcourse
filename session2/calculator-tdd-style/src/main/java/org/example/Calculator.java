package org.example;

public class Calculator {
    private boolean status = false;

    public boolean isOn() {
        return this.status;
    }

    public void turnOn(){
        this.status = true;
    }

    public void turnOff(){
        this.status = false;
    }

    public boolean isOff(){
        return !this.status;
    }

    public int sum(int sum1, int sum2){
        return sum1 + sum2;
    }

    public float sum(float sum1, float sum2){
        return sum1 + sum2;
    }
}
