package MusicShop;

public enum Builder
{
    FENDER("fender"),MARTIN("martin"),GIBSON("gibson"),COLLINGS("collings"),OLSON("olson");
    private String value;


    Builder( String value )
    {
        this.value = value;
    }


    public String getValue()
    {
        return value;
    }
}
