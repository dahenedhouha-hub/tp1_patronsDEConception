package mediatheque;

import java.util.LinkedList;
import java.util.List;

/**
 * Structure de données : elle ne connaît plus aucune fonctionnalité d'édition.
 * Elle se contente de stocker les items et de laisser un visiteur les parcourir.
 */
public class Mediatheque {
    private final List<Item> items = new LinkedList<>();

    public void addItem(Item i) {
        items.add(i);
    }

    public void accept(ItemVisitor visitor) {
        for (Item i : items) {
            i.accept(visitor);
        }
    }
}
