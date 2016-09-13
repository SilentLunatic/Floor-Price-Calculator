package rectanglegui;

public class Rectangle
{
    private double length;
    private double height;
    private double price;
    
    public Rectangle(double lengthIn, double heightIn, double priceIn)
    {
        length = lengthIn;
        height = heightIn;
        price = priceIn;
    }

    public double getLength()
    {
        return length;
    }
    public double getHeight()
    {
        return height;
    }
    public void setLength(double lengthIn)
    {
        length = lengthIn;
    }
    public void setHeight(double heightIn)
    {
        height = heightIn;
    }
    public void setPrice(double priceIn)
    {
        price = priceIn;
    }
    public double calculateArea()
    {
        return length * height;
    }
    public double calculatePerimeter()
    {
        return 2 * (length + height);
    }
    public double calculatePrice()
    {
        return price * (length * height);
    }
}