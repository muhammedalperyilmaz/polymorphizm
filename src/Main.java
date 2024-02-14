public class Main {
    public static void main( String[] args) {
        House house1 = new Apartment();
        House house2 = new detachedHouse();
        House house3 = new Villa();

        House[] houseArray = {house1, house2, house3};
        for (House houses : houseArray)
        { System.out.println("\n");
            houses.houseType();
            houses.Rent();
            houses.facade();
            houses.squareMeters();
        }
    }
}