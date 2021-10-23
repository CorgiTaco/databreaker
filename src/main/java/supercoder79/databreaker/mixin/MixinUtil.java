package supercoder79.databreaker.mixin;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.Type;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Util.class)
public class MixinUtil {

    // Don't check block entity types or block entity types on registration.
    /**
     * @author
     */
    @Overwrite
    public static Type<?> getChoiceType(DSL.TypeReference typeReference, String id) {
       return null;
    }
}
