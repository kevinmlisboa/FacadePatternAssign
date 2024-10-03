public class HotelApp {
    private FrontDesk frontDesk;

    public HotelApp(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void useServices() {
        
        frontDesk.requestValet("ABC123");
        frontDesk.requestCleaning(101);
        frontDesk.requestLuggageCart(2);
    }

    public static void main(String[] args) {
        
        Valet valet = new Valet();
        HouseKeeping housekeeping = new HouseKeeping();
        Cart cart = new Cart();
        
        
        FrontDesk frontDesk = new FrontDesk(valet, housekeeping, cart);
        
        
        HotelApp hotelApp = new HotelApp(frontDesk);
        
        
        hotelApp.useServices();
    }
}