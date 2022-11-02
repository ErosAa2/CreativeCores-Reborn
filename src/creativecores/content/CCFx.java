package creativecores.content;

import arc.graphics.Color;
import arc.math.Mathf;
import mindustry.entities.Effect;
import mindustry.graphics.Drawf;
import mindustry.graphics.Pal;

import static arc.graphics.g2d.Draw.color;

public class CCFx {

    public static final Effect
        railTrailGreen = new Effect(16f, e -> {
            color(Color.valueOf("9eff59"));

            for(int i : Mathf.signs){
                Drawf.tri(e.x, e.y, 10f * e.fout(), 24f, e.rotation + 90 + 90f * i);
            }

            Drawf.light(e.x, e.y, 60f * e.fout(), Color.valueOf("9eff59"), 0.5f);
        });

}
