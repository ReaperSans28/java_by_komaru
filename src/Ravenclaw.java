class Ravenclaw extends Student {
    // Рейвенкло, прикольно звучит
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int intelligence, int wisdom, int wit, int creativity, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("Ум: " + intelligence + ", Мудрость: " + wisdom + ", Острота ума: " + wit + ", Творчество: " + creativity);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void compareRavenclaw(Ravenclaw other) {
        int sum1 = this.getIntelligence() + this.getWisdom() + this.getWit() + this.getCreativity();
        int sum2 = other.getIntelligence() + other.getWisdom() + other.getWit() + other.getCreativity();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + this.getName());
        }
    }
}