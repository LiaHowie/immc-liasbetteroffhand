package immc.liasbetteroffhand;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

// Add config file through cloth config
@Config(name = "lias-better-offhand")
public class ModConfig implements ConfigData {

	@ConfigEntry.Gui.Tooltip()
    public boolean noOffhandLightPlacement = false;

	@ConfigEntry.Gui.Tooltip()
    public boolean debugMode = false;

    public static ModConfig get() {
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }

    public static void register() {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
    }
}