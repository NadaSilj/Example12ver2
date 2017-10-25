package rs.aleph.android.example15.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example15.model.Category;

public class CategoryProvider {

    public static List<Category> getCategories() {

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "Predjelo"));
        categories.add(new Category(1, "Glavno jelo"));
        categories.add(new Category(2, "Desert"));
        return categories;
    }

    public static List<String> getCategoryNames() {
        List<String> names = new ArrayList<>();
        names.add("Predjelo");
        names.add("Glavno jelo");
        names.add("Desert");
        return names;
    }

    public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "Predjelo");
            case 1:
                return new Category(1, "Glavno jelo");
            case 2:
                return new Category(2, "Desert");
            default:
                return null;
        }
    }
}
