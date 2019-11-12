package tim03we.bedwars;

/*
 * Copyright (c) 2019 tim03we  < https://github.com/tim03we >
 *
 * This software is distributed under "GNU General Public License v3.0".
 * This license allows you to use it and/or modify it but you are not at
 * all allowed to sell this plugin at any cost. If found doing so the
 * necessary action required would be taken.
 *
 * Bedwars is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License v3.0 for more details.
 *
 * You should have received a copy of the GNU General Public License v3.0
 * along with this program. If not, see
 * <https://opensource.org/licenses/GPL-3.0>.
 */

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import tim03we.bedwars.commands.SetupCommand;
import tim03we.bedwars.commands.test.SetBedCommand;
import tim03we.bedwars.tasks.GameTask;
import tim03we.bedwars.tasks.ShowDirectionTask;
import tim03we.bedwars.tasks.SpawnTask;

public class Bedwars extends PluginBase {

    private Game game;

    @Override
    public void onLoad() {
    }

    @Override
    public void onEnable() {
        game = new Game(this);
        this.register();
        this.game.loadSettings();
    }

    private void register() {
        getServer().getPluginManager().registerEvents(new EventListener(this), this);
        getServer().getCommandMap().register("setup", new SetupCommand(this));
        getServer().getCommandMap().register("setbed", new SetBedCommand());
        getServer().getScheduler().scheduleRepeatingTask(new GameTask(this), 20);
        getServer().getScheduler().scheduleRepeatingTask(new SpawnTask(this), 20);
        getServer().getScheduler().scheduleRepeatingTask(new ShowDirectionTask(), 1);
    }

    public Config getSetupFile() {
        return new Config(this.getDataFolder() + "./setup.yml", Config.YAML);
    }
}