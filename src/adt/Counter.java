package adt;

public class Counter {

    private int amount;
    
    private String name;
    
    public Counter(String name) {
        this.name = name;
        this.amount = 0;
    }
    
    public void increment() {
        this.amount ++;
    }
    
    public int getCurrentValue() {
        return amount;
    }
    
    public String toString() {
        return name + ":" + amount;
    }
}
