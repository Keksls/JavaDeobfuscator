/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkx
 */
public class bkx_2
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "level";
    public static final String d = "nameAndLevel";
    public static final String e = "iconUrl";
    public static final String f = "description";
    public static final String g = "canBeIncreased";
    public static final String h = "canBeDecreased";
    public static final String i = "categoryHasTooManyPoints";
    private static final String[] k = new String[]{"name", "level", "nameAndLevel", "iconUrl", "description", "canBeIncreased", "canBeDecreased", "categoryHasTooManyPoints"};
    public static final Comparator<bkx_2> j = Comparator.comparingInt(bkx_2::a);
    private final ezx_2 l;
    private final bkw_2 m;
    private final bkt_2 n;

    public bkx_2(ezx_2 ezx_22, bkw_2 bkw_22, bkt_2 bkt_22) {
        this.l = ezx_22;
        this.m = bkw_22;
        this.n = bkt_22;
    }

    public int a() {
        return this.n.b();
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "name": {
                return this.f();
            }
            case "level": {
                return this.b();
            }
            case "nameAndLevel": {
                String string2 = this.b() + (String)(this.n.d() == 0 ? "" : "/" + this.n.d());
                return this.f() + " - " + bae.h().a("levelShort.custom", string2);
            }
            case "iconUrl": {
                return azs_0.a().a("aptitudeIconsPath", "defaultIconPath", this.n.a());
            }
            case "description": {
                return this.g();
            }
            case "canBeIncreased": {
                return this.k();
            }
            case "canBeDecreased": {
                return this.j();
            }
            case "categoryHasTooManyPoints": {
                return this.m.a() < 0;
            }
        }
        return null;
    }

    private String f() {
        return bae.h().a(146, (long)this.n.b(), new Object[0]);
    }

    public short b() {
        return this.l.a(this.n.b());
    }

    private String g() {
        eps_0 eps_02;
        ani_2 ani_22 = new ani_2();
        if (this.n.d() != 0 && this.b() == this.n.d()) {
            ani_22.a();
            ani_22.a((CharSequence)bae.h().a("aptitudes.maxLevelReached", new Object[0]));
            ani_22.b();
        }
        if ((eps_02 = this.h()) != null) {
            ani_22.m().m().a((CharSequence)bae.h().a(eps_02.name() + "Description", new Object[0]));
        }
        short s2 = this.b();
        ani_22.m().m().g().a((CharSequence)bae.h().a("aptitudes.currentLevelEffects", new Object[0])).h().m();
        ani_22.a((CharSequence)this.b(s2));
        if (!this.i()) {
            short s3 = (short)(s2 + 1);
            ani_22.a((CharSequence)"\n\n").g().a((CharSequence)bae.h().a("aptitudes.nextLevelEffects", new Object[0])).h().a((CharSequence)"\n");
            ani_22.a((CharSequence)this.b(s3));
        }
        return ani_22.r();
    }

    @Nullable
    private eps_0 h() {
        efh_0 efh_02 = bgh_0.a().d(this.n.c());
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

    private String b(short s2) {
        ezf_1 ezf_12 = new ezf_1(this.n, s2);
        ArrayList<String> arrayList = eDi.a(new eDq<ezf_1>(ezf_12, this.n.b(), s2));
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

    private boolean i() {
        return this.n.d() != 0 && this.b() >= this.n.d();
    }

    private boolean j() {
        return this.l.a(this.n.b()) > 0;
    }

    private boolean k() {
        return !this.i() && this.l.a(this.n.b(), 1, cZI.H());
    }

    public void c() {
        fis_1.a().a((ajf_1)this, b, d, g, h, i);
        this.l();
        fis_1.a().a((ajf_1)this.m, "remainingPoints", "tagRoundStyle");
    }

    private void l() {
        bkx_2 bkx_22 = (bkx_2)fis_1.a().e("describedAptitude");
        if (bkx_22 != null && bkx_22.a() == this.a()) {
            fis_1.a().a((ajf_1)this, f);
        }
    }

    public bkw_2 e() {
        return this.m;
    }

    public int a(short s2) {
        if (this.n.d() == 0) {
            return this.l.c(this.m.c(), s2);
        }
        return Math.min(this.n.d() - this.b(), this.l.c(this.m.c(), s2));
    }

    @Override
    public String[] d() {
        return k;
    }
}

