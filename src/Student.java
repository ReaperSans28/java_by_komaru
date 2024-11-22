class Student {
    // А могли быть студентами Singularity hub, вообще-то тоже волшебное место
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Student(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void showProperties() {
        System.out.println("Имя: " + name + ", Сила магии: " + magicPower + ", Расстояние трансгрессии: " + transgressionDistance);
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void compareMagic(Student other) {
        if (this.getMagicPower() + this.getTransgressionDistance() > other.getMagicPower() + other.getTransgressionDistance()) {
            System.out.println(this.getName() + " сильнее, чем " + other.getName());
        } else if (this.getMagicPower() + this.getTransgressionDistance() < other.getMagicPower() + other.getTransgressionDistance()) {
            System.out.println(other.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + other.getName() + " равны по силе магии и трансгрессии.");
        }
    }
}