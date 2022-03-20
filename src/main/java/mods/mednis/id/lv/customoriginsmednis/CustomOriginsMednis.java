package mods.mednis.id.lv.customoriginsmednis;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomOriginsMednis implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("CustomOriginsMednis");


    @Override
    public void onInitialize() {

        // Load all the powers!
        Powers.register();

        LOGGER.info("-- Custom Origins Loaded 123 --");



    }
}
