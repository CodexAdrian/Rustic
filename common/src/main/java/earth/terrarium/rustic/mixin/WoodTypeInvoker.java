package earth.terrarium.rustic.mixin;

import net.minecraft.world.level.block.state.properties.WoodType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(WoodType.class)
public interface WoodTypeInvoker {

    @Invoker("<init>")
    static WoodType init(String name) {
        throw new UnsupportedOperationException();
    }

    @Invoker("register")
    static WoodType invokeRegister(WoodType value) {
        throw new UnsupportedOperationException();
    }
}
