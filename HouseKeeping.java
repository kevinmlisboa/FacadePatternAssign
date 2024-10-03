class HouseKeeping implements HotelService {
    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping service, cleaning room " + roomNumber);
    }

    @Override
    public void provideService() {
        
    }

    public void provideService(int roomNumber) {
        cleanRoom(roomNumber);
    }
}