package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int IN = 1;
    public static final int OUT  = -1;
    public static final int CLOSED = 0;
    private int mSwing;

    public Gate()
    {
        this.mSwing = CLOSED;
    }

    public boolean setSwing(int direction)
    {
        if (mSwing == direction)
            return false;

        this.mSwing = direction;
        return true;
    }

    public boolean open(int direction)
    {
        if (direction == CLOSED)
        {
            return false;
        }
        if ( (direction < OUT) || (direction > IN) )
        {
            return false;
        }
        return setSwing(direction);
    }

    public void close()
    {
        this.mSwing = CLOSED;
    }

    public int getSwingDirection()
    {
        return this.mSwing;
    }

    public int thru(int count)
    {
        if (this.mSwing == IN)
            return count;
        if (this.mSwing == OUT)
            return -1 * count;
        return 0;
    }

    @Override
    public String toString()
    {
        if (this.mSwing == CLOSED)
            return "This gate is closed";
        if (this.mSwing == IN)
            return "This gate is open and swings to enter the pen only";
        if (this.mSwing == OUT)
            return "This gate is open and swings to exit the pen only";
        return "This gate has an invalid swing direction";
    }
}
