/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from boN
 */
public class bon_1 {
    private static final Logger b = Logger.getLogger(bon_1.class);
    public static final boolean a = false;
    private final long c;
    private int d;
    private int e;
    private final ArrayList<bop_1> f;

    public bon_1(long l) {
        this.c = l;
        this.d = 0;
        this.e = 0;
        this.f = new ArrayList();
    }

    public void a(bmv_1 bmv_12) {
        bop_1 bop_12 = this.a(bmv_12.a_());
        bop_12.b(bmv_12.dr());
        bop_12.a(bmv_12.cI());
    }

    public void a(bmv_1 bmv_12, List<ts_2> list) {
        Object object;
        int n;
        if (this.f.isEmpty()) {
            this.d = list.size();
            for (n = 0; n < list.size(); ++n) {
                object = list.get(n);
                bop_1 bop_12 = new bop_1(0L, ((ts_2)object).a, ((ts_2)object).b);
                this.f.add(bop_12);
            }
        }
        if (this.d < list.size() && this.a(bmv_12.a_()) == null) {
            this.f.add(new bop_1(bmv_12.a_(), bmv_12.cI(), bmv_12.dr()));
            ++this.d;
            ++this.e;
            return;
        }
        if (this.a(bmv_12.a_()) != null) {
            return;
        }
        for (n = 0; n < this.f.size(); ++n) {
            object = this.f.get(n);
            if (((bop_1)object).a() != 0L || ((bop_1)object).b() != bmv_12.cI() || ((bop_1)object).c() != bmv_12.dr()) continue;
            ((bop_1)object).a(bmv_12.a_());
            ++this.e;
            return;
        }
        this.f.add(new bop_1(bmv_12.a_(), bmv_12.cI(), bmv_12.dr()));
        ++this.d;
        ++this.e;
    }

    public void b(bmv_1 bmv_12) {
        bop_1 bop_12 = this.a(bmv_12.a_());
        if (this.f.remove(bop_12)) {
            --this.e;
            --this.d;
        } else {
            b.warn((Object)("On essaye de remove plusieurs fois le monstre " + bmv_12.a_() + " du NPCGroupInformation."));
        }
        if (this.e <= 0) {
            boq_1.a().a(this);
        }
    }

    public void c(bmv_1 bmv_12) {
        bop_1 bop_12 = this.a(bmv_12.a_());
        if (bop_12 == null) {
            return;
        }
        bop_12.a(0L);
        --this.e;
        if (this.e <= 0) {
            boq_1.a().a(this);
        }
    }

    public boolean a() {
        int n = this.f.size();
        for (int k = 0; k < n; ++k) {
            eri_2<erl_2> eri_22;
            blx_1 blx_12 = bmf_2.a().c(this.f.get(k).a());
            if (blx_12 == null || (eri_22 = blx_12.gZ()) == null || !((rt_0)eri_22).a(erl_2.n)) continue;
            return true;
        }
        return false;
    }

    public List<bop_1> b() {
        return this.f;
    }

    protected bop_1 a(long l) {
        for (bop_1 bop_12 : this.f) {
            if (bop_12.a() != l) continue;
            return bop_12;
        }
        return null;
    }

    public boolean c() {
        return this.d != this.f.size();
    }

    public int d() {
        int n = 0;
        int n2 = this.f.size();
        for (int k = 0; k < n2; ++k) {
            bop_1 bop_12 = this.f.get(k);
            n += bop_12.c();
        }
        return n;
    }

    public long e() {
        return this.c;
    }

    public boolean d(bmv_1 bmv_12) {
        for (int k = 0; k < this.f.size(); ++k) {
            bop_1 bop_12 = this.f.get(k);
            if (bop_12.a() != bmv_12.a_()) continue;
            return true;
        }
        return false;
    }

    public void e(bmv_1 bmv_12) {
        if (this.d(bmv_12)) {
            return;
        }
        for (int k = 0; k < this.f.size(); ++k) {
            bop_1 bop_12 = this.f.get(k);
            if (bop_12.b() != bmv_12.gO() || bop_12.c() != bmv_12.dr()) continue;
            bop_12.a(bmv_12.a_());
            return;
        }
    }

    public static bop_1 f(bmv_1 bmv_12) {
        return new bop_1(bmv_12.R(), bmv_12.gO(), bmv_12.dr());
    }
}

