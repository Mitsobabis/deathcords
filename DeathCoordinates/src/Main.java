import listeners.DeathListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin Toggled");
        Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
    }
}
