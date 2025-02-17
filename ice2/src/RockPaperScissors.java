public class RockPaperScissors {
    public static enum Object { ROCK, PAPER, SCISSORS }
    private Object value;
    public RockPaperScissors(Object value) {
        value = Object.ROCK;
        switch (Object.ROCK) {
            case PAPER:
                break;
            case SCISSORS:
                break;
            case ROCK:
                break;
        }
    }
    public Object getValue() {
        return value;
    }
}
