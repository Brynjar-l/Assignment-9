package is.hi.hbv202g.ass9.composite;

import static org.junit.Assert.*;

import is.hi.hbv202g.ass9.compositeObservedTemplateMethod.MultiplyComposite;
import is.hi.hbv202g.ass9.compositeObservedTemplateMethod.NumberLeaf;
import is.hi.hbv202g.ass9.compositeObservedTemplateMethod.PlusComposite;
import org.junit.Test;

public class MixedCompositeTest {

	@Test
	public void testMixedPlusMultiplyComposites() {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		plusComposite.add(number2);

		MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number4);
		multiplyComposite.add(plusComposite);

		assertEquals("(1+2)*4 should return 12", 12, multiplyComposite.getResult());
	}
}
