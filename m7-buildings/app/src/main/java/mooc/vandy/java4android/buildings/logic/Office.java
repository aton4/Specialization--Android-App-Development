package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
       extends Building {

    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    public Office(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = null;
        this.mParkingSpaces = 0;
        this.sTotalOffices += 1;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = 0;
        this.sTotalOffices += 1;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
        this.sTotalOffices += 1;
    }

    public String getBusinessName()
    {
        return this.mBusinessName;
    }

    public int getParkingSpaces()
    {
        return this.mParkingSpaces;
    }

    public static int getTotalOffices()
    {
        return Office.sTotalOffices;
    }

    public void setBusinessName(String newBusinessName)
    {
        this.mBusinessName = newBusinessName;
    }

    public void setParkingSpaces(int newParkingSpaces)
    {
        this.mParkingSpaces = newParkingSpaces;
    }

    public String toString()
    {
        String officeData = super.toString();
        if (this.mBusinessName != null)
            officeData += "; has a business name";
        if (this.mParkingSpaces > 0)
            officeData += "; has a parking space";

        return officeData;
    }

    public boolean equals(Object otherObject)
    {
        Office otherOffice = (Office) otherObject;
        return (this.calcBuildingArea() == otherOffice.calcBuildingArea()) && (this.getParkingSpaces() == otherOffice.getParkingSpaces());
    }
}
