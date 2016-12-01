import java.util.*;

public class Card {

    private final String[] suit = {"clubs", "diamonds", "hearts", "spades"};
    private final String[] rank = {"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private String cardGiven;
    private char rank_index;
    private char suit_index;
    private String r;
    private String s;
    private String x;

    public String[] array;
    ArrayList<String> cards = new ArrayList<String>();

    Card(String cardGiven){
        this.cardGiven = cardGiven;

//        for (String s : cards){
//            s = cardGiven;
//            char rank_index = s.charAt(0);
//            char suit_index = s.charAt(1);
//            getRank(rank_index);
//            getSuit(suit_index);
        }
//        char rank_index = cardGiven.charAt(0);
//        char suit_index = cardGiven.charAt(1);
//        getRank(rank_index);
//        getSuit(suit_index);
//    }
    public Card(String[] array) {
        cards.addAll(Arrays.asList(array));

//        for (String i: cards){
//            char rank_index = i.charAt(0);
//            char suit_index = i.charAt(1);
//            getRank(rank_index);
//            getSuit(suit_index);
//            System.out.println(getR() + getS());
//        }
    }



    public String getRank(char rank_index){
        switch(rank_index) {
            case '1':
                r = "Ace";
                break;
            case '2':
                r = "Two";
                break;
            case '3':
                r = "Three";
                break;
            case '4':
                r = "Four";
                break;
            case '5':
                r = "Five";
                break;
            case '6':
                r = "Six";
                break;
            case '7':
                r = "Seven";
                break;
            case '8':
                r = "Eight";
                break;
            case '9':
                r = "Nine";
                break;
            case '0':
                r = "Ten";
                break;
            case 'J':
                r = "Jack";
                break;
            case 'Q':
                r = "Queen";
                break;
            case 'K':
                r = "King";
                break;
            case 'A':
                r = "Ace";
                break;
        }
        return r;

    }

    public String getSuit(char suit_index) {
        //this.suit_index = suit_index;
        //this.s = s;
        switch (suit_index) {
            case 'c':
                s = "Clubs";
                break;
            case 'd':
                s = "Diamonds";
                break;
            case 'h':
                s = "Hearts";
                break;
            case 's':
                s = "Spades";
                break;
        }
        return s;
    }



    public void PrintHand(){
        System.out.println("Cards: " + cards);
        for (String i: cards){
            char rank_index = i.charAt(0);
            char suit_index = i.charAt(1);
            getRank(rank_index);
            getSuit(suit_index);
            System.out.println(i + " - " + getR() + " of " + getS());
        }
    }


    public String getCardGiven() {
        return cardGiven;
    }

    public void setCardGiven(String cardGiven) {
        this.cardGiven = cardGiven;
    }

    public String getR() {
        return r;
    }

    public String getS() {
        return s;
    }


}





//    public String getRank(char rank_index){
//
//        switch(rank_index) {
//            case
//        }
//        return null;
//    }