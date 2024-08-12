package dev.pranavtech.week4;

public class Number extends mySubject{
    private int value;
    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }
}
