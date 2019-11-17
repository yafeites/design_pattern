package 命令模式;

import java.util.ArrayList;
import java.util.List;

public class waiter {
    List<command>commands=new ArrayList<>();
    public  void add(command command)
    {
        commands.add(command);
    }
    public  void delete(command command)
    {
        commands.remove(command);
    }
    public  void  excutor()
    {
        for(command command:commands)

        {
            command.excutor();

        }
        commands.clear();
    }
}
