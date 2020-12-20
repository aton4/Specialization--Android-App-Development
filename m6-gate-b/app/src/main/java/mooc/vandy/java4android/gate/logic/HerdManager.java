package mooc.vandy.java4android.gate.logic;

import android.util.Log;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mWestGate;

    /**
     * The output Gate object.
     */
    private Gate mEastGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here
    public static final int HERD = 24;

    public void simulateHerd(Random rand)
    {
        int numInside = HERD;
        int numOutside = 0;

        mOut.println("There are currently 24 snails in the pen and 0 snails in the pasture");

        int moveGate = -3;
        int randomGateNum;
        int randomTransferNum;

        int numIter = 0;
        while (numIter < 10)
        {
            if (numInside == HERD) {
                moveGate = Gate.OUT;
                Log.i("tag", "1");
            }
            else if (numOutside == HERD) {
                moveGate = Gate.IN;
                Log.i("tag", "2");
            }
            else {
                Log.i("tag", "3");
                randomGateNum = rand.nextInt((1 - 0) + 1) + 0;
                if (randomGateNum == 0)
                    moveGate = Gate.OUT;
                else
                    moveGate = Gate.IN;
            }

            if (moveGate == Gate.OUT) {
                randomTransferNum = rand.nextInt((numInside- 1) + 1) + 1;
                numInside -= randomTransferNum;
                numOutside += randomTransferNum;

                String infoString1 = "A" + randomTransferNum + " " + numInside + " " + numOutside;
                Log.i("tag", infoString1);
            }
            else {
                randomTransferNum = rand.nextInt((numOutside - 1) + 1) + 1;
                numOutside -= randomTransferNum;
                numInside += randomTransferNum;

                String infoString2 = "B" + randomTransferNum + " " + numInside + " " + numOutside;
                Log.i("tag", infoString2);
            }
            mOut.print("There are currently ");
            mOut.print(numInside);
            mOut.print(" snails in the pen and ");
            mOut.print(numOutside);
            mOut.println(" snails in the pasture");
            numIter++;
        }
    }
    
}
