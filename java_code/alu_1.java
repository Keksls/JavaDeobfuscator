/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from aLU
 */
public class alu_1
extends all_1 {
    protected static final Logger i = Logger.getLogger(alu_1.class);
    private final ArrayList<alw_1> j = new ArrayList();
    private final ArrayList<alw_1> k = new ArrayList();
    private static final int[][] l = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {0, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
    private final TIntArrayList m = new TIntArrayList();
    private float n = 1.0f;
    private boolean o = true;

    public alu_1(String string) {
        super(string);
    }

    public alu_1(String string, byte by) {
        super(string, by);
    }

    public alu_1(String string, byte by, byte by2) {
        super(string, by, by2);
    }

    @Override
    public amj_1 a(amx_1 amx_12, boolean bl, boolean bl2, boolean bl3, long l) {
        return null;
    }

    @Override
    public void a(amj_1 amj_12) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized alw_1 a(amx_1 amx_12, float f2, float f3, alo_1 alo_12, float f4, float f5, float f6, int n, int n2, boolean bl, boolean bl2, boolean bl3, float f7, long l) {
        amj_1 amj_12 = this.a(amx_12, l);
        if (amj_12 == null) {
            i.debug((Object)("le son " + amx_12.g() + " ne peut pas \u00eatre pr\u00e9par\u00e9"));
            return null;
        }
        amj_12.b(bl && n2 == 0);
        amj_12.i(f4);
        amj_12.j(f5);
        amj_12.k(f6 != 0.0f ? f6 : 1.0f);
        amj_12.e(f2);
        amj_12.g(f3);
        amj_12.h(this.a());
        amj_12.d(this.n());
        if (this.e != 0) {
            amj_12.b(this.e);
        }
        if (this.f) {
            amj_12.c(true);
        }
        amj_12.j();
        alw_1 alw_12 = alw_1.a(amj_12, alo_12, f5 + 5.0f, bl2, bl3, f7);
        if (bl && n2 > 0) {
            alw_12.a(n, n2);
        }
        ArrayList<alw_1> arrayList = this.j;
        synchronized (arrayList) {
            this.k.add(alw_12);
        }
        return alw_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void s() {
        ArrayList<alw_1> arrayList = this.j;
        synchronized (arrayList) {
            int n = this.k.size();
            for (int k = 0; k < n; ++k) {
                alw_1 alw_12 = this.k.get(k);
                this.j.add(alw_12);
            }
            this.k.clear();
        }
    }

    public void e(boolean bl) {
        this.o = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void f(float f2) {
        ArrayList<alw_1> arrayList = this.j;
        synchronized (arrayList) {
            float f3 = this.a();
            for (alw_1 alw_12 : this.j) {
                alw_12.c(f3);
            }
        }
    }

    @Override
    public void b(float f2, float f3) {
    }

    @Override
    public void c(float f2, float f3) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(boolean bl, boolean bl2) {
        ArrayList<alw_1> arrayList = this.j;
        synchronized (arrayList) {
            for (alw_1 alw_12 : this.j) {
                alw_12.a(bl2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized void a(long l) {
        super.a(l);
        afr_2 afr_22 = this.b != null ? this.b.w() : afr_2.g;
        float f2 = this.b != null ? this.b.x() : 1.0f;
        int n = this.b != null ? this.b.d() : 0;
        this.n = f2;
        this.m.resetQuick();
        ArrayList<alw_1> arrayList = this.j;
        synchronized (arrayList) {
            int n2;
            int n3 = this.j.size();
            for (n2 = 0; n2 < n3; ++n2) {
                alw_1 alw_12 = this.j.get(n2);
                alw_12.a(l, afr_22, f2, this.o, n);
                if (!alw_12.b()) continue;
                this.m.add(n2);
                ams_1.a(alw_12.a());
            }
            n2 = this.m.size();
            if (n2 > 0) {
                for (n3 = n2 - 1; n3 >= 0; --n3) {
                    this.j.remove(this.m.getQuick(n3));
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void t() {
        ArrayList<alw_1> arrayList = this.j;
        synchronized (arrayList) {
            for (alw_1 alw_12 : this.j) {
                ams_1.a(alw_12.a());
            }
            this.j.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(amj_1 amj_12) {
        ArrayList<alw_1> arrayList = this.j;
        synchronized (arrayList) {
            for (int k = this.j.size() - 1; k >= 0; --k) {
                alw_1 alw_12 = this.j.get(k);
                if (alw_12.a() != amj_12) continue;
                this.j.remove(k);
                ams_1.a(amj_12);
            }
        }
    }

    @Override
    public synchronized boolean c(int n) {
        int n2;
        if (!super.c(n)) {
            return false;
        }
        int n3 = this.j.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.j.get(n2).a().b(n);
        }
        n3 = this.k.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.k.get(n2).a().b(n);
        }
        return true;
    }

    @Override
    public Collection<amj_1> r() {
        throw new UnsupportedOperationException("Pas d'acc\u00e8s direct \u00e0 la liste des sources du FieldSourceGroup");
    }

    public int x() {
        return this.j.size();
    }

    public String y() {
        StringBuilder stringBuilder = new StringBuilder();
        for (alw_1 alw_12 : this.j) {
            stringBuilder.append(alw_12.a().J()).append("\n");
        }
        return stringBuilder.toString();
    }

    public String toString() {
        return "[FieldSourceGroup-" + this.q() + "] " + this.j.size() + " + " + this.k.size() + " sources en cours de lecture.";
    }
}

