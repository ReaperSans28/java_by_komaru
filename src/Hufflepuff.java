class Hufflepuff extends Student {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int diligence, int loyalty, int honesty, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("Трудолюбие: " + diligence + ", Верность: " + loyalty + ", Честность: " + honesty);
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;

    }
}