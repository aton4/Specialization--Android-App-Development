package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    // TODO - Put your code here.
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    public Building(int length, int width, int lotLength, int lotWidth)
    {
        this.mLength = length;
        this.mWidth = width;
        this.mLotLength = lotLength;
        this.mLotWidth = lotWidth;
    }

    public int getLength()
    {
        return this.mLength;
    }

    public int getWidth()
    {
        return this.mWidth;
    }

    public int getLotLength()
    {
        return this.mLotLength;
    }

    public int getLotWidth()
    {
        return this.mLotWidth;
    }

    public void setLength(int newLength)
    {
        this.mLength = newLength;
    }

    public void setWidth(int newWidth)
    {
        this.mWidth = newWidth;
    }

    public void setLotLength(int newLotLength)
    {
        this.mLotWidth = newLotLength;
    }

    public void setLotWidth(int newLotWidth)
    {
        this.mLotWidth = newLotWidth;
    }

    public int calcBuildingArea()
    {
        return this.mLength * this.mWidth;
    }

    public int calcLotArea()
    {
        return this.mLotWidth * this.mLotLength;
    }

    public String toString()
    {
        return "Owner: a " + this.mLength +"x" + this.mWidth + " building";
    }
    
}
