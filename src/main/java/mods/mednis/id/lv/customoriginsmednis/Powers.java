package mods.mednis.id.lv.customoriginsmednis;

import io.github.apace100.apoli.data.ApoliDataTypes;
import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.apace100.apoli.registry.ApoliRegistries;
import io.github.apace100.calio.data.SerializableData;
import io.github.apace100.calio.data.SerializableDataTypes;
import mods.mednis.id.lv.customoriginsmednis.powers.FlyPower;
import net.minecraft.util.Identifier;
import mods.mednis.id.lv.customoriginsmednis.powers.FlySpeedPower;
import net.minecraft.util.registry.Registry;

public class Powers {

    private static final String mod_id = "customoriginsmednis";

    public static final PowerFactory<Power> FLY_SPEED = new PowerFactory<>(
            new Identifier(mod_id,"fly_speed"),
            new SerializableData().add("speed", SerializableDataTypes.FLOAT,1.0F),
            (data) -> (type, player) -> new FlySpeedPower(type,player,data.getFloat("speed"))).allowCondition();

    public static final PowerFactory<Power> FLY = new PowerFactory<>(
            new Identifier(mod_id,"fly"),
            new SerializableData()
                    .add("fly", SerializableDataTypes.BOOLEAN,Boolean.FALSE)
                    .add("stop_flight_condition", ApoliDataTypes.ENTITY_CONDITION, null),
            (data) -> (type, player) ->
                    new FlyPower(type,
                            player,
                            data.getBoolean("fly"),
                            data.get("stop_flight_condition")))
            .allowCondition();


    public static void register() {
       Registry.register(ApoliRegistries.POWER_FACTORY, FLY_SPEED.getSerializerId(), FLY_SPEED);
       Registry.register(ApoliRegistries.POWER_FACTORY, FLY.getSerializerId(), FLY);
    }


}
