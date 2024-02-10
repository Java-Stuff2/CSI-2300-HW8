package Environment;

public class Mountain extends Environment {
    protected double oTwoLvl;
    private double pressureLvl;
    public double temps;
    public String name;

    public Mountain(String name) {
        super(name);
        this.name = name;
    }

    public Mountain(String name, float oTwoLvl, double pressureLvl, double temps) {
        super(name);
        this.oTwoLvl = oTwoLvl;
        this.pressureLvl = pressureLvl;
        this.temps = temps;

    }

    @Override
    public void isHabitable() {

        System.out.println(name + " is habitable.");
        System.out.println("The temperature is: " + temps);
        System.out.println("The oxygen level is: " + oTwoLvl + "%");
        System.out.println("The average pressure level is: " + pressureLvl + "\n");

    }

    interface Mountains {
        void display();
    }

    class MountWilson implements Mountains {

        public final void display() {
            System.out.println("Mount Wilson has 4 glaciers on its summit");
        }

    }

    class MountRainier implements Mountains {
        public final void display() {
            System.out.println("Mount Rainier has the largest volcanic glacier cave system (within the summit crater)");

        }

    }

    class BearMountain implements Mountains {
        public final void display() {
            System.out.println("Bear Mountain has bears.");
        }
    }

    public final void display() {

    }

    public static void main(String[] args) throws Exception {
        Mountain MountRainier = new Mountain("MountRainier");
        System.out.println("Mount Rainier has the largest volcanic glacier cave system (within the summit crater)");
        MountRainier.display();
        MountRainier.isHabitable();

        Mountain MountWilson = new Mountain("MountWilson");

        System.out.println("Mount Wilson has 4 glaciers on its summit");
        MountWilson.display();
        MountWilson.isHabitable();

        Mountain BearMountain = new Mountain("BearMountain");
        System.out.println("Bear Mountain has bears.");
        MountWilson.display();
        BearMountain.isHabitable();
    }
}
