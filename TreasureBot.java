
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    int numberOfBeepers;
    public void findTreasure() {
        numberOfBeepers = 0;
        
        while(numberOfBeepers != 5) {
            findBeeperPile();
            countBeeperPile();
            determineDirection();
        }
    }

public void determineDirection() {
    if(numberOfBeepers==1){
           faceNorth();
  }
  if(numberOfBeepers==2){
            while(!facingEast()) {
        turnLeft();
    }
  }
  if(numberOfBeepers==3){
      while(!facingSouth()){
         turnLeft(); 
      }
  }
  if(numberOfBeepers==4){
      while(!facingWest()){
         turnLeft(); 
      }
  }
}

public void countBeeperPile() {
    numberOfBeepers = 0;
     while(nextToABeeper()){
        
        pickBeeper();
        numberOfBeepers++;
  }
}

public void findBeeperPile() {
    while(!nextToABeeper()){
            move();
        }
}

public void faceNorth() {
     while(!facingNorth()) {
        turnLeft();
    }
}
}