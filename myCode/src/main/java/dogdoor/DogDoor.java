package dogdoor;

import java.util.Timer;
import java.util.TimerTask;


public class DogDoor
{
  private   boolean isOpen;
    void openDoor(){
        if(isOpen){
            System.out.println("Door is already open");
            return;
        }
        System.out.println("Opening door!!");
        isOpen=true;
       final Timer timerToCloseDoor = new Timer(  );
        timerToCloseDoor.schedule( new TimerTask()
        {
            @Override public void run()
            {
                System.out.println("ThreadRunning "+Thread.currentThread().getName());
                closeDoor();
                timerToCloseDoor.cancel();
            }
        },5000 );

    }
    void closeDoor(){
        System.out.println("CLosing Door");
        isOpen=false;
    }
}
