package tim03we.bedwars.tasks;

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

import cn.nukkit.Server;
import cn.nukkit.math.Vector3;
import cn.nukkit.scheduler.Task;
import tim03we.bedwars.Bedwars;
import tim03we.bedwars.Game;

public class MapResetTask extends Task {

    private Bedwars plugin;

    public MapResetTask(Bedwars plugin) {
        this.plugin = plugin;
    }

    @Override
    public void onRun(int i) {
        if(!Game.blocks.isEmpty()) {
            for (Vector3 coords : Game.blocks) {
                Server.getInstance().getLevelByName(Game.map).setBlockAt(coords.getFloorX(), coords.getFloorY(), coords.getFloorZ(), 0, 0);
                Game.blocks.remove(coords);
            }
        }
    }
}
