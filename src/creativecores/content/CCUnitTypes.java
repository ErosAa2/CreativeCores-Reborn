package creativecores.content;


import arc.graphics.Color;
import mindustry.gen.Sounds;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

public class CCUnitTypes {
    public static UnitType
        seedling, sprout;


    public void load() {
        seedling = new UnitType("seedling") {{
            health = 430;
            accel = 0.03f;
            drag = 0.08f;
            speed = 4;
            armor = 2;
            flying = true;
            constructor = UnitEntity::create;
            range = 250;
            hitSize = 4;
            maxRange = range;
            engineSize = 5f;
            engineOffset = 7f;
            engineColor = Color.valueOf("4cb043");

            weapons.add(
                    new Weapon("seedling-launcher") {{
                        x = 0;
                        y = 0;
                        mirror = false;
                        reload = 30;
                        top = false;
                        shootSound = Sounds.missile;
                        bullet = CCBullets.seedlingVine;
                    }}
            );
        }};

        sprout = new UnitType("sprout") {{
            health = 430;
            accel = 0.03f;
            drag = 0.08f;
            speed = 4;
            armor = 2;
            flying = true;
            constructor = UnitEntity::create;
            range = 250;
            hitSize = 4;
            maxRange = range;
            engineSize = 5f;
            engineOffset = 7f;
            engineColor = Color.valueOf("4cb043");

            weapons.add(
                    new Weapon("seedling-launcher") {{
                        x = 0;
                        y = 0;
                        mirror = false;
                        reload = 30;
                        top = false;
                        shootSound = Sounds.missile;
                        bullet = CCBullets.seedlingVine;
                    }}
            );
        }};

    }
}
