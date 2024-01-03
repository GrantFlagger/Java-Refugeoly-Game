package game;

import java.util.ArrayList;

public class Board {
    
  

//Creating an arrayList with squares class
  
    ArrayList<Squares> squareList = new ArrayList<>();

    public void addSqaure() {
       for (int i = 0; i < 40; i++) {
            Squares squares = new Squares();
            squareList.add(squares);
       }

    }

    public void getSqaure() {
        
        
        
    }

}


