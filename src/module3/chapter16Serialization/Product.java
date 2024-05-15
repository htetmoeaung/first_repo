package module3.chapter16Serialization;

public class Product {
    int id;
    String title;
    double price;
    String description;
    String category;
    String image;
    Rating rating;

    public Product(int id, String title, double price, String description, String category, String image, Rating rating) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", image='" + image + '\'' +
                ", rating=" + rating +
                '}';
    }
}
class Rating{
    double rating;
    int count;

    public Rating(double rating, int count) {
        this.rating = rating;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "rating=" + rating +
                ", count=" + count +
                '}';
    }
}
