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
    boolean Ace = false;

    public String[] array;
    ArrayList<String> cards = new ArrayList<String>();
    ArrayList<Integer> arrlist = new ArrayList<Integer>();



    public Card(String[] array) {
        cards.addAll(Arrays.asList(array));
    }



    public String getRank(char rank_index){
        switch(rank_index) {
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
            System.out.println( "\t" + i + " - " + getR() + " of " + getS());
        }
        System.out.println("----------------------------------------");
        hiCard();
        twoPair();
        System.out.println("\n");
    }

    public void twoPair(){
        Collections.sort(cards);
//        for (String i : cards){
//            System.out.println(i);
//        }
        for (String i : cards){
            
        }
        String first = cards.get(0);
        String second = cards.get(1);
        String third = cards.get(2);
        String fourth = cards.get(3);
        if (first.charAt(0) == second.charAt(0) && third.charAt(0) == fourth.charAt(0)){
            System.out.println("Two Pairs: " + "(" + first + " & " + second + ")" + " and " + "(" + third + " & " + fourth + ")");
        }

        }




//    public void twoPair(){
//        Collections.sort(cards);
//        for (String i : cards){
//            System.out.println(i);
//        }
//        if (cards.)
//
//    }



    public void hiCard(){
        for (String i: cards) {
            char rank_index = i.charAt(0);
            char suit_index = i.charAt(1);
            getRank(rank_index);
            getSuit(suit_index);
            if (rank_index == 'A') {
                System.out.println("High Card: A" + suit_index + " (" + getRank(rank_index) + " of " + getSuit(suit_index) + ")");
                Ace = true;
            }

            else {
                int hi = Character.getNumericValue(i.charAt(0));
                arrlist.add(hi);
            }

        }
        if (Ace == false){
            int highest = Collections.max(arrlist);
            String theHighest = String.valueOf(highest);
            for (String i: cards) {
                if (i.contains(theHighest)){
                    char rank_index = i.charAt(0);
                    char suit_index = i.charAt(1);
                    getRank(rank_index);
                    getSuit(suit_index);
                    System.out.println("High card: " + rank_index + suit_index + " (" + getRank(rank_index) + " of " + getSuit(suit_index) + ")");
                }
            }

        }

    }

    public void addCard(String newCard){
    this.cards.add(newCard);
        char rank_index = newCard.charAt(0);
        char suit_index = newCard.charAt(1);
        getRank(rank_index);
        getSuit(suit_index);
        System.out.println("Adding Card: " + getRank(rank_index) + " of " + getSuit(suit_index) + " (" + newCard + ")" + "\n");
    }

    public void removeCard(int card){
        String x = cards.get(card);
        char rank_index = x.charAt(0);
        char suit_index = x.charAt(1);
        getRank(rank_index);
        getSuit(suit_index);
        System.out.println("Removing Card: Index: " + card + ", " + getRank(rank_index) + " of " + getSuit(suit_index) + " (" + rank_index + suit_index + ")" + "\n");
        this.cards.remove(card);
    }

    public void removeCard(String card){
        this.cards.remove(card);
        char rank_index = card.charAt(0);
        char suit_index = card.charAt(1);
        getRank(rank_index);
        getSuit(suit_index);
        System.out.println("Removing Card: " + getRank(rank_index) + " of " + getSuit(suit_index) + " (" + rank_index + suit_index + ")" + "\n");
        this.cards.remove(card);
    }


    public String getR() {
        return r;
    }

    public String getS() {
        return s;
    }



}