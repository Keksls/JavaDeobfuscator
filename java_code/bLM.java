/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;

public class bLM
extends bLP {
    private final TLongArrayList a;
    private boolean b = false;

    public bLM(int n, TLongArrayList tLongArrayList) {
        super(n, null, null, null);
        this.a = tLongArrayList;
        this.h();
    }

    @Override
    public short aY_() {
        if (!this.b) {
            cct_1 cct_12 = ccs_1.a().a((short)this.j());
            this.a(cct_12 != null ? cct_12.s : (short)0);
            this.b = true;
        }
        return super.aY_();
    }

    private static xd_0 a(cct_1 cct_12) {
        TLongObjectIterator<bmf_0> tLongObjectIterator = cct_12.g();
        xd_0 xd_02 = new xd_0();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bmf_0 bmf_02 = (bmf_0)tLongObjectIterator.value();
            xd_02.a(bmf_02.b());
        }
        return xd_02;
    }

    @Override
    public azj_2 aX_() {
        return azf_2.e;
    }

    private void h() {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            long l = this.a.get(k);
            cct_1 cct_12 = ccs_1.a().a(l);
            xd_0 xd_02 = bLM.a(cct_12);
            this.a(new bll_0(xd_02, l));
        }
    }

    @Override
    public void a(blo_0 blo_02) {
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void b(blo_0 blo_02) {
    }
}

