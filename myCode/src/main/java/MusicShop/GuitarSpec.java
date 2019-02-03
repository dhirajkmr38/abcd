package MusicShop;

public class GuitarSpec extends Specification
{
    int numStrings;

    public GuitarSpec( Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings )
    {
        super( builder, model, type, backWood, topWood );
        this.numStrings = numStrings;
    }



}
