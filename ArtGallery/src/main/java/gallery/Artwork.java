package gallery;

import java.util.ArrayList;

public class Artwork {

    public String title;
    public Artist artist;
    public int price;
    public int nft;

    public Artwork(String newTitle, Artist artist, int newPrice, int newNft){
        this.title = newTitle;
        this.artist = artist;
        this.price = newPrice;
        this.nft = newNft;
        

    }

    public int getPrice(){
        return price;
    }

}
