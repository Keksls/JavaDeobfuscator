/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

public class amX
extends amU {
    private final TLongObjectHashMap<anc_0> a = new TLongObjectHashMap();
    private static final int b = 1;

    public void a(String string) {
        arf_1 arf_12 = arf_1.a(gg_0.b(string));
        int n = arf_12.c();
        int n2 = arf_12.c();
        for (int k = 0; k < n2; ++k) {
            long l = arf_12.j();
            int n3 = arf_12.c();
            anc_0 anc_02 = and_0.a.a(n3, arf_12);
            this.a.put(l, (Object)anc_02);
        }
        arf_12.close();
    }

    public void b(String string) {
        gk_0 gk_02 = new gk_0(gi_0.o(string));
        gk_02.a(1);
        gk_02.a(this.a.size());
        TLongObjectIterator tLongObjectIterator = this.a.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            gk_02.c(tLongObjectIterator.key());
            gk_02.a(((anc_0)tLongObjectIterator.value()).a());
            ((anc_0)tLongObjectIterator.value()).a(gk_02);
        }
        gk_02.d();
    }

    public void a(long l, anc_0 anc_02) {
        this.a.put(l, (Object)anc_02);
    }

    @Override
    protected void b(aty_1 aty_12, long l) {
        anc_0 anc_02 = (anc_0)this.a.get(l);
        if (anc_02 == null) {
            return;
        }
        anc_02.a(aty_12);
    }
}

