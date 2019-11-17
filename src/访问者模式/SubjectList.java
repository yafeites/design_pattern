package 访问者模式;

import java.util.List;

public class SubjectList {
    List<Person>lists;

    public SubjectList(List<Person> lists) {
        this.lists = lists;
    }
    public void add(Person person)
    {
        lists.add(person);
    }
    public  void  remove(Person person)
    {
        lists.remove(person);
    }
    public void  run(Visitor visitor)
    {
        for(Person person:lists)
        {
            person.work(visitor);
        }
    }

}
