package Animal;

public class Carp extends Animal {
    public String gender;
    public String color;
    protected String carpType;
    private double lifeSpan;

    public Carp(String gender, String color) {
        super(gender);
        this.gender = gender;
        this.color = color;
    }

    public Carp(String gender, String color, String carpType, double lifeSpan) {
        super(gender);
        this.gender = gender;
        this.color = color;
        this.carpType = carpType;
        this.lifeSpan = lifeSpan;
    }

    @Override
    public void decription() {
        System.out.println("Gender:" + gender + "Color:" + color);
        System.out.println("Carp Breed: " + carpType + "Its lifespan: " + lifeSpan);
    }

    public static void main(String[] args) throws Exception {

    }
}
