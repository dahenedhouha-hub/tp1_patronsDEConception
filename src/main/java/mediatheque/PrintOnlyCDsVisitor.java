package mediatheque;

/** Édite uniquement les CD (remplace printOnlyCDs). */
public class PrintOnlyCDsVisitor implements ItemVisitor {

    @Override
    public void visit(Book book) {
        // rien à faire : les livres ne sont pas concernés
    }

    @Override
    public void visit(CD cd) {
        System.out.println(cd);
    }
}
