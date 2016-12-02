
public class Main {

    public static void main(String args[]){

        Card h = new Card(new String[] {"3c", "4s", "5d", "6h", "7h"});
        h.PrintHand();
        h.addCard("8d");
        h.addCard("3d");
        h.removeCard(2);
        h.PrintHand();
//        h.addCard("9s");
//        h.addCard("5h");
//        h.addCard("As");
//        h.addCard("5s");
       h.removeCard("3c");
        h.PrintHand();
    }



}
