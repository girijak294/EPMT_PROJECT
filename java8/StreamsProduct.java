class StreamsProduct {
    private String name;
    private double price;
    private String category;
    private String grade;

    // Constructor
    public StreamsProduct(String name, double price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getGrade() {
        return grade;
    }

    // toString() for printing product details
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category='" + category + "', grade='" + grade + "'}";
    }
}

