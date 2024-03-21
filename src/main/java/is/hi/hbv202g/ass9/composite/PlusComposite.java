package is.hi.hbv202g.ass9.composite;

import java.util.List;
import java.util.ArrayList;

public class PlusComposite implements Component{
    private final List<Component> componentList;

    public PlusComposite() {
        componentList = new ArrayList<Component>();
    }

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public List<Component> getChildren() {
        return componentList;
    }


    // TODO: WHAT DOES THIS DO
    @Override
    public void operation() {

    }
}
