package game;

public class ReceiverEntity implements MoneyReceiver {

    private String name;
    private double money;

    @Override
    public double receiveMoney() {
        return money;
    }

    //Create object called Mafia Bank using this class
}
