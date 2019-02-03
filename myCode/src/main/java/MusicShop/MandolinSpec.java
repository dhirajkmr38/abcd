package MusicShop;

public class MandolinSpec extends Specification
{
    Style style;


    public MandolinSpec( Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style )
    {
        super( builder, model, type, backWood, topWood );
        this.style = style;

    }


    boolean matches( Specification specification )
    {
        if ( specification instanceof MandolinSpec && this.equals( specification ) ) {
            return true;
        } else
            return false;
    }
}
