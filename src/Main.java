public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "России");
        lada.car();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германии");
        audi.car();
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германии");
        bmw.car();
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южной Корее");
        kia.car();
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южной Корее");
        hyundai.car();
    }
}