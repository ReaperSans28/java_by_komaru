public class Slytherin extends Student {
    // Шляпа миссанула, здесь должен был быть Гарри!!!
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int desireForPower;

    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness, int desireForPower, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("Хитрость: " + cunning + ", Решительность: " + determination + ", Амбициозность: " + ambition + ", Находчивость: " + resourcefulness + ", Жажда власти: " + desireForPower);
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getDesireForPower() {
        return desireForPower;
    }
}