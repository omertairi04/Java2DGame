package main;

import gameObjects.OBJ_Chest;
import gameObjects.OBJ_Door;
import gameObjects.OBJ_Key;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 19 * gp.tileSize;
        gp.obj[0].worldY = 57 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 18 * gp.tileSize;
        gp.obj[1].worldY = 36 * gp.tileSize;

        gp.obj[2] = new OBJ_Key();
        gp.obj[2].worldX = 27 * gp.tileSize;
        gp.obj[2].worldY = 46 * gp.tileSize;

        gp.obj[3] = new OBJ_Door();
        gp.obj[3].worldX = 21 * gp.tileSize;
        gp.obj[3].worldY = 37 * gp.tileSize;

        gp.obj[4] = new OBJ_Door();
        gp.obj[4].worldX = 21 * gp.tileSize;
        gp.obj[4].worldY = 38 * gp.tileSize;

        gp.obj[5] = new OBJ_Door();
        gp.obj[5].worldX = 27 * gp.tileSize;
        gp.obj[5].worldY = 39 * gp.tileSize;

        gp.obj[6] = new OBJ_Chest();
        gp.obj[6].worldX = 13 * gp.tileSize;
        gp.obj[6].worldY = 27 * gp.tileSize;

        gp.obj[6] = new OBJ_Chest();
        gp.obj[6].worldX = 13 * gp.tileSize;
        gp.obj[6].worldY = 28 * gp.tileSize;

        gp.obj[7] = new OBJ_Chest();
        gp.obj[7].worldX = 13 * gp.tileSize;
        gp.obj[7].worldY = 29 * gp.tileSize;
    }
}
