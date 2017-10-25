package rs.aleph.android.example15.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example15.model.Category;
import rs.aleph.android.example15.model.Jelo;

public class JeloProvider {

    public static List<Jelo> getJelo() {

        Category Predjelo = new Category(0, "Salata");
        Category Glavnojelo = new Category(1, "Piletina");
        Category Desert = new Category(2, "Vocni kup");

        List<Jelo> jelos = new ArrayList<>();
        jelos.add(new Jelo(0, "apples.jpg", "Apples", "The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple.", 5.0f, Predjelo));
        jelos.add(new Jelo(1, "bananas.jpg", "Bananas", "The banana is an edible fruit, botanically a berry, produced by several kinds of large herbaceous flowering plants in the genus Musa.", 4.0f, Glavnojelo));
        jelos.add(new Jelo(2, "oranges.jpg", "Oranges", "The orange is the fruit of the citrus species Citrus in the family Rutaceae.", 3.0f, Desert));
        return jelos;
    }

    public static List<String> getFruitNames() {

        List<String> names = new ArrayList<>();
        names.add("Salata");
        names.add("Piletina");
        names.add("Vocni kup");
        return names;
    }

    public static Jelo getFruitById(int id) {

        Category rose = new Category(0, "Predjelo");
        Category citrus = new Category(1, "Glavnojelo");
        Category berry = new Category(2, "Desert");

        switch (id) {
            case 0:
                return new Jelo(0, "apples.jpg", "Apples", "The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple.", 5.0f, rose);
            case 1:
                return new Jelo(1, "bananas.jpg", "Bananas", "The banana is an edible fruit, botanically a berry, produced by several kinds of large herbaceous flowering plants in the genus Musa.", 4.0f, berry);
            case 2:
                return new Jelo(2, "oranges.jpg", "Oranges", "The orange is the fruit of the citrus species Citrus in the family Rutaceae.", 3.0f, citrus);
            default:
                return null;
        }
    }
}
