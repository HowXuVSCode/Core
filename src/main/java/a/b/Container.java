package a.b;

import com.google.common.eventbus.EventBus;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

import java.util.Arrays;

@IFMLLoadingPlugin.MCVersion(value = "1.7.10")
@IFMLLoadingPlugin.Name(value = "Core")
public class Container extends DummyModContainer {
    public static ModMetadata metadata;
    public Container(){
        super(new ModMetadata());
        metadata = getMetadata();
        metadata.modId = "core";
        metadata.authorList = Arrays.asList(new String[] { "A" });
        metadata.name = "Core";
        metadata.version = "1.7.10";
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        bus.register(this);
        return true;
    }
}
