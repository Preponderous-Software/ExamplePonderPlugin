package preponderous.exampleponderplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import preponderous.exampleponderplugin.ExamplePonderPlugin;
import preponderous.ponder.minecraft.abs.AbstractPluginCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Stephenson
 */
public class DefaultCommand extends AbstractPluginCommand {

    public DefaultCommand() {
        super(new ArrayList<>(List.of("default")), new ArrayList<>(List.of("epp.default")));
    }

    @Override
    public boolean execute(CommandSender commandSender) {
        commandSender.sendMessage(ChatColor.AQUA + "ExamplePonderPlugin " + ExamplePonderPlugin.getInstance().getVersion());
        commandSender.sendMessage(ChatColor.AQUA + "Developed by: Daniel Stephenson");
        commandSender.sendMessage(ChatColor.AQUA + "Wiki: https://github.com/Preponderous-Software/ExamplePonderPlugin/wiki");
        return true;
    }

    @Override
    public boolean execute(CommandSender commandSender, String[] strings) {
        return execute(commandSender);
    }
}