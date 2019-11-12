package tim03we.bedwars.commands.test;

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

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.block.Block;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class SetBedCommand extends Command {

    /*
    THIS COMMAND IS FOR TESTS
     */

    public SetBedCommand() {
        super("setbed", "Bedwars Test Command");
        setPermission("bedwars.setup.command");
    }

    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {
        if(!testPermission(sender)) {
            return false;
        }
        if(sender instanceof Player) {
            if(args.length > 2) {
                Server.getInstance().getLevelByName(((Player) sender).getLevel().getName()).setBlockAt(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), 26, 0);
                Player player = (Player) sender;
                int meta = player.getDirection().getHorizontalIndex();
                player.getLevel().setBlock(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Block.get(26, meta), true, true);
                player.getLevel().setBlock(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Block.get(26, meta | 8), true, true);
            }
        }
        return false;
    }
}
