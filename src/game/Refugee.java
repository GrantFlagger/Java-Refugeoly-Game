package game;

public class Refugee implements MoneyGiver,MoneyReceiver{
    
    
    private String name;
    private double money;
    private double expenses;
    

    @Override
    public void giveMoney(){
        money=money-expenses;
        expenses=expenses+money;
    }
    
    public void receiveMoney(){
        
    }

    public void moveTo() {

    }
}
