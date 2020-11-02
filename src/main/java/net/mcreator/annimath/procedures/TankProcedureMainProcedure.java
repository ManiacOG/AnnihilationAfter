package net.mcreator.annimath.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.annimath.AnnimathModElements;

import java.util.Map;
import java.util.HashMap;

@AnnimathModElements.ModElement.Tag
public class TankProcedureMainProcedure extends AnnimathModElements.ModElement {
	public TankProcedureMainProcedure(AnnimathModElements instance) {
		super(instance, 99);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TankProcedureMain!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TankProcedureMain!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TankProcedureMain!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TankProcedureMain!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			TankProcedureLungsProcedure.executeProcedure($_dependencies);
		}
	}
}
