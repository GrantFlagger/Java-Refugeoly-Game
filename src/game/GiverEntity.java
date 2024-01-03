package game;




public class GiverEntity implements MoneyGiver {
    private String name;
    private double money;
    
    @Override
    public double giveMoney(){
        return money;
    }
    
    //Create object called Ngo Bank using this class
    
}
