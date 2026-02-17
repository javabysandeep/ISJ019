import java.util.Objects;

public class ProductOld {
    private int id;
    private String name;
    private double price;
    private String mfYear;

    public ProductOld(int id, String name, double price, String mfYear) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.mfYear = mfYear;
    }

    public ProductOld() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMfYear() {
        return mfYear;
    }

    public void setMfYear(String mfYear) {
        this.mfYear = mfYear;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", mfYear='" + mfYear + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ProductOld productOld = (ProductOld) object;
        return id == productOld.id && Double.compare(price, productOld.price) == 0 && Objects.equals(name, productOld.name) && Objects.equals(mfYear, productOld.mfYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, mfYear);
    }
}
