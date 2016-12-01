
public class Main {

    public static void main(String args[]){

        //Card mycard = new Card("4s");
        Card h = new Card(new String[] {"3c", "4s", "5d", "6h", "7h"});
        h.PrintHand();
//        h.addCard("8d");
//        h.addCard("3d");
//        h.PrintHand();
        h.removeCard(1);
        h.PrintHand();

    }



}
