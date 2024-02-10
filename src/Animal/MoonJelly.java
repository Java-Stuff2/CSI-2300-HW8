package Animal;

public class MoonJelly extends Animal {
    protected String diet;
    private double avgSize;
    public String color;
    public String gender;

    public MoonJelly(String gender, String color) {
        super(gender);
        this.gender = gender;
        this.color = color;
    }

    public MoonJelly(String gender, String color, String diet, double avgSize) {
        super(gender);
        this.gender = gender;
        this.color = color;
        this.diet = diet;
        this.avgSize = avgSize;
    }

    @Override
    public void decription() {
        System.out.println("Gender: " + gender + "Color: " + color);
        System.out.println("Moon Jellyfish's diet: " + diet + "The average size of a Moon Jellyfish is: " + avgSize);
    }

    public static void main(String[] args) throws Exception {

    }
}
