class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet Service picking up vehicle with plate number " + plateNumber);
    }

    @Override
    public void provideService() {
        
    }

    public void provideService(String plateNumber) {
        pickUpVehicle(plateNumber);
    }
}