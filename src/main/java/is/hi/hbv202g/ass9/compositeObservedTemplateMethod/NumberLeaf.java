package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;

public class NumberLeaf extends Observable implements MathExpression {

    private int number;

    public NumberLeaf(int number) {
        this.number = number;
        observers = new ArrayList<Observer>();
    }

    @Override
    public int getResult() {
        return number;
    }

    public void setValue(int number) {
        this.number = number;
        notifyObservers();
    }
}
