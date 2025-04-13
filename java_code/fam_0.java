/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from fam
 */
public class fam_0 {
    private static final Logger a = Logger.getLogger(fam_0.class);
    private final TIntObjectHashMap<fap_0> b = new TIntObjectHashMap();
    private final List<fan_0> c = new ArrayList<fan_0>();
    private final wt_0 d = new wt_0(0, 0, 0, 0, 0, 0);
    private static List<Long> e;

    public static void a() {
        e = enp_2.a.h(ens_2.ak);
    }

    public static boolean a(int n) {
        return e != null && e.contains(n);
    }

    public void a(fap_0 fap_02) {
        this.b.put(fap_02.a(), (Object)fap_02);
    }

    public void b(int n) {
        this.b.remove(n);
    }

    public boolean c(int n) {
        return this.b.containsKey(n);
    }

    public void a(fan_0 fan_02) {
        if (!this.c.contains(fan_02)) {
            this.c.add(fan_02);
        }
    }

    public void b(fan_0 fan_02) {
        this.c.remove(fan_02);
    }

    public far d(int n) {
        return (far)this.b.get(n);
    }

    public void a(int n, int n2) {
        fap_0 fap_02 = (fap_0)this.b.get(n);
        if (fap_02 == null) {
            a.warn((Object)("[LOCK] On essaye de modifier un Lock inconnu id=" + n));
            return;
        }
        fap_02.a(n2);
    }

    public void a(int n, wu_0 wu_02) {
        fap_0 fap_02 = (fap_0)this.b.get(n);
        if (fap_02 == null) {
            a.warn((Object)("[LOCK] On essaye de modifier un Lock inconnu id=" + n));
            return;
        }
        fap_02.c(wu_02);
    }

    public void b(int n, wu_0 wu_02) {
        fap_0 fap_02 = (fap_0)this.b.get(n);
        if (fap_02 == null) {
            a.warn((Object)("[LOCK] On essaye de modifier un Lock inconnu id=" + n));
            return;
        }
        fap_02.a(wu_02);
    }

    public void a(int n, wu_0 wu_02, wu_0 wu_03) {
        fap_0 fap_02 = (fap_0)this.b.get(n);
        if (fap_02 == null) {
            a.warn((Object)("[LOCK] On essaye de modifier un Lock inconnu id=" + n));
            return;
        }
        fap_02.a(wu_02);
        fap_02.b(wu_03);
    }

    public boolean e(int n) {
        far far2 = (far)this.b.get(n);
        if (far2 == null) {
            a.warn((Object)("[LOCK] On essaye de v\u00e9rifier qu'un Lock inconnu est actif id=" + n));
            return false;
        }
        wu_0 wu_02 = wc_0.p().a();
        if (fam_0.a(far2, wu_02)) {
            return true;
        }
        if (this.g(n)) {
            return true;
        }
        return this.a(far2, wu_02);
    }

    public boolean f(int n) {
        far far2 = (far)this.b.get(n);
        if (far2 == null) {
            a.warn((Object)("[LOCK] On essaye de v\u00e9rifier qu'un Lock inconnu est actif id=" + n));
            return false;
        }
        wu_0 wu_02 = wc_0.p().a();
        return this.a(far2, wu_02);
    }

    public boolean g(int n) {
        return this.d() && !fam_0.a(n);
    }

    private boolean d() {
        fap_0 fap_02 = (fap_0)this.b.get(-1);
        if (fap_02 == null) {
            return false;
        }
        wu_0 wu_02 = wc_0.p().a();
        return this.a(fap_02, wu_02);
    }

    private boolean a(far far2, wu_0 wu_02) {
        if (!far2.d().e()) {
            return false;
        }
        if (far2.h().c()) {
            return false;
        }
        wu_0 wu_03 = wu_02.a(far2.e(), far2.d());
        this.d.a(far2.h());
        return wu_03.c(this.d);
    }

    public boolean h(int n) {
        far far2 = (far)this.b.get(n);
        if (far2 == null) {
            a.warn((Object)("[LOCK] On essaye de v\u00e9rifier qu'un Lock inconnu est actif id=" + n));
            return false;
        }
        wu_0 wu_02 = wc_0.p().a();
        return fam_0.a(far2, wu_02);
    }

    private static boolean a(faq faq2, wu_0 wu_02) {
        return !faq2.f().c() && wu_02.b(faq2.f());
    }

    public wu_0 i(int n) {
        far far2 = (far)this.b.get(n);
        if (far2 == null) {
            a.warn((Object)("[LOCK] On essaye de v\u00e9rifier qu'un Lock inconnu est actif id=" + n));
            return wt_0.b();
        }
        wu_0 wu_02 = wc_0.p().a();
        return wu_02.a(far2.e(), far2.d(), true);
    }

    public int j(int n) {
        far far2 = (far)this.b.get(n);
        if (far2 == null) {
            a.warn((Object)("[LOCK] On essaye de v\u00e9rifier qu'un Lock inconnu est actif id=" + n));
            return 0;
        }
        if (far2.c() == 0) {
            return 0;
        }
        wt_0 wt_02 = wc_0.p().j();
        if (far2.d().e() && !far2.i().c()) {
            wu_0 wu_02 = wt_02.a(far2.e(), far2.d());
            this.d.a(far2.i());
            if (!wu_02.c(this.d)) {
                return 0;
            }
        }
        return far2.l();
    }

    public void k(int n) {
        fap_0 fap_02 = (fap_0)this.b.get(n);
        if (fap_02 == null) {
            a.warn((Object)("[LOCK] On essaye de verrouiller un Lock inconnu id=" + n));
            return;
        }
        wt_0 wt_02 = wc_0.p().j();
        fap_02.a(wt_02);
        int n2 = this.c.size();
        for (int k = 0; k < n2; ++k) {
            this.c.get(k).a(n, wt_02);
        }
    }

    public void l(int n) {
        fap_0 fap_02 = (fap_0)this.b.get(n);
        if (fap_02 == null) {
            a.warn((Object)("[LOCK] On essaye de verrouiller un Lock inconnu id=" + n));
            return;
        }
        this.b(fap_02);
    }

    private void b(fap_0 fap_02) {
        int n = fap_02.a();
        wt_0 wt_02 = wc_0.p().j();
        if (fap_02.d().e() && !fap_02.i().c()) {
            wu_0 wu_02 = wt_02.a(fap_02.e(), fap_02.d());
            this.d.a(fap_02.i());
            if (!wu_02.c(this.d)) {
                fap_02.k();
            }
        }
        fap_02.j();
        fap_02.c(wt_02);
        int n2 = this.c.size();
        for (int k = 0; k < n2; ++k) {
            this.c.get(k).a(n, fap_02.l(), fap_02.i());
        }
        if (fap_02.l() >= fap_02.c()) {
            this.k(n);
        }
    }

    public TIntObjectIterator<fap_0> b() {
        return this.b.iterator();
    }

    public void c() {
        this.b.clear();
        this.c.clear();
    }

    static {
        fam_0.a();
        enp_2.a.a((ens_2 ens_22, Object object) -> {
            if (ens_22 != ens_2.ak) {
                return;
            }
            fam_0.a();
        });
    }
}

