package gallery;

import java.util.ArrayList;

public class Artwork {

    public String title;
    public String artist;
    public int price;
    public int nft;

    public Artwork(String newTitle, String newArtist, int newPrice, int newNft){
        this.title = newTitle;
        this.artist = newArtist;
        this.price = newPrice;
        this.nft = newNft;
        

    }

    public int getPrice(){
        return price;
    }

}
