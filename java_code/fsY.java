/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.awt.geom.Point2D;
import org.apache.log4j.Logger;

public class fsY
extends fsS<fxc_0> {
    private static final Logger ak = Logger.getLogger(fsY.class);
    public static final String TAG = "map";
    public static final String ac = "internalPopup";
    public static final String ad = "internalPopupTextView";
    public static final String ae = "internalPopupTextEditor";
    public static final String af = "internalPopupValid";
    public static final String ag = "internalPopupCancel";
    private fzp al;
    private fzu am;
    private boolean an = true;
    private boolean ao;
    boolean ap;
    public static final int ah = "knownMaps".hashCode();

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
    }

    public Point2D.Float getMapWidgetZoom() {
        if (this.x == null) {
            return new Point2D.Float(1.0f, 1.0f);
        }
        float f2 = (float)(this.A - this.y) / (float)this.x.e();
        float f3 = (float)(this.B - this.z) / (float)this.x.d();
        float f4 = (float)this.getWidth() / f2;
        float f5 = (float)this.getHeight() / f3;
        float f6 = f4 / (float)this.x.e();
        float f7 = f5 / (float)this.x.d();
        ak.info((Object)("width ratio = " + f6));
        ak.info((Object)("height ratio = " + f7));
        return new Point2D.Float(f6, f7);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fwi_0 getZoneManager() {
        return (fwi_0)this.w;
    }

    public void setKnownMaps(int[] nArray) {
    }

    @Override
    protected void setMeshCenter() {
    }

    @Override
    protected void a() {
        this.ao = true;
        this.ap = true;
        super.a();
    }

    public void setAllMapZonesVisible(boolean bl) {
        this.an = bl;
        ((fxc_0)this.v).a(this.an && this.getZoneManager().f());
        this.D = true;
        this.setNeedsToPostProcess();
    }

    public void setMapZoneVisibleById(int n, boolean bl) {
        if (!this.getZoneManager().a(n, bl)) {
            ak.info((Object)("Impossible de trouver la zone d'id " + n));
        }
        this.D = true;
        this.setNeedsToPostProcess();
    }

    public void setPlayerMapZone(int n, int n2) {
        this.getZoneManager().d(n, n2);
    }

    public fww getSelectedMapZone() {
        return this.getZoneManager().d();
    }

    @Override
    protected void a(int n, int n2) {
        super.a(n, n2);
        int n3 = XZ.a(n);
        int n4 = XZ.b(n2);
        this.getZoneManager().c(n3, n4);
    }

    @Override
    public void validate() {
        super.validate();
        this.ao = true;
        this.getZoneManager().e();
    }

    private boolean l() {
        if (this.ap) {
            fjf_2 fjf_22 = fta_0.getInstance().getSize();
            boolean bl = false;
            float f2 = (float)fjf_22.width * 0.9f;
            float f3 = (float)fjf_22.height * 0.9f;
            float f4 = f2 / f3;
            float f5 = 2.0f;
            if (f4 >= 2.0f) {
                f2 = f3 * 2.0f;
            } else {
                f3 = f2 / 2.0f;
            }
            if (this.m_minSize == null || (float)this.m_minSize.width != f2 || (float)this.m_minSize.height != f3) {
                this.setMinSize(new fjf_2((int)f2, (int)f3));
                bl = true;
            }
            this.ap = false;
            return bl;
        }
        return false;
    }

    private void m() {
        if (!this.ao) {
            return;
        }
        if (this.m_appearance == null) {
            return;
        }
        float f2 = (float)this.m_appearance.getContentWidth() / this.s;
        float f3 = (float)this.m_appearance.getContentHeight() / this.t;
        float f4 = Math.min(f2, f3);
        this.setMinZoom(f4);
        this.setMaxZoom(f4);
        this.ao = false;
        this.D = true;
        float f5 = -this.q * this.h;
        float f6 = -this.r * this.h;
        float f7 = this.n.e(f5, f6);
        float f8 = this.n.f(f5, f6);
        this.setIsoCenterX(f7);
        this.setIsoCenterY(f8);
        this.setIsoCenterZ(0.0f);
    }

    @Override
    protected void c() {
        TLongObjectHashMap tLongObjectHashMap = new TLongObjectHashMap();
        TLongByteHashMap tLongByteHashMap = new TLongByteHashMap();
        this.getZoneManager().a(this.h, (TLongObjectHashMap<azj_2>)tLongObjectHashMap, tLongByteHashMap);
        super.c();
        ((fxc_0)this.v).a((TLongObjectHashMap<azj_2>)tLongObjectHashMap);
        ((fxc_0)this.v).a(tLongByteHashMap);
        ((fxc_0)this.v).a(this.an && this.getZoneManager().f());
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.ap && this.l() && this.m_containerParent != null) {
            this.m_containerParent.invalidateMinSize();
            this.setNeedsToPostProcess();
        }
        return bl;
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (this.G) {
            return bl;
        }
        if (this.F) {
            this.e();
        }
        this.w.b(n);
        if (this.ao) {
            this.m();
        }
        if (this.E) {
            this.b();
        }
        if (this.D) {
            this.j();
        }
        return bl;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.I.clear();
        this.w.b();
        this.w = null;
        fzn.a().a(this.al, true);
        fta_0.getInstance().removeEventListener(frd_0.P, this.am, false);
        this.am = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqs fqs2 = new fqs();
        fqs2.onCheckOut();
        fqs2.setWidget(this);
        this.add(fqs2);
        this.setLayoutManager(null);
        this.v = new fxc_0();
        ((fxc_0)this.v).d();
        ((fxc_0)this.v).a(new azf_2(azf_2.e));
        this.w = new fwi_0((fxc_0)this.v);
        this.an = true;
        this.F = false;
        this.G = false;
        this.g = false;
        this.al = new fzp(this);
        fzn.a().a(this.al);
        this.am = new fsz_0(this);
        fta_0.getInstance().addEventListener(frd_0.P, this.am, false);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != ah) {
            return super.setPropertyAttribute(n, object);
        }
        this.setKnownMaps((int[])object);
        return true;
    }
}

