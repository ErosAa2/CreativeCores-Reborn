package creativecores.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.MultiEffect;
import mindustry.graphics.Pal;

public class CCBullets {
    public static BulletType
        seedlingVine, sproutArtillary, bioGrouthBullet, ecosystemEmp, biomeray;

    public void load() {
        seedlingVine = new MissileBulletType(4,10) {{
            weaveMag = 50;
            weaveScale = 1;
            lifetime = 100;
            shrinkY = shrinkX = 0;

            backColor = Color.valueOf("4cb043");
            frontColor = Color.valueOf("8ce66c");

            trailEffect = Fx.heal;
            trailLength = 1;
            trailColor = Color.valueOf("9eff59");

        }};

        sproutArtillary = new ArtilleryBulletType(5, 54) {{
            shrinkY = shrinkX = 0;

            height = 10;
            width = 10;

            backColor = Color.valueOf("4cb043");
            frontColor = Color.valueOf("8ce66c");

            trailEffect = Fx.heal;
            trailLength = 15;
            trailColor = Color.valueOf("9eff59");

            fragBullets = 4;
            fragAngle = 180;
            fragBullet = new MissileBulletType(6, 7) {{
                shrinkY = shrinkX = 0;

                backColor = Color.valueOf("4cb043");
                frontColor = Color.valueOf("8ce66c");
                trailLength = 15;
                trailColor = Color.valueOf("9eff59");

                homingPower = 15;
                homingRange = 400;
            }};

        }};

        bioGrouthBullet = new MissileBulletType(4,180) {{
            weaveScale = 2;
            weaveMag = 20;
            lifetime = 250;
            shrinkY = shrinkX = 0;

            backColor = Color.valueOf("4cb043");
            frontColor = Color.valueOf("8ce66c");

            trailInterval = 0;
            trailLength = 20;
            trailColor = Color.valueOf("9eff59");

            fragBullet = new MissileBulletType(4, 25) {{
                shrinkY = shrinkX = 0;

                backColor = Color.valueOf("4cb043");
                frontColor = Color.valueOf("8ce66c");
                trailLength = 15;
                trailColor = Color.valueOf("9eff59");

                homingPower = 15;
                homingRange = 400;
            }};

            intervalBullets = 2;
            intervalBullet = new MissileBulletType(2, 10) {{
                shrinkY = shrinkX = 0;

                backColor = Color.valueOf("4cb043");
                frontColor = Color.valueOf("8ce66c");
                trailLength = 15;
                trailColor = Color.valueOf("9eff59");

                homingPower = 15;
                homingRange = 400;
            }};

        }};

        biomeray = new MissileBulletType(2, 880) {{
            weaveScale = 2;
            weaveMag = 2;
            width = 20;

            backColor = Color.valueOf("4cb043");
            frontColor = Color.valueOf("8ce66c");
            trailLength = 15;
            trailColor = Color.valueOf("9eff59");

            shootEffect = CCFx.greenLaserCharge;
            trailInterval = 0;
            trailLength = 20;
            trailColor = Color.valueOf("9eff59");
            fragBullets = 2;
            lifetime = 1;

            fragBullet = new MissileBulletType(3, 56) {{
                shrinkY = shrinkX = 0;

                backColor = Color.valueOf("4cb043");
                frontColor = Color.valueOf("8ce66c");
                trailLength = 15;
                trailColor = Color.valueOf("9eff59");

                homingPower = 15;
                homingRange = 400;
                fragBullets = 4;
                fragBullet = new MissileBulletType(4, 32) {{
                    shrinkY = shrinkX = 0;

                    backColor = Color.valueOf("4cb043");
                    frontColor = Color.valueOf("8ce66c");
                    trailLength = 15;
                    trailColor = Color.valueOf("9eff59");

                    homingPower = 15;
                    homingRange = 400;

                    fragBullets = 16;
                    fragBullet = new MissileBulletType(1, 8) {{
                        shrinkY = shrinkX = 0;

                        backColor = Color.valueOf("4cb043");
                        frontColor = Color.valueOf("8ce66c");
                        trailLength = 15;
                        trailColor = Color.valueOf("9eff59");

                        homingPower = 15;
                        homingRange = 400;
                    }};
                }};
            }};
        }};
    }
}
