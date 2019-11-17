package 享元模式;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebsiteFactory {
    Map<String,Website>websiteMap=new HashMap<>();
    final  static  Object object=new Object();
   static WebsiteFactory websiteFactory;
    public  static  WebsiteFactory getInstance()
    {
        if(websiteFactory==null)
        {
            synchronized(object)
            {
                if(websiteFactory==null)
                {
                    websiteFactory=new WebsiteFactory();
                }
            }
        }
        return websiteFactory;
    }
    public  Website getWebsite(String x)
    {
        if(!websiteMap.containsKey(x))
        {
            websiteMap.put(x, new SharedWebsite());

        }
        return websiteMap.get(x);
    }
}
