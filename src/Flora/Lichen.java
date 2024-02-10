package Flora;

public class Lichen extends Flora {
    protected boolean poisonus;
    public double growth;
    private String species;

    public Lichen(String species) {
        super(species);
        this.species = species;
    }

    public Lichen(String species, boolean poisonus, double growth) {
        super(species);
        this.species = species;
        this.poisonus = poisonus;
        this.growth = growth;
    }

    @Override
    public void describe() {

        System.out.println("The species of this specific lichen is: " + species);
        System.out.println("It is " + poisonus);
        System.out.println("Its average growth is: " + growth);
    }

    public static void main(String[] args) throws Exception {

    }
}
