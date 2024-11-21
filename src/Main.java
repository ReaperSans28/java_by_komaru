class Hogwarts {
    public static void main(String[] args) {
        // Шаманы Токийского магического коллед... А не, это просто студенты Хогвартса
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 28, 8, 42, 3, 9);
        Gryffindor ron = new Gryffindor("Рон Уизли", 9, 99, 99, 99, 0);
        Gryffindor harry = new Gryffindor("Гарри Поттер", 0, 0, 0, 9, 0);

        Slytherin draco = new Slytherin("Драко Малфой", 0, 100, 99, 80, 100, 68, 70);
        Slytherin grehem = new Slytherin("Грэхэм Монтегю", 34, 63, 61, 54, 74, 24, 54);
        Slytherin gregory = new Slytherin("Грегори Гойл", 60, 65, 50, 70, 40, 77, 99);

        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 22, 22, 2, 22, 22);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 33, 3, 33, 33, 33);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 44, 44, 44, 44, 4);

        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", 50, 50, 50, 50, 50, 50);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 95, 90, 95, 100, 85, 40);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 70, 75, 80, 85, 90, 70);

        // Статы
        harry.showProperties();
        hermione.showProperties();
        ron.showProperties();

        draco.showProperties();
        grehem.showProperties();
        gregory.showProperties();

        zacharias.showProperties();
        cedric.showProperties();
        justin.showProperties();

        chang.showProperties();
        padma.showProperties();
        marcus.showProperties();

        // Сравнение по статам
        compareGryffindor(hermione, ron);
        compareSlytherin(draco, gregory);
        compareHufflepuff(zacharias, cedric);
        compareRavenclaw(padma, marcus);

        // Сравнение по power и motivation Гарри и Драко
        compareMagic(harry, draco);
    }

    static void compareMagic(Student student1, Student student2) {
        if (student1.getMagicPower() + student1.getTransgressionDistance() > student2.getMagicPower() + student2.getTransgressionDistance()) {
            System.out.println(student1.getName() + " сильнее, чем " + student2.getName());
        } else if (student1.getMagicPower() + student1.getTransgressionDistance() < student2.getMagicPower() + student2.getTransgressionDistance()) {
            System.out.println(student2.getName() + " сильнее, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по силе магии и трансгрессии.");
        }
    }

    static void compareGryffindor(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int sum2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
    }

    static void compareSlytherin(Slytherin student1, Slytherin student2) {
        int sum1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getDesireForPower();
        int sum2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getDesireForPower();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Слизеренец, чем " + student1.getName());
        }
    }

    static void compareHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.getDiligence() + student1.getLoyalty() + student1.getHonesty();
        int sum2 = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());

        }
    }

    static void compareRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreativity();
        int sum2 = student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativity();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }
    }
}