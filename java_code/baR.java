/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

public class baR
extends alc_1 {
    final TLongArrayList f = new TLongArrayList();
    private boolean g = false;
    public boolean e = false;
    private static final int h = 10;

    public baR(int n, int n2, int n3, TLongObjectHashMap<aff_1> tLongObjectHashMap) {
        super(n, n2, n3);
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            this.f.add(l);
            bwl_1.a.a(l, this);
        }
    }

    @Override
    public long o() {
        try {
            int n = this.p();
            if (!this.g) {
                return 0L;
            }
            return n;
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
            return 0L;
        }
    }

    public void b(boolean bl) {
        this.e = bl;
    }

    private int p() {
        int n = 0;
        int n2 = this.f.size();
        for (int k = 0; k < n2; ++k) {
            Object object;
            long l = this.f.get(k);
            blx_1 blx_12 = bmf_2.a().c(l);
            if (blx_12 == null || !bwl_1.a.b(l, this)) continue;
            aff_1 aff_12 = bwl_1.a.b(l);
            bwl_1.a.a(l);
            biI biI2 = blx_12.bv();
            if (this.e || blx_12.a(erl_2.y)) {
                object = biI2.aZ();
                biI2.a(agk.a());
                blx_12.b(aff_12.d(), aff_12.e(), aff_12.f());
                biI2.a((agi)object);
                continue;
            }
            if (blx_12.P_().e(aff_12) > 10) {
                blx_12.b(aff_12.d(), aff_12.e(), aff_12.f());
                continue;
            }
            object = azu_0.j().k();
            if (blx_12 == object) {
                this.g = true;
                ((bmr_1)object).n(false);
                this.a(blx_12);
            }
            biI biI3 = biI2;
            biI3.bZ();
            apl_1 apl_12 = biI3.a(aff_12, false, false);
            int n3 = apl_12.a();
            int n4 = biI3.aZ().a(biI3, n3).a(biI3);
            int n5 = n3 * n4;
            if (apl_12.b() && n3 > 0) {
                if (n < n5) {
                    n = n5;
                }
                biI3.a(apl_12, true);
                continue;
            }
            blx_12.b(aff_12.d(), aff_12.e(), aff_12.f());
        }
        return n;
    }

    private void a(blx_1 blx_12) {
        bas_0 bas_02 = new bas_0(this, blx_12);
        blx_12.bv().b(bas_02);
    }

    void b(blx_1 blx_12) {
        if (blx_12.bp()) {
            cYT.a().f();
        }
    }

    @Override
    protected void l() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        if (this.f.contains(bmr_12.a_())) {
            bmr_12.n(true);
        }
    }

    static /* synthetic */ Logger n() {
        return a;
    }
}

