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

import cn.nukkit.scheduler.Task;
import tim03we.bedwars.Bedwars;

public class SpawnTask extends Task {

    private Bedwars plugin;

    public SpawnTask(Bedwars plugin) {
        this.plugin = plugin;
    }

    @Override
    public void onRun(int i) {

    }
}
