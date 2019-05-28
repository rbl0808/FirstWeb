package Proxy;


import org.junit.jupiter.api.Test;
import sun.misc.ProxyGenerator;
import java.io.FileOutputStream;
import java.io.IOException;
public class ProxyTest {
    @Test
    public void testJdkProxy() {
        // 生成目标对象
        Personal personal = new PersonalImpl();
        // 获取代理对象
        JDKProxyFactory<Personal> proxyFactory = new JDKProxyFactory<>(personal);
        Personal proxy = proxyFactory.getProxy();
        // 将proxy的class字节码输出到文件
        generatorClass(proxy);
        // 调用代理对象
        proxy.introduction();
    }

    /**
     * 将对象的class字节码输出到文件
     * * * @param proxy 代理类
     */
    private void generatorClass(Object proxy) {
        FileOutputStream out = null;
        try {
            byte[] generateProxyClass = ProxyGenerator.generateProxyClass(
                    proxy.getClass().getSimpleName(),
                    new Class[]{proxy.getClass()});
            out = new FileOutputStream(proxy.getClass().getSimpleName() + ".class");
            out.write(generateProxyClass);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {

                }
            }
        }
    }
}

