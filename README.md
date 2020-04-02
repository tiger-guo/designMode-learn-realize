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
    ② CGLIB方法
    
        CGLIB方法实现比较简单，仅需要实现 MethodInterceptor 接口，传入代理对象即可。 
     
### 策略模式
1. 定义：
   
   定义算法簇，分别封装起来，让它们直接可以相互替换，此模式让算法的变化独立于使用算法的客户。
   
### 观察者模式
1. 定义：

    定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到消息并自动更新。
    
### 装饰者模式
1. 定义：
    
    动态的将职责附加到对象上。想要扩展功能，装饰者提供有别于继承的另一种选择。   
    
### 工厂方法模式
1. 定义：
    
    定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。

### 抽象工厂模式
1. 定义:

    提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。