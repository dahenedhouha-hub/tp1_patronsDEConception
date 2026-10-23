package mediatheque;

/** Édite uniquement les livres (remplace printOnlyBooks). */
public class PrintOnlyBooksVisitor implements ItemVisitor {

    @Override
    public void visit(Book book) {
        System.out.println(book);
    }

    @Override
    public void visit(CD cd) {
        // rien à faire : les CD ne sont pas concernés
    }
}
