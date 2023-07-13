package a.b;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class A_Event {
    @SubscribeEvent
    public void a(LivingUpdateEvent event) {
        Entity entity = event.entity;
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            if (player.inventory.hasItem(Items.apple)) {
                System.out.println("我有一个apple");
            }
        }
    }
}
