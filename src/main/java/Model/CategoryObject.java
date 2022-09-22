package Model;

public class CategoryObject {
    private String category;
    private String subcategory;

    public CategoryObject setCategory(String category) {
        this.category = category;
        return this;
    }

    public CategoryObject setSubcategory(String subcategory) {
        this.subcategory = subcategory;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }
}
