/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from enu
 */
public enum enu_0 {
    a(0, enx_0.a, 0, 0, 0),
    b(101, enx_0.b, 107, 101, 0),
    c(107, enx_0.c, 107, 101, 0);

    public static final float d = 0.5f;
    public final int e;
    private final enx_0 f;
    private final int g;
    private final int h;
    private final int i;

    private enu_0(int n2, enx_0 enx_02, int n3, int n4, int n5) {
        this.e = n2;
        this.f = enx_02;
        this.g = n3;
        this.h = n4;
        this.i = n5;
    }

    @NotNull
    public static enu_0 a(int n) {
        for (enu_0 enu_02 : enu_0.values()) {
            if (enu_02.e != n) continue;
            return enu_02;
        }
        return a;
    }

    public int a() {
        return this.e;
    }

    public boolean a(enw_0 enw_02) {
        return this.f.a().contains((Object)enw_02);
    }

    public EnumSet<enw_0> b() {
        return this.f.a();
    }

    public int c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public float e() {
        float f2 = enp_2.a.i(ens_2.cf);
        if (this.f.a(enw_0.w)) {
            return f2 * (1.0f + (float)enp_2.a.b(ens_2.cg) / 100.0f);
        }
        return f2;
    }

    public int f() {
        return this.i;
    }

    public float g() {
        float f2 = enp_2.a.i(ens_2.cd);
        if (this.f.a(enw_0.v)) {
            return f2 * (1.0f + (float)enp_2.a.b(ens_2.ce) / 100.0f);
        }
        return f2;
    }

    public float h() {
        float f2 = enp_2.a.i(ens_2.cj);
        if (this.f.a(enw_0.y)) {
            return f2 * (1.0f + (float)enp_2.a.b(ens_2.ck) / 100.0f);
        }
        return f2;
    }

    public float i() {
        float f2 = enp_2.a.i(ens_2.ch);
        if (this.f.a(enw_0.x)) {
            return f2 * (1.0f + (float)enp_2.a.b(ens_2.ci) / 100.0f);
        }
        return f2;
    }

    public String toString() {
        return "SubscriptionLevel{name=" + this.name() + ", m_id=" + this.e + ", m_rightsSet=" + this.f + ", m_premiumLevel=" + this.g + ", m_freeLevel=" + this.h + ", m_craftXpRatio=" + this.e() + ", m_lootExtraRoll=" + this.i + ", m_xpRatio=" + this.g() + ", m_dropRatio=" + this.h() + ", m_kamasRatio=" + this.i() + "}";
    }
}

