package net.mcreator.annimath.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.annimath.AnnimathModElements;

import java.util.Map;
import java.util.HashMap;

@AnnimathModElements.ModElement.Tag
public class InfuserguirecipiesProcedure extends AnnimathModElements.ModElement {
	public InfuserguirecipiesProcedure(AnnimathModElements instance) {
		super(instance, 54);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Infuserguirecipies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Infuserguirecipies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Infuserguirecipies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Infuserguirecipies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			Infuserguiprocefure1Procedure.executeProcedure($_dependencies);
		}
	}
}
