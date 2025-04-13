/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

/*
 * Renamed from auR
 */
public class aur_1 {
    private final avp_2 c;
    public final String a;
    public final String b;
    private final int d;
    private boolean e = true;
    private final float f = 1.0f;
    private long g = 0L;
    private static final float h = 0.1f;
    private static final float i = 0.04f;

    public aur_1(String string, String string2) {
        this.a = string;
        this.b = string2;
        this.d = auc_1.c(string2);
        this.c = new avp_2();
        this.c.a(gi_0.k(string), string);
        aui_1.a().a(this.c);
    }

    public void a(float f2) {
        this.g = (long)((float)this.g + f2);
    }

    public final boolean a() {
        return this.e;
    }

    public final void a(boolean bl) {
        this.e = bl;
    }

    public final boolean b() {
        return true;
    }

    public void b(boolean bl) {
    }

    public final avp_2 c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public ava_1 e() {
        return null;
    }

    public void a(EntitySprite entitySprite) {
        entitySprite.a(this.c(), this.d(), this.e());
        entitySprite.b(auc_1.a().b);
    }
}

