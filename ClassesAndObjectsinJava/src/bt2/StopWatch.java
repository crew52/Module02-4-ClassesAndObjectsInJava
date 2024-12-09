package bt2;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }
    public long getTime() {
        return stopTime - startTime;
    }

}
