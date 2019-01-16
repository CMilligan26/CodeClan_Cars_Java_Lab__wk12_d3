package CarStuff;

import java.util.ArrayList;

public class Car {

    Engine engine;
    ArrayList<Tyre> tyres;
    Integer price;
    String colour;
    String type;
    Integer maxPrice;

    public Car(Engine engine, ArrayList<Tyre> tyres, Integer price, String colour, String type){
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.maxPrice = price;
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
        if (price < 0){
            price = 0;
        }
    }

    public void repair(int repairCost){
        price += repairCost;
        if (price > maxPrice ) {
            price = maxPrice;
        }
    }
}
