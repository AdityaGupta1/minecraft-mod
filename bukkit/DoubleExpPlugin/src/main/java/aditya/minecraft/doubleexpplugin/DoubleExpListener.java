/**
 * Copyright: Aditya Gupta
 */
package aditya.minecraft.doubleexpplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

/**
 * @author Aditya Gupta
 */
public class DoubleExpListener implements Listener {
    
    private int exp = 0;
    
    @EventHandler
    public void doubleExp(EntityDeathEvent event) {
        exp = event.getDroppedExp();
        exp = exp + exp;
        event.setDroppedExp(exp);
    }

}
