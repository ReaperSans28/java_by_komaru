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

    public void compareSlytherin(Slytherin other) {
        int sum1 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.desireForPower;
        int sum2 = other.cunning + other.determination + other.ambition + other.resourcefulness + other.desireForPower;
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизеренец, чем " + this.getName());
        }
    }
}