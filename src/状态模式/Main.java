public class Main {
    public static void main(String[] args) {
        morningstate morningstate=new morningstate();
        work w=new work(morningstate);
        w.setHour(10);
        w.run();
        w.setHour(15);
        w.run();
    }

}
