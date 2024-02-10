package Environment;

public class River extends Environment {
    protected double depth;
    private String maturity;
    public String shape;
    public String name;

    public River(String name) {
        super(name);
        this.name = name;
    }

    public River(String name, String shape, double depth, String maturity) {
        super(name);
        this.shape = shape;
        this.depth = depth;
        this.maturity = maturity;
    }

    @Override
    public void isHabitable() {
        System.out.println("This " + name + "is habitable for this fish.");
        System.out.println("The depth of this river is: " + depth);
        System.out.println("The shape of this river is: " + shape);
        System.out.println("The maturity is: " + maturity);

    }

    interface Rivers {
        void display();
    }

    class MississippiRiver implements Rivers {

        public final void display() {
            System.out.println("The Mississippi River is the second longest river.");
        }

    }

    class OhioRiver implements Rivers {

        public final void display() {
            System.out.println("The Ohio River is the source of drinking water for almost 10% of the US population");
        }

    }

    class YukonRiver implements Rivers {

        public final void display() {
            System.out.println("The Yukon River is the third and fourth longest river system in the North America");
        }

    }
class ColoradoRiver implements Rivers{
    public final void display() {
        System.out.println("The Colorado River is the sixth longest river system in the North America");
    }
}
    public static void main(String[] args) throws Exception {

    }
}
