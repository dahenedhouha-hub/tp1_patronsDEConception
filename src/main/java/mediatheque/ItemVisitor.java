package mediatheque;

/**
 * Visiteur de la médiathèque : une méthode visit() par type concret d'Item.
 * Pour ajouter une nouvelle fonctionnalité sur le catalogue, il suffit
 * d'écrire une nouvelle classe qui implémente cette interface.
 */
public interface ItemVisitor {
    void visit(Book book);
    void visit(CD cd);
}
