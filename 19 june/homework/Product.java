class Product {
    String name, category;
    double price;

    { category = "General"; }

    Product() { this("Unknown Product", 0, "General"); }
    Product(String name) { this(name, 0, "General"); }
    Product(String name, double price) { this(name, price, "General"); }

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }
}