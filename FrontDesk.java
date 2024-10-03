public class FrontDesk {
    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk(Valet valet, HouseKeeping housekeeping, Cart cart) {
        this.valet = valet;
        this.housekeeping = housekeeping;
        this.cart = cart;
    }

    public void requestValet(String plateNumber) {
        System.out.println("Sending valet");
        valet.provideService(plateNumber);
    }

    public void requestCleaning(int roomNumber) {
        System.out.println("Sending housekeepe");
        housekeeping.provideService(roomNumber);
    }

    public void requestLuggageCart(int numberOfCarts) {
        System.out.println("Sending Luggage Cart");
        cart.provideService(numberOfCarts);
    }
}