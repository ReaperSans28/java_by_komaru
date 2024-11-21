public class Gryffindor extends Student {
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
        System.out.println("Ноблесть: " + nobility + ", Честь: " + honor + ", Храбрость: " + bravery);
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
}