class Hufflepuff extends Student {
    // Хуффлепуф????
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

    public void compareHufflepuff(Hufflepuff other) {
        int sum1 = this.getDiligence() + this.getLoyalty() + this.getHonesty();
        int sum2 = other.getDiligence() + other.getLoyalty() + other.getHonesty();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + this.getName());

        }
    }
}