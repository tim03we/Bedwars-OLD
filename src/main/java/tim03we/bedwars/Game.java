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

import cn.nukkit.math.Vector3;
import tim03we.bedwars.enums.Teams;

import java.util.ArrayList;

public class Game {

    private Bedwars plugin;

    public Game(Bedwars plugin) {
        this.plugin = plugin;
    }

    public static Integer countdown = 0;
    public static Integer game_time = 0;
    public static Integer countdown_end = 15;

    public static Boolean IN_SETUP = false;
    public static Boolean STATUS_LOBBY = false;
    public static Boolean STATUS_STARTED = false;
    public static Boolean STATUS_END = false;

    public static ArrayList<Vector3> blocks = new ArrayList<Vector3>();

    public static String map;

    public void loadSettings() {
        countdown = plugin.getSetupFile().getInt("settings.countdown");
        game_time = plugin.getSetupFile().getInt("settings.game_time");
        map = plugin.getSetupFile().getString("settings.world");
    }

    private static void loadTeamSettings() {

    }

    public static void loadTeams() {

    }

    public static void getTeamSpawn() {

    }

    public static void getTeamBedLocation() {

    }

    public static Boolean hasBed(String team) {
        switch (team) {
            case "blue":
                return Teams.BLUE.get("has_bed").equals("yes");
            case "red":
                return Teams.RED.get("has_bed").equals("yes");
            case "yellow":
                return Teams.YELLOW.get("has_bed").equals("yes");
            case "green":
                return Teams.GREEN.get("has_bed").equals("yes");
            case "dark_green":
                return Teams.DARK_GREEN.get("has_bed").equals("yes");
            case "pink":
                return Teams.PINK.get("has_bed").equals("yes");
            case "black":
                return Teams.BLACK.get("has_bed").equals("yes");
            case "aqua":
                return Teams.AQUA.get("has_bed").equals("yes");
        }
        return false;
    }
}
