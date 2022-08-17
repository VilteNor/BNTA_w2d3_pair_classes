package gallery;


    public class Customer {

        private final int price;
        public String name;
        public int wallet;
        public Artwork artwork;


        public Customer(String newName, int newWallet, Artwork artwork){
            this.name = newName;
            this.wallet = newWallet;
            this.price = artwork.price;
                    


        }

        public int walletBalance(){
            return this.wallet - this.price;
            
        }








    }
