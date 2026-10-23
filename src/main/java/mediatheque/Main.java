package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem(new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem(new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem(new CD(12, "Sergeant Peppers"));

        // Étape 2 du TP : mon livre et mon album préférés
        mediatheque.addItem(new Book("Antoine de Saint-Exupéry", "Le Petit Prince"));
        mediatheque.addItem(new CD(13, "Random Access Memories"));

        System.out.println("=== Catalogue complet ===");
        mediatheque.accept(new PrintCatalogVisitor());

        System.out.println();
        System.out.println("=== Livres uniquement ===");
        mediatheque.accept(new PrintOnlyBooksVisitor());

        System.out.println();
        System.out.println("=== CD uniquement ===");
        mediatheque.accept(new PrintOnlyCDsVisitor());

        System.out.println();
        System.out.println("=== Statistiques (nouveau visiteur) ===");
        CountItemsVisitor compteur = new CountItemsVisitor();
        mediatheque.accept(compteur);
        System.out.println(compteur.getBooks() + " livre(s), " + compteur.getCDs() + " CD");
    }
}
