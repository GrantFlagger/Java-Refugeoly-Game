package game;

public class RecieverEntity implements MoneyReceiver {

    private String name;
    private double money;

    public void receiveMoney() {
        money=money+expenses;
    }

    //Create object called Mafia Bank using this class
}
