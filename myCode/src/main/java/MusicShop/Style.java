package MusicShop;

enum Style{
    A("a"),B("b"),C("c");
    String value;

    Style( String value )
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
}