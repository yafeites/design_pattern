package 装饰模式;

public class drawperson extends Person {
     protected Person person;
     @Override
      public  void dosomething()
      {
          if(person!=null)
          {
              person.dosomething();
          }
      }

}
