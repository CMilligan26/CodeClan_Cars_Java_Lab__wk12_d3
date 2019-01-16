package DealershipStuff;

public class Till {

    Integer money;

    public Till(){
        this.money = 0;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int income){
        money += income;
    }
}
