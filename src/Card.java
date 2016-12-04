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
    String name;
    String yo;

    public String[] array;
    ArrayList<String> cards = new ArrayList<String>();
    ArrayList<Integer> arrlist = new ArrayList<Integer>();
    ArrayList<String> duplicates = new ArrayList<String>();
    Set<String> v = new HashSet<>();



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

    public String getName() {
        for(String i : cards) {
            char rank_index = i.charAt(0);
            char suit_index = i.charAt(1);
            name = String.valueOf(rank_index + suit_index);
        }
        return name;
    }

    public void twoPair() {
        System.out.println("Pairs: ");
        for(String t : cards) {
            char rank_index = t.charAt(0);//no need to convert to string
            for (String i : cards) {
                if (!i.equals(t) && i.charAt(0) == rank_index)
                    System.out.println(i);
            }
        }
    }

//    public void twoPair() {
//        for(String t : cards) {
//            char rank_index = t.charAt(0);
//            yo = String.valueOf(rank_index);
//            //if (t.startsWith(yo)) System.out.println(t);
//        }
//        for (String i : cards) {
//            if (i.startsWith(yo)) System.out.println(i);
//        }
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



//    public void twoPair(){
//        Collections.sort(cards);
//        for (int i = 0; i < cards.size();){
//            String first = cards.get(i);
//            String second = cards.get(i + 1);
//            if (first.charAt(0) == second.charAt(0)){
//                duplicates.add(first);
//                duplicates.add(second);
//            }
//            i++;
//
//        }
//        System.out.println(duplicates);



//    public void twoPair(){
//        Collections.sort(cards);
//        for (int t = 0; t< cards.size();){
//            String first = cards.get(t);
//            String second = cards.get(t + 1);
//            if (first.charAt(0) == second.charAt(0)) {
//                duplicates.add(first);
//                duplicates.add(second);
//                t++;
//            }
//        }
//        System.out.println(duplicates);
//
//    }

/////////KIND OF WORKD//////////////////
//    public void twoPair(){
//        for(String i: cards){
//            char rank_index = i.charAt(0);
//            char suit_index = i.charAt(1);
//            String Ri = String.valueOf(rank_index);
//            String Si = String.valueOf(suit_index);
//            getRank(rank_index);
//            getSuit(suit_index);
//            if (v.add(Ri) ==false){
//                System.out.println("Pairs: " + cards.contains(Ri));
//            }
//
//        }