package dev.pranavtech.week4;

public class BinNumber implements myObserver{
    private Number n;

    public BinNumber(Number n){
        this.n = n;
        n.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toBinaryString(n.getValue()));
    }
}
