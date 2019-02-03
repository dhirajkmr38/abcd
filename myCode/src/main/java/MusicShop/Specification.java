package MusicShop;

public abstract class Specification
{
    private Builder builder;
    private String model;
    Type type;
    Wood backWood;
    Wood topWood;

    public Specification( Builder builder, String model, Type type, Wood backWood, Wood topWood )
    {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

}
