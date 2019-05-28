    package ZXD_2018_4_2;
   //2018年4月2日14:35:53
    import javax.servlet.*;
    import java.io.IOException;

    public class AServlet implements Servlet {

        @Override
        public void init(ServletConfig servletConfig) throws ServletException {
            System.out.println("我出生了");
        }

        @Override
        public ServletConfig getServletConfig() {
            System.out.println("这是我的servlet的配置");
            return null;
        }

        @Override
        public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
            int i = 0;
            System.out.println(i++);
           System.out.println("我是Service方法");
        }

        @Override
        public String getServletInfo() {
            System.out.println("我很好,我是个正常的Servlet");
            return null;
        }

        @Override
        public void destroy() {
            System.out.println("我马上要死了");

        }
    }
