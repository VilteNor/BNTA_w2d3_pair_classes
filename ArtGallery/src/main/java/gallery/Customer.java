package gallery;


    public class Customer {

        public String name;
        public int wallet;



        public Customer(String newName, int newWallet){
            this.name = newName;
            this.wallet = newWallet;
                    


        }

        public int getWallet(){
            return wallet;
        }
        public void setWallet(int wallet){
            this.wallet=wallet;
        }

        public void buyArtwork(int price){
        if(this.wallet>price){
            wallet-= price;
            setWallet(this.wallet);
            System.out.println("customer's balance now is: "+wallet);
        }
        else{
            System.out.println("sorry, you don't have any money to purchase artwork.");
        }



            
        }








    }
