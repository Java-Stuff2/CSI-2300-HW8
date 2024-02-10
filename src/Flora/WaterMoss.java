package Flora;

public final class WaterMoss extends Flora {
    public String species;
    protected String waterMossType;
    private int waterAbsorption;

    public WaterMoss(String species) {
        super(species);
        this.species = species;
    }

    public WaterMoss(String species, String waterMossType, int waterAbsorption) {
        super(species);
        this.species = species;
        this.waterMossType = waterMossType;
        this.waterAbsorption = waterAbsorption;
    }

    @Override
    public void describe() {
        System.out.println(waterMossType + "This type of water moss is from the: " + species + "species.");
        System.out.println("On average, it can absorb: " + waterAbsorption + "times its weight");
    }

    public static void main(String[] args) throws Exception {

    }
}
