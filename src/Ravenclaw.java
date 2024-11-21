class Ravenclaw extends Student {
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
}