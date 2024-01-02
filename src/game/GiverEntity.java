package game;




public class GiverEntity implements MoneyGiver {
    private String name;
    private double money=10.000;
    
    @Override
    public void giveMoney(){
        money=money-1000;
        System.out.println("the money are deducted");
    }
    
    //Create object called Ngo Bank using this class
    
}
