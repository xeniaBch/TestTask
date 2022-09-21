package Model;

public class CategoryObject {
    private final String category;
    private final String subcategory;

    public CategoryObject(String category, String subcategory) {
        this.category = category;
        this.subcategory = subcategory;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }
}
