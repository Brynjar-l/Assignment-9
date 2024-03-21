package is.hi.hbv202g.ass9.composite;

import java.util.List;
import java.util.ArrayList;

public class PlusComposite implements MathExpression {
    private final List<MathExpression> mathExpressionList;

    public PlusComposite() {
        mathExpressionList = new ArrayList<MathExpression>();
    }

    public void add(MathExpression mathExpression) {      // DUNNO MAYBE REMOVE
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
}
