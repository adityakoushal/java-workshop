class MobilePhone {
    String brand, model;
    double price;

    { brand = "Samsung"; System.out.println("Inventory Entry Started"); }

    MobilePhone() { this("Basic Model", 0); }
    MobilePhone(String model) { this(model, 0); }

    MobilePhone(String model, double price) {
        this.model = model;
        this.price = price;
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}