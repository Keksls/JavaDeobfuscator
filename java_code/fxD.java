/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public final class fxD
implements Iterable<fxB> {
    public static final azj_2 a = azf_2.f;
    private static final int c = Integer.MAX_VALUE;
    private static final int d = Integer.MAX_VALUE;
    public static final int b = Integer.MAX_VALUE;
    private static final String e = "...";
    private static final String f = "\n";
    private ful_0 g = null;
    private Color h = a.z();
    private boolean i = false;
    private fro_0 j = fro_0.d;
    private fro_0 k = fro_0.a;
    private frh_0 l = frh_0.c;
    private final fxP m;
    private final ArrayList<fxB> n = new ArrayList();
    private fxB o = null;
    private int p = Integer.MAX_VALUE;
    private int q = -1;
    private boolean r = false;
    private int s = Integer.MAX_VALUE;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private final fjf_2 w = new fjf_2(0, 0);
    private final fjf_2 x = new fjf_2(0, 0);
    private final fjf_2 y = new fjf_2(0, 0);
    private boolean z = true;
    private boolean A = true;
    private boolean B = true;
    private boolean C = false;
    private int D = 0;
    private boolean E = true;
    private boolean F;
    private long G = 0L;
    @NotNull
    private final List<fxG> H = new ArrayList<fxG>();

    public fxD(fxP fxP2) {
        this.m = fxP2;
    }

    public void a() {
        for (int k = this.n.size() - 1; k >= 0; --k) {
            this.n.get(k).b();
        }
        this.n.clear();
    }

    public boolean a(fxG fxG2) {
        if (this.H.contains(fxG2)) {
            return false;
        }
        return this.H.add(fxG2);
    }

    public boolean b(fxG fxG2) {
        if (!this.H.contains(fxG2)) {
            return false;
        }
        return this.H.remove(fxG2);
    }

    public void a(ful_0 ful_02) {
        this.g = ful_02;
    }

    public ful_0 b() {
        return this.g;
    }

    public ayf_2 c() {
        return this.m == null ? null : this.m.z();
    }

    public void a(ayf_2 ayf_22) {
        if (this.m.z() != ayf_22) {
            this.m.a(ayf_22);
            this.z = true;
            this.B = true;
            this.g.setNeedsToPreProcess();
            this.g.setNeedsToMiddleProcess();
        }
    }

    public boolean d() {
        return this.m.A();
    }

    public void a(boolean bl) {
        this.m.d(bl);
    }

    public Color e() {
        return this.h;
    }

    public void a(Color color) {
        this.h = color;
    }

    public void a(azj_2 azj_22) {
        if (azj_22 != null) {
            this.a(azj_22.z());
        } else {
            this.a((Color)null);
        }
    }

    public fro_0 f() {
        return this.j;
    }

    public void a(fro_0 fro_02) {
        this.j = fro_02;
        this.z = true;
        this.g.setNeedsToMiddleProcess();
    }

    public fro_0 g() {
        return this.k;
    }

    public void b(fro_0 fro_02) {
        this.k = fro_02;
    }

    public frh_0 h() {
        return this.l;
    }

    public void a(frh_0 frh_02) {
        if (frh_02 != null) {
            this.l = frh_02;
            this.B = true;
            this.z = true;
            this.g.setNeedsToPreProcess();
            this.g.setNeedsToMiddleProcess();
        }
    }

    public boolean i() {
        return this.i;
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    public Boolean j() {
        return this.C;
    }

    public void c(boolean bl) {
        this.C = bl;
    }

    public fxP k() {
        return this.m;
    }

    public String l() {
        if (this.m != null) {
            return this.m.a();
        }
        return null;
    }

    public boolean a(@NotNull String string) {
        if (this.m == null) {
            return string == null;
        }
        return this.m.a(string);
    }

    public void b(String string) {
        if (this.m != null) {
            this.a(() -> {
                if (Objects.equals(this.m.a(), string)) {
                    return;
                }
                this.m.b(string);
                this.B = true;
                this.z = true;
                this.g.setNeedsToPreProcess();
                this.g.setNeedsToMiddleProcess();
            });
        }
    }

    public int m() {
        if (this.m != null) {
            return this.m.e();
        }
        return 0;
    }

    public void c(String string) {
        if (this.m != null) {
            this.a(() -> {
                this.m.c(string);
                this.B = true;
                this.z = true;
                this.g.setNeedsToPreProcess();
                this.g.setNeedsToMiddleProcess();
            });
        }
    }

    public void n() {
        if (this.m != null) {
            this.m.c();
            this.B = true;
            this.z = true;
            this.g.setNeedsToPreProcess();
            this.g.setNeedsToMiddleProcess();
        }
    }

    public void a(fxQ fxQ2, int n) {
        if (this.m != null) {
            this.A |= this.m.a(fxQ2, n);
            if (this.A) {
                this.g.setNeedsToMiddleProcess();
            }
        }
    }

    public void o() {
        if (this.m != null) {
            this.A |= this.m.r();
            if (this.A) {
                this.g.setNeedsToMiddleProcess();
            }
        }
    }

    public void b(fxQ fxQ2, int n) {
        if (this.m != null) {
            this.A |= this.m.b(fxQ2, n);
            if (this.A) {
                this.g.setNeedsToMiddleProcess();
            }
        }
    }

    public void p() {
        if (this.m != null) {
            this.A |= this.m.v();
            if (this.A) {
                this.g.setNeedsToMiddleProcess();
            }
        }
    }

    public ArrayList<fxB> q() {
        return this.n;
    }

    public int r() {
        return this.p;
    }

    public void a(int n) {
        this.p = n;
        this.B = true;
        this.g.setNeedsToPreProcess();
    }

    public int s() {
        return this.q;
    }

    public void b(int n) {
        this.q = n;
        this.B = true;
        this.g.setNeedsToPreProcess();
    }

    public boolean t() {
        return this.r;
    }

    public void d(boolean bl) {
        this.r = bl;
        this.B = true;
        this.g.setNeedsToPreProcess();
    }

    public int u() {
        return this.s;
    }

    public void c(int n) {
        this.s = n;
        if (this.t()) {
            this.B = true;
            this.g.setNeedsToPreProcess();
        }
    }

    public boolean v() {
        return this.t || this.u;
    }

    public void e(boolean bl) {
        this.t = bl;
        this.B = true;
        this.A = true;
        this.g.setNeedsToPreProcess();
        this.g.setNeedsToMiddleProcess();
    }

    public boolean w() {
        return this.u;
    }

    public void f(boolean bl) {
        this.u = bl;
        this.B = true;
        this.A = true;
        this.g.setNeedsToPreProcess();
        this.g.setNeedsToMiddleProcess();
    }

    public boolean x() {
        return this.F;
    }

    public boolean y() {
        return this.E;
    }

    public void g(boolean bl) {
        this.E = bl;
    }

    public int z() {
        if (this.B()) {
            return this.v;
        }
        return 0;
    }

    public void d(int n) {
        this.v = Math.min(Math.max(0, n), this.A());
    }

    public int A() {
        return this.n.size() - 1;
    }

    public boolean B() {
        return this.v() && this.r;
    }

    public boolean C() {
        return this.v() && !this.r;
    }

    public boolean D() {
        return this.E && (this.B() || this.C());
    }

    public fjf_2 E() {
        return (fjf_2)this.y.clone();
    }

    public void a(int n, int n2) {
        n = Math.max(0, n);
        n2 = Math.max(0, n2);
        if ((double)n != this.y.getWidth() || (double)n2 != this.y.getHeight()) {
            this.y.setSize(n, n2);
            this.z = true;
            this.g.setNeedsToMiddleProcess();
        }
    }

    public int F() {
        return this.l.b() ? this.y.width : this.y.height;
    }

    public int G() {
        return this.l.b() ? this.y.height : this.y.width;
    }

    public fjf_2 H() {
        return (fjf_2)this.w.clone();
    }

    public fjf_2 I() {
        return this.x.d();
    }

    public boolean J() {
        return this.B;
    }

    public boolean K() {
        return this.z;
    }

    public boolean L() {
        return this.A;
    }

    public abo_2<fxH, fxF> b(int n, int n2) {
        abo_2<Object, fxF> abo_22 = new abo_2<Object, fxF>(null, fxF.c);
        n2 = this.M() - this.G() - n2;
        int n3 = this.n.size();
        for (int k = 0; k < n3; ++k) {
            fxB fxB2 = this.n.get(k);
            if (!((double)n2 >= fxB2.f().getMinY()) || !((double)n2 <= fxB2.f().getMaxY())) continue;
            int n4 = fxB2.g();
            if (fxB2.f().contains(n, n2)) {
                ArrayList<fxH> arrayList = fxB2.t();
                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                    fxH fxH2 = arrayList.get(i2);
                    int n5 = fxH2.b() + n4;
                    if (n5 > n || n5 + fxH2.d() < n) continue;
                    abo_22.a(fxH2);
                    return abo_22;
                }
            }
            if (n < n4) {
                abo_22.a(fxB2.p());
                abo_22.b(fxF.b);
            } else {
                abo_22.a(fxB2.q());
                abo_22.b(fxF.d);
            }
            return abo_22;
        }
        if (!this.n.isEmpty()) {
            abo_22.a(this.n.get(this.n.size() - 1).q());
            abo_22.b(fxF.e);
        }
        return abo_22;
    }

    public int M() {
        int n = 0;
        if (!this.n.isEmpty()) {
            if (this.B()) {
                fxB fxB2 = this.n.get(this.z());
                if (fxB2 != null) {
                    n = fxB2.h() + fxB2.i();
                }
            } else {
                fxB fxB3 = this.n.get(this.n.size() - 1);
                if (this.k.b()) {
                    n = this.G() + fxB3.h();
                } else if (!this.k.a()) {
                    n = (this.G() + fxB3.h()) / 2;
                }
            }
        }
        return n;
    }

    public void N() {
        if (this.m != null) {
            this.A |= this.m.B();
            if (this.A) {
                this.g.setNeedsToMiddleProcess();
            }
        }
    }

    public void d(String string) {
        if (this.m != null) {
            this.a(() -> {
                if (this.m.f(string)) {
                    this.z = true;
                    this.B = true;
                    this.g.setNeedsToPreProcess();
                    this.g.setNeedsToMiddleProcess();
                }
            });
        }
    }

    public void O() {
        if (this.m != null) {
            this.a(() -> {
                if (this.m.C()) {
                    this.z = true;
                    this.g.setNeedsToMiddleProcess();
                }
            });
        }
    }

    public void P() {
        if (this.m != null) {
            this.a(() -> {
                if (this.m.D()) {
                    this.z = true;
                    this.g.setNeedsToMiddleProcess();
                }
            });
        }
    }

    public void Q() {
        if (this.m != null) {
            this.A |= this.m.E();
            if (this.A) {
                this.g.setNeedsToMiddleProcess();
            }
        }
    }

    public void R() {
        if (this.m != null) {
            this.A |= this.m.F();
            if (this.A) {
                this.g.setNeedsToMiddleProcess();
            }
        }
    }

    public void S() {
        fxH fxH2;
        if (this.o != null && !this.o.m() && (fxH2 = this.o.p()) != null) {
            this.b(fxH2.h(), fxH2.i());
        }
    }

    public void T() {
        if (this.o == null) {
            return;
        }
        if (this.o.m()) {
            return;
        }
        fxH fxH2 = this.o.q();
        if (fxH2 != null) {
            this.b(fxH2.h(), fxH2.j());
        }
    }

    public boolean e(int n) {
        return n < this.s;
    }

    public void U() {
        double d2 = 0.0;
        double d3 = 0.0;
        if (!(this.m.l() || this.D() || this.t())) {
            short s2 = 0;
            for (fxQ fxQ2 : this.m) {
                switch (fxQ2.b()) {
                    case c: {
                        fxQ fxQ3 = (fxR)fxQ2;
                        d2 += (double)((fxR)fxQ3).k();
                        d3 = Math.max(d3, (double)((fxR)fxQ3).l());
                        s2 = 0;
                        break;
                    }
                    case b: {
                        fxQ fxQ3 = (fxS)fxQ2;
                        ayf_2 ayf_22 = ((fxS)fxQ3).l();
                        if (ayf_22 == null) {
                            ayf_22 = this.c();
                        }
                        if (ayf_22 == null) break;
                        String string = ((fxS)fxQ3).k();
                        if (string != null && string.length() != 0) {
                            int n = ayf_22.a(string);
                            int n2 = ayf_22.b(string);
                            d2 += (double)n;
                            d3 = Math.max(d3, (double)n2);
                        } else {
                            d2 += (double)ayf_22.d();
                            d3 = Math.max(d3, (double)ayf_22.e());
                        }
                        s2 = ayf_22.c().c();
                        break;
                    }
                }
            }
            d2 += (double)s2;
        } else if (!this.m.l() && !this.D() && this.t() && this.q > 0) {
            Point point = new Point(0, 0);
            boolean bl = false;
            fxB fxB2 = null;
            int n = 0;
            fro_0 fro_02 = this.j;
            int n3 = this.C() ? Integer.MAX_VALUE : (this.p != Integer.MAX_VALUE ? Math.max(this.q, this.p) : this.q);
            for (fxQ fxQ4 : this.m) {
                fro_0 fro_03 = fxQ4.e();
                if (fro_03 == null) {
                    fro_03 = this.j;
                }
                if (fro_03 != fro_02) {
                    fro_02 = fro_03;
                    bl = true;
                }
                int n4 = 0;
                switch (fxQ4.b()) {
                    case c: {
                        int n5;
                        fxR fxR2 = (fxR)fxQ4;
                        if (point.x != 0 && (n5 = n3 - point.x) < fxR2.k()) {
                            bl = true;
                        }
                        if (bl || fxB2 == null) {
                            if (fxB2 != null) {
                                point.x = 0;
                                point.y -= fxB2.i();
                                d3 += (double)fxB2.i();
                                d2 = Math.max((double)point.x, d2);
                                fxB2.b();
                            }
                            fxB2 = fxB.a();
                            fxB2.a(fro_02);
                            bl = false;
                            if (!this.e(n)) break;
                            ++n;
                        }
                        fxB2.d(Math.max(fxR2.l(), fxB2.i()));
                        fxB2.a(fxR2, point.x);
                        point.x += fxR2.k();
                        break;
                    }
                    case b: {
                        fxS fxS2 = (fxS)fxQ4;
                        ayf_2 ayf_23 = fxS2.l();
                        if (ayf_23 == null) {
                            ayf_23 = this.c();
                        }
                        String string = fxS2.k();
                        if (ayf_23 == null || string == null) break;
                        int n6 = 0;
                        while (n6 != -1) {
                            int n7;
                            int n8;
                            String string2;
                            int n9 = n6;
                            String string3 = string2 = (n6 = string.indexOf(f, n6 + 1)) == -1 ? string.substring(n9) : string.substring(n9, n6);
                            if (point.x != 0 && string2.length() != 0 && (n8 = ayf_23.a(string2, n7 = n3 - point.x, false)) == 0) {
                                bl = true;
                            }
                            boolean bl2 = bl = bl || n4 != 0 || fxB2 == null || string2.startsWith(f);
                            if (string2.length() == 0) {
                                if (bl) {
                                    if (fxB2 != null) {
                                        point.x = 0;
                                        point.y -= fxB2.i();
                                        d2 = Math.max((double)point.x, d2);
                                        d3 += (double)fxB2.i();
                                    }
                                    if (fxB2 != null) {
                                        fxB2.b();
                                    }
                                    fxB2 = fxB.a();
                                    fxB2.a(fro_02);
                                    bl = false;
                                    if (!this.e(n)) break;
                                    ++n;
                                }
                                fxB2.d(Math.max(ayf_23.e(), fxB2.i()));
                                fxB2.a("", fxS2, n4, n4, point.x, 0);
                                continue;
                            }
                            n7 = 0;
                            while (n7 < string2.length()) {
                                if (bl) {
                                    if (fxB2 != null) {
                                        d2 = Math.max((double)point.x, d2);
                                        point.y -= fxB2.i();
                                        d3 += (double)fxB2.i();
                                    }
                                    point.x = ayf_23.c().c();
                                    if (fxB2 != null) {
                                        fxB2.b();
                                    }
                                    fxB2 = fxB.a();
                                    fxB2.a(fro_02);
                                    bl = false;
                                    if (!this.e(n)) break;
                                    ++n;
                                }
                                if ((n8 = n3 - point.x) < 0) {
                                    n8 = Integer.MAX_VALUE;
                                }
                                int n10 = ayf_23.a(string2.substring(n7), n8);
                                int n11 = n7 + Math.max(1, n10);
                                String string4 = string2.substring(n7, n11);
                                int n12 = ayf_23.a(string4);
                                int n13 = ayf_23.b(string4);
                                fxB2.d(Math.max(n13, fxB2.i()));
                                fxB2.e(Math.max(fxB2.k(), ayf_23.c(string4)));
                                fxB2.a(string4, fxS2, n4, n4 + string4.length(), point.x, n12);
                                n4 += string4.length();
                                n7 = n11;
                                if (n7 != string2.length()) {
                                    bl = true;
                                    d2 = Math.max(d2, (double)(point.x + n12));
                                    continue;
                                }
                                point.x += n12;
                            }
                            if (this.e(n)) continue;
                            break;
                        }
                        if (this.e(n)) break;
                        break;
                    }
                }
            }
            if (!bl && fxB2 != null) {
                d3 += (double)fxB2.i();
                d2 = Math.max((double)point.x, d2);
            }
            if (fxB2 != null) {
                fxB2.b();
            }
        } else if (!this.m.l() && !this.D() && this.t() && this.q <= 0) {
            Point point = new Point(0, 0);
            boolean bl = false;
            int n = 0;
            fxB fxB3 = null;
            fro_0 fro_04 = this.j;
            int n14 = 0;
            for (fxQ fxQ5 : this.m) {
                fro_0 fro_05 = fxQ5.e();
                if (fro_05 == null) {
                    fro_05 = this.j;
                }
                if (fro_05 != fro_04) {
                    fro_04 = fro_05;
                    bl = true;
                }
                int n15 = 0;
                switch (fxQ5.b()) {
                    case c: {
                        fxR fxR3 = (fxR)fxQ5;
                        if (bl || fxB3 == null) {
                            if (fxB3 != null) {
                                point.x = 0;
                                point.y -= fxB3.i();
                                d3 += (double)fxB3.i();
                            }
                            if (fxB3 != null) {
                                fxB3.b();
                            }
                            fxB3 = fxB.a();
                            fxB3.a(fro_04);
                            bl = false;
                            if (!this.e(n)) break;
                            ++n;
                        }
                        fxB3.d(Math.max(fxR3.l(), fxB3.i()));
                        fxB3.a(fxR3, point.x);
                        point.x += fxR3.k();
                        n14 = 0;
                        break;
                    }
                    case b: {
                        fxS fxS3 = (fxS)fxQ5;
                        ayf_2 ayf_24 = fxS3.l();
                        if (ayf_24 == null) {
                            ayf_24 = this.c();
                        }
                        n14 = ayf_24.c().c();
                        String string = fxS3.k();
                        if (ayf_24 == null || string == null) break;
                        int n16 = 0;
                        while (n16 != -1) {
                            int n17 = n16;
                            String string5 = (n16 = string.indexOf(f, n16 + 1)) == -1 ? string.substring(n17) : string.substring(n17, n16);
                            boolean bl3 = bl = bl || n15 != 0 || fxB3 == null || string5.startsWith(f);
                            if (string5.length() == 0) {
                                if (bl) {
                                    if (fxB3 != null) {
                                        d2 = Math.max((double)(point.x + n14), d2);
                                        point.x = 0;
                                        point.y -= fxB3.i();
                                        d3 += (double)fxB3.i();
                                    }
                                    if (fxB3 != null) {
                                        fxB3.b();
                                    }
                                    fxB3 = fxB.a();
                                    fxB3.a(fro_04);
                                    bl = false;
                                    if (!this.e(n)) break;
                                    ++n;
                                }
                                fxB3.d(Math.max(ayf_24.e(), fxB3.i()));
                                fxB3.a("", fxS3, n15, n15, point.x, 0);
                                continue;
                            }
                            if (bl) {
                                if (fxB3 != null) {
                                    d2 = Math.max((double)(point.x + n14), d2);
                                    point.x = 0;
                                    point.y -= fxB3.i();
                                    d3 += (double)fxB3.i();
                                }
                                if (fxB3 != null) {
                                    fxB3.b();
                                }
                                fxB3 = fxB.a();
                                fxB3.a(fro_04);
                                if (!this.e(n)) break;
                                ++n;
                            }
                            fxB3.d(Math.max(ayf_24.b(string5), fxB3.i()));
                            point.x += ayf_24.a(string5);
                            fxB3.e(Math.max(fxB3.k(), ayf_24.c(string5)));
                            fxB3.a(string5, fxS3, n15, n15 + string5.length(), point.x, ayf_24.a(string5));
                            n15 += string5.length();
                            bl = n16 != -1;
                        }
                        if (this.e(n)) break;
                        break;
                    }
                }
            }
            if (fxB3 != null) {
                d2 = Math.max(d2, (double)(point.x + n14));
                d3 += (double)fxB3.i();
                point.x = 0;
            }
            if (fxB3 != null) {
                fxB3.b();
            }
        } else {
            ayf_2 ayf_25 = this.c();
            if (ayf_25 != null) {
                d2 = ayf_25.d();
                d3 = ayf_25.e();
            }
        }
        if (this.l.b()) {
            this.x.setSize(d2, d3);
            this.w.setSize(Math.max(Math.min((double)this.p, d2), (double)this.q), d3);
        } else {
            this.x.setSize(d3, d2);
            this.w.setSize(d3, Math.max(Math.min((double)this.p, d2), (double)this.q));
        }
        this.B = false;
    }

    public void V() {
        this.a();
        this.F = false;
        Point point = new Point(0, 0);
        boolean bl = false;
        boolean bl2 = false;
        fxB fxB2 = null;
        fro_0 fro_02 = this.j;
        int n = this.C() ? Integer.MAX_VALUE : this.F();
        for (fxQ fxQ2 : this.m) {
            fro_0 fro_03 = fxQ2.e();
            if (fro_03 == null) {
                fro_03 = this.j;
            }
            if (fro_03 != fro_02) {
                fro_02 = fro_03;
                bl = true;
                bl2 = false;
            }
            int n2 = 0;
            switch (fxQ2.b()) {
                case c: {
                    int n3;
                    fxR fxR2 = (fxR)fxQ2;
                    if (point.x != 0 && (n3 = this.F() - point.x) < fxR2.k()) {
                        bl = true;
                        bl2 = true;
                    }
                    if (bl || fxB2 == null) {
                        fxB fxB3 = this.a(fxB2, bl2, point, 0, fro_02);
                        if (fxB3 == null) {
                            return;
                        }
                        fxB2 = fxB3;
                        bl = false;
                    }
                    fxB2.d(Math.max(fxR2.l(), fxB2.i()));
                    fxB2.a(fxR2, point.x);
                    point.x += fxR2.k();
                    break;
                }
                case b: {
                    fxS fxS2 = (fxS)fxQ2;
                    ayf_2 ayf_22 = fxS2.l();
                    if (ayf_22 == null) {
                        ayf_22 = this.c();
                    }
                    String string = fxS2.k();
                    if (ayf_22 == null || string == null) break;
                    int n4 = 0;
                    while (n4 != -1) {
                        int n5;
                        int n6;
                        String string2;
                        int n7 = n4;
                        String string3 = string2 = (n4 = string.indexOf(f, n4 + 1)) == -1 ? string.substring(n7) : string.substring(n7, n4);
                        if (point.x != 0 && string2.length() != 0 && (n6 = ayf_22.a(string2, n5 = n - point.x, false)) == 0) {
                            bl = true;
                        }
                        bl = bl || n2 != 0 || fxB2 == null || string2.startsWith(f);
                        boolean bl3 = bl2 = bl && !string2.startsWith(f);
                        if (string2.length() == 0) {
                            if (bl) {
                                fxB fxB4 = this.a(fxB2, bl2, point, ayf_22.c().c(), fro_02);
                                if (fxB4 == null) {
                                    return;
                                }
                                point.y -= fxB4.i();
                                fxB2 = fxB4;
                                bl = false;
                            }
                            fxB2.d(Math.max(ayf_22.e(), fxB2.i()));
                            fxB2.a("", fxS2, n2, n2, point.x, 0);
                            continue;
                        }
                        n5 = 0;
                        while (n5 < string2.length()) {
                            if (bl) {
                                fxB fxB5 = this.a(fxB2, bl2, point, ayf_22.c().c(), fro_02);
                                if (fxB5 == null) {
                                    return;
                                }
                                fxB2 = fxB5;
                                bl = false;
                            }
                            if ((n6 = n - point.x) < 0) {
                                n6 = Integer.MAX_VALUE;
                            }
                            int n8 = ayf_22.a(string2.substring(n5), n6);
                            int n9 = n5 + Math.max(1, n8);
                            String string4 = string2.substring(n5, n9);
                            int n10 = ayf_22.a(string4) - ayf_22.c().c();
                            int n11 = ayf_22.b(string4);
                            fxB2.d(Math.max(n11, fxB2.i()));
                            fxB2.e(Math.max(fxB2.k(), ayf_22.c(string4)));
                            fxB2.a(string4, fxS2, n2, n2 + string4.length(), point.x, n10);
                            n2 += string4.length();
                            n5 = n9;
                            if (n5 != string2.length()) {
                                bl = true;
                                bl2 = true;
                                continue;
                            }
                            point.x += n10;
                        }
                    }
                    break;
                }
            }
        }
        if (!bl && fxB2 != null) {
            fxB2.c(point.y - fxB2.i());
            fxB2.b(fxB2.l().a(fxB2.j(), this.F()));
            this.n.add(fxB2);
            fxB2 = null;
        }
        if (fxB2 != null) {
            fxB2.b();
        }
        this.W();
        this.z = false;
    }

    public void W() {
        if (this.v()) {
            int n;
            int n2;
            int n3;
            Object object;
            int n4;
            int n5;
            int n6;
            int n7;
            this.o = null;
            fxQ fxQ2 = this.m.o();
            int n8 = this.m.p();
            int n9 = this.m.q();
            fxQ fxQ3 = this.m.s();
            int n10 = this.m.t();
            int n11 = this.m.u();
            for (n7 = 0; n7 < this.n.size(); ++n7) {
                fxB fxB2 = this.n.get(n7);
                fxB2.d();
            }
            n7 = -1;
            int n12 = -1;
            int n13 = -1;
            int n14 = -1;
            for (n6 = 0; n6 < this.n.size() && n7 < 0; ++n6) {
                fxB fxB3 = this.n.get(n6);
                fxB3.d();
                n5 = n6 == 0 ? 1 : 0;
                ArrayList<fxH> arrayList = fxB3.t();
                for (n4 = 0; n4 < arrayList.size() && n14 < 0; ++n4) {
                    object = arrayList.get(n4);
                    fxQ fxQ4 = ((fxH)object).h();
                    if (fxQ4 != fxQ2) continue;
                    boolean bl = n9 < ((fxH)object).i() + (n5 != 0 ? 0 : 1);
                    int n15 = n3 = n9 > ((fxH)object).j() ? 1 : 0;
                    if (bl || n3) continue;
                    int n16 = n9 - ((fxH)object).i() + (n5 != 0 ? 0 : -1);
                    n14 = fxB3.a(this.c(), (fxH)object, n16);
                    n7 = n6;
                    n12 = n4;
                    n13 = n16;
                }
            }
            n6 = -1;
            int n17 = -1;
            n5 = -1;
            int n18 = -1;
            for (n4 = 0; n4 < this.n.size() && n6 < 0; ++n4) {
                object = this.n.get(n4);
                ((fxB)object).d();
                boolean bl = n4 == 0;
                ArrayList<fxH> arrayList = ((fxB)object).t();
                for (n3 = 0; n3 < arrayList.size() && n18 < 0; n3 += 1) {
                    fxH fxH2 = arrayList.get(n3);
                    fxQ fxQ5 = fxH2.h();
                    if (fxQ5 != fxQ3) continue;
                    n2 = n11 < fxH2.i() + (bl ? 0 : 1) ? 1 : 0;
                    int n19 = n = n11 > fxH2.j() ? 1 : 0;
                    if (n2 != 0 || n != 0) continue;
                    int n20 = n11 - fxH2.i() + (bl ? 0 : -1);
                    n18 = ((fxB)object).a(this.c(), fxH2, n20);
                    n6 = n4;
                    n17 = n3;
                    n5 = n20;
                    this.o = object;
                }
            }
            if (n7 >= 0 && n6 >= 0) {
                for (n4 = n7; n4 <= n6; ++n4) {
                    int n21;
                    int n22;
                    object = this.n.get(n4);
                    if (n4 == n7 && n7 < n6) {
                        n22 = n14;
                        n21 = ((fxB)object).a(this.c(), ((fxB)object).q(), ((fxB)object).r()) - n14;
                        n3 = 0;
                    } else if (n7 < n4 && n4 < n6) {
                        n22 = 0;
                        n21 = ((fxB)object).a(this.c(), ((fxB)object).q(), ((fxB)object).r());
                        n3 = 0;
                    } else if (n4 == n6 && n7 < n6) {
                        n22 = 0;
                        n21 = ((fxB)object).a(this.c(), ((fxB)object).g(n17), n5);
                        n3 = 0;
                    } else {
                        if (n7 != n6) continue;
                        n22 = n14;
                        n21 = Math.max(n18 - n14, 1);
                        n3 = n21 <= 1 ? 1 : 0;
                    }
                    int n23 = this.g.getAppearance().getContentWidth();
                    int n24 = ((fxB)object).a(this.c(), ((fxB)object).q(), ((fxB)object).r());
                    if (n24 < Math.abs(this.D) + n23) {
                        this.D = n23 - n24;
                    } else if (n14 < Math.abs(this.D)) {
                        this.D = -n14;
                    } else if (n14 > n23 + Math.abs(this.D)) {
                        this.D = n23 - n14;
                    }
                    this.D = Math.min(this.D, 0);
                    n = ((fxB)object).o();
                    for (n2 = 0; n2 < n; ++n2) {
                        fxH fxH3 = ((fxB)object).g(n2);
                        fxH3.a(this.D);
                    }
                    n22 += this.D;
                    n22 = Math.max(n22 - 1, 0);
                    ((fxB)object).a(n22, n21, n3 != 0);
                }
            }
        }
        this.A = false;
    }

    private fxB a(fxB fxB2, boolean bl, Point point, int n, fro_0 fro_02) {
        point.x = n;
        if (fxB2 != null) {
            boolean bl2;
            point.y -= fxB2.i();
            fxB2.c(point.y);
            if (this.i && this.r && bl) {
                Object object;
                fxL fxL2;
                Object object2;
                fxH fxH2 = fxB2.q();
                if (fxH2 != null && fxH2.g() == fxI.b && (object2 = (fxL2 = (fxL)fxH2).l()) != null && ((String)object2).endsWith(" ")) {
                    fxL2.a(((String)object2).substring(0, ((String)object2).length() - 1));
                    int n2 = fxB2.j();
                    int n3 = fxL2.d();
                    object = fxL2.o();
                    if (object == null) {
                        object = this.c();
                    }
                    String string = fxL2.l();
                    int n4 = ((ayf_2)object).a(string);
                    fxL2.b(((ayf_2)object).a(string));
                    fxB2.s();
                    int n5 = fxB2.j();
                    boolean bl3 = false;
                }
                int n6 = 0;
                for (fxH fxH3 : fxB2.t()) {
                    fxL fxL3;
                    if (fxH3.g() != fxI.b || (object = (fxL3 = (fxL)fxH3).m()) == null) continue;
                    int n7 = Cz.a(' ', (char[])object);
                    fxL3.e(n7);
                    n6 += n7;
                }
                fxB2.f(n6);
            }
            fxB2.b(fxB2.l().a(fxB2.j(), this.F()));
            boolean bl4 = bl2 = -point.y <= this.G();
            if (bl2 || this.B()) {
                this.n.add(fxB2);
            } else {
                fxB2.b();
            }
            if (!this.r || !this.B() && !bl2 || !this.e(this.n.size())) {
                this.aa();
                this.z = false;
                return null;
            }
        }
        fxB2 = fxB.a();
        fxB2.a(fro_02);
        return fxB2;
    }

    private void aa() {
        if (this.n.isEmpty()) {
            return;
        }
        this.F = true;
        fxB fxB2 = this.n.get(this.n.size() - 1);
        if (fxB2 != null) {
            int n = fxB2.o();
            while (n > 0) {
                fxH fxH2;
                if ((fxH2 = fxB2.g(--n)).g() == fxI.b) {
                    fxL fxL2 = (fxL)fxH2;
                    ayf_2 ayf_22 = fxL2.o();
                    if (ayf_22 == null) {
                        ayf_22 = this.c();
                    }
                    if (ayf_22 != null) {
                        int n2 = ayf_22.a(e);
                        int n3 = this.F() - fxL2.b();
                        if (n3 >= n2) {
                            int n4;
                            int n5;
                            char[] cArray = fxL2.l().toCharArray();
                            int n6 = 0;
                            for (n5 = 0; n5 < cArray.length && n6 + (n4 = ayf_22.a(cArray[n5])) <= n3 - n2; ++n5) {
                                n6 += n4;
                            }
                            n4 = n5;
                            String string = fxL2.l().substring(0, n4);
                            int n7 = ayf_22.a(string);
                            int n8 = 5;
                            if (n3 - n7 + 5 >= 0) {
                                fxL2.a(string);
                                fxL2.b(n7);
                                fxL fxL3 = fxB2.a(e, null, 0, 0, fxL2.b() + n7, n2);
                                fxL3.a(ayf_22);
                                fxL3.a(fxL2.r());
                                fxL3.a(fxL2.k());
                                fxL3.a(fxL2.s());
                                fxL3.b(fxL2.t());
                                fxB2.s();
                                fxB2.b(fxB2.l().a(fxB2.j(), this.F()));
                                return;
                            }
                        }
                    }
                }
                fxB2.a(n);
            }
        }
    }

    @Override
    public Iterator<fxB> iterator() {
        return this.n.iterator();
    }

    public void X() {
        this.a();
        this.m.H();
        this.i = false;
        this.h = Color.BLACK;
        this.j = fro_0.d;
        this.k = fro_0.a;
        this.l = frh_0.c;
        this.g = null;
        this.H.clear();
    }

    public ful_0 Y() {
        return this.g;
    }

    public void a(long l) {
        this.G = l;
    }

    public long Z() {
        return this.G;
    }

    private void a(@NotNull Runnable runnable) {
        String string = this.l();
        runnable.run();
        String string2 = this.l();
        this.H.forEach(fxG2 -> fxG2.onTextChanged(string, string2));
    }
}

