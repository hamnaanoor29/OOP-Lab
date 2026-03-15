package LabAssignment.Assignment1;

public class Demo {
    public static void main(String args[]) {
        Deck deck=new Deck();
        deck.displayDeck();
        deck.Shuffle();
        System.out.println();
        deck.displayDeck();
        String names[]={"Hamna","Ahmad","Sarah"};
        Game game1 = new Game(names);

        game1.playGame(5);

        game1.showWinner();
    }
}