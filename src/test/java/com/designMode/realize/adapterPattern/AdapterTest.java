package com.designMode.realize.adapterPattern;

/**
 * @program: designMode-learn&realize
 * @description: 适配器测试类
 * @author: liuguohu
 * @create: 2020-04-13 15:45
 **/

public class AdapterTest {
    public static void main(String[] args) {
        EnPluginInterface enPlugin = new EnPlugin();
        Home home = new Home();
        PluginAdapter pluginAdapter = new PluginAdapter(enPlugin);
        home.setPlugin(pluginAdapter);
        // 会输出 “charge with EnPlugin”
        home.charge();
    }
}
