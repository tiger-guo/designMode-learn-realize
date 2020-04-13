package com.designMode.realize.adapterPattern;

/**
 * @program: designMode-learn&realize
 * @description:国标测试类
 * @author: liuguohu
 * @create: 2020-04-13 15:42
 **/

public class CnTests {

    public static void main(String[] args) {
        CnPluginInterface cnPlugin = new CnPlugin();
        Home home = new Home(cnPlugin);
        // 会输出 “charge with CnPlugin”
        home.charge();
    }
}
