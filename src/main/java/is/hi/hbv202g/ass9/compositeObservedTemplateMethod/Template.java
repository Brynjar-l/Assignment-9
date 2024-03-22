package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.List;

public abstract class Template implements MathExpression, Observer{
    protected List<MathExpression> mathExpressionList;
    protected int lastObservedResult;

    public final void add(MathExpression mathExpression) {
        mathExpressionList.add(mathExpression);
    }

    @Override
    public abstract int getResult();

    public final int getLastObservedResult() {
        return lastObservedResult;
    }

    @Override
    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }



}
