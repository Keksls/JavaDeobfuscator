/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.awt.Rectangle;
import java.util.ArrayList;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class fxB
implements abo_1 {
    private static final Logger a = Logger.getLogger(fxB.class);
    private static final ObjectPool b = new abm_1(new fxC());
    private ObjectPool c;
    private final ArrayList<fxH> d = new ArrayList();
    private fxM e = null;
    private final Rectangle f = new Rectangle();
    private int g = 0;
    private fro_0 h;
    private int i;

    fxB() {
    }

    public static fxB a() {
        fxB fxB2;
        try {
            fxB2 = (fxB)b.borrowObject();
            fxB2.c = b;
        }
        catch (Exception exception) {
            a.error((Object)"Probl\u00e8me au borrowObject.");
            fxB2 = new fxB();
            fxB2.onCheckOut();
        }
        return fxB2;
    }

    public void b() {
        try {
            if (this.c != null) {
                this.c.returnObject((Object)this);
            } else {
                this.onCheckIn();
            }
        }
        catch (Exception exception) {
            a.warn((Object)"Probl\u00e8me lors du retour dans un pool", (Throwable)exception);
            this.onCheckIn();
        }
    }

    public int a(ayf_2 ayf_22, fxH fxH2, int n) {
        int n2 = 0;
        for (int k = 0; k < this.d.size(); ++k) {
            fxH fxH3 = this.d.get(k);
            if (fxH3 != fxH2) {
                n2 += fxH3.b(ayf_22, fxH3.f());
                continue;
            }
            return n2 + fxH3.b(ayf_22, n);
        }
        return n2;
    }

    public fxL a(String string, int n, int n2) {
        return this.a(string, null, 0, 0, n, n2);
    }

    public fxL a(String string, fxS fxS2, int n, int n2, int n3, int n4) {
        fxL fxL2 = new fxL();
        fxL2.a(this);
        fxL2.a(string);
        fxL2.a(fxS2);
        fxL2.c(n);
        fxL2.d(n2);
        fxL2.a(n3);
        fxL2.b(n4);
        this.a(fxL2);
        return fxL2;
    }

    public fxK a(fxR fxR2, int n) {
        fxK fxK2 = new fxK();
        fxK2.a(this);
        fxK2.a(fxR2);
        fxK2.a(n);
        this.a(fxK2);
        return fxK2;
    }

    private void a(fxH fxH2) {
        this.f.width += fxH2.d();
        this.d.add(fxH2);
    }

    public void a(int n) {
        fxH fxH2 = this.d.remove(n);
        this.f.width -= fxH2.d();
    }

    public void c() {
        this.d.clear();
        this.f.width = 0;
        this.d();
    }

    public void d() {
        this.e = null;
    }

    public fxM e() {
        return this.e;
    }

    public void a(int n, int n2, boolean bl) {
        this.e = new fxM();
        this.e.a(this);
        this.e.a(n);
        this.e.b(n2);
        this.e.a(bl);
    }

    public Rectangle f() {
        return this.f;
    }

    public int g() {
        return this.f.x;
    }

    public void b(int n) {
        this.f.x = n;
    }

    public int h() {
        return this.f.y;
    }

    public void c(int n) {
        this.f.y = n;
    }

    public int i() {
        return this.f.height;
    }

    public void d(int n) {
        this.f.height = n;
    }

    public int j() {
        return this.f.width;
    }

    public int k() {
        return this.g;
    }

    public void e(int n) {
        this.g = n;
    }

    public fro_0 l() {
        return this.h;
    }

    public void a(fro_0 fro_02) {
        this.h = fro_02;
    }

    public boolean m() {
        return this.d.isEmpty();
    }

    public int n() {
        return this.i;
    }

    public void f(int n) {
        this.i = n;
    }

    public int o() {
        return this.d.size();
    }

    public fxH g(int n) {
        return this.d.get(n);
    }

    public fxH p() {
        if (!this.d.isEmpty()) {
            return this.d.get(0);
        }
        return null;
    }

    public fxH q() {
        if (!this.d.isEmpty()) {
            return this.d.get(this.d.size() - 1);
        }
        return null;
    }

    public int r() {
        int n = 0;
        for (int k = 0; k < this.d.size(); ++k) {
            n += this.d.get(k).f();
        }
        return n;
    }

    public void s() {
        this.f.width = 0;
        for (fxH fxH2 : this.d) {
            this.f.width += fxH2.d();
        }
    }

    public final ArrayList<fxH> t() {
        return this.d;
    }

    @Override
    public void onCheckOut() {
        this.g = 0;
    }

    @Override
    public void onCheckIn() {
        this.d.clear();
        this.e = null;
        this.f.setBounds(0, 0, 0, 0);
        this.h = null;
        this.i = 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = this.d.size();
        for (int k = 0; k < n; ++k) {
            stringBuilder.append(this.d.get(k).toString());
        }
        return stringBuilder.toString();
    }
}

