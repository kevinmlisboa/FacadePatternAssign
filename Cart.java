class Cart implements HotelService {
    public void requestCart(int numberOfCarts) {
        System.out.println("Cart service: Providing " + numberOfCarts + " luggage carts");
    }

    @Override
    public void provideService() {
        // Placeholder for service invocation
    }

    public void provideService(int numberOfCarts) {
        requestCart(numberOfCarts);
    }
}