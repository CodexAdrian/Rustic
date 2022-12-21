package earth.terrarium.rustic.common.util.forge;

import earth.terrarium.rustic.mixin.forge.AxeItemAccessor;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class PlatformUtilsImpl {
    public static void registerStrippedLog(Block log, Block strippedLog) {
        Map<Block, Block> strippedBlocks = new HashMap<>(AxeItemAccessor.getStrippables());
        strippedBlocks.put(log, strippedLog);
        AxeItemAccessor.setStrippables(strippedBlocks);
    }
}
