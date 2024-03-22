package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {
    private final List<MathExpression> mathExpressionList;
    private int lastObservedResult;

    public MultiplyComposite() {
        mathExpressionList = new ArrayList<MathExpression>();
    }

    public void add(MathExpression mathExpression) {
        mathExpressionList.add(mathExpression);
    }

    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression mathExpression : mathExpressionList) {
            result *= mathExpression.getResult();
        }
        return result;
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
