package OOP;

public class StopWatch {

    private final long startTime;



    public StopWatch(){
        startTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        long now = System.currentTimeMillis();
        return (now - startTime)/1000.0;
    }
}
