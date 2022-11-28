package creativecores.content;


import arc.graphics.Color;
import mindustry.entities.abilities.EnergyFieldAbility;
import mindustry.entities.abilities.ForceFieldAbility;
import mindustry.gen.Sounds;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

public class CCUnitTypes {
    public static UnitType
        seedling, sprout, biome, ecosystem, biosphere, mystrea;


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
            engineSize = 3f;
            engineOffset = 4f;

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
            health = 860;
            accel = 0.03f;
            drag = 0.05f;
            speed = 3.75f;
            armor = 4;
            flying = true;
            lowAltitude = true;
            constructor = UnitEntity::create;
            range = 300;
            hitSize = 8;
            maxRange = range;
            engineSize = 7f;
            engineOffset = 6f;

            weapons.add(
                    new Weapon("sprout-artillery") {{
                        x = 5;
                        y = 0;
                        mirror = true;
                        reload = 120;
                        top = true;
                        shootSound = Sounds.artillery;
                        bullet = CCBullets.sproutArtillary;
                    }}
            );
        }};

        biome = new UnitType("biome") {{
            health = 1360;
            accel = 0.05f;
            drag = 0.05f;
            speed = 2.5f;
            armor = 12;
            flying = true;
            lowAltitude = true;
            constructor = UnitEntity::create;
            range = 400;
            hitSize = 12;
            maxRange = range;
            engineSize = 7f;
            engineOffset = 6f;

            weapons.add(
                    new Weapon("creative-cores-bio-spreader") {{
                        x = 10;
                        y = 0;
                        mirror = true;
                        reload = 230;
                        top = true;
                        shootSound = Sounds.lasershoot;
                        bullet = CCBullets.bioGrouthBullet;
                    }}
            );
        }};

        ecosystem = new UnitType("ecosystem") {{
            health = 2500;
            accel = 0.04f;
            drag = 0.04f;
            speed = 2.3f;
            armor = 18;
            flying = true;
            lowAltitude = true;
            constructor = UnitEntity::create;

            abilities.add(new EnergyFieldAbility(220, 20, 100));
            abilities.add(new ForceFieldAbility(150, 5, 1500, 300));

            setEnginesMirror(
                    new UnitEngine(14f, -7f, 4f, 0),
                    new UnitEngine(14f, -7f, 4f, 0)
            );

            range = 400;
            hitSize = 12;
            maxRange = range;
            engineSize = 8f;
            engineOffset = 7f;
        }};

        biosphere = new UnitType("biosphere") {{
            health = 3800;
            accel = 0.02f;
            drag = 0.03f;
            speed = 2f;
            armor = 43;
            flying = true;
            lowAltitude = true;
            constructor = UnitEntity::create;

            abilities.add(new ForceFieldAbility(200, 10, 2000, 300));

            setEnginesMirror(
                    new UnitEngine(14f, -7f, 4f, 0),
                    new UnitEngine(14f, -7f, 4f, 0)
            );

            range = 400;
            hitSize = 12;
            maxRange = range;
            engineSize = 8f;
            engineOffset = 12f;

            weapons.add(
                    new Weapon("creative-cores-biosphere-sniper") {{
                        x = 10;
                        y = 0;
                        mirror = true;
                        reload = 50;
                        top = true;
                        shootSound = Sounds.lasershoot;
                        bullet = CCBullets.biomeray;
                    }},

                    new Weapon("creative-cores-bio-spreader") {{
                        x = 25;
                        y = 0;
                        mirror = true;
                        reload = 100;
                        top = true;
                        shootSound = Sounds.lasershoot;
                        bullet = CCBullets.bioGrouthBullet;
                    }}
            );
        }};

        biosphere = new UnitType("biosphere") {{
            health = 3800;
            accel = 0.02f;
            drag = 0.03f;
            speed = 2f;
            armor = 43;
            flying = true;
            lowAltitude = true;
            constructor = UnitEntity::create;

            abilities.add(new ForceFieldAbility(200, 10, 2000, 300));

            setEnginesMirror(
                    new UnitEngine(14f, -7f, 4f, 0),
                    new UnitEngine(14f, -7f, 4f, 0)
            );

            range = 400;
            hitSize = 12;
            maxRange = range;
            engineSize = 8f;
            engineOffset = 12f;

            weapons.add(
                    new Weapon("creative-cores-biosphere-sniper") {{
                        x = 10;
                        y = 0;
                        mirror = true;
                        reload = 50;
                        top = true;
                        shootSound = Sounds.lasershoot;
                        bullet = CCBullets.biomeray;
                    }},

                    new Weapon("creative-cores-bio-spreader") {{
                        x = 25;
                        y = 0;
                        mirror = true;
                        reload = 100;
                        top = true;
                        shootSound = Sounds.lasershoot;
                        bullet = CCBullets.bioGrouthBullet;
                    }}
            );
        }};

        mystrea = new UnitType("mystrea") {{
            health = 3800;
            accel = 0.02f;
            drag = 0.03f;
            speed = 2f;
            armor = 43;
            flying = true;
            lowAltitude = true;
            constructor = UnitEntity::create;

            abilities.add(new ForceFieldAbility(200, 10, 2000, 300));

            setEnginesMirror(
                    new UnitEngine(14f, -7f, 4f, 0),
                    new UnitEngine(14f, -7f, 4f, 0)
            );

            range = 400;
            hitSize = 12;
            maxRange = range;
            engineSize = 8f;
            engineOffset = 12f;

            weapons.add(
                    new Weapon("creative-cores-biosphere-sniper") {{
                        x = 10;
                        y = 0;
                        mirror = true;
                        reload = 50;
                        top = true;
                        shootSound = Sounds.lasershoot;
                        bullet = CCBullets.biomeray;
                    }},

                    new Weapon("creative-cores-bio-spreader") {{
                        x = 25;
                        y = 0;
                        mirror = true;
                        reload = 100;
                        top = true;
                        shootSound = Sounds.lasershoot;
                        bullet = CCBullets.bioGrouthBullet;
                    }}
            );
        }};

    }
}
