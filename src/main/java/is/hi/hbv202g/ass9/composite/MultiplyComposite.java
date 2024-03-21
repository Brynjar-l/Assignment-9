package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {

    private final List<MathExpression> mathExpressionList;

    public MultiplyComposite() {
        mathExpressionList = new ArrayList<MathExpression>();
    }

    public void add(MathExpression mathExpression) {
        mathExpressionList.add(mathExpression);
    } // MAYBE REMOVE

    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression mathExpression : mathExpressionList) {
            result *= mathExpression.getResult();
        }
        return result;
    }
}
