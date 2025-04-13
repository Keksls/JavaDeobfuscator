/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Renamed from cKF
 */
public class ckf_2
extends fso
implements rv_0,
fai_2 {
    public static final String a = "timelineElementType";
    public static final int b = 1;
    public static final int c = 2;
    public static final String TAG = "timeline";
    private static final int e = 250;
    private csd_1 f;
    private fag_2 g;
    int h;
    private ArrayList<ckj_2> i;
    ArrayList<ckj_2> j;
    ckp_2 k;
    final HashMap<ftj_0, Integer> l = new HashMap();
    fsk_0 m;
    private boolean n = false;
    boolean o = false;
    boolean p = true;
    private boolean q = false;
    ArrayList<fjh_2> r;
    ArrayList<fjh_2> s;
    private final cke_2 t = new cke_2();
    private static final int u = 100;
    final Object v = new Object();
    public static final int d = "content".hashCode();

    @Override
    public void addFromXML(fyb_0 fyb_02) {
        if (fyb_02 instanceof faf_2) {
            this.g.a((faf_2)fyb_02);
        } else if (fyb_02 instanceof fsk_0) {
            this.m = (fsk_0)fyb_02;
        }
        super.addFromXML(fyb_02);
    }

    private void d() {
        this.k = new ckp_2();
        ftj_0 ftj_02 = new ftj_0();
        ftj_02.onCheckOut();
        ftj_02.setNonBlocking(this.m_nonBlocking);
        ftj_02.setRendererManager(this.g);
        ftj_02.setEnableDND(false);
        ftj_02.setEnabled(this.m_enabled);
        ftj_02.setNetEnabled(this.m_netEnabled);
        this.k.a(ftj_02);
        this.add(ftj_02);
        ftj_02.setContentProperty("timelineTurn", null);
        ftj_02.setContent(this.t);
        this.l.put(ftj_02, 1);
    }

    public ckj_2 a(csa_1 csa_12) {
        ckj_2 ckj_22 = new ckj_2(csa_12);
        csa_12.a_(eps_0.B).a(this);
        this.i.add(ckj_22);
        this.n = true;
        this.setNeedsToPreProcess();
        ftj_0 ftj_02 = new ftj_0();
        ftj_02.onCheckOut();
        ftj_02.setNonBlocking(this.m_nonBlocking);
        ftj_02.setRendererManager(this.g);
        ftj_02.setEnableDND(false);
        ftj_02.setEnabled(this.m_enabled);
        ftj_02.setNetEnabled(this.m_netEnabled);
        this.add(ftj_02);
        ftj_02.setContentProperty(TAG + csa_12.a_(), null);
        ftj_02.setContent(csa_12);
        ckj_22.a(ftj_02);
        this.l.put(ftj_02, 1);
        this.setWidgetOnTop(this.m);
        return ckj_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(ckj_2 ckj_22) {
        if (this.i == null) {
            return;
        }
        Object object = this.v;
        synchronized (object) {
            this.i.remove(ckj_22);
            ckj_22.a().a_(eps_0.B).b(this);
            ftj_0 ftj_02 = ckj_22.c();
            int n = this.l.get(ftj_02);
            if (n == 1) {
                this.l.remove(ftj_02);
                ftj_02.destroySelfFromParent();
            } else {
                this.l.put(ftj_02, n - 1);
            }
            this.n = true;
            this.setNeedsToPreProcess();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(csa_1 csa_12) {
        if (this.i == null) {
            return;
        }
        Object object = this.v;
        synchronized (object) {
            for (int k = this.i.size() - 1; k >= 0; --k) {
                ckj_2 ckj_22 = this.i.get(k);
                if (ckj_22.a() != csa_12) continue;
                this.n = true;
                this.setNeedsToPreProcess();
                this.j.remove(ckj_22);
                this.i.remove(k);
                csa_12.a_(eps_0.B).b(this);
                ftj_0 ftj_02 = ckj_22.c();
                int n = this.l.get(ftj_02);
                if (n == 1) {
                    this.l.remove(ftj_02);
                    ftj_02.destroySelfFromParent();
                    continue;
                }
                this.l.put(ftj_02, n - 1);
            }
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return true;
    }

    @Override
    public fvE getWidget(String string, int n) {
        if (string == null) {
            return null;
        }
        return null;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        for (ckj_2 ckj_22 : this.i) {
            ckj_22.c().setEnabled(bl);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        for (ckj_2 ckj_22 : this.i) {
            ckj_22.c().setNetEnabled(bl);
        }
    }

    public void setContent(csd_1 csd_12) {
        if (this.f == csd_12) {
            return;
        }
        this.f = csd_12;
        if (this.f != null) {
            this.f.a(this);
        }
        this.a(ckh_2.b);
        this.n = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    @Override
    public fvE getWidget(int n, int n2) {
        if (this.m_unloading || !this.m_visible || !this.getAppearance().a(n, n2)) {
            return null;
        }
        return super.getWidget(n, n2);
    }

    private ckj_2 getFighterElement(csa_1 csa_12, int n) {
        for (ckj_2 ckj_22 : this.i) {
            if (ckj_22.a() != csa_12) continue;
            if (n == 0) {
                return ckj_22;
            }
            --n;
        }
        return null;
    }

    private void a(ckh_2 ckh_22) {
        ckj_2 ckj_22;
        Object object;
        int n;
        if (this.f == null) {
            return;
        }
        csa_1 csa_12 = this.f.R();
        List<csa_1> list = this.f.L();
        int n2 = list.indexOf(csa_12);
        if (n2 == -1) {
            return;
        }
        List<csa_1> list2 = this.f.M();
        List<csa_1> list3 = this.f.M();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        this.h = list.size() - n2 - 1;
        this.j = new ArrayList();
        int n3 = list.size();
        for (n = n2; n < n3; ++n) {
            object = list.get(n);
            list3.remove(object);
            ckj_22 = this.getFighterElement((csa_1)object, 0);
            if (ckj_22 == null) {
                ckj_22 = this.a((csa_1)object);
            }
            arrayList.add(object);
            this.j.add(ckj_22);
        }
        n3 = list2.size();
        for (n = 0; n < n3 && (list3.size() != 0 || n < list2.indexOf(csa_12)); ++n) {
            object = list2.get(n);
            list3.remove(object);
            ckj_22 = this.getFighterElement((csa_1)object, arrayList.contains(object) ? 1 : 0);
            if (ckj_22 == null) {
                ckj_22 = this.a((csa_1)object);
            }
            arrayList.add(object);
            this.j.add(ckj_22);
        }
        n = this.i.size();
        for (n3 = n - 1; n3 >= 0; --n3) {
            object = this.i.get(n3);
            if (this.j.contains(object)) continue;
            this.a((ckj_2)object);
        }
        this.p = true;
    }

    public void a() {
    }

    public void c(csa_1 csa_12) {
        this.a(ckk_2.a.a(csa_12));
        this.n = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    public void d(csa_1 csa_12) {
        this.b(csa_12);
        this.a(ckk_2.b.a(csa_12));
        this.n = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    public void b() {
    }

    public void c() {
        this.q = true;
        this.t.a(this.f.u());
    }

    public void setFightStarted() {
        this.q = true;
    }

    public void e(csa_1 csa_12) {
    }

    public void f(csa_1 csa_12) {
        this.a(ckh_2.a);
        this.n = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    @Override
    public void a(rs_0 rs_02) {
        epa_1 epa_12 = (epa_1)rs_02;
        if (epa_12.t() == eps_0.B && !this.q) {
            this.f.s();
            this.f.O();
            this.a(ckh_2.a);
            this.n = true;
            this.setNeedsToPreProcess();
            this.setNeedsToPostProcess();
        }
    }

    public ftj_0 getCellRenderable(csa_1 csa_12) {
        for (ckj_2 ckj_22 : this.i) {
            if (ckj_22.a() != csa_12) continue;
            return ckj_22.c();
        }
        return null;
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.n) {
            this.invalidateMinSize();
        }
        return bl;
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.setNeedsToResetMeshes();
        this.d();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        if (this.i != null) {
            for (ckj_2 ckj_22 : this.i) {
                epa_1 epa_12 = ckj_22.a().a_(eps_0.B);
                epa_12.b(this);
            }
            this.i.clear();
            this.i = null;
        }
        this.j = null;
        this.r = null;
        this.s = null;
        this.m = null;
        this.l.clear();
        this.f = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.q = false;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.g = new fag_2();
        this.i = new ArrayList();
        this.m_invalidateOnMinSizeChange = true;
        this.o = false;
        this.p = false;
        this.t.a(1);
        this.setNonBlocking(true);
        ckn_2 ckn_22 = new ckn_2(this);
        ckn_22.onCheckOut();
        this.add(ckn_22);
        this.m_enableResizeEvents = true;
        this.addEventListener(frd_0.P, new ckg_2(this), false);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != d) {
            return super.setPropertyAttribute(n, object);
        }
        this.setContent((csd_1)object);
        return true;
    }
}

