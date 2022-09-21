package Model;

public class FilterItem {
    private final String value1;
    private final String value2;
    private final String brand;

    public FilterItem(String value1, String value2, String brand) {
        this.value1 = value1;
        this.value2 = value2;
        this.brand = brand;
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    public String getBrand() {
        return brand;
    }
}
