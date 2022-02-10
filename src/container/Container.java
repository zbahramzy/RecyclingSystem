package container;

public abstract class Container {
    //attributes
    protected String containerType;
    protected double containerValue;
    //constructor
    public Container(String pantType, double pantValue) {
        setContainerType(pantType);
        setContainerValue(pantValue);
    }
    //getters
    public String getContainerType() {
        return containerType;
    }
    public double getContainerValue() {
        return containerValue;
    }
    //setters
    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }
    public void setContainerValue(double containerValue) {
        this.containerValue = containerValue;
    }
}