/**
 * Write a description of class OutOfShots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OutOfShotState implements KrrishState 
{
    Krrish heroObj;

    /**
     * Constructor for objects of class OutOfShotState
     */
    public OutOfShotState(Krrish heroObj)
    {
         this.heroObj = heroObj;
    }
    
    public void attackEnemy(){
        //System.out.println("Out of Shot. Please collect shots");
    }

    
}
