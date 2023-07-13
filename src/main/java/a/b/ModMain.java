/*
 * @Author: HowXu howxu366@outlook.com
 * @Date: 2023-07-13 18:31:10
 * @LastEditors: HowXu howxu366@outlook.com
 * @LastEditTime: 2023-07-13 18:35:56
 * @FilePath: \forge-1.7.10-10.13.4.1614-1.7.10-src\src\main\java\a\b\ModMain.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package a.b;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "core2")
public class ModMain {
    public static ModMain instance;

    public ModMain() {
        instance = this;
    }

    @EventHandler
    public void FMLPRE(FMLPreInitializationEvent e) {

    }

    @EventHandler
    public void FMLINIT(FMLInitializationEvent e) {
    MinecraftForge.EVENT_BUS.register(new A_Event());
    }

    @EventHandler
    public void FMLPOST(FMLPostInitializationEvent e) {

    }
}
