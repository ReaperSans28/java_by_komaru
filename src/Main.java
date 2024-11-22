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
        hermione.compareGryffindor(ron);
        draco.compareSlytherin(gregory);
        zacharias.compareHufflepuff(cedric);
        padma.compareRavenclaw(marcus);

        // Сравнение по power и motivation Гарри и Драко
        harry.compareMagic(draco);
    }
}