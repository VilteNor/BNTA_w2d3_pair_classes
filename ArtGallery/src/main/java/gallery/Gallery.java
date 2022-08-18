package gallery;


import java.util.ArrayList;

public class Gallery {
    public String name;
  public int till;
  public ArrayList<Artwork> artworkList;

    public Gallery(String newGalleryName, int newTill){
    this.name = newGalleryName;
    this.till = newTill;
    this.artworkList = new ArrayList<>();

    }

    public void setTill(int till){
      this.till = till;
    }
    public int getTill(){
      return till;
    }
    public void acceptPayment(int payment){
      till += payment;
      System.out.println("the Gallery has accepted a payment of "+payment);
      setTill(this.till);
      System.out.println("gallery's till holds: "+till);
    }




// end of code
}


