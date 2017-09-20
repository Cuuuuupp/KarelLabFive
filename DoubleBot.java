


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * drew campillo 
 * version 1
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
    move();
    int beeper = 0;
        while(nextToABeeper()){
            pickBeeper();
            beeper++;
    }
    int i;
        for(i = 0; i <= beeper; i++) {
            putBeeper();
    }
    move();
    for(i = 0; i <= (beeper*2)+1; i++){
        putBeeper();
    }
    move();
}
}
