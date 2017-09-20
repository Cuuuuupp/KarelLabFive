
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
  }
    int numberOfBeepers;
    public void choosePile() {
  while(nextToABeeper()){
     pickBeeper();
     numberOfBeepers++;
  }
        if(numberOfBeepers%2==0){
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        int i;
            for(i = 0; i<=numberOfBeepers; i++) {
                putBeeper();
        }
    }
    if(numberOfBeepers%2==1){
            turnLeft();
            move();
            int i;
            for(i = 0; i<=numberOfBeepers; i++) {
                putBeeper();
            }
    }
}
}