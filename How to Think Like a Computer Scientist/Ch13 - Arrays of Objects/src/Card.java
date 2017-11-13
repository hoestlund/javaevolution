public class Card {
    int suit, rank;

    public Card(){
        this.suit = 0;
        this.rank = 0;
    }

    public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    private void printCard(){
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        //The zeroeth element should not be used so we insert the placeholder
        String[] ranks = { "placholder", "Ace", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Jack", "Queen", "King" };

    }
}
