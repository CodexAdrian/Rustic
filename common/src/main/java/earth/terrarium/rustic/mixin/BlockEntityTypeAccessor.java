package earth.terrarium.rustic.mixin;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Set;

// It's so cursed and I love it
@Mixin(BlockEntityType.class)
public interface BlockEntityTypeAccessor {
    @Accessor
    Set<Block> getValidBlocks();

    @Mutable
    @Accessor
    void setValidBlocks(Set<Block> blocks);
}
