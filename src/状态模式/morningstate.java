public class morningstate implements state {
    @Override
    public void dosomething(work work) {
        if(work.getHour()>10)
        {
            work.setState(new eveningstate());
        }
        else
        {
            System.out.println("在早上");
        }
    }
}
