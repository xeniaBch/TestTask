package Model;

public class FilterItem {
    private  String value1;
    private String value2;
    private String brand;

    public FilterItem setValue1(String value1) {
        this.value1 = value1;
        return this;
    }

    public FilterItem setValue2(String value2) {
        this.value2 = value2;
        return this;
    }

    public FilterItem setBrand(String brand) {
        this.brand = brand;
        return this;
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
