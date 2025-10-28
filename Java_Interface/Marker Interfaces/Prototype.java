public class Prototype implements Cloneable {
    private String name;

    public Prototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public String toString() {
        return "Prototype[name=" + name + "]";
    }
}