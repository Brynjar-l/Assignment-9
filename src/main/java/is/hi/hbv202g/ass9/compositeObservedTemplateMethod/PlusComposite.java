package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;

public class PlusComposite extends Template {

    public PlusComposite() {
        mathExpressionList = new ArrayList<MathExpression>();
    }

    @Override
    public int getResult() {
        int result = 0;
        for (MathExpression mathExpression : mathExpressionList) {
            result += mathExpression.getResult();
        }

        return result;
    }




}