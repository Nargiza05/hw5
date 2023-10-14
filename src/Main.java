public class Main {
    public static void main(String[] args) {

        // Создаем экземпляр класса Boss
        Boss boss = new Boss();
        // Устанавливаем значения полям с использованием сеттеров
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        // Выводим информацию о боссе, используя геттеры
        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Урон босса: " + boss.getDamage());
        System.out.println("Тип защиты босса: " + boss.getDefenseType());


        // Вызываем метод createHeroes, чтобы создать героев и получить массив
        Hero[] heroes = createHeroes();

        // Печатаем информацию о каждом герое в массиве
        for (Hero hero : heroes) {
            System.out.println("Здоровье героя: " + hero.getHealth());
            System.out.println("Урон героя: " + hero.getDamage());
            System.out.println("Суперспособность героя: " + hero.getSuperpower());
            System.out.println("----------------------");
        }
    }

    // Метод для создания и возвращения массива героев
    public static Hero[] createHeroes() {
        // Создаем 3 героев с использованием разных конструкторов
        Hero hero1 = new Hero(100, 20, "Лазерный взгляд");
        Hero hero2 = new Hero(120, 25);
        Hero hero3 = new Hero(90, 18, "Неуязвимость");

        // Помещаем героев в массив и возвращаем массив
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}