public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "Default";
        } else {
            this.model = model;
        }
        if (productionCountry == null) {
            this.productionCountry = "Default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (Double.compare(engineVolume , 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
    }
    void car() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, сборка в " + productionCountry + ", " + color + " цвет кузова, объём двигателя - " + engineVolume + " л.");
    }
}
