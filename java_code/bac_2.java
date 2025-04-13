/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;
import java.util.Collection;

/*
 * Renamed from bAc
 */
public class bac_2
extends uq_0 {
    private float m = 0.0f;
    private float n = 0.0f;
    private bvx_2 o;
    private tg_0 p;
    private byte q = (byte)-1;
    private final TLongHashSet r = new TLongHashSet();
    private int s = 0;

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = null;
        this.p = null;
        this.q = (byte)-1;
        this.r.clear();
        this.s = 0;
    }

    public void h() {
        this.o = null;
        this.p = null;
        this.q = (byte)-1;
        this.s = 0;
    }

    public void a(bvx_2 bvx_22, byte by) {
        this.o = bvx_22;
        this.p = this.o.g();
        this.q = by;
    }

    @Override
    protected float a(us_0 us_02, ys_0 ys_02, us_0 us_03, ys_0 ys_03, byte by) {
        float f2 = super.a(us_02, ys_02, us_03, ys_03, by);
        int n = ys_02.a - this.g - 1;
        int n2 = ys_02.a + this.g + 1;
        int n3 = ys_02.b - this.g - 1;
        int n4 = ys_02.b + this.g + 1;
        this.r.clear();
        this.s = 0;
        this.c(ys_02.a, ys_02.b);
        for (int k = n; k <= n2; ++k) {
            for (int i2 = n3; i2 <= n4; ++i2) {
                this.b(k, i2);
            }
        }
        this.r.clear();
        this.s = 0;
        return f2 += (float)this.r.size() * this.m + (float)this.s * this.n;
    }

    private void b(int n, int n2) {
        if (!this.p.o(n, n2)) {
            return;
        }
        epq_2 epq_22 = this.o.a(n, n2);
        if (epq_22 == null) {
            return;
        }
        if (epq_22.J_() != 20) {
            return;
        }
        blx_1 blx_12 = (blx_1)epq_22;
        if (blx_12.Y() == this.q) {
            return;
        }
        if (blx_12.bV()) {
            return;
        }
        this.r.add(epq_22.a_());
    }

    private void c(int n, int n2) {
        if (!this.p.o(n, n2)) {
            return;
        }
        Collection<sr_0> collection = this.o.aB();
        if (collection.isEmpty()) {
            return;
        }
        for (sr_0 sr_02 : collection) {
            boolean bl;
            ele_0 ele_02 = ele_0.a(sr_02.w());
            switch (ele_02) {
                case a: 
                case e: 
                case f: {
                    bl = true;
                    break;
                }
                default: {
                    bl = false;
                }
            }
            if (!bl || !sr_02.c(n, n2, (short)0) || !this.a(sr_02)) continue;
            ++this.s;
        }
    }

    private boolean a(sr_0 sr_02) {
        abc_2 abc_22 = sr_02.B();
        int n = abc_22.a();
        for (int k = 0; k < n; ++k) {
            Sl sl = (Sl)abc_22.a(k);
            ejh_0 ejh_02 = (ejh_0)efc_0.a().b(sl.j());
            if (ejh_02 == null || ejh_02.e() != sf_0.b) continue;
            return true;
        }
        return false;
    }

    public void a(float f2) {
        this.m = f2;
    }

    public void b(float f2) {
        this.n = f2;
    }
}

