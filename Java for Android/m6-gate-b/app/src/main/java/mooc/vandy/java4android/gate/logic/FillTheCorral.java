package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here
    public void setCorralGates(Gate[] gate, Random rand)
    {
        int randomNum;
        for (Gate element : gate)
        {
            randomNum = rand.nextInt((2 - 0) + 1) + 0 - 1;
            element.setSwing(randomNum);
            mOut.println(element.toString());
        }
    }

    public boolean anyCorralAvailable(Gate[] corral)
    {
        for (Gate element : corral)
        {
            if (element.getSwingDirection() == Gate.IN)
                return true;
        }
        return false;
    }

    public int corralSnails(Gate[] corral, Random rand)
    {
        int numInside = 0;
        int numOutSide = 5;
        int randomIndex;
        int randomTransferNum;

        int iter = 0;
        while (numOutSide > 0) {
            randomIndex = rand.nextInt(((corral.length - 1) - 0) + 1) + 0;
            randomTransferNum = rand.nextInt((numOutSide - 1) + 1) + 1;

            mOut.print(randomTransferNum);
            mOut.print(" are trying to move through corral ");
            mOut.println(randomIndex);
            numOutSide -= corral[randomIndex].thru(randomTransferNum);
            iter++;
        }

        mOut.print("It took ");
        mOut.print(iter);
        mOut.println(" attempts to corral all of the snails.");
        return iter;
    }
    
}
