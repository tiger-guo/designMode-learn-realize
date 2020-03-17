## 设计模式已完成内容

### 代理模式：
1. 静态代理 

    代理对象继承代理类的父接口并提前声明将要代理类的父接口，通过构造方法将被代理对象传入，在代理类中调用被代理的对象的方法进行执行。
2. 动态代理
    
    ① JDK自带动态代理
        
        public interface InvocationHandler {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
        }
            - proxy：被代理的类的实例
            - method：调用被代理的类的方法
            - args：该方法需要的参数
        public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) throws IllegalArgumentException
            - loader：被代理的类的类加载器
            - interfaces：被代理类的接口数组
            - invocationHandler：就是实现了InvocationHandler的处理器类
        