/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.set.hash.TIntHashSet;
import java.util.List;

public class fdx
extends fde<feu> {
    static final fdi_0 c = new fdi_0(new aqi_2("Nothing", new aqo_2[0]));
    public static final fdv_0<fdx> b = new fdy();

    fdx(long l, int n, int n2, boolean bl, Iterable<fdf_0> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void a(List<aot_2> list) {
    }

    @Override
    public fdj_0 i() {
        return fdj_0.t;
    }

    @Override
    public boolean a(feu feu2) {
        if (!feu2.f().o()) {
            return false;
        }
        fhi_0 fhi_02 = feu2.e();
        int n = fhi_02.cO();
        fgp_0 fgp_02 = feu2.g();
        if (fgp_02 == null) {
            return false;
        }
        if (fhi_02 instanceof eah_0) {
            eah_0 eah_02 = (eah_0)((Object)fhi_02);
            TIntHashSet tIntHashSet = eah_02.d();
            TIntIterator tIntIterator = tIntHashSet.iterator();
            while (tIntIterator.hasNext()) {
                if (!fgp_02.i(tIntIterator.next())) continue;
                return true;
            }
        }
        return fgp_02.j(n);
    }
}

