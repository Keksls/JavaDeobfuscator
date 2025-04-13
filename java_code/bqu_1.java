/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bQu
 */
public class bqu_1
extends bqv_1 {
    public static final String a = "mobile";
    private bMg G;

    public bqu_1() {
    }

    public bqu_1(bmr_1 bmr_12) {
        super(bmr_12);
    }

    public void a(fge fge2) {
        fga fga2 = (fga)fge2;
        ffu_0 ffu_02 = ffx.a.a(fga2);
        bMf bMf2 = new bMf(this.D, ffu_02);
        int n = fga2.c();
        fgb fgb2 = fgd.a.a((Integer)n);
        bMf2.g().e(aOt.a(fgb2.b().a()));
        this.G = (bMg)bMf2.g();
        fis_1.a().a((ajf_1)this, "animName", a);
    }

    public void a(fgb fgb2, @Nullable biE biE2) {
        this.G = new bMg(null, null);
        this.G.m(fgb2.d());
        this.G.a(aej_2.d);
        this.G.e("AnimStatique");
        this.G.a(agm.a());
        if (biE2 != null) {
            this.G.f(biE2);
        }
        this.G.g(ahi_0.j.a());
        this.G.b((byte)8);
        this.G.c(true);
        this.G.E();
        fis_1.a().a((ajf_1)this, "animName", a);
    }

    public void a(fgj fgj2) {
        fge fge2 = fgh.a.b(fgj2.d());
        this.G = new bMg(null, null);
        this.G.m(fgj2.c());
        if (fge2 != null) {
            this.G.a(fge2.h(fge2.n()));
        }
        bMj.a(this.G, azu_0.j().k());
        this.G.a(aej_2.d);
        this.G.e("AnimStatique");
        this.G.a(agm.a());
        this.G.g(ahi_0.j.a());
        this.G.b((byte)8);
        this.G.c(true);
        bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(fgj2.b());
        if (bjw_12 != null) {
            this.G.c(bjw_12.C());
        }
        this.G.E();
        fis_1.a().a((ajf_1)this, "animName", a, "petAnimationEquipment");
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.G;
        }
        if (string.equals("petAnimationEquipment")) {
            return this.G.an();
        }
        return super.b(string);
    }
}

