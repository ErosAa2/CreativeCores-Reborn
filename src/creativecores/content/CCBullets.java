package creativecores.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.entities.bullet.BulletType;
import mindustry.entities.bullet.MissileBulletType;

public class CCBullets {
    public static BulletType
        seedlingVine;

    public void load() {
        seedlingVine = new MissileBulletType(4,10) {{
            weaveMag = 5;
            weaveScale = 1;
            shrinkY = shrinkX = 0;

            backColor = Color.valueOf("4cb043");
            frontColor = Color.valueOf("8ce66c");

            trailEffect = Fx.heal;
            trailLength = 5;
            trailColor = Color.valueOf("9eff59");

        }};

    }
}
