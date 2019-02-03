package MusicShop;

public enum Wood
{
    INDIAN_ROSEWOOD("indiarosewood"),BRAZALLIAN_ROSEWOOD("brazallian rosewood"),MAPLE("maple");
    String value;


    Wood( String value )
    {
        this.value = value;
    }


    public String getValue()
    {
        return value;
    }
}
