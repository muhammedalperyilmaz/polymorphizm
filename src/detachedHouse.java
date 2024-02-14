public class detachedHouse extends House{
    public void houseType() {
        System.out.println("Detached House");
    }
    @Override
    public void Rent() {
       System.out.println("House Rent per month: "+25000 +" $");
    }

    @Override
    public void squareMeters() {
        System.out.println("Square Meters: "+300);
    }
    @Override
    public void facade() {
        System.out.println("Facade of House: South, Noth, Earth, West");
    }
}
