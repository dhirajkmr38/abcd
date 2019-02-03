package MusicShop;

public enum Type
{
    ACOUSTIC("acoustic"),ELECTRIC("electric");
    String value;


    Type( String value )
    {
        this.value = value;
    }


    public String getValue()
    {
        return value;
    }
}
