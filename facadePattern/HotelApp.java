public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        HotelService valetService = new Valet("HDY333");
        HotelService houseKeepingService = new HouseKeeping(123);
        HotelService cartService = new Cart(3);

        frontDesk.requestService(valetService);
        frontDesk.requestService(houseKeepingService);
        frontDesk.requestService(cartService);
    }
}
