public class Gryffindor extends Student {
    // ГРИФИНДОР!
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int nobility, int honor, int bravery, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("Благородство: " + nobility + ", Честь: " + honor + ", Храбрость: " + bravery);
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void compareGryffindor(Gryffindor other) {
        int sum1 = this.nobility + this.honor + this.bravery;
        int sum2 = other.nobility + other.honor + other.bravery;
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }
}