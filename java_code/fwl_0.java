/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

/*
 * Renamed from fwL
 */
public class fwl_0
extends avc_1 {
    private static final String e = "minAlpha";
    private static final String f = "maxAlpha";
    private static final String g = "px";
    private static final String h = "py";
    private static final String i = "pw";
    private static final String j = "ph";
    private static final String k = "texSize";

    private static ava_1 g() {
        return new ava_1(new aut_1(e, auu_1.a), new aut_1(f, auu_1.a), new aut_1(g, auu_1.a), new aut_1(h, auu_1.a), new aut_1(i, auu_1.a), new aut_1(j, auu_1.a), new aut_1(k, auu_1.a));
    }

    public fwl_0() {
        super(fpm_0.b().B + "gui.cgfx", "AngleDesat", fwl_0.g());
    }

    public void a(float f2) {
        this.d.a(e, f2);
    }

    public void b(float f2) {
        this.d.a(f, f2);
    }

    public void a(ayo_2 ayo_22) {
        this.d.a(g, ayo_22.f());
        this.d.a(h, ayo_22.g());
        this.d.a(i, ayo_22.e());
        this.d.a(j, ayo_22.d());
        afe_1 afe_12 = ayo_22.a().x();
        this.d.a(k, afe_12.a());
    }

    @Override
    public void a(EntitySprite entitySprite) {
        entitySprite.a(this.c(), this.d(), this.d);
    }

    public ava_1 f() {
        if (!axy_2.b.c()) {
            this.d.a("gColorScale", aup_1.I.a("gColorScale"));
        }
        return this.d;
    }
}

