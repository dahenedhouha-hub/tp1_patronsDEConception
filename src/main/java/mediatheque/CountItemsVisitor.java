package mediatheque;

/**
 * Visiteur supplémentaire, écrit sans toucher à Mediatheque, Item, Book ou CD :
 * il compte les livres et les CD du catalogue.
 */
public class CountItemsVisitor implements ItemVisitor {
    private int books;
    private int cds;

    @Override
    public void visit(Book book) {
        books++;
    }

    @Override
    public void visit(CD cd) {
        cds++;
    }

    public int getBooks() {
        return books;
    }

    public int getCDs() {
        return cds;
    }
}
