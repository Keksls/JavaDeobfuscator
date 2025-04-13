/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eLg
 */
public class elg_0 {
    protected static final Logger a = Logger.getLogger(elg_0.class);
    private static elg_0 b = new elg_0();
    private final TLongObjectHashMap<ekr_0> c = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekf_0> d = new TLongObjectHashMap();
    private final TLongObjectHashMap<eke_0> e = new TLongObjectHashMap();
    private final TLongObjectHashMap<eko_0> f = new TLongObjectHashMap();
    private final TLongObjectHashMap<eks_0> g = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekc_0> h = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekn_0> i = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekt_0> j = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekh_0> k = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekd_0> l = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekj_0> m = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekp_0> n = new TLongObjectHashMap();
    private final TLongObjectHashMap<eku_0> o = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekl_0> p = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekg_0> q = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekm_0> r = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekb_0> s = new TLongObjectHashMap();
    private final TLongObjectHashMap<ekk_0> t = new TLongObjectHashMap();

    public static elg_0 a() {
        return b;
    }

    public void a(ekk_0 ekk_02) {
        if (ekk_02 instanceof ekr_0) {
            this.a((ekr_0)ekk_02);
        } else if (ekk_02 instanceof ekn_0) {
            this.a((ekn_0)ekk_02);
        } else if (ekk_02 instanceof ekf_0) {
            this.a((ekf_0)ekk_02);
        } else if (ekk_02 instanceof ekc_0) {
            this.a((ekc_0)ekk_02);
        } else if (ekk_02 instanceof eko_0) {
            this.a((eko_0)ekk_02);
        } else if (ekk_02 instanceof eks_0) {
            this.a((eks_0)ekk_02);
        } else if (ekk_02 instanceof eke_0) {
            this.a((eke_0)ekk_02);
        } else if (ekk_02 instanceof ekt_0) {
            this.a((ekt_0)ekk_02);
        } else if (ekk_02 instanceof ekh_0) {
            this.a((ekh_0)ekk_02);
        } else if (ekk_02 instanceof ekq_0) {
            this.a((ekq_0)ekk_02);
        } else if (ekk_02 instanceof ekj_0) {
            this.a((ekj_0)ekk_02);
        } else if (ekk_02 instanceof ekp_0) {
            this.a((ekp_0)ekk_02);
        } else if (ekk_02 instanceof eku_0) {
            this.a((eku_0)ekk_02);
        } else if (ekk_02 instanceof ekl_0) {
            this.a((ekl_0)ekk_02);
        } else if (ekk_02 instanceof ekd_0) {
            this.a((ekd_0)ekk_02);
        } else if (ekk_02 instanceof ekg_0) {
            this.a((ekg_0)ekk_02);
        } else if (ekk_02 instanceof ekm_0) {
            this.a((ekm_0)ekk_02);
        } else if (ekk_02 instanceof ekb_0) {
            this.a((ekb_0)ekk_02);
        } else {
            a.error((Object)("Type de zone d'effet inconnue du manager " + ekk_02.getClass().getSimpleName()));
        }
    }

    private void a(ekb_0 ekb_02) {
        this.t.put(ekb_02.A(), (Object)ekb_02);
        this.s.put(ekb_02.A(), (Object)ekb_02);
    }

    private void a(ekm_0 ekm_02) {
        this.t.put(ekm_02.A(), (Object)ekm_02);
        this.r.put(ekm_02.A(), (Object)ekm_02);
    }

    private void a(eku_0 eku_02) {
        this.t.put(eku_02.A(), (Object)eku_02);
        this.o.put(eku_02.A(), (Object)eku_02);
    }

    private void a(ekl_0 ekl_02) {
        this.t.put(ekl_02.A(), (Object)ekl_02);
        this.p.put(ekl_02.A(), (Object)ekl_02);
    }

    private void a(ekg_0 ekg_02) {
        this.t.put(ekg_02.A(), (Object)ekg_02);
        this.q.put(ekg_02.A(), (Object)ekg_02);
    }

    private void a(ekp_0 ekp_02) {
        this.t.put(ekp_02.A(), (Object)ekp_02);
        this.n.put(ekp_02.A(), (Object)ekp_02);
    }

    private void a(ekj_0 ekj_02) {
        this.t.put(ekj_02.A(), (Object)ekj_02);
        this.m.put(ekj_02.A(), (Object)ekj_02);
    }

    private void a(ekq_0 ekq_02) {
        this.t.put(ekq_02.A(), (Object)ekq_02);
    }

    private void a(ekh_0 ekh_02) {
        this.k.put(ekh_02.A(), (Object)ekh_02);
        this.t.put(ekh_02.A(), (Object)ekh_02);
    }

    private void a(ekd_0 ekd_02) {
        this.l.put(ekd_02.A(), (Object)ekd_02);
        this.t.put(ekd_02.A(), (Object)ekd_02);
    }

    private void a(ekt_0 ekt_02) {
        this.j.put(ekt_02.A(), (Object)ekt_02);
        this.t.put(ekt_02.A(), (Object)ekt_02);
    }

    private void a(ekr_0 ekr_02) {
        this.c.put(ekr_02.A(), (Object)ekr_02);
        this.t.put(ekr_02.A(), (Object)ekr_02);
    }

    public ekr_0 a(long l) {
        return (ekr_0)this.c.get(l);
    }

    private void a(ekn_0 ekn_02) {
        this.i.put(ekn_02.A(), (Object)ekn_02);
        this.t.put(ekn_02.A(), (Object)ekn_02);
    }

    public ekn_0 b(long l) {
        return (ekn_0)this.i.get(l);
    }

    private void a(ekf_0 ekf_02) {
        this.d.put(ekf_02.A(), (Object)ekf_02);
        this.t.put(ekf_02.A(), (Object)ekf_02);
    }

    public ekf_0 c(long l) {
        return (ekf_0)this.d.get(l);
    }

    private void a(ekc_0 ekc_02) {
        this.h.put(ekc_02.A(), (Object)ekc_02);
        this.t.put(ekc_02.A(), (Object)ekc_02);
    }

    public ekc_0 d(long l) {
        return (ekc_0)this.h.get(l);
    }

    private void a(eke_0 eke_02) {
        this.e.put(eke_02.A(), (Object)eke_02);
        this.t.put(eke_02.A(), (Object)eke_02);
    }

    public eke_0 e(long l) {
        return (eke_0)this.e.get(l);
    }

    public eke_0 b() {
        return (eke_0)this.e.get(this.e.keys()[Hw.a(this.e.size())]);
    }

    private void a(eko_0 eko_02) {
        this.f.put(eko_02.A(), (Object)eko_02);
        this.t.put(eko_02.A(), (Object)eko_02);
    }

    public eko_0 f(long l) {
        return (eko_0)this.f.get(l);
    }

    public Iterator<eko_0> c() {
        return new acj_1<eko_0>(this.f);
    }

    private void a(eks_0 eks_02) {
        this.g.put(eks_02.A(), (Object)eks_02);
        this.t.put(eks_02.A(), (Object)eks_02);
    }

    public eks_0 g(long l) {
        return (eks_0)this.g.get(l);
    }

    public ekt_0 h(long l) {
        return (ekt_0)this.j.get(l);
    }

    public ekk_0 i(long l) {
        return (ekk_0)this.t.get(l);
    }

    public ekh_0 j(long l) {
        return (ekh_0)this.k.get(l);
    }

    public ekb_0 k(long l) {
        return (ekb_0)this.s.get(l);
    }

    public List<ekj_0> d() {
        Object[] objectArray = new ekj_0[this.m.size()];
        this.m.values(objectArray);
        return Arrays.asList(objectArray);
    }

    public static void a(elg_0 elg_02) {
        b = elg_02;
    }
}

