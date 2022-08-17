import gallery.Gallery;
import gallery.Artwork;
import gallery.Artist;
import gallery.Customer;

public class App {
public static void main(String[] args){

    Gallery gallery1 = new Gallery("Royal Art Gallery", 0);

    Artwork artwork1 = new Artwork("Mona Lisa", "Da Vinci", 300, 30);
    Artwork artwork2 = new Artwork("WW2", "Da Vinci", 200, 20);
    Artwork artwork3 = new Artwork("The weeping man", "Da Vinci", 100, 10);

    Customer customer1 = new Customer("Vilte",700, artwork1);
    Customer customer2 = new Customer("Amina",600, artwork2);

    System.out.println(gallery1);
    System.out.println(customer1.walletBalance());

    System.out.println(artwork1.getPrice());












    }

}
