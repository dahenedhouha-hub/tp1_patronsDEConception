package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new Book("Friedrich Nietzsche", "Ainsi parlait Zarathoustra"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        mediatheque.addItem( new CD(10, "when i was your woman"));
        mediatheque.printCatalog();
        //mediatheque.printOnlyBooks();
        //mediatheque.printOnlyCDs();
    }
}
