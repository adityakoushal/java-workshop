class RestaurantOrder {
    String item; int quantity;

    { System.out.println("New Order Started"); }

    RestaurantOrder() { this("Burger", 1); }
    RestaurantOrder(String item) { this(item, 1); }

    RestaurantOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
    }
}