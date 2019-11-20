package simpleclasses.task4;

public class Train {
    private String destination;
    private int number;
    private int[] time;

    public Train() {
    }


    public Train(String destination, int number, int[] time) {
        this.destination = destination;
        this.number = number;
        setTime(time);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getTime() {
        return time;
    }

    public void setTime(int[] time) {
        if (time[0] >= 0 && time[1] < 60)
        this.time = time;
    }
}
