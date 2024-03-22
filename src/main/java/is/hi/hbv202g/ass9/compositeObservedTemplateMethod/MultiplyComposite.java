package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;

public class MultiplyComposite extends Template {

    public MultiplyComposite() {
        mathExpressionList = new ArrayList<MathExpression>();
    }

    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression mathExpression : mathExpressionList) {
            result *= mathExpression.getResult();
        }

        return result;
    }

}