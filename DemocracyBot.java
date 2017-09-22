
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
    int colbysucks=0;
    public void fixBallots() {
        
        findBallot();
        testBallot();
        testBallot();
        testBallot();
        testBallot();
        testBallot();
        
        
    }
    
    public void findBallot() {
        move();
    }
    public void testBallot() {
        if(nextToABeeper()){
            move();
            move();
        }else{
            turnLeft();
            move();
            if(nextToABeeper()){
            pickBeeper();
            turnLeft();
            turnLeft();
            move();
            move();
            if(nextToABeeper()){
            pickBeeper();
            turnLeft();
            turnLeft();
            move();
            turnLeft();
            turnLeft();
            turnLeft();
            move();
            move();
        }else{
            turnLeft();
            turnLeft();
            move();
            turnLeft();
            turnLeft();
            turnLeft();
            move();
            move();
    }
        }else{
            turnLeft();
            turnLeft();
            move();
            move();
            if(nextToABeeper()){
            pickBeeper();
            turnLeft();
            turnLeft();
            move();
            turnLeft();
            turnLeft();
            turnLeft();
            move();
            move();
        }else{
            turnLeft();
            turnLeft();
            move();
            turnLeft();
            turnLeft();
            turnLeft();
            move();
            move();
    }
   }
} }public void faceNorth() {
     while(!facingNorth()) {
        turnLeft();
    }
    }
}
