package ZXD_2018_4_17;
//只拦截 到4_17_AServlet的请求
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(filterName = "bbb",urlPatterns = "/4_17_AServlet",
        dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.ERROR})
public class BFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("我是4_17_BFilter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("又见4_17_BSFilter");
    }
}
