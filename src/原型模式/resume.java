package 原型模式;

public class resume  {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  int age;
    private  String name;

    public resume(int age, String name, Experience work) {
        this.age = age;
        this.name = name;
        this.work = work;
    }
    private resume(Experience work)
    {
        this.work=work;
    }
    private  Experience work;
    @Override
    protected Object clone() throws CloneNotSupportedException {
          resume clone_resume=new resume((Experience) work.clone());
          clone_resume.setAge(this.age);
          clone_resume.setName(this.name);
          return  clone_resume;

    }
}
