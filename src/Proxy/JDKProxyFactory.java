package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class JDKProxyFactory<T> implements InvocationHandler {
    /** *
     * 目标对象
     */
    private T target;
    /** * 构造函数传入目标对象
     ** * @param target
     ** * 目标对象
     */
    public JDKProxyFactory(T target) {
        this.target = target;
    }

    /** * 获取代理对象
     ** * @return 获取代理
     */
    public T getProxy() {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 对方法增强
        System.out.println("大家好！");
        // 调用原方法
         Object result = method.invoke(target, args);
        // 方法增强
         System.out.println("再见！");
         return result;
    }

}

