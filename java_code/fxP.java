/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class fxP
implements Iterable<fxQ> {
    private static final Logger a = Logger.getLogger(fxP.class);
    private final ArrayList<fxQ> f = new ArrayList();
    protected int b = Integer.MAX_VALUE;
    private int g = 0;
    protected Pattern c;
    protected boolean d;
    protected boolean e;
    private int h = -1;
    private int i = 0;
    private int j = -1;
    private int k = 0;
    private boolean l = false;
    private ayf_2 m;
    private boolean n;

    public void c() {
        fxS fxS2 = new fxS(this, null, false);
        fxS2.c("");
        this.a(fxS2);
    }

    protected void a(fxQ fxQ2) {
        this.f.add(fxQ2);
        this.g += fxQ2.f();
    }

    protected void a(int n, fxQ fxQ2) {
        this.f.add(n, fxQ2);
    }

    public void b(fxQ fxQ2) {
        if (this.f.remove(fxQ2)) {
            fxQ2.i();
        }
        this.g -= fxQ2.f();
    }

    @Nullable
    public fxQ a(int n) {
        try {
            return this.f.get(n);
        }
        catch (Exception exception) {
            return null;
        }
    }

    protected void d() {
        for (fxQ fxQ2 : this.f) {
            fxQ2.i();
        }
        this.f.clear();
        this.g = 0;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return this.b;
    }

    public void b(int n) {
        this.b = n;
    }

    public Pattern g() {
        return this.c;
    }

    @Nullable
    public String h() {
        if (this.c != null) {
            return this.c.pattern();
        }
        return null;
    }

    public void e(String string) {
        if (string == null) {
            this.c = null;
            return;
        }
        this.c = this.d ? Pattern.compile(string, 64) : Pattern.compile(string);
    }

    public void a(boolean bl) {
        if (bl == this.d) {
            return;
        }
        this.d = bl;
        if (this.c != null) {
            this.e(this.c.pattern());
        }
    }

    public boolean i() {
        return this.e;
    }

    public void b(boolean bl) {
        this.e = bl;
    }

    public boolean j() {
        return this.l;
    }

    public void c(boolean bl) {
        this.l = bl;
    }

    public boolean k() {
        return this.d;
    }

    public boolean l() {
        return this.f.isEmpty();
    }

    @Nullable
    public fxQ m() {
        if (!this.f.isEmpty()) {
            return this.f.get(0);
        }
        return null;
    }

    @Nullable
    public fxQ n() {
        if (!this.f.isEmpty()) {
            return this.f.get(this.f.size() - 1);
        }
        return null;
    }

    @Nullable
    public fxQ o() {
        int n = this.p();
        if (n != -1) {
            return this.a(n);
        }
        return null;
    }

    public int p() {
        if (this.b()) {
            return this.j;
        }
        return this.h;
    }

    public int q() {
        if (this.b()) {
            return this.k;
        }
        return this.i;
    }

    public boolean a(fxQ fxQ2, int n) {
        int n2 = this.f.indexOf(fxQ2);
        int n3 = Hw.a(n, -1, this.g);
        if (n3 != n) {
            a.debug((Object)"setSelectionStart avec une valeur d'index invalide : ", (Throwable)new Exception());
            n = n3;
        }
        boolean bl = false;
        if (n2 != this.h || this.i != n) {
            bl = true;
        }
        this.h = n2;
        this.i = n;
        return bl;
    }

    public boolean r() {
        boolean bl = this.j != this.h || this.i != this.k;
        this.h = this.j;
        this.i = this.k;
        return bl;
    }

    @Nullable
    public fxQ s() {
        int n = this.t();
        if (n != -1) {
            return this.a(n);
        }
        return null;
    }

    public int t() {
        if (this.b()) {
            return this.h;
        }
        return this.j;
    }

    public int u() {
        if (this.b()) {
            return this.i;
        }
        return this.k;
    }

    public boolean c(int n) {
        if (this.k != n) {
            this.k = n;
            return true;
        }
        return false;
    }

    public boolean d(int n) {
        if (this.i != n) {
            this.i = n;
            return true;
        }
        return false;
    }

    public boolean b(fxQ fxQ2, int n) {
        int n2 = this.f.indexOf(fxQ2);
        int n3 = Hw.a(n, -1, this.g);
        if (n3 != n) {
            a.debug((Object)"setSelectionEnd avec une valeur d'index invalide : ", (Throwable)new Exception());
            n = n3;
        }
        boolean bl = n2 != this.j || this.k != n;
        this.j = n2;
        this.k = n;
        return bl;
    }

    public boolean v() {
        boolean bl = this.j != this.h || this.k != this.i;
        this.j = this.h;
        this.k = this.i;
        return bl;
    }

    public boolean w() {
        return this.h != -1 && this.j != -1;
    }

    public boolean x() {
        return this.h == this.j && this.i == this.k;
    }

    @Nullable
    public String y() {
        if (!this.w() || this.x()) {
            return null;
        }
        int n = this.p();
        int n2 = this.t();
        int n3 = this.q();
        int n4 = this.u();
        if (n == n2) {
            fxQ fxQ2 = this.o();
            if (fxQ2 != null && fxQ2.b() == ane_2.b) {
                String string = ((fxS)fxQ2).k();
                return string.substring(n3, n4);
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int k = n; k <= n2; ++k) {
                fxQ fxQ3 = this.a(k);
                if (fxQ3.b() != ane_2.b) continue;
                String string = ((fxS)fxQ3).k();
                if (k == n) {
                    stringBuilder.append(string.substring(n3));
                    continue;
                }
                if (k == n2) {
                    stringBuilder.append(string.substring(0, n4));
                    continue;
                }
                stringBuilder.append(string);
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public void a(ayf_2 ayf_22) {
        this.m = ayf_22;
    }

    public ayf_2 z() {
        return this.m;
    }

    public boolean A() {
        return this.n;
    }

    public void d(boolean bl) {
        this.n = bl;
    }

    public abstract String a();

    public boolean a(@NotNull String string) {
        return string.equals(this.a());
    }

    public abstract void b(String var1);

    public abstract void c(String var1);

    @Override
    @NotNull
    public Iterator<fxQ> iterator() {
        return this.f.iterator();
    }

    public boolean B() {
        boolean bl = this.j != -1 || this.h != -1 || this.k != 0 || this.i != 0;
        this.h = -1;
        this.i = 0;
        this.j = -1;
        this.k = 0;
        return bl;
    }

    private boolean b() {
        if (!this.w()) {
            return false;
        }
        if (this.j < this.h) {
            return true;
        }
        return this.h == this.j && this.k < this.i;
    }

    public boolean f(String string) {
        fxQ fxQ2;
        boolean bl;
        int n;
        int n2;
        int n3;
        fxQ fxQ3;
        block9: {
            int n4;
            int n5;
            block8: {
                if (!(this.w() || !string.isEmpty() && Objects.equals(fxS.a(string, this.g()), string))) {
                    return false;
                }
                fxQ3 = this.o();
                n3 = this.p();
                n5 = this.t();
                n2 = this.q();
                n4 = this.u();
                n = 0;
                bl = false;
                if (n3 != n5) break block8;
                fxQ2 = this.o();
                if (fxQ2 == null) break block9;
                n = n4 - n2;
                if (!fxQ2.a(n2, n4)) break block9;
                this.b(fxQ2);
                bl = true;
                break block9;
            }
            for (int k = n5; k >= n3; --k) {
                fxQ fxQ4 = this.a(k);
                if (k == n3) {
                    n += fxQ4.f() - 1 - n2;
                    if (!fxQ4.a(n2)) continue;
                    this.b(fxQ4);
                    bl = true;
                    continue;
                }
                if (k == n5) {
                    n += n4 + 1;
                    if (!fxQ4.b(n4)) continue;
                    this.b(fxQ4);
                    continue;
                }
                n += fxQ4.f();
                this.b(fxQ4);
            }
        }
        this.g -= n;
        if (fxQ3.b() == ane_2.b) {
            fxQ2 = (fxS)fxQ3;
        } else {
            fxQ2 = new fxS(this, null, false);
            bl = true;
        }
        int n6 = ((fxS)fxQ2).a(string, n2);
        if (bl) {
            this.a(n3, fxQ2);
        }
        this.g += n6;
        if (this.g > this.b) {
            int n7 = this.g - this.b;
            ((fxS)fxQ2).a(n2, n2 + n7);
            n6 -= n7;
            this.g -= n7;
        }
        this.a(fxQ2, n2);
        this.v();
        this.e(n6);
        this.r();
        return true;
    }

    public boolean C() {
        boolean bl = this.x() ? this.F() : false;
        boolean bl2 = this.f("");
        return bl2 || bl;
    }

    public boolean D() {
        boolean bl = this.x() ? this.E() : false;
        boolean bl2 = this.f("");
        return bl2 || bl;
    }

    public boolean e(int n) {
        boolean bl = false;
        for (int k = 0; k < n; ++k) {
            bl |= this.E();
        }
        return bl;
    }

    public boolean E() {
        fxQ fxQ2 = this.a(this.j);
        if (fxQ2 == null) {
            return false;
        }
        if (this.k + 1 <= fxQ2.f()) {
            ++this.k;
            return true;
        }
        if (fxQ2 == this.n()) {
            return false;
        }
        ++this.j;
        this.k = 1;
        return true;
    }

    public boolean F() {
        fxQ fxQ2 = this.a(this.j);
        if (fxQ2 == null) {
            return false;
        }
        if (this.k - 1 >= 0) {
            --this.k;
            return true;
        }
        if (fxQ2 == this.m()) {
            return false;
        }
        fxQ fxQ3 = this.a(this.j - 1);
        if (fxQ3 == null) {
            return false;
        }
        --this.j;
        this.k = fxQ3.f() - 1;
        return true;
    }

    public int G() {
        return this.f.size();
    }

    public int a(int n, int n2) {
        String string = this.a().substring(n, n2);
        int n3 = 0;
        for (char c2 : string.toCharArray()) {
            n3 += this.z().a(c2);
        }
        return n3;
    }

    public void H() {
        for (fxQ fxQ2 : this.f) {
            fxQ2.i();
        }
        this.f.clear();
    }
}

