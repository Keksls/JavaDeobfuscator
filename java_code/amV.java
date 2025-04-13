/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntLongHashMap
 *  gnu.trove.map.hash.TLongLongHashMap
 *  org.apache.commons.lang3.ArrayUtils
 */
import gnu.trove.map.hash.TIntLongHashMap;
import gnu.trove.map.hash.TLongLongHashMap;
import org.apache.commons.lang3.ArrayUtils;

public abstract class amV
extends alf_1 {
    private final TIntLongHashMap a = new TIntLongHashMap();
    private final TLongLongHashMap b = new TLongLongHashMap();
    private static final int c = 700;
    private final long[] d = new long[]{400L, 410L, 420L};

    @Override
    public void a(int n, long l, long l2, long l3) {
        this.a.put(n, l);
        this.b.put(l3, l2);
    }

    private long a(int n) {
        return this.a.remove(n);
    }

    @Override
    public boolean a(long l, long l2) {
        long l3 = ami_2.a(l2);
        if (!ArrayUtils.contains((long[])this.d, (long)l3)) {
            return true;
        }
        long l4 = this.b.get(l2);
        return 700L <= Math.abs(l - l4);
    }

    protected boolean a() {
        return aki_0.h().d();
    }

    @Override
    public void a(int n, boolean bl) {
        long l = this.a(n);
        if (bl) {
            amj_1 amj_12 = aml_1.a().b(l);
            aki_0.h().a(l, amj_12);
        }
    }
}

