package game;

public class Refugee implements MoneyGiver,MoneyReceiver{
    
    
    private String name;
    private double money;
    ReceiverEntity expenses = new ReceiverEntity();
    GiverEntity expenses_2=new GiverEntity();
    
    

    @Override
    public double giveMoney(){
        money=money-expenses_2.giveMoney();
        return money;
    }
    
    @Override
    public double receiveMoney(){
       money=money+ expenses.receiveMoney();
       return money;
    }

    public void moveTo() {

    }
}
