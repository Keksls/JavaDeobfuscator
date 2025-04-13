/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bko
 */
@Deprecated
public class bko_2
implements ajh_1 {
    public static final String a = "nameAndLevel";
    public static final String b = "name";
    public static final String d = "id";
    public static final String e = "iconUrl";
    public static final String f = "description";
    public static final String g = "levelValue";
    public static final String h = "level";
    public static final String i = "levelWithColor";
    public static final String j = "levelColor";
    public static final String k = "canBeIncreased";
    public static final String l = "canBeDecreased";
    public static final String m = "characteristicValue";
    public static final String n = "characteristicName";
    public static final String o = "characteristicDescription";
    public static final String p = "isMaxedOut";
    private final ezz_2 q;
    private final bkt_2 r;

    bko_2(ezz_2 ezz_22, bkt_2 bkt_22) {
        this.q = ezz_22;
        this.r = bkt_22;
    }

    public int a() {
        return this.r.b();
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.i();
        }
        if (string.equals(a)) {
            String string2 = this.b() + (String)(this.r.d() == 0 ? "" : "/" + this.r.d());
            return this.i() + " - " + bae.h().a("levelShort.custom", string2);
        }
        if (string.equals(e)) {
            return azs_0.a().a("aptitudeIconsPath", "defaultIconPath", this.r.a());
        }
        if (string.equals(f)) {
            eps_0 eps_02;
            ani_2 ani_22 = new ani_2();
            if (this.r.d() != 0 && this.b() == this.r.d()) {
                ani_22.a();
                ani_22.a((CharSequence)bae.h().a("aptitudes.maxLevelReached", new Object[0]));
                ani_22.b();
            }
            if ((eps_02 = this.h()) != null) {
                ani_22.m().m().a((CharSequence)bae.h().a(eps_02.name() + "Description", new Object[0]));
            }
            short s2 = this.b();
            ani_22.m().m().g().a((CharSequence)bae.h().a("aptitudes.currentLevelEffects", new Object[0])).h().m();
            ani_22.a((CharSequence)this.a(s2));
            if (!this.j()) {
                short s3 = (short)(s2 + 1);
                ani_22.a((CharSequence)"\n\n").g().a((CharSequence)bae.h().a("aptitudes.nextLevelEffects", new Object[0])).h().a((CharSequence)"\n");
                ani_22.a((CharSequence)this.a(s3));
            }
            return ani_22.r();
        }
        if (string.equals(g)) {
            return this.b();
        }
        if (string.equals(h)) {
            return this.b();
        }
        if (string.equals(i)) {
            boolean bl = false;
            String string3 = this.j() ? elw_1.c.a() : elw_1.a.a();
            ani_2 ani_23 = new ani_2();
            ani_23.i().a(string3);
            ani_23.a(this.b());
            ani_23.j();
            return ani_23.r();
        }
        if (string.equals(j)) {
            boolean bl = false;
            if (this.j()) {
                return elw_1.c.a();
            }
            return elw_1.a.a();
        }
        if (string.equals(k)) {
            return this.g();
        }
        if (string.equals(l)) {
            return this.f();
        }
        if (string.equals(p)) {
            return this.j();
        }
        if (!string.equals(m)) {
            if (string.equals(n)) {
                eps_0 eps_03 = this.h();
                if (eps_03 != null) {
                    return bae.h().a(eps_03.name() + "Short", new Object[0]);
                }
                return null;
            }
            if (string.equals(o)) {
                eps_0 eps_04 = this.h();
                if (eps_04 != null) {
                    return bae.h().a(eps_04.name() + "Description", new Object[0]);
                }
                return null;
            }
        }
        return null;
    }

    @Nullable
    private eps_0 h() {
        efh_0 efh_02 = bgh_0.a().d(this.r.c());
        if (efh_02 == null) {
            return null;
        }
        ejh_0 ejh_02 = (ejh_0)efc_0.a().b(efh_02.j());
        if (!(ejh_02 instanceof eGH)) {
            return null;
        }
        eGN eGN2 = (eGN)ejh_02;
        return (eps_0)eGN2.aJ();
    }

    public short b() {
        return this.q.a(this.r.b());
    }

    private String i() {
        return bae.h().a(146, (long)this.r.b(), new Object[0]);
    }

    private String a(short s2) {
        ezf_1 ezf_12 = new ezf_1(this.r, s2);
        ArrayList<String> arrayList = eDi.a(new eDq<ezf_1>(ezf_12, this.r.b(), s2));
        ani_2 ani_22 = new ani_2();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            if (k > 0) {
                ani_22.m();
            }
            ani_22.a((CharSequence)arrayList.get(k));
        }
        return ani_22.r();
    }

    public void c() {
        fis_1.a().a((ajf_1)this, i, k, l);
    }

    public void e() {
        fis_1.a().a((ajf_1)this, b, a, f, m, o, h, j, i, p, k, l);
    }

    private boolean j() {
        return this.r.d() != 0 && this.b() >= this.r.d();
    }

    public boolean f() {
        bmr_1 bmr_12 = azu_0.j().k();
        return this.q.a(this.r.b()) > 0;
    }

    public boolean g() {
        return false;
    }
}

