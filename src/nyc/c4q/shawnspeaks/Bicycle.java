package nyc.c4q.shawnspeaks;

/**
 * Created by shawnspeaks on 8/31/16.
 */
public class Bicycle implements Vehicle, Wheelieable {
    double speed;

    public Bicycle(){
        this.speed = 0;
    }

    @Override
    public void applyBrakes() {
        speed = 1;
    }

    @Override
    public void speedUp(int delta) {
        speed = speed + delta;
    }

    @Override
    public void slowDown(int delta) {
        if (this.speed > 1){
            speed = speed - delta;
        }
    }

    @Override
    public void popAWheelie(int duration) {
       while(duration != 0) {
           System.out.println("popping that wheelie bro! At " + speed + "m/ph");

           duration--;
       }
    }
}


