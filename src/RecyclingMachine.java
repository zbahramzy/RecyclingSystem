import container.*;
import java.util.ArrayList;

public class RecyclingMachine {
    private ArrayList<Container> A = new ArrayList<>();
    private ArrayList<Container> B = new ArrayList<>();
    private ArrayList<Container> C = new ArrayList<>();
    //private int totalNumberOfItems;
    private double monetaryRefund;

    public void insertContainer(Container type) {
        if(type.getContainerType() == "A") {
            A.add(type);
        } else if (type.getContainerType() == "B") {
            B.add(type);
        } else {
            C.add(type);
        }
    }

    public int numberOfItemsA() {
        return A.size();
    }
    public int numberOfItemsB() {
        return B.size();
    }
    public int numberOfItemsC() {
        return C.size();
    }
    public int totalNumberOfItems() {
        return numberOfItemsA() + numberOfItemsB() + numberOfItemsC();
    }
}