/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import org.jetbrains.annotations.Nullable;

public class fgP<Protector extends fgy_0>
extends eyu_1 {
    private final TByteObjectHashMap<fgq> b = new TByteObjectHashMap();

    public fgP(Protector Protector, abr_1<fgq<Protector>> abr_12, @Nullable fgu_0 fgu_02) {
        fgo_0[] fgo_0Array = fgo_0.values();
        for (int k = 0; k < fgo_0Array.length; ++k) {
            fgo_0 fgo_02 = fgo_0Array[k];
            if (fgu_02 != null && !fgu_02.a((fgy_0)Protector, fgo_02)) continue;
            fgq<Protector> fgq2 = abr_12.createNew();
            fgq2.a(Protector);
            this.b.put(fgo_02.d, fgq2);
        }
    }

    public boolean a(fgo_0 fgo_02) {
        return this.b.contains(fgo_02.d);
    }

    public long b(fgo_0 fgo_02) {
        fgq fgq2 = (fgq)this.b.get(fgo_02.d);
        return fgq2 == null ? 0L : fgq2.dK().a();
    }

    public boolean a(fgo_0 fgo_02, int n) {
        fgq fgq2 = (fgq)this.b.get(fgo_02.d);
        return fgq2 != null && fgq2.dK().b(n);
    }

    public boolean b(fgo_0 fgo_02, int n) {
        fgq fgq2 = (fgq)this.b.get(fgo_02.d);
        if (fgq2.dK().a() + (long)n > Integer.MAX_VALUE) {
            return false;
        }
        return fgq2 != null && fgq2.dK().c(n);
    }

    public boolean c(fgo_0 fgo_02, int n) {
        fgq fgq2 = (fgq)this.b.get(fgo_02.d);
        return fgq2 != null && fgq2.dK().d(n);
    }

    @Override
    public boolean b(long l) {
        return super.b(Math.min(1000000000L, l));
    }

    public void a(int n) {
        fgo_0[] fgo_0Array = fgo_0.values();
        for (int k = 0; k < fgo_0Array.length; ++k) {
            this.a(fgo_0Array[k], 0);
        }
        this.b(n);
    }

    public fgq c(fgo_0 fgo_02) {
        return (fgq)this.b.get(fgo_02.d);
    }

    public void a(xo_1 xo_12) {
        xo_12.a = Hw.e(this.a());
        TByteObjectIterator tByteObjectIterator = this.b.iterator();
        while (tByteObjectIterator.hasNext()) {
            tByteObjectIterator.advance();
            xp_1 xp_12 = new xp_1();
            xp_12.a = tByteObjectIterator.key();
            xp_12.b = Hw.e(((fgq)tByteObjectIterator.value()).dK().a());
            xo_12.b.add(xp_12);
        }
    }

    public void b(xo_1 xo_12) {
        for (int k = 0; k < xo_12.b.size(); ++k) {
            xp_1 xp_12 = xo_12.b.get(k);
            fgo_0 fgo_02 = fgo_0.a(xp_12.a);
            if (fgo_02 == null) {
                a.error((Object)("No context associated for id " + xp_12.a + ", cashAmount : " + xp_12.b));
                continue;
            }
            this.a(fgo_02, xp_12.b);
        }
        this.b(xo_12.a);
    }
}

