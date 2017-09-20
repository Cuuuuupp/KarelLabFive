
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    int numberOfBeepers;
    public void fixBallots() {
        findBallot();
        
    }
    
    public void findBallot() {
        move();
        turnLeft();
        move();
    }
    public void faceNorth() {
     while(!facingNorth()) {
        turnLeft();
    }
    }
}
