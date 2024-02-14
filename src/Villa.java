public class Villa extends House {
    public void houseType() {
        System.out.println("Villa");
    }
    @Override
    public void Rent() {
        System.out.println("House rent per month :"+150000+ "$");
    }

    @Override
    public void squareMeters() {
        System.out.println("Square meters: "+1000);
    }
    public void facade()
    {
        System.out.println(" Facade of House: South, Noth, Earth, West");
    }
}
