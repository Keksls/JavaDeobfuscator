/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class bVs
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "territoryName";
    public static final String d = "cash";
    public static final String e = "taxes";
    public static final String f = "satisfaction";
    public static final String g = "animation";
    public static final String h = "animName";
    public static final String i = "inChaos";
    private final fem_0 k;
    private final bMn l;
    private aby_0 m;
    private ArrayList n;
    public static final String[] j = new String[]{"name", "cash", "taxes", "satisfaction", "inChaos"};

    public bVs(fem_0 fem_02) {
        this.k = fem_02;
        this.l = bMs.a.a(fem_02.a());
        if (this.l.D() != this.k.b()) {
            this.l.b(this.k.b());
        }
    }

    @Override
    public String[] d() {
        return j;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            String string2 = bae.h().a(48, (long)this.h(), new Object[0]);
            return string2 + (String)(this.k.d() ? " " + bae.h().a("chaos.label", new Object[0]) : "");
        }
        if (string.equals(b)) {
            return this.l.n();
        }
        if (string.equals(d)) {
            return DecimalFormat.getIntegerInstance().format(this.a()) + " \u00a7";
        }
        if (string.equals(f)) {
            if (this.n == null) {
                int n = this.k.h();
                int n2 = this.k.g();
                this.n = new ArrayList(n);
                for (int k = 0; k < n; ++k) {
                    this.n.add(k < n2);
                }
            }
            return this.n;
        }
        if (string.equals(g)) {
            return this.k();
        }
        if (string.equals(h)) {
            return this.j();
        }
        if (string.equals(e)) {
            return (int)(this.g() * 100.0f) + " %";
        }
        if (string.equals(i)) {
            return this.k.d();
        }
        return null;
    }

    public long a() {
        return this.k.e();
    }

    public float b() {
        return this.k.h() == 0 ? -1.0f : (float)this.k.g() / (float)this.k.h();
    }

    public int c() {
        return this.k.h();
    }

    public boolean e() {
        return this.c() == 0 || this.c() == this.k.g();
    }

    public int f() {
        return this.k.g();
    }

    public float g() {
        return this.k.f();
    }

    public int h() {
        return this.k.a();
    }

    public bnm_0 i() {
        return bnm_0.a(fgk_0.a(this.k.g(), this.k.h()));
    }

    public String j() {
        return this.i().b();
    }

    public aby_0 k() {
        if (this.m == null) {
            aby_0 aby_02 = new aby_0(abd_1.c(), 0.0f, 0.0f, 0.0f);
            String string = this.k.a() + ".anm";
            try {
                aby_02.a(azs_0.a().a("ANMGUIPath") + string, true);
            }
            catch (IOException iOException) {
                return null;
            }
            catch (gm_0 gm_02) {
                return null;
            }
            aby_02.a(string);
            this.m = aby_02;
        }
        this.m.g(this.j());
        this.m.e(this.j());
        return this.m;
    }

    public String l() {
        return this.l.n();
    }
}

