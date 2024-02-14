public class Apartment extends  House {
    public void houseType () {
        System.out.println("Apartment");
    }
    public void Rent() {
        System.out.println("House Rent per month" + 2000+" $");
    }

    @Override
    public void squareMeters() {
       System.out.println("House square meters: "+110);
    }
    public void facade()
    {
        System.out.println("Facade of House:  South");
    }
}
