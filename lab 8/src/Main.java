public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
        Box box = new Box(10);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( box );

        Storehouse store = new Storehouse();
        store.addProduct("milk",3,10);
        store.addProduct("coffee",5,7);
        store.addProduct("jogurt",5,7);
        store.addProduct("buttermilk",5,7);
        System.out.println("prices:");

        System.out.println("milk:"+ store.price("milk"));
        System.out.println("coffee:"+ store.price("coffee"));
        System.out.println("sugar:"+ store.price("sugar"));
        System.out.println("Amount of coffee before "+store.stock("coffee"));
        System.out.println("we take a coffee "+store.take("coffee"));
        System.out.println("Amount of coffee after"+store.stock("coffee"));
        for(String product: store.products()){
            System.out.println(product);
        }
        Purchase purchase = new Purchase("milk",4,2);
        System.out.println("The total price of the purchase containing four milks is "+purchase.price());
        System.out.println(purchase);
        purchase.increaseAmount();
        System.out.println(purchase);
        shoppingBasket Basket = new shoppingBasket();
        Basket.add("milk",3);
        Basket.add("buttermilk",2);
        Basket.add("buttermilk",2);
        Basket.add("cheese",3);
        Basket.add("cheese",3);
        Basket.add("laptop",899);
        System.out.println("total price:"+Basket.price());
        Basket.print();
    }
}