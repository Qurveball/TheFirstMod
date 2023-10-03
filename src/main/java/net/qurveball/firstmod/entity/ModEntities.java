package net.qurveball.firstmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.qurveball.firstmod.FirstMod;

public class ModEntities {
    public static final EntityType<GnomeEntity> GNOME = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(FirstMod.MOD_ID, "gnome"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GnomeEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1)).build());
}
