package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
       extends Building {

    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
        this.mOwner = null;
        this.mPool = false;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner)
    {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = false;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool)
    {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }

    public String getOwner()
    {
        return this.mOwner;
    }

    public boolean hasPool()
    {
        return this.mPool;
    }

    public void setOwner(String newOwner)
    {
        this.mOwner = newOwner;
    }

    public void setPool(boolean newPool)
    {
        this.mPool = newPool;
    }

    public String toString()
    {
        String houseData;
        if (this.mOwner == null)
            houseData = "n/a";
        else
            houseData = mOwner;
        if (this.mPool)
            houseData += "; has a pool";
        if (this.calcLotArea() > this.calcBuildingArea())
            houseData += "; has a big open space";
        return houseData;
    }

    public boolean equals(Object otherObject)
    {
        Building otherBuilding = (Building) otherObject;
        return this.calcBuildingArea() == otherBuilding.calcBuildingArea();
    }
}
