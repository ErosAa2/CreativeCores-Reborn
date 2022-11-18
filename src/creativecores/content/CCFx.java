package creativecores.content;

import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Lines;
import arc.math.Interp;
import arc.math.Mathf;
import mindustry.entities.Effect;
import mindustry.graphics.Drawf;
import mindustry.graphics.Pal;

import static arc.graphics.g2d.Draw.color;

public class CCFx {

    public static final Effect
        greenLaserCharge = new Effect(16f, e -> {
            color(Color.valueOf("9eff59"));

            Lines.stroke(e.fout() * 5);
            Lines.circle(e.x, e.y, e.fout(Interp.pow5Out));

            Drawf.light(e.x, e.y, 60f * e.fout(), Color.valueOf("9eff59"), 0.5f);
        });

}
