package dev.pranavtech.week4;

public class HexNumber implements myObserver{
    private Number n;

    public HexNumber(Number n){
        this.n = n;
        n.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toHexString(n.getValue()));
    }
}
