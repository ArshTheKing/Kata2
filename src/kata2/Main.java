package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(3,9,8,-2,6,8,-7,4,1);
        new ConsoleHistogramDisplay().show(histogram);
    }
    
}
