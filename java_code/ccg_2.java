/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;

/*
 * Renamed from ccg
 */
public final class ccg_2 {
    private static final int a = 80;
    private static final abj_2<Long, TLongHashSet> b = new abj_2(80);

    static void a(cch_1 cch_12, afc[] afcArray) {
        long l = Hw.c(cch_12.a(), cch_12.b());
        TLongHashSet tLongHashSet = new TLongHashSet();
        for (int k = 0; k < afcArray.length; ++k) {
            afc afc2 = afcArray[k];
            bfv_0.b().a(new TD(afc2.a, afc2.b, afc2.d), afc2.c);
            tLongHashSet.add(afc2.a);
        }
        b.a(l, tLongHashSet);
    }

    static void b(cch_1 cch_12, afc[] afcArray) {
        for (int k = 0; k < afcArray.length; ++k) {
            afc afc2 = afcArray[k];
            if (!afc2.e) continue;
            bFZ bFZ2 = bFZ.a(afc2.a, null);
            cch_12.b(bFZ2);
        }
    }

    public static void a(int n, int n2) {
        long l = Hw.c(n, n2);
        TLongHashSet tLongHashSet = b.a(l);
        if (tLongHashSet != null) {
            for (long l2 : tLongHashSet) {
                bfv_0.b().c(l2);
            }
        }
    }
}

