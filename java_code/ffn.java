/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;

public class ffn {
    public static final int a = 25;
    private final TByteObjectHashMap<ffl> b = new TByteObjectHashMap();
    private final TLongObjectHashMap<ffm> c = new TLongObjectHashMap();

    public ffl a(ffp ffp2) {
        return (ffl)this.b.get(ffp2.c);
    }

    public ffm a(long l) {
        return (ffm)this.c.get(l);
    }

    public void a(ffl ffl2) {
        this.b.put(ffl2.a().c, (Object)ffl2);
    }

    public void a(ffm ffm2) {
        this.c.put(ffm2.a(), (Object)ffm2);
    }

    public void b(long l) {
        this.c.remove(l);
    }

    public void a(ud_2 ud_22) {
        this.c(ud_22);
        this.d(ud_22);
    }

    public void b(ud_2 ud_22) {
        this.e(ud_22);
        this.f(ud_22);
    }

    private void c(ud_2 ud_22) {
        ud_22.b.clear();
        TByteObjectIterator tByteObjectIterator = this.b.iterator();
        while (tByteObjectIterator.hasNext()) {
            tByteObjectIterator.advance();
            ue_1 ue_12 = new ue_1();
            ((ffl)tByteObjectIterator.value()).a(ue_12.a);
            ud_22.b.add(ue_12);
        }
    }

    private void d(ud_2 ud_22) {
        ud_22.c.clear();
        TLongObjectIterator tLongObjectIterator = this.c.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            uf_2 uf_22 = new uf_2();
            ((ffm)tLongObjectIterator.value()).a(uf_22.a);
            ud_22.c.add(uf_22);
        }
    }

    private void e(ud_2 ud_22) {
        this.b.clear();
        for (int k = 0; k < ud_22.b.size(); ++k) {
            ffl ffl2 = new ffl();
            ffl2.b(ud_22.b.get((int)k).a);
            this.a(ffl2);
        }
    }

    private void f(ud_2 ud_22) {
        this.c.clear();
        for (int k = 0; k < ud_22.c.size(); ++k) {
            ffm ffm2 = new ffm();
            ffm2.b(ud_22.c.get((int)k).a);
            this.a(ffm2);
        }
    }

    public abq_2<ffm> a() {
        abq_2<ffm> abq_22 = new abq_2<ffm>(new ffo());
        TLongObjectIterator tLongObjectIterator = this.c.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            abq_22.add((ffm)tLongObjectIterator.value());
        }
        return abq_22;
    }

    public String toString() {
        return "DimBagRights{m_groupRights=" + this.b.size() + ", m_individualRights=" + this.c.size() + "}";
    }
}

