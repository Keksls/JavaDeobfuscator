/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from baz
 */
public class baz_0
extends bak_0 {
    private final List<Long> e = new ArrayList<Long>();
    private final List<Long> f = new ArrayList<Long>();
    private final List<Long> g = new ArrayList<Long>();

    public baz_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void l() {
    }

    @Override
    protected void r() {
        Object object;
        bwh_0 bwh_02 = this.b();
        if (bwh_02 == null) {
            return;
        }
        if (bwh_02 instanceof bvw_2) {
            object = (bvw_2)bwh_02;
            ((bvw_2)object).a(this.f);
            ((bvw_2)object).b(this.e);
        }
        object = new ArrayList(bwh_02.j());
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            boolean bl;
            blx_1 blx_12 = (blx_1)iterator.next();
            blx_12.ap();
            blx_12.br();
            boolean bl2 = bl = blx_12.gY() == 5;
            if (blx_12.cX() || bl) {
                a.info((Object)("Removing character " + blx_12.dp() + " from manager"));
                bmf_2.a().e(blx_12);
                continue;
            }
            if (!this.e.contains(blx_12.a_()) && !blx_12.ab_() || blx_12.a(eoz_1.m) || this.f.contains(blx_12.a_()) || !(blx_12 instanceof bmv_1)) continue;
            ((bmv_1)blx_12).cH();
        }
        bwh_02.o();
        if (bwh_02 instanceof bvw_2) {
            ccm_1.g().b((bvw_2)bwh_02);
        }
        bwj_1.a().b(bwh_02);
        baa_0.a().c(bwh_02.c());
    }

    public void a(Collection<Long> collection) {
        if (collection != null) {
            this.e.addAll(collection);
        }
    }

    public void b(Collection<Long> collection) {
        if (collection != null) {
            this.f.addAll(collection);
        }
    }

    public void c(Collection<Long> collection) {
        if (collection != null) {
            this.g.addAll(collection);
        }
    }
}

