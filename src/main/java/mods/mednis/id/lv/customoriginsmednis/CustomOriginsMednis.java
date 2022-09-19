package mods.mednis.id.lv.customoriginsmednis;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomOriginsMednis implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Mednis - Origins");
    public static final Item FABRIC_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {

        // Load all the powers!
        Powers.register();

        // Register item for icon!
        Registry.register(Registry.ITEM, new Identifier("customoriginsmednis", "fairy"), FABRIC_ITEM);

        LOGGER.info("-- Mednis Origins Loaded --");
        LOGGER.info("Currently adding: {} origin(s)", 1);

    }
}
