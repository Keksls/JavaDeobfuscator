/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class fsS<T extends fxe_0>
extends fsv_0
implements fqu {
    private static final int ac = 200;
    public static final String e = "poissonDisk";
    private static final ava_1 ad = new ava_1(new aut_1[0]);
    protected EntityGroup f;
    private aiO ae = aiO.b;
    private fip_1 af;
    protected boolean g = true;
    final fwd_0 ag = new fwd_0();
    private boolean ah;
    protected float h = 1.0f;
    protected float i = 1.0f;
    protected float j = 1.0f;
    protected float k = 1.0f;
    private boolean ak;
    protected boolean l;
    protected fwg_0 m;
    final fwh_0 al = new fwh_0();
    final fwh_0 am = new fwh_0();
    final fwh_0 an = new fwh_0();
    private final HashMap<String, ays_2> ao = new HashMap();
    private final fwf_0 ap = new fwf_0();
    boolean aq;
    protected ahg_0 n;
    protected boolean o;
    protected boolean p;
    private float ar;
    private boolean as;
    protected float q;
    protected float r;
    protected float s;
    protected float t;
    protected ayo_2 u;
    protected T v;
    protected fwu<T> w;
    protected ayo_2 x;
    protected int y;
    protected int z;
    protected int A;
    protected int B;
    protected ays_2 C;
    protected boolean D;
    protected boolean E;
    protected boolean F;
    protected boolean G;
    protected String H;
    protected final ArrayList<fsw_0> I = new ArrayList();
    private long at;
    public static final int J;
    public static final int K;
    public static final int L;
    public static final int M = 1650396766;
    public static final int N = 1650396767;
    public static final int O = 1650396768;
    public static final int P = -1179317609;
    public static final int Q = 844294999;
    public static final int R = 1064092997;
    public static final int S = -910230938;
    public static final int T = 1641242935;
    public static final int U = -1372042101;
    public static final int V = 420023546;
    public static final int W = -2122168210;
    public static final int X = -20604672;
    public static final int Y = -1636742325;
    public static final int Z = 836595617;
    public static final int aa;

    public String getMapAnmPath() {
        return this.H;
    }

    public void setMapAnmPath(String string) {
        this.H = string;
    }

    public void a(fwA fwA2) {
        fwz fwz2 = fwi_0.a(fwA2, this.h, this.q, this.r, this.H);
        this.w.a(fwA2.j(), fwz2);
        ((fxe_0)this.v).a(fwA2.j(), fwz2);
        this.D = true;
        this.setNeedsToPostProcess();
    }

    public void a(int n) {
        this.w.a(n);
        this.F = true;
        this.setNeedsToPostProcess();
    }

    public void d() {
        this.w.a();
        this.F = true;
        this.setNeedsToPostProcess();
    }

    protected void e() {
        this.w.c();
        this.F = false;
        this.D = true;
    }

    protected void b() {
        this.w.a(this.h, this.q, this.r);
        this.D = true;
        this.E = false;
    }

    public void setMapBackgroundPixmap(ayo_2 ayo_22) {
        this.x = ayo_22;
        this.G = true;
        this.setNeedsToPreProcess();
    }

    public ayo_2 getMapBackgroundPixmap() {
        return this.x;
    }

    public int getMapBackgroundStartX() {
        return this.y;
    }

    public int getMapBackgroundStartY() {
        return this.z;
    }

    public int getMapBackgroundEndX() {
        return this.A;
    }

    public int getMapBackgroundEndY() {
        return this.B;
    }

    public void setMapBackgroundStartX(int n) {
        this.y = n;
    }

    public void setMapBackgroundStartY(int n) {
        this.z = n;
    }

    public void setMapBackgroundEndX(int n) {
        this.A = n;
    }

    public void setMapBackgroundEndY(int n) {
        this.B = n;
    }

    @Override
    public void setPixmap(fqv fqv2) {
        if (fqv2 == null) {
            return;
        }
        String string = fqv2.getName();
        if (string == null || !string.equals(e)) {
            return;
        }
        ayo_2 ayo_22 = fqv2.getPixmap();
        if (ayo_22 != null && ayo_22.p()) {
            ayo_22.q();
        }
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
    }

    @Override
    public azj_2 getModulationColor() {
        return null;
    }

    protected void f() {
        if (this.x != null) {
            float f2 = (float)(this.A - this.y) / (float)this.x.e();
            float f3 = (float)(this.B - this.z) / (float)this.x.d();
            float f4 = this.s / f2;
            float f5 = this.t / f3;
            float f6 = -f4 * (float)this.y / (float)this.x.e();
            float f7 = -f5 * (float)this.z / (float)this.x.d();
            ((fxe_0)this.v).a((int)f6, (int)f7, (int)f4, (int)f5);
        }
    }

    public void a(fsw_0 fsw_02) {
        this.I.add(fsw_02);
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.G) {
            boolean bl2;
            boolean bl3 = this.x != null && this.x.a().j();
            boolean bl4 = this.u != null && this.u.a().j() || this.l;
            boolean bl5 = bl2 = this.C == null || this.C.j();
            if (!(bl3 && bl4 && bl2)) {
                return true;
            }
            if (this.u != null) {
                ((fxe_0)this.v).a(this.u);
            }
            ((fxe_0)this.v).a(this.C);
            if (this.x != null) {
                ((fxe_0)this.v).b(this.x);
            }
            for (int k = this.I.size() - 1; k >= 0; --k) {
                this.I.get(k).a();
            }
            this.G = false;
            this.D = true;
            this.setNeedsToPreProcess();
            this.setNeedsToPostProcess();
        }
        return bl;
    }

    @Override
    public fqs getAppearance() {
        return (fqs)this.m_appearance;
    }

    private boolean a(EntitySprite entitySprite, fjh_1 fjh_12) {
        ays_2 ays_22 = this.getMeshTexture(fjh_12.a());
        if (ays_22 != null) {
            if (ays_22.s()) {
                return false;
            }
            azr_2 azr_22 = ays_22.a(0);
            afe_1 afe_12 = ays_22.w();
            int n = afe_12.a();
            int n2 = afe_12.b();
            entitySprite.a(ays_22);
            entitySprite.b(0.0f, 0.0f, (float)n2 / (float)azr_22.b(), (float)n / (float)azr_22.a());
        }
        return true;
    }

    void a(ahg_0 ahg_02, fjg_1 fjg_12, EntitySprite entitySprite, EntitySprite entitySprite2, float f2, float f3, afd_1 afd_12, boolean bl, boolean bl2) {
        XulorParticleSystem xulorParticleSystem;
        int n;
        int n2;
        int n3;
        int n4;
        fjh_1 fjh_12;
        if (!fjg_12.t()) {
            return;
        }
        if (this.at == -1L || fjg_12.d() != this.at) {
            return;
        }
        if (fjg_12.d(0.05f)) {
            fjg_12.a(this.getIsoValue(fjg_12.a(), fjg_12.l(), bl2));
            fjg_12.b(this.getIsoValue(fjg_12.b(), fjg_12.k(), bl2));
            fjg_12.c(this.getIsoValue(fjg_12.c(), fjg_12.m(), bl2));
        }
        boolean bl3 = this.m != null && this.m.b == entitySprite;
        int n5 = 3;
        int n6 = 3;
        int n7 = 3;
        boolean bl4 = this.as && fjg_12.g() != null;
        fjh_1 fjh_13 = fjh_12 = bl4 ? fjg_12.g() : fjg_12.f();
        if (fjh_12 == null || !this.a(entitySprite, fjh_12)) {
            return;
        }
        afe_1 afe_12 = entitySprite.d().w();
        n5 = afe_12.a();
        n6 = n7 = afe_12.b();
        int n8 = 3;
        int n9 = 3;
        int n10 = 3;
        fjh_1 fjh_14 = fjg_12.h();
        if (fjh_14 != null && this.a(entitySprite2, fjh_14)) {
            entitySprite2.b(true);
            afe_1 afe_13 = entitySprite2.d().w();
            n8 = afe_13.a();
            n9 = n10 = afe_13.b();
        } else {
            entitySprite2.b(false);
        }
        float f4 = ahg_02.c(fjg_12.a(), fjg_12.b()) - afd_12.a();
        float f5 = ahg_02.a(fjg_12.a(), fjg_12.b(), fjg_12.c()) - afd_12.b();
        int n11 = (int)(f4 + (float)this.getAppearance().getContentWidth() / 2.0f);
        int n12 = (int)(f5 + (float)this.getAppearance().getContentHeight() / 2.0f);
        int n13 = (int)(f4 * 1.05f + (float)this.getAppearance().getContentWidth() / 2.0f);
        int n14 = (int)(f5 * 1.05f + (float)this.getAppearance().getContentHeight() / 2.0f);
        boolean bl5 = this.getAppearance().getShape().a(n13, n14, this.getWidth(), this.getHeight());
        if (!bl5 && bl) {
            n3 = n4 = this.getAppearance().getOnScreenX(n11, n12) - (int)((float)this.getAppearance().getContentWidth() / 2.0f);
            n = n2 = this.getAppearance().getOnScreenY(n11, n12) - (int)((float)this.getAppearance().getContentHeight() / 2.0f);
        } else {
            n3 = n4 = (int)f4;
            n = n2 = (int)f5;
        }
        if (bl3 && fjg_12.q()) {
            n5 = (int)((double)n5 * 1.2);
            n6 = (int)((double)n6 * 1.2);
            n8 = (int)((double)n8 * 1.2);
            n9 = (int)((double)n9 * 1.2);
        }
        if (!bl4) {
            n5 = (int)((float)n5 * this.ar);
            n6 = (int)((float)n6 * this.ar);
            n8 = (int)((float)n8 * this.ar);
            n9 = (int)((float)n9 * this.ar);
        }
        n3 -= (int)((float)n5 * fjh_12.b());
        n += (int)((float)n6 * fjh_12.c());
        if (fjh_14 != null) {
            n4 -= (int)((float)n8 * fjh_14.b());
            n2 = n - 1;
        }
        entitySprite.a((float)((int)(f3 + (float)n)), (float)((int)(f2 + (float)n3)), n5, n6);
        entitySprite2.a((float)((int)(f3 + (float)n2)), (float)((int)(f2 + (float)n4)), n8, n9);
        float[] fArray = fjg_12.i();
        float f6 = 1.0f;
        if (fArray != null && fArray.length == 4) {
            f6 = fArray[3] * (bl && !bl5 ? 0.5f : 1.0f);
        }
        if ((xulorParticleSystem = this.ap.a(fjg_12)) != null) {
            int n15 = n6 - n7;
            xulorParticleSystem.a(f2 + f4, f3 + f5 + (float)n15);
        }
        if (bl || bl5) {
            aug_1 aug_12 = aui_1.a().b();
            if (aug_12.b(aup_1.o)) {
                if (fjg_12.r()) {
                    entitySprite.a(aug_12, aup_1.o, ad);
                    entitySprite2.a(aug_12, aup_1.o, ad);
                } else {
                    entitySprite.a(aug_12, aup_1.d, ad);
                    entitySprite2.a(aug_12, aup_1.d, ad);
                }
            } else if (fjg_12.r()) {
                f6 *= 0.5f;
            }
            entitySprite.a(fArray[0], fArray[1], fArray[2], f6);
            entitySprite2.a(fArray[0], fArray[1], fArray[2], f6);
            this.f.a(entitySprite);
            this.f.a(entitySprite2);
            if (xulorParticleSystem != null) {
                xulorParticleSystem.b(this.f);
            }
        }
    }

    private float getIsoValue(float f2, float f3, boolean bl) {
        return this.ag.a(f2, f3, bl);
    }

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
    }

    @Override
    protected void addInnerMeshes() {
        this.m_entity.a(((fxe_0)this.v).g());
        this.m_entity.a((Entity)this.f);
        super.addInnerMeshes();
    }

    public boolean isDisplayPoints() {
        return this.o;
    }

    public void setDisplayPoints(boolean bl) {
        this.o = bl;
    }

    public boolean isDisplayCompass() {
        return this.p;
    }

    public void setDisplayCompass(boolean bl) {
        this.p = bl;
    }

    public float getIsoCenterX() {
        return this.ag.a();
    }

    public void setIsoCenterX(float f2) {
        this.ag.b(f2);
    }

    public float getIsoCenterY() {
        return this.ag.b();
    }

    public void setIsoCenterY(float f2) {
        this.ag.c(f2);
    }

    public float getIsoCenterZ() {
        return this.ag.c();
    }

    public void setIsoCenterZ(float f2) {
        this.ag.d(f2);
    }

    public boolean getEnableTooltip() {
        return this.g;
    }

    public void setEnableTooltip(boolean bl) {
        this.g = bl;
    }

    public float getZoom() {
        return this.h;
    }

    public float getMinZoom() {
        return this.j;
    }

    public void setMinZoom(float f2) {
        if (f2 > 0.0f && f2 <= 1.0f) {
            this.j = f2;
            this.setZoom();
        }
    }

    public float getMaxZoom() {
        return this.i;
    }

    public void setMaxZoom(float f2) {
        if (f2 > 0.0f && f2 <= 1.0f) {
            this.i = f2;
            this.setZoom();
        }
    }

    public float getZoomScale() {
        return this.k;
    }

    public void setZoomScale(float f2) {
        if (f2 >= 0.0f && f2 <= 1.0f) {
            this.k = f2;
            this.setZoom();
        }
    }

    public void setMapId(long l) {
        this.at = l;
    }

    public aiO getTooltipHotPoint() {
        return this.ae;
    }

    public void setTooltipHotPoint(aiO aiO2) {
        this.ae = aiO2;
    }

    protected void setZoom() {
        this.h = this.j + (this.i - this.j) * this.k;
        assert (this.h > 0.0f && this.h <= 1.0f);
        this.ag.a(this.h);
        this.n.f(86.0f * this.h);
        this.n.g(43.0f * this.h * (float)(this.ah ? 1 : 2));
        this.n.h(10.0f * this.h);
        ((fxe_0)this.v).a(this.h);
        this.D = true;
        this.setNeedsToPostProcess();
    }

    public boolean isIsoMap() {
        return this.ah;
    }

    public void setIsoMap(boolean bl) {
        this.ah = bl;
        this.setZoom();
    }

    private void setList(fwh_0 fwh_02, ArrayList<fjg_1> arrayList) {
        this.ap.a(fwh_02);
        fwh_02.a(arrayList);
    }

    public void a(fjg_1 fjg_12) {
        this.an.a(fjg_12);
    }

    public void b(fjg_1 fjg_12) {
        this.an.b(fjg_12);
        if (this.getOverItem() == fjg_12) {
            this.setOverItem(null);
        }
    }

    public void g() {
        this.an.b();
        this.setOverItem(null);
    }

    private ays_2 getMeshTexture(String string) {
        ays_2 ays_22 = this.ao.get(string);
        if (ays_22 != null) {
            return ays_22;
        }
        ays_22 = fwj_0.a(string);
        this.ao.put(string, ays_22);
        return ays_22;
    }

    @Override
    public fvE getWidget(int n, int n2) {
        if (this.m_unloading || fta_0.getInstance().isMovePointMode()) {
            return null;
        }
        return super.getWidget(n, n2);
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return fqj2 instanceof fqs;
    }

    public void setOnMapClick(fdq_1 fdq_12) {
        this.addEventListener(frd_0.r, fdq_12, true);
    }

    public void setOnMapDoubleClick(fdr_1 fdr_12) {
        this.addEventListener(frd_0.s, fdr_12, true);
    }

    public void setOnMapMove(fds_1 fds_12) {
        this.ak = true;
        this.addEventListener(frd_0.t, fds_12, true);
    }

    public fjg_1 getOverItem() {
        return this.m == null ? null : this.m.a;
    }

    public EntitySprite getOverMesh() {
        return this.m == null ? null : this.m.b;
    }

    public float getLandMarkZoom() {
        return this.ar;
    }

    public void setLandMarkZoom(float f2) {
        this.ar = f2;
    }

    public boolean isUseAlternateTexture() {
        return this.as;
    }

    public void setUseAlternateTexture(boolean bl) {
        this.as = bl;
    }

    protected void h() {
        this.aq = true;
    }

    private boolean a(EntitySprite entitySprite, int n, int n2) {
        if (entitySprite == null) {
            return false;
        }
        int n3 = n - this.m_appearance.getLeftInset();
        int n4 = n2 - this.m_appearance.getBottomInset();
        return this.getAppearance().a(n3, n4) && fwe_0.a(entitySprite, n, n2);
    }

    public fjg_1 getItemUnderMouse(fwh_0 fwh_02, ArrayList<fjg_1> arrayList, int n, int n2) {
        int n3 = this.a(fwh_02, n, n2);
        if (n3 < 0 || n3 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(n3);
    }

    private fwg_0 getMapOverlayPointUnderMouse(int n, int n2) {
        fwg_0 fwg_02;
        fwg_0 fwg_03 = fwg_02 = this.p ? this.getMapOverlayPointUnderMouse(this.am, n, n2) : null;
        if (fwg_02 != null) {
            return fwg_02;
        }
        fwg_0 fwg_04 = fwg_02 = this.o ? this.getMapOverlayPointUnderMouse(this.al, n, n2) : null;
        if (fwg_02 != null) {
            return fwg_02;
        }
        return this.getMapOverlayPointUnderMouse(this.an, n, n2);
    }

    private fwg_0 getMapOverlayPointUnderMouse(fwh_0 fwh_02, int n, int n2) {
        int n3 = this.a(fwh_02, n, n2);
        return fwh_02.d(n3);
    }

    private int a(fwh_0 fwh_02, int n, int n2) {
        for (int k = fwh_02.a() - 1; k >= 0; --k) {
            EntitySprite entitySprite = fwh_02.b(k);
            if (!this.a(entitySprite, n, n2) || this.at == -1L || fwh_02.a(k).d() != this.at) continue;
            return k;
        }
        return -1;
    }

    protected void a(fwg_0 fwg_02) {
    }

    protected void b(fwg_0 fwg_02) {
    }

    protected void a(int n, fwg_0 fwg_02) {
    }

    protected void a(int n, int n2) {
    }

    public afe_1 getIsoMousePosition() {
        int n = fyf_0.a().c() - this.getScreenX();
        int n2 = fyf_0.a().d() - this.getScreenY();
        afd_1 afd_12 = this.getMouseToIso(n, n2);
        return new afe_1((int)afd_12.a(), (int)afd_12.b());
    }

    private void setOverItem(fwg_0 fwg_02) {
        if (this.m != null) {
            this.m.c();
        }
        this.m = fwg_02;
        if (this.m != null) {
            this.m.b();
        }
    }

    public void i() {
        int n = fyf_0.a().c() - this.getScreenX();
        int n2 = fyf_0.a().d() - this.getScreenY();
        this.setOverItem(this.getMapOverlayPointUnderMouse(n, n2));
    }

    void a(fck_2 fck_22) {
        int n;
        int n2 = fck_22.a(this);
        fwg_0 fwg_02 = this.getMapOverlayPointUnderMouse(n2, n = fck_22.b(this));
        if (this.m != fwg_02) {
            if (this.m != null) {
                this.b(this.m);
                this.dispatchEvent(fci_2.a(fck_22, this, frd_0.l, this.m.a, this.m.b));
                this.setOverItem(null);
            }
            if (fwg_02 != null) {
                this.a(fwg_02);
                this.dispatchEvent(fci_2.a(fck_22, this, frd_0.m, fwg_02.a, fwg_02.b));
                this.setOverItem(fwg_02);
            }
        }
        afd_1 afd_12 = this.getMouseToIso(n2, n);
        this.a((int)afd_12.a(), (int)afd_12.b());
        if (this.ak) {
            fcg_2 fcg_22 = fcg_2.a(fck_22, afd_12.a(), afd_12.b(), this.m != null ? this.m.a() : null);
            fcg_22.a(frd_0.t);
            this.dispatchEvent(fcg_22);
        }
    }

    private afd_1 getMouseToIso(int n, int n2) {
        int n3 = -this.m_appearance.getLeftInset() - this.m_appearance.getContentWidth() / 2;
        int n4 = -this.m_appearance.getBottomInset() - this.m_appearance.getContentHeight() / 2;
        return this.ag.a(this.n, n + n3, n2 + n4);
    }

    boolean b(fck_2 fck_22) {
        Object object;
        frd_0 frd_02;
        frd_0 frd_03;
        if (fck_22.f() != frd_0.C && fck_22.f() != frd_0.D) {
            return false;
        }
        int n = fck_22.a(this);
        int n2 = fck_22.b(this);
        if (fck_22.f() == frd_0.C) {
            frd_03 = frd_0.j;
            frd_02 = frd_0.r;
        } else {
            frd_03 = frd_0.k;
            frd_02 = frd_0.s;
        }
        if (this.m != null) {
            object = fci_2.a(fck_22, this, frd_03, this.m.a, this.m.b);
            this.dispatchEvent((fzs)object);
            this.a(fck_22.x(), this.m);
        }
        object = this.getMouseToIso(n, n2);
        this.a((int)((afd_1)object).a(), (int)((afd_1)object).b());
        fcg_2 fcg_22 = fcg_2.a(fck_22, ((afd_1)object).a(), ((afd_1)object).b(), this.m != null ? this.m.a() : null);
        fcg_22.a(frd_02);
        this.dispatchEvent(fcg_22);
        return false;
    }

    private void l() {
        fst_0 fst_02 = new fst_0(this);
        this.addEventListener(frd_0.u, fst_02, false);
        fsu_0 fsu_02 = new fsu_0(this);
        this.addEventListener(frd_0.C, fsu_02, false);
        this.addEventListener(frd_0.D, fsu_02, false);
    }

    public afe_1 isoToScreen(int n, int n2, boolean bl) {
        afd_1 afd_12 = this.ag.a(this.n, n, n2, bl);
        return new afe_1((int)afd_12.a(), (int)afd_12.b());
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.f.u();
        this.f = null;
        this.al.b();
        this.an.b();
        this.am.b();
        this.af.onCheckIn();
        this.af = null;
        this.setOverItem(null);
        this.ap.a();
        this.n.e();
        this.n = null;
        this.k();
        if (this.v != null) {
            ((fxe_0)this.v).c();
            this.v = null;
        }
    }

    protected final void j() {
        if (!this.D) {
            return;
        }
        if (this.m_appearance == null || this.m_appearance.getContentWidth() == 0 || this.m_appearance.getContentHeight() == 0) {
            return;
        }
        this.c();
        this.h();
        this.D = false;
    }

    protected void c() {
        ((fxe_0)this.v).a(this.m_size, this.m_appearance.getMargin(), this.m_appearance.getBorder(), this.m_appearance.getPadding());
    }

    protected final void k() {
        if (this.u != null && this.u.a() != null) {
            this.u.a().u();
        }
        this.u = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqj fqj2 = fqj.checkOut();
        fqj2.setWidget(this);
        this.add(fqj2);
        fin_2 fin_22 = fin_2.checkOut();
        this.add(fin_22);
        assert (this.f == null);
        this.f = (EntityGroup)EntityGroup.a.d();
        this.f.p = this;
        this.f.D().a(new ayx_2());
        this.af = new fip_1();
        this.af.onCheckOut();
        this.ag.d();
        this.g = true;
        this.aq = false;
        this.ar = 1.0f;
        this.as = false;
        this.l();
        this.m();
        this.setNonBlocking(false);
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }

    @Override
    public void validate() {
        super.validate();
        this.ag.a((int)((float)this.m_appearance.getContentWidth() / this.n.w()));
        this.D = true;
        int n = this.I.size();
        for (int k = 0; k < n; ++k) {
            this.I.get(k).b();
        }
    }

    @Override
    public boolean postProcess(int n) {
        super.postProcess(n);
        this.n.k(false);
        this.n.a(this.m_appearance.getContentWidth(), this.m_appearance.getContentHeight());
        this.n.D().a(this.getDisplayX() + this.m_appearance.getLeftInset());
        this.n.D().b(this.getDisplayY() + this.m_appearance.getBottomInset());
        this.n.a(n);
        return true;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fsS fsS2 = (fsS)fyo2;
        fsS2.setIsoCenterX(this.getIsoCenterX());
        fsS2.setIsoCenterY(this.getIsoCenterY());
        fsS2.setIsoCenterZ(this.getIsoCenterZ());
        fsS2.setIsoMap(this.ah);
        fsS2.setMaxZoom(this.getMaxZoom());
        fsS2.setMinSize(this.getMinSize());
        fsS2.setTooltipHotPoint(this.getTooltipHotPoint());
        fsS2.setZoomScale(this.getZoomScale());
        fsS2.setEnableTooltip(this.getEnableTooltip());
        fsS2.setMapId(this.at);
    }

    private void m() {
        assert (this.n == null);
        this.o = true;
        this.p = true;
        this.n = new fsV(this);
        this.n.f(86.0f * this.h);
        this.n.g(43.0f * this.h);
        this.n.k(false);
    }

    public void setMapPath(String string) {
        ath_2 ath_22;
        URL uRL;
        if (this.l) {
            return;
        }
        if (Cz.f(string)) {
            return;
        }
        try {
            uRL = gg_0.d(string);
        }
        catch (MalformedURLException malformedURLException) {
            m_logger.error((Object)("URL invalide : " + string));
            return;
        }
        try {
            ath_22 = fpm_0.b(uRL);
        }
        catch (Exception exception) {
            m_logger.error((Object)("Probl\u00e8me lors de la lecture du fichier de map d'url : " + uRL));
            return;
        }
        this.k();
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 0.0f;
        this.setBaseMapDisplayer();
        ArrayList<? extends aqx_2> arrayList = ath_22.a().k();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            aqx_2 aqx_22 = arrayList.get(k);
            fwj_0 fwj_02 = fwj_0.a(aqx_22);
            if (fwj_02 == null) continue;
            this.s = (float)fwj_02.c;
            this.t = (float)fwj_02.d;
            this.q = (float)fwj_02.a;
            this.r = (float)fwj_02.b;
            ays_2 ays_22 = fwj_0.a(arrayList.get(k), uRL);
            this.a(string, uRL, aqx_22);
            if (ays_22 != null) {
                this.a(fwj_02, ays_22);
            }
            ((fxe_0)this.v).b((int)this.s, (int)this.t);
            this.setMeshCenter();
        }
        this.a();
    }

    protected void a() {
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
        this.E = true;
    }

    protected void setMeshCenter() {
    }

    protected void a(fwj_0 fwj_02, ays_2 ays_22) {
        this.u = fwj_02.a(ays_22);
        this.f();
        this.G = true;
    }

    protected void a(String string, URL uRL, aqx_2 aqx_22) {
        this.C = fwj_0.a(aqx_22, uRL, string);
    }

    protected void setBaseMapDisplayer() {
        ((fxe_0)this.v).a(new fxq_0());
    }

    public void setForceDisplayEntity(boolean bl) {
        this.l = bl;
    }

    public void setMapRect(int n, int n2, int n3, int n4) {
        assert (this.l);
        this.q = n;
        this.r = n2;
        this.s = n3;
        this.t = n4;
        ((fxe_0)this.v).b(n3, n4);
        this.k();
        this.f();
    }

    public void setMapDisplayer(fxp_0 fxp_02) {
        this.setForceDisplayEntity(true);
        ((fxe_0)this.v).a(fxp_02);
        this.a();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 836595617) {
            this.setMapPath(string);
        } else if (n == 1650396766) {
            this.setIsoCenterX(Co.e(string));
        } else if (n == 1650396767) {
            this.setIsoCenterY(Co.e(string));
        } else if (n == 1650396768) {
            this.setIsoCenterZ(Co.e(string));
        } else if (n == -1179317609) {
            this.setIsoMap(Co.a(string));
        } else if (n == -1372042101) {
            this.setOnMapClick(fze2.a(fdq_1.class, string));
        } else if (n == 420023546) {
            this.setOnMapDoubleClick(fze2.a(fdr_1.class, string));
        } else if (n == -2122168210) {
            this.setOnMapMove(fze2.a(fds_1.class, string));
        } else if (n == 844294999) {
            this.setMaxZoom(Co.e(string));
        } else if (n == 1064092997) {
            this.setMinZoom(Co.e(string));
        } else if (n == -910230938) {
            this.setTooltipHotPoint(aiO.a(string));
        } else if (n == -20604672) {
            this.setEnableTooltip(Co.a(string));
        } else if (n == -1636742325) {
            this.setLandMarkZoom(Co.e(string));
        } else if (n == 1641242935) {
            this.setZoomScale(Co.e(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 836595617) {
            this.setMapPath(Co.a(object));
        } else if (n == aa) {
            this.setMapId(Co.f(object));
        } else if (n == J) {
            this.setList(this.al, (ArrayList)object);
        } else if (n == K) {
            this.setList(this.am, (ArrayList)object);
        } else if (n == L) {
            this.setList(this.an, (ArrayList)object);
        } else if (n == 1650396766) {
            this.setIsoCenterX(Co.e(object));
        } else if (n == 1650396767) {
            this.setIsoCenterY(Co.e(object));
        } else if (n == 1650396768) {
            this.setIsoCenterZ(Co.e(object));
        } else if (n == -1179317609) {
            this.setIsoMap(Co.b(object));
        } else if (n == 844294999) {
            this.setMaxZoom(Co.e(object));
        } else if (n == 1064092997) {
            this.setMinZoom(Co.e(object));
        } else if (n == -910230938) {
            this.setTooltipHotPoint((aiO)((Object)object));
        } else if (n == -20604672) {
            this.setEnableTooltip(Co.b(object));
        } else if (n == 1641242935) {
            this.setZoomScale(Co.e(object));
        } else if (n == -1636742325) {
            this.setLandMarkZoom(Co.e(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    static {
        ad.a("gColorScale", 1.0f);
        J = "content".hashCode();
        K = "compassContent".hashCode();
        L = "landMarkContent".hashCode();
        aa = "mapId".hashCode();
    }
}

