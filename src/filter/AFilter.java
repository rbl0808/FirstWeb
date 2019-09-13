package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Map;

/**
 * 从application中获取Map
 * 从request中得到当前客户端的IP
 * 进行统计工作，结果保存到Map中
 *
 */
@WebFilter(filterName = "ccc",urlPatterns = "/*")
public class AFilter implements Filter {
    private FilterConfig config;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config =filterConfig;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /*
         * 1. 得到application中的map
         * 2. 从request中获取当前客户端的ip地址
         * 3. 查看map中是否存在这个ip对应访问次数，如果存在，把次数+1再保存回去
         * 4. 如果不存在这个ip，那么说明是第一次访问本站，设置访问次数为1
         */
        /*
         * 1. 得到appliction
         *
         */
    ServletContext app = config.getServletContext();
    Map<String,Integer> map = (Map<String, Integer>) app.getAttribute("map");
    String ip = servletRequest.getRemoteAddr();
    if(map.containsKey(ip)){
        int cnt = map.get(ip);
       map.put(ip,cnt+1);
   }else {
        map.put(ip,1);
   }
   app.setAttribute("map",map);
    filterChain.doFilter(servletRequest,servletResponse);
    }
}
