/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from erm
 */
public abstract class erm_2
implements erp_2 {
    protected static final Logger a = Logger.getLogger(erm_2.class);
    protected final eqy_1[] b = new eqy_1[10];
    protected final boolean[] c = new boolean[10];
    protected byte d;
    protected byte e;
    private erk_2<? extends erp_2> f;
    private final ern_2 g;
    private final ero_2 h;
    private final List<err_2> i = new ArrayList<err_2>();

    protected erm_2(ern_2 ern_22, ero_2 ero_22) {
        this.g = ern_22;
        this.h = ero_22;
    }

    private boolean m() {
        for (eqy_1 eqy_12 : this.b) {
            if (eqy_12 != null) continue;
            return true;
        }
        return false;
    }

    public void a(erk_2<? extends erp_2> erk_22) {
        this.f = erk_22;
    }

    @Override
    public eqy_1 a() {
        return this.a((int)this.d);
    }

    @Override
    @Nullable
    public eqy_1 a(int n) {
        if (n < 0 || n >= this.b.length) {
            a.error((Object)("[SYMBIOT] Impossible to get creature parameters for invalid index=" + n));
            return null;
        }
        return this.b[n];
    }

    @Override
    public byte b() {
        return this.e;
    }

    @Override
    public byte a(eqy_1 eqy_12) {
        if (eqy_12 == null) {
            return -1;
        }
        for (byte by = 0; by < 10; by = (byte)(by + 1)) {
            if (this.b[by] != eqy_12) continue;
            return by;
        }
        return -1;
    }

    @Override
    public byte a(long l) {
        for (byte by = 0; by < 10; by = (byte)((byte)(by + 1))) {
            if (this.b[by] == null || this.b[by].h() != l) continue;
            return by;
        }
        return -1;
    }

    @Override
    public byte c() {
        return this.d;
    }

    @Override
    public void a(byte by) {
        this.d = by;
        this.r();
    }

    @Override
    public int b(eqy_1 eqy_12) {
        if (!this.m()) {
            return -1;
        }
        byte by = -1;
        for (byte by2 = 9; by2 >= 0; by2 = (byte)(by2 - 1)) {
            if (this.b[by2] == null) {
                by = by2;
                continue;
            }
            if (this.b[by2] != eqy_12) continue;
            return -1;
        }
        if (by != -1) {
            this.a(eqy_12, by);
        }
        return by;
    }

    @Override
    public void a(eqy_1 eqy_12, byte by) {
        if (eqy_12 == null) {
            a.warn((Object)"[SYMBIOT] Impossible to add a creature with null characteristics");
            return;
        }
        a.info((Object)("[SYMBIOT] Adding summon parameters " + eqy_12.h() + " on index " + by));
        if (by < 0 || by >= 10) {
            a.error((Object)("[SYMBIOT] Impossible to add a creature, index " + by + " out of bounds"));
            return;
        }
        if (this.b[by] == null) {
            this.b[by] = eqy_12;
            this.c(eqy_12);
            this.c[by] = true;
        }
        if (this.e == 0) {
            this.a(by);
        }
        this.e = (byte)(this.e + 1);
        if (this.f != null) {
            this.f.c(by);
        }
        this.q();
    }

    public void b(byte by) {
        if (by < 0 || by >= 10) {
            a.error((Object)("[SYMBIOT] Impossible to delete a creature, index " + by + " out of bounds "));
            return;
        }
        if (this.b[by] != null) {
            this.e = (byte)(this.e - 1);
        }
        this.b[by] = null;
        this.c[by] = false;
        if (this.e == 0) {
            this.a((byte)-1);
        } else if (by == this.d) {
            for (byte by2 = 0; by2 < 10; by2 = (byte)(by2 + 1)) {
                if (this.b[by2] == null) continue;
                this.a(by2);
                return;
            }
        }
        this.p();
    }

    @Override
    public void c(byte by) {
        this.b(by);
        this.e(by);
    }

    @Override
    public void b(long l) {
        byte by = this.a(l);
        if (by == -1) {
            return;
        }
        this.a((int)by, true);
    }

    @Override
    public void a(int n, boolean bl) {
        if (n < 0 || n >= 10) {
            a.error((Object)("[SYMBIOT] Impossible to set creature available : requested index " + n + " is out of bounds"));
            return;
        }
        if (this.b[n] != null) {
            this.c[n] = bl;
        } else {
            a.error((Object)("[SYMBIOT] Impossible to set creature available with index " + n + " : the creature is null"));
        }
        this.c(n);
    }

    void a(byte by, eqy_1 eqy_12) {
        if (by < 0 || by >= this.b.length) {
            a.error((Object)("[SYMBIOT] Impossible to set captured creature : requested index " + by + " is out of bounds "));
            return;
        }
        this.b[by] = eqy_12;
    }

    @Override
    public boolean b(int n) {
        if (n < 0 || n >= this.c.length) {
            a.error((Object)("[SYMBIOT] Impossible to request creature availability : requested index " + n + " is out of bounds "));
            return false;
        }
        eqy_1 eqy_12 = this.b[n];
        if (eqy_12 == null) {
            return false;
        }
        epj_2 epj_22 = eqy_12.i();
        if (epj_22 == null || eiu_0.a(epj_22.s())) {
            return false;
        }
        return this.c[n] && this.f.e((byte)n);
    }

    public boolean a(short s2) {
        for (eqy_1 eqy_12 : this.b) {
            if (eqy_12 == null || eqy_12.f() != s2) continue;
            return true;
        }
        return false;
    }

    public boolean b(short s2) {
        return true;
    }

    public void d() {
        this.e = 0;
        for (int k = 0; k < 10; ++k) {
            this.b[k] = null;
            this.c[k] = false;
        }
        this.d = 0;
        this.o();
    }

    void e() {
        for (eqy_1 eqy_12 : this.b) {
            if (eqy_12 == null) continue;
            this.c(eqy_12);
        }
    }

    private void c(eqy_1 eqy_12) {
        eqy_12.a(this.g.a(eqy_12.f()));
    }

    @Override
    @Nullable
    public final eqy_1 c(short s2) {
        return this.h.a(s2);
    }

    public void f() {
        Arrays.fill(this.c, true);
        this.n();
    }

    @Override
    public void g() {
        byte by = this.d;
        byte by2 = this.e;
        for (byte by3 = 1; by3 <= by2; by3 = (byte)(by3 + 1)) {
            if ((by = (byte)(by + 1)) >= by2) {
                by = (byte)(by - by2);
            }
            if (this.b((int)by)) break;
        }
        this.d(by);
    }

    @Override
    public int h() {
        int n = 0;
        for (int n2 = 0; n2 < 10; n2 = (int)((byte)(n2 + 1))) {
            if (this.a(n2) != null) continue;
            ++n;
        }
        return n;
    }

    @Override
    public ern_2 i() {
        return this.g;
    }

    @Override
    public ero_2 j() {
        return this.h;
    }

    void k() {
        this.e = (byte)(this.e + 1);
    }

    void l() {
        this.f.cI();
    }

    @Override
    public boolean a(err_2 err_22) {
        return !this.i.contains(err_22) && this.i.add(err_22);
    }

    @Override
    public boolean b(err_2 err_22) {
        return this.i.remove(err_22);
    }

    private void d(byte by) {
        for (err_2 err_22 : this.i) {
            try {
                err_22.a(by);
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void n() {
        for (err_2 err_22 : this.i) {
            try {
                err_22.g();
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void o() {
        for (err_2 err_22 : this.i) {
            try {
                err_22.d();
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void c(int n) {
        for (err_2 err_22 : this.i) {
            try {
                err_22.a(n);
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void p() {
        for (err_2 err_22 : this.i) {
            try {
                err_22.b();
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void e(byte by) {
        if (this.f == null) {
            return;
        }
        try {
            this.f.d(by);
        }
        catch (Exception exception) {
            a.error((Object)"Exception raised", (Throwable)exception);
        }
    }

    private void q() {
        for (err_2 err_22 : this.i) {
            try {
                err_22.a();
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    private void r() {
        for (err_2 err_22 : this.i) {
            try {
                err_22.c();
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }
}

