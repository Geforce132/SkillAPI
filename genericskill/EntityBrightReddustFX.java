package genericskill;

import net.minecraft.client.particle.EntityReddustFX;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityBrightReddustFX extends EntityReddustFX {
	public EntityBrightReddustFX(World world, double d, double d1, double d2, float f, float f1, float f2, float f3) {
		super(world, d, d1, d2, f, f1, f2, f3);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender(float f) {
		return 0;
	}

	@Override
	public float getBrightness(float f) {
		return 0;
	}
}
