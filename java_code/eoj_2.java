/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/*
 * Renamed from eOj
 */
final class eoj_2
extends vd_0 {
    private final elv_0<? extends epq_2> b;
    private final eoo_2 c;
    private final Comparator<epq_2> d;
    private List<epq_2> e;
    private List<epq_2> f;

    eoj_2(elv_0<? extends epq_2> elv_02, eoo_2 eoo_22) {
        this.b = elv_02;
        this.c = eoo_22;
        this.d = new eoq_2(this.b.c(), eoo_22);
    }

    @Override
    protected void a(vb_0 vb_02) {
        eoj_2.d(vb_02);
        this.b();
        TLongArrayList tLongArrayList = this.a();
        eoj_2.a(vb_02, tLongArrayList);
    }

    private static void a(vb_0 vb_02, TLongArrayList tLongArrayList) {
        vb_02.e().add(tLongArrayList.toArray());
        vb_02.d().add(tLongArrayList.toArray());
    }

    private TLongArrayList a() {
        TLongArrayList tLongArrayList = new TLongArrayList();
        if (this.e.isEmpty() && this.f.isEmpty()) {
            return tLongArrayList;
        }
        if (this.e.isEmpty()) {
            eoj_2.a(tLongArrayList, this.f);
            return tLongArrayList;
        }
        if (this.f.isEmpty()) {
            eoj_2.a(tLongArrayList, this.e);
            return tLongArrayList;
        }
        boolean bl = true;
        while (!this.e.isEmpty() && !this.f.isEmpty()) {
            if (bl) {
                tLongArrayList.add(this.e.remove(0).a_());
            } else {
                tLongArrayList.add(this.f.remove(0).a_());
            }
            boolean bl2 = bl = !bl;
            if (this.e.isEmpty()) {
                eoj_2.a(tLongArrayList, this.f);
                continue;
            }
            if (!this.f.isEmpty()) continue;
            eoj_2.a(tLongArrayList, this.e);
        }
        return tLongArrayList;
    }

    private static void a(TLongArrayList tLongArrayList, List<? extends epq_2> list) {
        for (epq_2 epq_22 : list) {
            tLongArrayList.add(epq_22.a_());
        }
    }

    private static void d(vb_0 vb_02) {
        vb_02.d().clear();
        vb_02.e().clear();
    }

    private void b() {
        Collection collection = this.b.e((byte)0);
        Collection collection2 = this.b.e((byte)1);
        int n = this.a(collection);
        int n2 = this.a(collection2);
        if (n2 > n) {
            this.e = new ArrayList(collection2);
            this.f = new ArrayList(collection);
        } else if (n2 < n) {
            this.e = new ArrayList(collection);
            this.f = new ArrayList(collection2);
        } else if (this.b.c() % 2 == 0) {
            this.e = new ArrayList(collection2);
            this.f = new ArrayList(collection);
        } else {
            this.e = new ArrayList(collection);
            this.f = new ArrayList(collection2);
        }
        this.e.sort(this.d);
        this.f.sort(this.d);
    }

    private int a(Collection<? extends epq_2> collection) {
        if (collection.isEmpty()) {
            return 0;
        }
        int n = 0;
        for (epq_2 epq_22 : collection) {
            n += this.c.a(epq_22.a_());
        }
        return n /= collection.size();
    }

    @Override
    protected void b(vb_0 vb_02) {
    }

    @Override
    protected void c(vb_0 vb_02) {
    }

    @Override
    protected void a(vb_0 vb_02, long l) {
        vb_02.e().add(l);
    }

    @Override
    protected void a(vb_0 vb_02, long l, int n) {
        if (n >= vb_02.d().size()) {
            vb_02.d().add(l);
        } else {
            vb_02.d().insert(n, l);
        }
        vb_02.e().clear();
        vb_02.e().add(vb_02.d().toArray());
    }

    @Override
    protected void b(vb_0 vb_02, long l) {
        ahx_2.a(vb_02.e(), l);
    }
}

