/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bME
 */
public final class bme_0
implements fgj_0 {
    public static final bme_0 a = new bme_0();
    private static final Logger b = Logger.getLogger(bme_0.class);
    private final TLongObjectHashMap<bmf_0> c = new TLongObjectHashMap();
    private final TLongObjectHashMap<bmf_0> d = new TLongObjectHashMap();
    private long e;
    private long f = -1L;

    private bme_0() {
    }

    public TLongObjectIterator<bmf_0> a() {
        return this.d.iterator();
    }

    private void b() {
        int[] nArray;
        this.c.clear();
        for (int n : nArray = fgT.a.c()) {
            bmf_0 bmf_02 = (bmf_0)fgT.a.a(n);
            if (bmf_02.f() != this.e) continue;
            this.c.put((long)bmf_02.e(), (Object)bmf_02);
        }
    }

    public bmf_0 a(int n) {
        return (bmf_0)this.c.get((long)n);
    }

    public bmf_0 a(int n, int n2) {
        TLongObjectIterator tLongObjectIterator = this.c.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bmf_0 bmf_02 = (bmf_0)tLongObjectIterator.value();
            if (!bmf_02.a(n, n2)) continue;
            return bmf_02;
        }
        return null;
    }

    public bmf_0 b(int n, int n2) {
        TLongObjectIterator tLongObjectIterator = this.c.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bmf_0 bmf_02 = (bmf_0)tLongObjectIterator.value();
            if (!bmf_02.b().b(n, n2)) continue;
            return bmf_02;
        }
        return null;
    }

    public void a(long l) {
        if (l == this.e) {
            return;
        }
        this.e = l;
        this.b();
        this.a(this.e, true);
    }

    @Override
    public void a(fgy_0 fgy_02, faX faX2) {
        fgv_0 fgv_02 = fgy_02.E();
        if (fgv_02 == null) {
            return;
        }
        bmf_0 bmf_02 = (bmf_0)this.c.get((long)fgv_02.e());
        if (bmf_02 == null) {
            return;
        }
        this.a(this.f, true);
    }

    public void b(long l) {
        this.a(l, false);
    }

    private void a(long l, boolean bl) {
        int[] nArray;
        if (this.f == l && !bl) {
            return;
        }
        this.f = l;
        blg_1.a().a(blh_1.a);
        this.d.clear();
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (int n : nArray = fgT.a.c()) {
            bmf_0 bmf_02 = (bmf_0)fgT.a.a(n);
            if (bmf_02.f() != l) continue;
            if (bmf_02.h() == null) {
                bmf_02.a(bMs.a.b(bmf_02.e()));
            }
            this.d.put((long)n, (Object)bmf_02);
            bmg_0 bmg_02 = new bmg_0(bmf_02);
            fgy_0 fgy_02 = bmf_02.h();
            int n2 = fgy_02 != null ? fgy_02.F() : -1;
            bmh_0 bmh_02 = (bmh_0)tIntObjectHashMap.get(n2);
            if (bmh_02 == null) {
                bmh_02 = new bmh_0();
                tIntObjectHashMap.put(n2, (Object)bmh_02);
                bmh_02.a(l);
            }
            bmh_02.a(bmg_02);
        }
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            blg_1.a().a(blh_1.a, ((bmh_0)tIntObjectIterator.value()).j(), (bLP)tIntObjectIterator.value());
        }
        this.f = l;
    }
}

