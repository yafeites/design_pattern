package 反射模式;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties properties=new Properties();
//        InputStream inputStream=ClassLoader.getSystemResourceAsStream("db.properties");
       InputStream inputStream= Main.class.getClassLoader().getResourceAsStream("反射模式/db.properties");
        properties.load(inputStream);
        String s= properties.getProperty("name");
        Class c=Class.forName(s);
        反射模式.HandlerUser handlerUser=(反射模式.HandlerUser) c.newInstance();
    }

}
