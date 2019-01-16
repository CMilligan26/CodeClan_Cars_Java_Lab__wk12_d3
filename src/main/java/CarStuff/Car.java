package CarStuff;

import java.util.ArrayList;

public class Car {

    Engine engine;
    ArrayList<Tyre> tyres;
    Integer price;
    String colour;
    String type;

    public Car(Engine engine, ArrayList<Tyre> tyres, Integer price, String colour, String type){
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public void addDamage(int damageCost) {
        price -= damageCost;
    }

    public void repair(int repairCost){
        price += repairCost;
    }
}
