/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

public abstract class XV<P extends XW<P>> {
    protected static final boolean a = false;
    protected static final Logger b = Logger.getLogger(XV.class);
    protected P c;

    protected XV() {
    }

    protected abstract P a(int var1, int var2, int var3, int var4, boolean var5);

    private P d(int n, int n2) {
        return this.a(n, n2, 18, 18, false);
    }

    private P e(int n, int n2) {
        return this.a(n, n2, 18, 18, true);
    }

    public void a(int n, int n2) {
        int n3 = XY.a(n);
        int n4 = XY.b(n2);
        P p2 = this.e(n3, n4);
        ((XW)p2).a(4, p2);
        this.a((XW<P>)p2, n3, n4);
        this.c = p2;
        b.info((Object)(this.getClass().getSimpleName() + " initialis\u00e9, centr\u00e9 sur " + this.c));
    }

    private void a(XW<P> xW, int n, int n2) {
        xW.a(7, this.d(n, n2 + 1));
        xW.a(6, this.d(n - 1, n2 + 1));
        xW.a(8, this.d(n + 1, n2 + 1));
        xW.a(3, this.d(n - 1, n2));
        xW.a(5, this.d(n + 1, n2));
        xW.a(1, this.d(n, n2 - 1));
        xW.a(0, this.d(n - 1, n2 - 1));
        xW.a(2, this.d(n + 1, n2 - 1));
    }

    public boolean a() {
        return this.c != null;
    }

    public final List<P> b() {
        if (this.c != null) {
            return ((XW)this.c).e();
        }
        return null;
    }

    public void c() {
    }

    public final P b(int n, int n2) {
        assert (this.c != null);
        for (XW xW : this.c.f()) {
            if (xW == null || xW.a() != n || xW.b() != n2) continue;
            return (P)xW;
        }
        return null;
    }

    public final P c(int n, int n2) {
        assert (this.c != null);
        for (XW xW : this.c.f()) {
            if (xW == null || !xW.a(n, n2)) continue;
            return (P)xW;
        }
        return null;
    }

    public final P d() {
        return (P)((XW)this.c).a(4);
    }
}

