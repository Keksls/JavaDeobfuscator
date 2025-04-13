/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bhp
 */
final class bhp_2
implements bhn_2 {
    private static final Logger a = Logger.getLogger(bhp_2.class);
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g = 1;
    private String h;
    private short i;
    private abz_0 j;
    private boolean k = true;
    private ahh_0 l;
    @NotNull
    private final ekk_0 m;
    private List<bho_2> n;

    bhp_2(@NotNull ekk_0 ekk_02) {
        this.m = ekk_02;
    }

    @Override
    public long a() {
        return this.m.a_();
    }

    @Override
    public String u() {
        ani_2 ani_22 = new ani_2();
        Su su = this.m.v();
        if (su instanceof blx_1) {
            faU faU2 = (faU)((Object)su);
            ani_22.a((CharSequence)"[").a((CharSequence)faU2.dp()).a((CharSequence)"] ");
        }
        ani_22.a((CharSequence)bae.h().a(6, (long)((int)this.m.A()), new Object[0]));
        return ani_22.r();
    }

    @Override
    public boolean b() {
        return this.d != null && !this.d.isEmpty();
    }

    @Override
    public String c() {
        return this.d;
    }

    @Override
    public String d() {
        if (!this.e()) {
            return this.c();
        }
        return this.e;
    }

    @Override
    public boolean e() {
        return this.e != null;
    }

    @Override
    public String f() {
        if (!this.g()) {
            return this.c();
        }
        return this.f;
    }

    @Override
    public boolean g() {
        return this.f != null;
    }

    @Override
    public void c(String string) {
        this.d = null;
        this.e = null;
        this.f = null;
        if (string == null) {
            return;
        }
        String[] stringArray = Cz.a(string, '|');
        if (stringArray.length >= 1) {
            this.d = stringArray[0];
        }
        if (stringArray.length >= 2) {
            this.e = stringArray[1];
        }
        if (stringArray.length >= 3) {
            this.f = stringArray[2];
        }
    }

    void d(String string) {
        this.b = string;
    }

    void e(String string) {
        this.c = string;
    }

    @Override
    public boolean l() {
        return this.m.a(eld_0.n);
    }

    @Override
    public void a(String string) {
        this.h = string;
    }

    @Override
    public void a(int n) {
        this.g = n;
    }

    @Override
    public void a(ahh_0 ahh_02) {
        this.l = ahh_02;
    }

    @Override
    public ahh_0 h() {
        return this.l;
    }

    @Override
    public boolean i() {
        return !Cz.f(this.h);
    }

    @Override
    public String j() {
        return this.h;
    }

    @Override
    public int k() {
        return this.g;
    }

    @Override
    public boolean m() {
        return !Cz.f(this.c);
    }

    @Override
    public String n() {
        return this.c;
    }

    @Override
    public boolean o() {
        return !Cz.f(this.b);
    }

    @Override
    public String p() {
        return this.b;
    }

    public void a(short s2) {
        this.i = s2;
    }

    @Override
    public short s() {
        return this.i;
    }

    @Override
    public void a(boolean bl) {
        this.k = bl;
    }

    @Override
    public boolean t() {
        return this.k;
    }

    @Override
    public void a(abz_0 abz_02) {
        this.j = abz_02;
        this.j.g(ahi_0.h.a());
        try {
            this.j.a(this.m.F());
            this.b("AnimStatique");
            if (this.n == null || this.n.isEmpty()) {
                return;
            }
            for (int k = 0; k < this.n.size(); ++k) {
                this.n.get(k).a(this);
            }
        }
        catch (Exception exception) {
            a.error((Object)exception);
        }
    }

    @Override
    public long b(String string) {
        if (this.j == null) {
            return 0L;
        }
        this.j.e(string);
        return this.j.j(string);
    }

    @Override
    public abz_0 q() {
        return this.j;
    }

    @Override
    @NotNull
    public ekk_0 r() {
        return this.m;
    }

    @Override
    public void a(bho_2 bho_22) {
        if (this.n == null) {
            this.n = new ArrayList<bho_2>();
        }
        this.n.add(bho_22);
    }

    @Override
    public void b(bho_2 bho_22) {
        if (this.n != null) {
            this.n.remove(bho_22);
        }
    }

    @Override
    public void a(bhn_2 bhn_22) {
        if (bhn_22 == null) {
            return;
        }
        this.d = bhn_22.c();
        this.e = bhn_22.e() ? bhn_22.d() : null;
        this.f = bhn_22.g() ? bhn_22.f() : null;
        this.h = bhn_22.j();
        this.g = bhn_22.k();
        this.c = bhn_22.n();
        this.b = bhn_22.p();
        this.j = bhn_22.q();
        this.l = bhn_22.h();
        this.i = bhn_22.s();
    }
}

