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
}