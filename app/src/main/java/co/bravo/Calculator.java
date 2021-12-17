package co.bravo;
import java.util.Objects;

public class Calculator {
    Integer term = 0, result = null;
    Operator operator;

    public enum Operator {
        ADD, MINUS, DIVIDE, MULTIPLY
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void equals() {
        switch (operator) {
            case ADD -> add();
            case MINUS -> minus();
            case DIVIDE -> divide();
            case MULTIPLY -> multiply();
            default -> result = 0;
        }
    }
    
    public void add() {
        if (result == null) {
            result = term;
        } else {
            result += term;
        }
        operator = Operator.ADD;
    }

    public void minus() {
        if (result == null) {
            result = term;
        } else {
            result -= term;
        }
        operator = Operator.MINUS;
    }

    private void divide() {
        result = 1;
    }

    public void multiply() {
        if (result == null) {
            result = term;
        } else {
            result *= term;
        }
        operator = Operator.MULTIPLY;
    }

    public void allClear() {
        term = 0;
        result = null;
        operator = null;
    }

    public int getResult() {
        return Objects.requireNonNullElse(result, 0);
    }
}
