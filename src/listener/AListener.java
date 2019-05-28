package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import java.util.LinkedHashMap;
import java.util.Map;

public class AListener implements ServletContextListener {
    /*
    在服务器启动时创建map并保存到servletconfig

     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Map<String,Integer> map = new LinkedHashMap<String, Integer>();
        ServletContext application = sce.getServletContext();
        application.setAttribute("map",map);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
