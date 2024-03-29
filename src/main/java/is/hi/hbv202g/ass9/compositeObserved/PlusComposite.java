package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {
    private final List<MathExpression> mathExpressionList;

    private int lastObservedResult;

    public PlusComposite() {
        mathExpressionList = new ArrayList<MathExpression>();
    }

    public void add(MathExpression mathExpression) {
        mathExpressionList.add(mathExpression);
    }

    @Override
    public int getResult() {
        int toReturn = 0;
        for (MathExpression mathExpression : mathExpressionList) {
            toReturn += mathExpression.getResult();
        }

        return toReturn;
    }

    @Override
    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
