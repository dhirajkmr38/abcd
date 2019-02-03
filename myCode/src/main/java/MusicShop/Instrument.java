package MusicShop;

public class Instrument
{
    String serialNumber;
    double price;
    Specification specification;


    public Instrument( String serialNumber, double price, Specification specification )
    {
        this.serialNumber = serialNumber;
        this.price = price;
        this.specification = specification;
    }
}
