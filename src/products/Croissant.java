package products;

public class Croissant
{
    private String croissantTitle = "Croissant";
    private int croissantPrice = 20;

    public Croissant()
    {
        this.croissantTitle = new Croissant().getTitle();
        this.croissantPrice = new Croissant().getCroissantPrice();
    }

    public String getCroissantTitle()
    {
        return croissantTitle;
    }

    public int getCroissantPrice()
    {
        return croissantPrice;
    }

    public String getTitle()
    {
        return croissantTitle;
    }

    public int getPrice()
    {
        return croissantPrice;
    }
}
