/*
 * @Author: HowXu howxu366@outlook.com
 * @Date: 2023-07-12 19:49:19
 * @LastEditors: HowXu howxu366@outlook.com
 * @LastEditTime: 2023-07-13 18:44:58
 * @FilePath: \TestEver\src\main\java\ab\c\Core.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package a.b;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

public class Core implements IFMLLoadingPlugin {
    @Override
    public String[] getASMTransformerClass() {
        return new String[]{"a.b.Transformer"};
    }

    @Override
    public String getModContainerClass() {
        return "a.b.Container";
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
