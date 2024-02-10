package Animal;

public abstract class Animal {
    public String gender;
    protected int age;
    private boolean domesticated;

    public Animal(String gender) {
        this.gender = gender;
    }

    public Animal(String gender, int age, boolean domesticated) {
        this.gender = gender;
        this.age = age;
        this.domesticated = domesticated;
    }

    public abstract void decription();

    public void description() {
        System.out.println("The gender of this " + gender);
        System.out.println("The age of this animal is:" + age);
        System.out.println("This animal is:" + domesticated);

    }

    public static void main(String[] args) throws Exception {

    }
}
