package xwang10_p3x;

import java.util.ArrayList;
import java.util.Random;

/**
 * The GameModel class includes all the card game logic.
 */
public class GameModel {
    /**
     * The player class includes the name of the player and the cards as a queue.
     */
    private static class Player {
        private String name; // To hold the player's name.
        // Create a queue for player's cards
        Queue<Integer> playerCards;

        /**
         * Constructor
         */
        public Player() {
            playerCards = new Queue<>();
        }
    }

    private final Player[] players; // Create Player object
    // Create a stack for the shuffled cards
    Stack<Integer> shuffledStack = new Stack<>();
    // Create a stack for the discard pile
    Stack<Integer> discardedStack = new Stack<>();

    /**
     * Constructor
     * @param playerNum The number of the players.
     */
    public GameModel(int playerNum) {
        players = new Player[playerNum];

        // Differentiate players
        for (int i = 0; i < playerNum; i++) {
            players[i] = new Player();
            players[i].name = "Player " + (i + 1);
        }
        // Reset distributeCards.
        distributeCards();
    }

    /**
     * The getPlayerName method returns the players' name.
     * @param i The index of players.
     * @return The name of the players.
     */
    public String getPlayerName(int i) {
        return players[i].name;
    }

    /**
     * The setCards method creates a set of cards containing 52 cards.
     * @return 52 cards for the game.
     */
    public ArrayList<Integer> setCards() {
        final int CARD_SIZE = 13;
        final int CARD_COPY = 4;
        // Create an ArrayList to hold cards without shuffling
        ArrayList<Integer> cards = new ArrayList<>(CARD_COPY * CARD_SIZE);
        // Assign cards to ArrayList cards
        for (int i = 0; i < CARD_COPY; i++) {
            for (int j = 0; j < CARD_SIZE; j++) {
                cards.add(j + 1);
            }
        }
        return cards;
    }

    /**
     * The shuffleDeck method shuffles the cards.
     * @param cards 52 cards to shuffle.
     * @return The shuffled cards.
     */
    private ArrayList<Integer> shuffleDeck(ArrayList<Integer> cards) {
        Random rand = new Random();
        for (int i = cards.size(); i > 1; i--) {
            int j = rand.nextInt(i);
            int temp = cards.get(i - 1);
            cards.set(i - 1, cards.get(j));
            cards.set(j, temp);
        }
        return cards;
    }

    /**
     * The shuffledStack method push shuffled cards to the stack.
     * @param cards The shuffled cards.
     */
    public void shuffledStack(ArrayList<Integer> cards) {
        for (int i = 0; i < cards.size(); i++) {
            shuffledStack.push(cards.get(i));
        }
    }

    /**
     * The distributeCards method deals cards to different players in a round-robin fashion.
     */
    public void distributeCards() {
        // Call shuffledStack method to obtain the shuffled stack
        shuffledStack(shuffleDeck(setCards()));
        final int PLAYER_CARD_NUM = 7;
        // Deal 7 cards to each player in a round-robin fashion.
        for (int i = 0; i < PLAYER_CARD_NUM; i++) {
            for (int j = 0; j < players.length; j++) {
                players[j].playerCards.enqueue(shuffledStack.pop());
            }
        }
    }

    /**
     * The enqueueCards enqueue cards to player's card queue.
     * @param i The index of player.
     * @param num The card to be enqueued.
     */
    public void enqueueCards(int i, int num) {
        int discardedCardsSize; // The size of the discardedCards
        int topCard; // The top card in the discardedCards
        // Enqueue the card into playerCards
        players[i].playerCards.enqueue(num);
        // If the deal stack ran out of cards, turn over the discardedCards
        if (shuffledStack.empty()) {
            topCard = discardedStack.pop();
            discardedCardsSize = discardedStack.size();
            for (int j = 0; j < discardedCardsSize; j++) {
                shuffledStack.push(discardedStack.pop());
            }
            // Push the next card onto discardedCards.
            discardedStack.push(topCard);
       }
    }

    /**
     * The dequeueCards method plays a card from the player's card queue.
     * @param i The index of player.
     * @return The card to be played.
     */
    public int dequeueCards(int i) {
        return players[i].playerCards.dequeue();
    }

    /**
     * The peekDiscardedCards method returns the top card of the discardedCards.
     * @return The top card.
     */
    public int peekDiscardedStack() {
        return discardedStack.peek();
    }

    /**
     * The popShuffledCards method pops the top card from the shuffledCards.
     * @return The top card to be popped.
     */
    public int popShuffledStack() {
        return shuffledStack.pop();
    }

    /**
     * The playIsEmpty method checks whether the playerCards is empty or not.
     * @param i The index of the players.
     * @return True if it's empty, otherwise false.
     */
    public boolean playIsEmpty(int i) {
        return players[i].playerCards.empty();
    }

    /**
     * The toString method represents the cards the held by the player.
     * @param i The index of players.
     * @return The cards held by the player.
     */
    public String toString(int i) {
        return players[i].playerCards.toString();
    }
}

