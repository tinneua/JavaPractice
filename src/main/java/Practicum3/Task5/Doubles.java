package Practicum3.Task5;


/**
 * Created by lugovskoy.r on 3/7/16.
 */
public class Doubles {

    public Double parse(String s) {
        StateMachine automat = new StateMachine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            automat.next(c);
        }
        return automat.getResult();
    }

    private static class StateMachine {
        public void next(char c) {
            currentState = currentState.next(c, data);
        }

        State currentState = State.INIT;
        ParseData data = new ParseData();

        public Double getResult() {
            if (currentState == State.NUMBER) {
                return new Double(data.getNumber());
            } else return null;
        }

        public enum State {
            INIT {
                @Override
                public State next(char c, ParseData data) {
                    if ((c - '0') >= 0 && (c - '0') <= 9) {
                        data.addDigit(c - '0');
                        return NUMBER;
                    } else return INVALID_END;
                }
            }, NUMBER {
                @Override
                public State next(char c, ParseData data) {
                    if ((c - '0') >= 0 && (c - '0') <= 9) {
                        data.addDigit(c - '0');
                        return NUMBER;
                    }
                    return INVALID_END;
                }
            }, VALID_END {
                @Override
                public State next(char c, ParseData data) {
                    if (c == ' ') return VALID_END;
                    return INVALID_END;
                }
            }, INVALID_END {
                @Override
                public State next(char c, ParseData data) {
                    return INVALID_END;
                }
            };

            public abstract State next(char c, ParseData data);

        }
    }

    public static class ParseData {
        private int number = 0;

        public int getNumber() {
            return number;
        }

        public void addDigit(int i) {
            number = number * 10 + i;
        }

    }
}
