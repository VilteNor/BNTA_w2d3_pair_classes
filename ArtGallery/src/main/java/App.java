import gallery.Gallery;
import gallery.Artwork;
import gallery.Artist;
import gallery.Customer;

public class App {
public static void main(String[] args){

    Gallery gallery1 = new Gallery("Royal Art Gallery", 0);
    Artist artist1= new Artist("Da Vinci");
    Artist artist2 = new Artist("Henry Carr");

    Artwork artwork1 = new Artwork("Mona Lisa",artist1, 300, 30);
    Artwork artwork2 = new Artwork("WW2",artist2, 200, 20);
    Artwork artwork3 = new Artwork("The weeping man",artist1, 100, 10);

    Customer customer1 = new Customer("Vilte",700);
    Customer customer2 = new Customer("Amina",600);




// customer1 checking their current balance:
    System.out.println("customer's current wallet: "+ customer1.getWallet());

// get the price of artwork
    int price_artwork1 = artwork1.getPrice();
    System.out.println("the price of artwork: "+price_artwork1);

// customer1 buying the artwork1 and checking their balance:
    customer1.buyArtwork( price_artwork1);

// customer paying the gallery when purchasing an artwork
// gallery accepts the payment and updates the till:
    gallery1.acceptPayment(price_artwork1);

// customer's current wallet:
    int customer1_wallet = customer1.getWallet();
    System.out.println("customer1 updated wallet: "+customer1_wallet);

    // gallery's till holds:
    System.out.println("till holds: "+ gallery1.getTill());

// customer1 buys artwork2 and updates Gallery till again
    customer1.buyArtwork(artwork2.price);
    gallery1.acceptPayment(artwork2.price);

    // gallery's till holds:
    System.out.println("till holds: "+ gallery1.getTill());
    // customer's current wallet:

    System.out.println("customer1 updated wallet: "+customer1.getWallet());




    // customer1 buys artwork3 but doesn't have any more money
    customer1.buyArtwork(artwork2.price);

    // gallery's till holds:
    System.out.println("till holds: "+ gallery1.getTill());
    // customer's current wallet:
    System.out.println("customer1 wallet: "+customer1.getWallet());



}

}
