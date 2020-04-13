package com.designMode.realize.adapterPattern;

/**
 * @program: designMode-learn&realize
 * @description: 适配器
 * @author: liuguohu
 * @create: 2020-04-13 15:44
 **/

public class PluginAdapter implements CnPluginInterface {
    private EnPluginInterface enPlugin;

    public PluginAdapter(EnPluginInterface enPlugin) {
        this.enPlugin = enPlugin;
    }

    // 这是重点，适配器实现了国标的插头，然后重写国标的充电方法，在国标的充电方法中调用英标的充电方法
    @Override
    public void chargeWith2Pins() {
        enPlugin.chargeWith3Pins();
    }
}