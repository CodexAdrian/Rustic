package earth.terrarium.rustic.common.registry;

import com.teamresourceful.resourcefullib.common.recipe.CodecRecipeSerializer;
import earth.terrarium.botarium.api.registry.RegistryHolder;
import earth.terrarium.rustic.Rustic;
import earth.terrarium.rustic.common.recipes.CrushingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;

import java.util.function.Supplier;

public class ModRecipeSerializers {
    public static final RegistryHolder<RecipeSerializer<?>> SERIALIZERS = new RegistryHolder<>(Registry.RECIPE_SERIALIZER, Rustic.MOD_ID);
    public static final Supplier<CodecRecipeSerializer<CrushingRecipe>> CRUSHING = SERIALIZERS.register("crushing", () -> new CodecRecipeSerializer<>(ModRecipeTypes.CRUSHING.get(), CrushingRecipe::codec));
}
