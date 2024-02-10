package Environment;

// import Environment.River;
// import Environment.Ocean;
// import Environment.Mountain;

public abstract class Environment {
    public String name;
    protected String regionName;

    public Environment(String name) {
        this.name = name;
    }

    public Environment(String name, String regionName) {
        this.name = name;
        this.regionName = regionName;
    }

    public abstract void isHabitable();

    public boolean isHabitableq() {
        System.out.println("This is habitable for:" + name);
        return true;
    }

    public static void main(String[] args) throws Exception {

    }
}
