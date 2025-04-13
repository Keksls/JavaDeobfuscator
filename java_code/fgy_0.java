/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fgy
 */
public abstract class fgy_0
implements Sg {
    protected static final Logger a = Logger.getLogger(fgy_0.class);
    private int b;
    private faX c;
    private faX d;
    private fgv_0 e;
    private final ArrayList<fgj_0> f = new ArrayList();

    protected fgy_0(int n) {
        this.b = n;
        this.c = null;
        this.d = null;
    }

    protected void a(int n) {
        this.b = n;
    }

    public int B() {
        return this.b;
    }

    @Override
    public long b() {
        return this.b;
    }

    @Override
    public Sc c() {
        return eee_0.b;
    }

    public void a(fgj_0 fgj_02) {
        if (!this.f.contains(fgj_02)) {
            this.f.add(fgj_02);
        }
    }

    public void b(fgj_0 fgj_02) {
        this.f.remove(fgj_02);
    }

    public faX C() {
        return this.c;
    }

    public void a(faX faX2) {
        this.c = faX2;
        if (this.d == null) {
            this.b(this.c);
        }
    }

    public faX D() {
        return this.d;
    }

    public void b(faX faX2) {
        faX faX3 = this.d;
        this.d = faX2;
        for (int k = 0; k < this.f.size(); ++k) {
            this.f.get(k).a(this, faX2);
        }
        this.a(faX2, faX3);
    }

    protected void a(faX faX2, faX faX3) {
    }

    public fgv_0 E() {
        return this.e;
    }

    @Nullable
    public fgr_0 A() {
        return null;
    }

    public void a(fgv_0 fgv_02) {
        if (this.e != null) {
            this.e.a(null);
        }
        this.e = fgv_02;
        if (this.e != null) {
            this.e.a(this);
        }
    }

    public String toString() {
        return "Protector {id=" + this.b + ", nativeNation=" + (this.c != null ? Integer.valueOf(this.c.c()) : null) + ", currentNation=" + (this.d != null ? Integer.valueOf(this.d.c()) : null) + ", territory=" + (this.e != null ? Integer.valueOf(this.e.e()) : null) + "}";
    }

    public int F() {
        if (this.d == null) {
            return -1;
        }
        return this.d.c();
    }

    public int G() {
        if (this.c == null) {
            return -1;
        }
        return this.c.c();
    }

    public abstract fgk_0 w();

    public boolean H() {
        return this.F() != 0;
    }

    public long I() {
        return this.e.f();
    }
}

