import model.Car;
import model.Human;

public class Main {
    public static void main(String[] args) {
        humans();
        cars();
    }

    //task 1
    private static void humans() {
        Human max = new Human(35, "Максим", "Минск", "бренд-менеджер");
        Human any = new Human(29, "Аня", "Москва", "методист образовательных программ");
        Human katy = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(27, "Артем", "Москва", "директор по развитию бизнеса");
        max.greet();
        any.greet();
        katy.greet();
        artem.greet();
    }

    //task 2
    private static void cars() {
        Car lada = new Car("Lada", "Grande", "1.7", "жёлтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "3.0", "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", "1.7", "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4 поколение", "2.4", "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", "1,6", "оранжевый", 2016, "Южная Корея");
        lada.printInfo();
        audi.printInfo();
        bmw.printInfo();
        kia.printInfo();
        hyundai.printInfo();
    }
}