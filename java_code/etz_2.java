/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from eTz
 */
public class etz_2
extends etw_2 {
    private final ArrayList<eth_2> i = new ArrayList();
    private final ArrayList<efh_0> j = new ArrayList();
    private final ArrayList<efh_0> k = new ArrayList();
    private final TIntArrayList l = new TIntArrayList();
    private acv_1 m;

    public etz_2(short s2, short s3, int n, byte by, int n2, int n3, int n4, boolean bl) {
        super(s2, s3, n, by, n2, n3, n4, bl);
    }

    public void a(eth_2 eth_22) {
        this.i.add(eth_22);
    }

    public void a(efh_0 efh_02) {
        if (efh_02.a(eff_0.k)) {
            this.k.add(efh_02);
        } else {
            this.j.add(efh_02);
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean j() {
        return !this.j.isEmpty();
    }

    @Override
    public boolean a(TObjectProcedure<eth_2> tObjectProcedure) {
        for (int k = 0; k < this.i.size(); ++k) {
            if (tObjectProcedure.execute((Object)this.i.get(k))) continue;
            return false;
        }
        return true;
    }

    public boolean b(TObjectProcedure<efh_0> tObjectProcedure) {
        for (int k = 0; k < this.j.size(); ++k) {
            if (tObjectProcedure.execute((Object)this.j.get(k))) continue;
            return false;
        }
        return true;
    }

    public boolean c(TObjectProcedure<efh_0> tObjectProcedure) {
        for (int k = 0; k < this.k.size(); ++k) {
            if (tObjectProcedure.execute((Object)this.k.get(k))) continue;
            return false;
        }
        return true;
    }

    public boolean a(TIntProcedure tIntProcedure) {
        for (int k = 0; k < this.l.size(); ++k) {
            if (tIntProcedure.execute(this.l.getQuick(k))) continue;
            return false;
        }
        return true;
    }

    public void c(int n) {
        this.l.add(n);
    }

    public void a(acv_1 acv_12) {
        this.m = acv_12.d() == 0 ? null : acv_12;
    }

    @Override
    public boolean b(int n) {
        return this.m != null && this.m.g(n) != 0;
    }

    @Override
    public int[] k() {
        return this.m == null ? Cn.f : this.m.f();
    }

    @Override
    public int a(int n) {
        int n2;
        int n3 = n2 = this.m == null ? 0 : this.m.g(n);
        if (n2 == 0) {
            return this.c();
        }
        return n2;
    }

    public boolean l() {
        return !this.k.isEmpty();
    }
}

