/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from cKw
 */
public class ckw_2
extends fso
implements fai_2 {
    public static final String TAG = "TimePointBarWidget";
    private static final String h = "labels";
    private static final String i = "points";
    private static final String j = "avatar";
    public static final String a = "turnLabel";
    public static final String b = "turnArrow";
    public static final String c = "pointItemRenderer";
    public static final String d = "avatarItemRenderer";
    public static final String e = "timePointDescriptionPopup";
    public static final String f = "timePointDescriptionPopupRenderable";
    csd_1 k;
    private csc_1 l;
    fil_1 m;
    private fag_2 n;
    private fag_2 o;
    ArrayList<csb_1> p;
    private ArrayList<csb_1> q;
    ArrayList<ftj_0> r;
    ArrayList<ftj_0> s;
    ArrayList<fsM> t;
    fsk_0 u;
    private fsM v;
    private boolean w = false;
    private int[] x;
    private int[] y;
    private int[] z;
    int[] A;
    int[] B;
    private int[] C;
    int[] D;
    int E;
    boolean F = false;
    public static final int g = "content".hashCode();

    public static int getAdjustedX(ftj_0 ftj_02, int n, int n2, int n3, ArrayList<ftj_0> arrayList, csa_1 csa_12) {
        boolean bl;
        int n4 = 0;
        block0: do {
            for (int k = n3 - 1; k >= 0; --k) {
                ftj_0 ftj_03 = arrayList.get(k);
                csa_1 csa_13 = (csa_1)ftj_03.getItemValue();
                if (ftj_03.getX() != n || ftj_03.getY() < n2 && ftj_03.getY() + ftj_03.getHeight() < n2 || n2 < ftj_03.getY() && n2 + ftj_02.getHeight() < ftj_03.getY()) continue;
                bl = true;
                n -= ftj_02.getWidth();
                if (csa_13 != csa_12) continue block0;
                n -= ftj_02.getWidth();
                continue block0;
            }
            bl = false;
        } while (bl && n4++ < 20);
        return n;
    }

    @Override
    public void addFromXML(fyb_0 fyb_02) {
        if (fyb_02 instanceof fsM && a.equals(fyb_02.getId())) {
            this.v = (fsM)fyb_02;
        } else if (fyb_02 instanceof fsk_0 && b.equals(fyb_02.getId())) {
            this.u = (fsk_0)fyb_02;
            this.u.setVisible(false);
            super.addFromXML(fyb_02);
        } else if (fyb_02 instanceof fil_1 && e.equals(fyb_02.getId())) {
            this.m = (fil_1)fyb_02;
        } else if (fyb_02 instanceof faf_2 && d.equals(fyb_02.getId())) {
            this.o.a((faf_2)fyb_02);
        } else if (fyb_02 instanceof faf_2 && c.equals(fyb_02.getId())) {
            this.n.a((faf_2)fyb_02);
        } else {
            super.addFromXML(fyb_02);
        }
    }

    public void a(int n, csa_1 csa_12) {
        this.p.add(n, csa_12.cn());
        this.q.add(csa_12.cn());
        this.w = true;
        this.setNeedsToPreProcess();
        if (this.r.size() < this.p.size()) {
            ftj_0 ftj_02 = new ftj_0();
            ftj_02.onCheckOut();
            ftj_02.setNonBlocking(this.m_nonBlocking);
            ftj_02.setRendererManager(this.n);
            ftj_02.setEnableDND(false);
            ftj_02.setEnabled(this.m_enabled);
            ftj_02.setNetEnabled(this.m_netEnabled);
            this.r.add(n, ftj_02);
            this.add(ftj_02);
            ftj_02.setContentProperty("timePointBar" + csa_12.a_(), null);
            ftj_02.setContent(csa_12);
            ftj_0 ftj_03 = new ftj_0();
            ftj_03.onCheckOut();
            ftj_03.setNonBlocking(this.m_nonBlocking);
            ftj_03.setRendererManager(this.o);
            ftj_03.setEnableDND(false);
            ftj_03.setEnabled(this.m_enabled);
            ftj_03.setNetEnabled(this.m_netEnabled);
            this.s.add(n, ftj_03);
            this.add(ftj_03);
            ftj_03.setContentProperty("timePointBar" + csa_12.a_(), null);
            ftj_03.setContent(csa_12);
        }
    }

    public void a(csa_1 csa_12) {
        int n = this.getFighterIndex(csa_12);
        if (n == -1) {
            return;
        }
        this.q.remove(this.p.remove(n));
        this.r.remove(n).destroySelfFromParent();
        this.s.remove(n).destroySelfFromParent();
        this.w = true;
        this.setNeedsToPreProcess();
    }

    private int getFighterIndex(csa_1 csa_12) {
        int n = this.p.size();
        for (int k = 0; k < n; ++k) {
            if (this.p.get(k).m() != csa_12) continue;
            return k;
        }
        return -1;
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
        if (string.equals(h)) {
            if (n >= 0 && n < this.t.size()) {
                return this.t.get(n);
            }
            return null;
        }
        if (string.equals(j)) {
            if (n >= 0 && n < this.s.size()) {
                return this.s.get(n);
            }
            return null;
        }
        if (string.equals(i)) {
            if (n >= 0 && n < this.r.size()) {
                return this.r.get(n);
            }
            return null;
        }
        return null;
    }

    ckq_2 getDecorator() {
        ArrayList<fyb_0> arrayList = this.getAppearance().getChildren();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            fyb_0 fyb_02 = arrayList.get(k);
            if (!(fyb_02 instanceof ckq_2)) continue;
            return (ckq_2)fyb_02;
        }
        return null;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        int n = this.r.size();
        for (int k = 0; k < n; ++k) {
            this.r.get(k).setEnabled(bl);
            this.s.get(k).setEnabled(bl);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        int n = this.r.size();
        for (int k = 0; k < n; ++k) {
            this.r.get(k).setNetEnabled(bl);
            this.s.get(k).setNetEnabled(bl);
        }
    }

    public void setContent(csd_1 csd_12) {
        if (this.k == csd_12) {
            return;
        }
        this.k = csd_12;
        this.k.a(this);
        this.E = this.k.a().a();
        this.w = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public fvE getWidget(int n, int n2) {
        if (this.m_unloading || !this.m_visible || !this.getAppearance().a(n, n2)) {
            return null;
        }
        fvE fvE2 = super.getWidget(n, n2);
        if (fvE2 == this || fvE2 == null) {
            n -= this.getAppearance().getLeftInset();
            n2 -= this.getAppearance().getBottomInset();
            int n3 = this.getDecorator().getMesh().f().d();
            int n4 = this.getDecorator().getMesh().f().e();
            int n5 = this.getAppearance().getContentWidth() - n4;
            int[] nArray = this.getDecorator().getPixelSeparations();
            if (nArray != null) {
                for (int k = 0; k < nArray.length; ++k) {
                    int n6 = nArray[k];
                    if (n <= n5 || n >= n4 + n5 || n2 <= n6 - n3 || n2 >= n6) continue;
                    fvE2 = this.t.get(k);
                    break;
                }
            }
        }
        return fvE2;
    }

    public void a(csb_1 csb_12, int n) {
        this.w = true;
        this.setNeedsToPreProcess();
    }

    private void d() {
        if (this.k == null) {
            return;
        }
        List<csa_1> list = this.k.L();
        int n = list.size();
        for (int k = n - 1; k >= 0; --k) {
            csa_1 object = list.get(k);
            int n2 = this.getFighterIndex(object);
            if (n2 != -1) continue;
            this.a(n - k - 1, object);
        }
        for (csb_1 csb_12 : this.p) {
            csa_1 csa_12 = csb_12.m();
            if (list.contains(csa_12)) continue;
            this.a(csa_12);
        }
    }

    public void a() {
    }

    public void b(csa_1 csa_12) {
    }

    public void c(csa_1 csa_12) {
        this.a(csa_12);
    }

    public void b() {
        this.u.setVisible(true);
    }

    public void c() {
        this.E = this.k.J();
        this.d();
        this.w = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    public void d(csa_1 csa_12) {
    }

    public void e(csa_1 csa_12) {
        this.w = true;
        this.setNeedsToPreProcess();
    }

    void e() {
        int n;
        this.q.sort(ckz_2.a);
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (int k = this.p.size() - 1; k >= 0; --k) {
            csb_1 csb_12 = this.p.get(k);
            tIntHashSet.add(csb_12.k());
        }
        int[] nArray = tIntHashSet.toArray();
        Arrays.sort(nArray);
        this.x = nArray;
        int n2 = -1;
        int n3 = -1;
        this.y = new int[this.x.length];
        this.z = new int[this.x.length];
        int n4 = this.q.size();
        for (n = 0; n < n4; ++n) {
            csb_1 csb_13 = this.q.get(n);
            if (csb_13.k() != n2) {
                n2 = csb_13.k();
                this.y[++n3] = n;
            }
            int n5 = n3;
            this.z[n5] = this.z[n5] + 1;
        }
        this.B = this.A;
        if (this.x.length != 0) {
            n = 1;
            int n6 = this.x.length - 1;
            for (n4 = 0; n4 < n6; ++n4) {
                if (this.x[n4] + 1 == this.x[n4 + 1]) continue;
                ++n;
            }
            this.A = new int[n + this.x.length];
            this.C = new int[n + this.x.length];
            this.D = new int[n + this.x.length];
            n4 = 0;
            int n7 = this.x.length;
            for (n6 = 0; n6 < n7; ++n6) {
                this.A[n4] = this.x[n6];
                this.C[n4] = this.y[n6];
                this.D[n4] = this.z[n6];
                if (this.x.length == n6 + 1 || this.x[n6] + 1 != this.x[n6 + 1]) {
                    this.A[++n4] = this.x[n6] + 1;
                    this.C[n4] = -1;
                    this.D[n4] = 0;
                }
                ++n4;
            }
        } else {
            this.A = new int[0];
            this.C = new int[0];
            this.D = new int[0];
        }
        n = Math.max(this.A.length, this.B.length);
        while (this.t.size() > n) {
            this.t.remove(this.t.size() - 1).destroySelfFromParent();
        }
        n4 = 0;
        while (this.t.size() < n) {
            fsM fsM2 = (fsM)this.v.cloneElementStructure();
            fsM2.setNonBlocking(true);
            fqh_0 fqh_02 = fsM2.getAppearance();
            fqh_02.setAlign(frs_0.e);
            this.add(fsM2);
            this.t.add(fsM2);
            n4 = 1;
        }
        if (n4 != 0) {
            int n8;
            for (n8 = this.t.size() - 1; n8 >= 0; --n8) {
                this.m_widgetChildren.remove(this.t.get(n8));
            }
            for (n8 = this.t.size() - 1; n8 >= 0; --n8) {
                this.m_widgetChildren.add(0, (fvE)this.t.get(n8));
            }
        }
        this.w = false;
    }

    private int getDisplayedTurnsNumber() {
        if (this.x == null || this.x.length == 0) {
            return 0;
        }
        int n = 1;
        int n2 = this.x.length - 1;
        for (int k = 0; k < n2; ++k) {
            if (this.x[k] + 1 == this.x[k + 1]) continue;
            ++n;
        }
        return this.x.length + n;
    }

    fjf_2 f() {
        ckq_2 ckq_22 = this.getDecorator();
        ckr_2 ckr_22 = ckq_22.getMesh();
        int n = 0;
        int n2 = 0;
        n2 = Math.max(n2, ckr_22.c().e());
        n += ckr_22.c().d();
        n2 = Math.max(n2, ckr_22.e().e());
        int n3 = this.getDisplayedTurnsNumber();
        n2 = Math.max(n2, ckr_22.f().e());
        n += ckr_22.f().d() * n3;
        n2 = Math.max(n2, ckr_22.d().e());
        return new fjf_2(n2, n += ckr_22.d().d());
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.w) {
            this.e();
            this.invalidateMinSize();
        }
        return bl;
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.setNeedsToResetMeshes();
        fis_1.a().a("fight.describedTimePointBonus", this.l);
        this.addEventListener(frd_0.y, new ckx_2(this), true);
        this.addEventListener(frd_0.z, new cky_2(this), true);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.n = null;
        this.r.clear();
        this.r = null;
        this.l = null;
        this.q.clear();
        this.q = null;
        this.p.clear();
        this.p = null;
        this.t.clear();
        this.t = null;
        this.k = null;
        this.u = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.m_invalidateOnMinSizeChange = true;
        this.n = new fag_2();
        this.o = new fag_2();
        this.l = (csc_1)Gy.a().b(csc_1.class).get();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.s = new ArrayList();
        this.r = new ArrayList();
        this.t = new ArrayList();
        this.A = new int[0];
        this.B = new int[0];
        this.F = false;
        this.setNonBlocking(false);
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        this.add(fic_12);
        ckd_2 ckd_22 = new ckd_2(this);
        ckd_22.onCheckOut();
        this.add(ckd_22);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != g) {
            return super.setPropertyAttribute(n, object);
        }
        this.setContent((csd_1)object);
        return true;
    }
}

