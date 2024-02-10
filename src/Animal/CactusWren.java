package Animal;

public class CactusWren extends Animal {
    public String gender;
    protected String voice;
    public boolean migration;
    private String species;

    public CactusWren(String gender, String species) {
        super(gender);
        this.gender = gender;
        this.species = species;
    }

    public CactusWren(String gender, String species, String voice, boolean migration) {
        super(gender);
        this.gender = gender;
        this.species = species;
        this.voice = voice;
        this.migration = migration;
    }

    @Override
    public void decription() {
        System.out.println("The species of this Cactus Wren " + species);
        System.out.println("The Cactus Wren's voice sounds:" + voice);
        System.out.println("Can the Catcus Wren migrate:" + migration);

    }

    public static void main(String[] args) throws Exception {

    }
}
