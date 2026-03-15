package LabAssignment;
public class Game {

    Deck deck = new Deck();
    Player player[];

    Game(int numberOfPlayers) {
        player = new Player[numberOfPlayers];
        player[0] = new Player("Hamna");
    }

    Game(String names[]) {
        player = new Player[names.length];

        for (int i = 0; i < names.length; i++)
            player[i] = new Player(names[i]);
    }

    public void playGame(int rounds) {

        deck.Shuffle();

        for (int r = 0; r < rounds; r++) {

            System.out.println("\nRound " + (r + 1));

            int highest = 0;
            Player winner = null;

            for (int i = 0; i < player.length; i++) {

                Card card = deck.drawCard();
                player[i].setCard(card);

                System.out.println(player[i].name + " drew " + card);

                if (card.getValue() > highest) {
                    highest = card.getValue();
                    winner = player[i];
                }
            }

            if (winner != null) {
                winner.addScore();
                System.out.println("Winner: " + winner.name);
            }
        }
    }

    public void showWinner() {

        Player winner = player[0];

        for (int i = 1; i < player.length; i++) {
            if (player[i].score > winner.score)
                winner = player[i];
        }

        System.out.println("\nFinal Winner: " + winner.name +
                " Score: " + winner.score);
    }

    public String toString() {

        StringBuilder playerDetail = new StringBuilder();

        for (int i = 0; i < player.length; i++)
            playerDetail.append(player[i] + "\n");

        return playerDetail.toString();
    }
}


class Player {

    String name;
    int score;
    Card hand;

    Player(String name) {
        this.name = name;
        score = 0;
    }

    public void setCard(Card card) {
        hand = card;
    }

    public Card getCard() {
        return hand;
    }

    public void addScore() {
        score++;
    }

    public String toString() {
        return name + " Score: " + score;
    }
}