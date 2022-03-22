package mods.mednis.id.lv.customoriginsmednis;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomOriginsMednis implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Mednis - Origins");


    @Override
    public void onInitialize() {

        // Load all the powers!
        Powers.register();

        LOGGER.info("-- Mednis Origins Loaded --");
        LOGGER.info("Currently adding: {} origin(s)",1);



    }
}
