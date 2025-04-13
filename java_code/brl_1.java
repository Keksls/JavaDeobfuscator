/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
 * Renamed from brL
 */
public class brl_1
extends brz_0 {
    public static final int m = 8;
    public static final String n = "recipes";
    public static final String o = "isExpanded";
    public static final String p = "isMouseOver";
    public static final String q = "hasPreviousPage";
    public static final String r = "hasNextPage";
    public static final String s = "currentPageText";
    private ArrayList<brw_0> t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;

    public brl_1(int n, int n2) {
        super(n, ecc_0.a);
    }

    public void b(int n) {
        this.a(ecn_0.a.a(this.l).b(n));
    }

    public void c(int n) {
        this.a(ecn_0.a.a(this.l).c(n));
    }

    private void a(Iterator<eco_0> iterator) {
        this.t = new ArrayList();
        if (iterator == null) {
            return;
        }
        ece_0 ece_02 = bgg.a.b();
        while (iterator.hasNext()) {
            eco_0 eco_02 = iterator.next();
            if (eco_02.a(ece_02)) continue;
            brw_0 brw_02 = new brw_0(eco_02, this);
            this.t.add(brw_02);
        }
        this.t.sort(Comparator.comparingInt(brw_0::c));
        int n = this.t.size();
        this.x = (int)Math.floor(n / 8);
    }

    public boolean m() {
        return this.t != null && this.t.size() != 0;
    }

    @Override
    public Object b(String string) {
        if (string.equals(n)) {
            int n = this.w * 8;
            n = Math.max(n, 0);
            int n2 = n + 8;
            if (n > (n2 = Math.min(n2, this.t.size()))) {
                return Collections.emptyList();
            }
            return this.t.subList(n, n2);
        }
        if (string.equals(o)) {
            return this.u;
        }
        if (string.equals(p)) {
            return this.v;
        }
        if (string.equals(q)) {
            return this.w > 0;
        }
        if (string.equals(r)) {
            return this.w < this.x;
        }
        if (string.equals(s)) {
            return this.w + 1 + "/" + (this.x + 1);
        }
        return super.b(string);
    }

    @Override
    public short h() {
        return 100;
    }

    @Override
    public boolean l() {
        return false;
    }

    public boolean n() {
        return this.u;
    }

    public boolean o() {
        return this.v;
    }

    public void a(boolean bl) {
        this.u = bl;
    }

    public ArrayList<brw_0> p() {
        return this.t;
    }

    public void b(boolean bl) {
        this.v = bl;
        fis_1.a().a((ajf_1)this, p);
    }

    public void q() {
        this.w = 0;
        fis_1.a().a((ajf_1)this, q);
        fis_1.a().a((ajf_1)this, r);
        fis_1.a().a((ajf_1)this, n);
        fis_1.a().a((ajf_1)this, s);
    }

    public void r() {
        if (this.w <= 0) {
            return;
        }
        --this.w;
        fis_1.a().a((ajf_1)this, q);
        fis_1.a().a((ajf_1)this, r);
        fis_1.a().a((ajf_1)this, n);
        fis_1.a().a((ajf_1)this, s);
    }

    public void s() {
        if (this.w >= this.x) {
            return;
        }
        ++this.w;
        fis_1.a().a((ajf_1)this, q);
        fis_1.a().a((ajf_1)this, r);
        fis_1.a().a((ajf_1)this, n);
        fis_1.a().a((ajf_1)this, s);
    }

    public void t() {
        this.w = this.x;
        fis_1.a().a((ajf_1)this, q);
        fis_1.a().a((ajf_1)this, r);
        fis_1.a().a((ajf_1)this, n);
        fis_1.a().a((ajf_1)this, s);
    }
}

