package 代理模式;

public class Proxy_Person implements  action {
    Person person;
    @Override
    public void sayhello() {
        if(person!=null)
        {
            person.sayhello();
        }
        dosomething();

    }
    public  void dosomething()
    {

    }

    public Proxy_Person(Person person) {
        this.person = person;
    }
}
