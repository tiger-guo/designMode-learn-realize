package com.designMode.realize.adapterPattern;

/**
 * @program: designMode-learn&realize
 * @description: 在国内家中充电
 * @author: liuguohu
 * @create: 2020-04-13 15:42
 **/

public class Home {

    private CnPluginInterface cnPlugin;

    public Home() { }

    public Home(CnPluginInterface cnPlugin) {
        this.cnPlugin = cnPlugin;
    }

    public void setPlugin(CnPluginInterface cnPlugin) {
        this.cnPlugin = cnPlugin;
    }

    // 充电
    public void charge() {
        // 国标充电
        cnPlugin.chargeWith2Pins();
    }
}
