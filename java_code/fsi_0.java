/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsI
 */
public class fsi_0
extends fvE {
    public static final String TAG = "graph";
    private fws_0 c;
    private fjf_2 d = null;
    private boolean e = false;
    private boolean f = false;
    private fsj_0 g = null;
    public static final int a = "content".hashCode();
    public static final int b = -917611389;

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
        this.m_entity.a(this.c.h());
    }

    public void setContent(fsj_0 fsj_02) {
        this.g = fsj_02;
        this.c.a(fsj_02);
        this.f = true;
        this.e = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    public void setCellSize(fjf_2 fjf_22) {
        this.d = fjf_22;
        this.c.c(this.d.width);
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return true;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void a() {
        this.c.a();
    }

    private boolean b() {
        int n = this.g != null ? this.g.c().size() : 0;
        int n2 = this.d.width * n;
        int n3 = this.d.height;
        fjf_2 fjf_22 = this.getContentMinSize();
        if (fjf_22.width == n2 || fjf_22.height == n3) {
            return false;
        }
        this.setMinSize(new fjf_2(n2, n3));
        this.e = false;
        return true;
    }

    @Override
    public void validate() {
        super.validate();
        if (this.c != null) {
            this.c.a(this.m_size, this.m_appearance.getMargin(), this.m_appearance.getBorder(), this.m_appearance.getPadding());
        }
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl;
        boolean bl2 = super.preProcess(n);
        if (this.e && (bl = this.b()) && this.m_containerParent != null) {
            this.m_containerParent.invalidateMinSize();
            this.f = true;
            this.setNeedsToPostProcess();
        }
        return bl2;
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (this.f) {
            this.c.a(this.m_size, this.m_appearance.getMargin(), this.m_appearance.getBorder(), this.m_appearance.getPadding());
            this.f = false;
        }
        return bl;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.g = null;
        this.d = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqj fqj2 = fqj.checkOut();
        fqj2.setWidget(this);
        this.add(fqj2);
        this.c = new fws_0();
        this.c.g();
        this.e = false;
        this.f = false;
        this.d = new fjf_2(0, 0);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != -917611389) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setCellSize(fze2.b(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != a) {
            return super.setPropertyAttribute(n, object);
        }
        this.setContent((fsj_0)object);
        return true;
    }
}

