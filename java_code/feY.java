/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class feY {
    protected static final Logger a = Logger.getLogger(feY.class);
    public static final byte b = 6;
    public static final byte c = 6;
    protected byte d;
    protected short e;
    protected short f;
    protected final List<ffq> g = new ArrayList<ffq>();
    protected feX h;

    public final feX a() {
        return this.h;
    }

    public final void a(feX feX2) {
        this.h = feX2;
    }

    public final void a(byte by) {
        this.d = by;
    }

    public final byte b() {
        return this.d;
    }

    public boolean a(int n, int n2) {
        if (n < this.e || n >= this.e + 6) {
            return false;
        }
        return n2 >= this.f && n2 < this.f + 6;
    }

    public final short c() {
        return this.e;
    }

    public final void a(short s2) {
        this.e = s2;
    }

    public final short d() {
        return this.f;
    }

    public final void b(short s2) {
        this.f = s2;
    }

    public final boolean a(yg_2 yg_22, boolean bl) {
        yg_22.c();
        yg_22.a = this.d;
        if (bl) {
            for (ffq ffq2 : this.g) {
                try {
                    yh_2 yh_22 = new yh_2();
                    ffq2.a(yh_22.a);
                    yg_22.b.add(yh_22);
                }
                catch (Exception exception) {
                    a.error((Object)("Erreur lors de la serialisation d'un room content ie=" + ffq2), (Throwable)exception);
                }
            }
        }
        yg_22.c = this.g();
        return true;
    }

    public final boolean b(yg_2 yg_22, boolean bl) {
        this.d = yg_22.a;
        if (!bl) {
            this.a(yg_22.c);
            return true;
        }
        feW feW2 = this.h.a();
        for (yh_2 yh_22 : yg_22.b) {
            try {
                ffq ffq2 = feW2.i().a(feW2, yh_22.a);
                if (ffq2 == null) continue;
                feW2.a(ffq2);
            }
            catch (Exception exception) {
                a.error((Object)("Erreur durant la r\u00e9cup\u00e9ration du roomContent " + yh_22 + " d'une pi\u00e8ce du sac " + yg_22), (Throwable)exception);
            }
        }
        return true;
    }

    public boolean a(ffq ffq2, int n, int n2) {
        if (n < this.e) {
            return false;
        }
        if (n >= this.e + 6) {
            return false;
        }
        if (n2 < this.f) {
            return false;
        }
        if (n2 >= this.f + 6) {
            return false;
        }
        return this.b(n, n2) == null;
    }

    protected final boolean a(ffq ffq2) {
        if (this.a(ffq2, ffq2.G(), ffq2.H())) {
            this.g.add(ffq2);
            return true;
        }
        return false;
    }

    protected final boolean b(ffq ffq2) {
        return this.g.remove(ffq2);
    }

    public final ffq a(byte by, byte by2) {
        int n = this.e + by;
        int n2 = this.f + by2;
        return this.b(n, n2);
    }

    public List<ffq> e() {
        return this.g;
    }

    public ffq b(int n, int n2) {
        int n3 = this.g.size();
        for (int k = 0; k < n3; ++k) {
            ffq ffq2 = this.g.get(k);
            if (ffq2.G() != n || ffq2.H() != n2) continue;
            return ffq2;
        }
        return null;
    }

    public final ArrayList<ffq> a(int n, int n2, int n3, int n4) {
        ArrayList<ffq> arrayList = new ArrayList<ffq>();
        int n5 = this.e + n;
        int n6 = this.f + n2;
        int n7 = n5 + n3;
        int n8 = n6 + n4;
        int n9 = this.g.size();
        for (int k = 0; k < n9; ++k) {
            ffq ffq2 = this.g.get(k);
            int n10 = ffq2.G();
            int n11 = ffq2.H();
            if (n10 < n5 || n10 >= n7 || n11 < n6 || n11 >= n8) continue;
            arrayList.add(ffq2);
        }
        return arrayList;
    }

    public final ArrayList<ffq> a(ffs ffs2) {
        ArrayList<ffq> arrayList = new ArrayList<ffq>();
        int n = this.g.size();
        for (int k = 0; k < n; ++k) {
            ffq ffq2 = this.g.get(k);
            if (ffq2.at_() != ffs2) continue;
            arrayList.add(ffq2);
        }
        return arrayList;
    }

    public boolean c(ffq ffq2) {
        return this.g.contains(ffq2);
    }

    public final boolean f() {
        return this.g.isEmpty();
    }

    public String toString() {
        return "Room : x=" + this.e + ", y=" + this.f;
    }

    protected abstract ys_1 g();

    protected abstract void a(ys_1 var1);
}

