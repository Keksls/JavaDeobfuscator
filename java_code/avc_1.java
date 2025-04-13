/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

/*
 * Renamed from avc
 */
public class avc_1 {
    private final avp_2 e;
    public final String a;
    public String b;
    private int f;
    private boolean g = true;
    private final float h = 1.0f;
    protected long c = 0L;
    protected final ava_1 d;
    private boolean i;

    public avc_1(String string, String string2, ava_1 ava_12) {
        this.a = string;
        this.b = string2;
        this.f = auc_1.c(string2);
        this.e = new avp_2();
        this.e.a(gi_0.k(string), string);
        aui_1.a().a(this.e);
        this.d = ava_12;
    }

    public void a(int n) {
        this.c += (long)n;
    }

    public final boolean a() {
        return this.g;
    }

    public final void a(boolean bl) {
        this.g = bl;
    }

    public final boolean b() {
        return this.g;
    }

    public final avp_2 c() {
        return this.e;
    }

    public final int d() {
        return this.f;
    }

    public void a(EntitySprite entitySprite) {
        entitySprite.a(this.c(), this.d(), this.d);
        entitySprite.b(auc_1.a().b);
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    public boolean e() {
        return this.i;
    }

    public void a(String string) {
        this.b = string;
        this.f = auc_1.c(string);
    }
}

