package is.hi.hbv202g.ass9.compositeObserved;
public class NumberLeaf implements MathExpression {

    private int number;

    public NumberLeaf(int number) {
        this.number = number;
    }

    @Override
    public int getResult() {
        return number;
    }
}
