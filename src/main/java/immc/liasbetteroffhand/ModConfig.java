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

    @ConfigEntry.Gui.CollapsibleObject
    public DebugConfig debugMode = new DebugConfig();
    public static class DebugConfig implements ConfigData {
        @ConfigEntry.Gui.Tooltip()
        public boolean enabled = false;

        @ConfigEntry.Gui.Tooltip()
        public boolean inGameMessages = false;

    }

    public static ModConfig get() {
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }

    public static void register() {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
    }
}