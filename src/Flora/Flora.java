package Flora;

public abstract class Flora {
    protected String name;
    private String species;
    public double growth;// in feet

    public Flora(String name) {
        this.name = name;
    }

    public Flora(String name, String species, double growth) {
        this.name = name;
        this.species = species;
        this.growth = growth;
    }

    public abstract void describe();

    public void description() {
        System.out.println("This " + name + "is from the " + species);
        System.out.println("It's average growth is " + growth);
    }

    public static void main(String[] args) throws Exception {

    }
}
