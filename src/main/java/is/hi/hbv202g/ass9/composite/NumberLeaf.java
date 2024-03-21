package is.hi.hbv202g.ass9.composite;
public class NumberLeaf implements Component{

    private final int number;

    public NumberLeaf(int number) {
        this.number = number;
    }

    public int getResult() {
        return number;
    }


    @Override
    public void operation() {

    }
}
