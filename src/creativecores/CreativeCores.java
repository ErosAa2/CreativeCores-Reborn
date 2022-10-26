package creativecores;

import arc.*;
import arc.util.*;
import creativecores.content.CCBullets;
import creativecores.content.CCUnitTypes;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class CreativeCores extends Mod{

    public CreativeCores(){}

    @Override
    public void loadContent() {
        new CCBullets().load();
        new CCUnitTypes().load();
    }

}
