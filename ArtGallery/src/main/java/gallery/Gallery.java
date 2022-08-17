package gallery;


import java.util.ArrayList;

public class Gallery {
    public String name;
  public double till;
  public ArrayList<Artwork> artworkList;

    public Gallery(String newGalleryName, double newTill){
    this.name = newGalleryName;
    this.till = newTill;
    this.artworkList = new ArrayList<>();
    
    
    
    }
 
    
}
