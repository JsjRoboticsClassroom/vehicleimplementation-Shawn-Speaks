package nyc.c4q.shawnspeaks;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // CardDeck deck = new CardDeck () ;
    Bicycle vehicle = new Bicycle();
        vehicle.speedUp(15);
        vehicle.popAWheelie(1);
        vehicle.speedUp(25);
        vehicle.popAWheelie(1);
        vehicle.slowDown(-200);
        vehicle.popAWheelie(3);
        vehicle.applyBrakes();
        vehicle.popAWheelie(2);
    }

}
