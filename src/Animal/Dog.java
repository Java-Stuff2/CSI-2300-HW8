package Animal;

public class Dog extends Animal {
    public String gender;
    protected String sound;
    private String dogBreed;
    public int age;

    public Dog(String gender, String sound) {
        super(gender);
        this.gender = gender;
        this.sound = sound;
    }

    public Dog(String gender, String sound, String dogBreed, int age) {
        super(gender);
        this.gender = gender;
        this.sound = sound;
        this.dogBreed = dogBreed;
        this.age = age;
    }

    @Override
    public void decription() {
        System.out.println("The gender of this dog is:" + gender);
        System.out.println("The dog goes:" + sound);
        System.out.println("The breed of this dog is:" + dogBreed + ". The dog is " + age + "old.");

    }

    public static void main(String[] args) throws Exception {

    }
}
