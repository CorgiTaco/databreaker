package supercoder79.databreaker.mixin;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.datafixer.Schemas;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Schemas.class)
public class MixinSchemas {

    // Return the input
    /**
     * @author
     */
    @Overwrite
    private static DataFixer create() {
        return new DataFixer() {
            @Override
            public <T> Dynamic<T> update(DSL.TypeReference type, Dynamic<T> input, int version, int newVersion) {
                return input;
            }

            @Override
            public Schema getSchema(int key) {
                return null;
            }
        };
    }
}
