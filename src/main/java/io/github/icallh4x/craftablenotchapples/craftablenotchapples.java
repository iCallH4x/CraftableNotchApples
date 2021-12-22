package io.github.icallh4x.craftablenotchapples;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;


public class craftablenotchapples extends JavaPlugin {


    public void onEnable() {

        ItemStack apple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);

        ShapedRecipe notchApple = new ShapedRecipe(new NamespacedKey(this, "CraftedNotchApple"), apple);

        notchApple.shape("***", "*A*", "***");

        notchApple.setIngredient('*', Material.GOLD_BLOCK);
        notchApple.setIngredient('A', Material.APPLE);

        getServer().addRecipe(notchApple);

    }

    public void onDisable() {

    }
}
