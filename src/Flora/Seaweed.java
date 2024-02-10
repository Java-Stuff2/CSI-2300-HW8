package Flora;

public final class Seaweed extends Flora {
    protected double depth;
    public String seaweedType;
    private boolean stipePart;
    private String species;

    public Seaweed(String species) {
        super(species);
        this.species = species;

    }

    public Seaweed(String species, boolean stipePart, double depth, String seaweedType) {
        super(species);
        this.species = species;
        this.stipePart = stipePart;
        this.depth = depth;
        this.seaweedType = seaweedType;
    }

    @Override
    public void describe() {
        System.out.println(seaweedType + "This type of seaweed has a " + stipePart + ".");
        System.out.println("Is is found at " + depth + "feet");
        System.out.println("It is from the " + species + "species");
    }

    public static void main(String[] args) throws Exception {

    }

}
