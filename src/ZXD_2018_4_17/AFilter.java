package ZXD_2018_4_17;
//拦截所有请求
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "aaa",urlPatterns = "/*")
public class AFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("请求发起首见4_17_AFilter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("请求完成又见4_17_AFilter");
    }
}
