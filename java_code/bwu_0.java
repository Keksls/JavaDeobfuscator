/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bwu
 */
public abstract class bwu_0 {
    private static final Logger f = Logger.getLogger(bwu_0.class);
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    protected int e = -1;
    private List<bwv_0> g;

    public abstract int a();

    public void a(biI biI2) {
        biI2.a(agm.a());
    }

    public int b(biI biI2) {
        return this.a(biI2, this.b());
    }

    public int c(biI biI2) {
        return this.a(biI2, this.c());
    }

    private int a(biI biI2, String string) {
        int n = biI2.j(string);
        if (n == Integer.MAX_VALUE) {
            if (!string.equals(biI2.ab())) {
                f.warn((Object)("acteur gfxId=" + biI2.bI().X_() + " n'a pas une anim " + string + " valide"));
            }
            return 0;
        }
        return n;
    }

    protected abstract String b();

    protected abstract String c();

    public final void d(biI biI2) {
        try {
            this.e(biI2);
        }
        catch (Exception exception) {
            f.error((Object)"Exception levee", (Throwable)exception);
        }
        this.g(biI2);
    }

    private void g(biI biI2) {
        if (this.g == null) {
            return;
        }
        ArrayList<bwv_0> arrayList = new ArrayList<bwv_0>(this.g);
        for (bwv_0 bwv_02 : arrayList) {
            try {
                bwv_02.a(biI2, this);
            }
            catch (Exception exception) {
                f.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public abstract void e(biI var1);

    public boolean a(bwu_0 bwu_02) {
        if (bwu_02 == this) {
            return true;
        }
        return bwu_02 != null && bwu_02.a() == this.a();
    }

    public String d() {
        return "AnimHit";
    }

    public String[] e() {
        return null;
    }

    public int f() {
        return this.e;
    }

    public abstract void f(biI var1);

    public void a(bwv_0 bwv_02) {
        if (this.g == null) {
            this.g = new ArrayList<bwv_0>();
        }
        if (this.g.contains(bwv_02)) {
            return;
        }
        this.g.add(bwv_02);
    }

    public void b(bwv_0 bwv_02) {
        if (this.g != null) {
            this.g.remove(bwv_02);
        }
    }
}

