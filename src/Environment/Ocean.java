package Environment;

public class Ocean extends Environment {
    public double temp;
    private double saline;
    protected String regionsName;
    public String name;

    public Ocean(String name) {
        super(name);
        this.name = name;
    }

    public Ocean(String name, double temp, double saline, String regionsName) {
        super(name);
        this.temp = temp;
        this.saline = saline;
        this.regionsName = regionsName;
    }

    @Override
    public void isHabitable() {
        System.out.println("This " + name + "is habitable for this fish.");
        System.out.println("The temperature is: " + temp);
        System.out.println("The saline level is: " + saline);
        System.out.println("The region is: " + regionsName);
    }

    public static void main(String[] args) throws Exception {

    }
}
