/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/*
 * Renamed from fte
 */
public class fte_0
extends fso
implements ayp_2,
fqu {
    public static final String TAG = "multipleImage";
    public static final String a = "internalPopup";
    public static final String b = "internalPopupTextView";
    protected fxf_0 c;
    boolean r = false;
    Point s = null;
    protected boolean d = false;
    protected boolean e = true;
    protected boolean f = false;
    private boolean t = false;
    private boolean u = false;
    protected int g;
    protected int h;
    int v;
    int w;
    protected int i = 0;
    protected int j = 0;
    int x = 0;
    int y = 0;
    boolean z = false;
    boolean A = false;
    private final ArrayList<fjo_1> B = new ArrayList();
    final ArrayList<fjz_1> C = new ArrayList();
    private ayo_2 D = null;
    fjz_1 E = null;
    private fzu F;
    private fzu G;
    private fzu H;
    private fzu I;
    fvE J;
    fuk_0 K;
    ftl_0 L;
    private String M;
    private ftm N;
    public static final int k = "modulationColor".hashCode();
    public static final int l = "imagePath".hashCode();
    public static final int m = -1450345951;
    public static final int n = 370229451;
    public static final int o = 1415534255;
    public static final int p = 498894174;
    public static final int q = -1161348842;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            this.setPixmap((fqv)fyb_02);
        } else if (fyb_02 instanceof fvE && fyb_02.getId().equals(a)) {
            this.J = (fvE)fyb_02;
            this.J.setVisible(false);
        }
        super.add(fyb_02);
    }

    @Override
    protected void addInnerMeshes() {
        if (this.m_entity != null && this.c.j() != null) {
            this.m_entity.a((Entity)this.c.j());
        }
        super.addInnerMeshes();
    }

    public void setImageListener(ftm ftm2) {
        this.N = ftm2;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.c != null) {
            this.c.a(azj_22);
        }
        int n = this.C.size();
        for (int k = 0; k < n; ++k) {
            XulorParticleSystem xulorParticleSystem = this.C.get(k).f();
            if (xulorParticleSystem == null) continue;
            xulorParticleSystem.b(azj_22.q() * azj_22.p(), azj_22.r() * azj_22.p(), azj_22.s() * azj_22.p(), azj_22.p());
        }
    }

    public boolean getManualInnerMove() {
        return this.z;
    }

    public void setManualInnerMove(boolean bl) {
        this.z = bl;
        this.c();
    }

    private void c() {
        frb_0 frb_02 = frb_0.a;
        if (this.z) {
            frb_02 = this.t && !this.u ? frb_0.h : (this.u && !this.t ? frb_0.i : frb_0.c);
        }
        this.setCursorType(frb_02);
    }

    public void setUseInnerMoveTween(boolean bl) {
        this.a();
        if (bl) {
            this.a(0.0f, 1.0f, 0.0f, 1.0f, 5000);
        }
    }

    public boolean getShrinkToImageWidth() {
        return this.u;
    }

    public void setShrinkToImageWidth(boolean bl) {
        this.u = bl;
        this.c();
    }

    public boolean getShrinkToImageHeight() {
        return this.t;
    }

    public void setShrinkToImageHeight(boolean bl) {
        this.t = bl;
        this.c();
    }

    public boolean getToggleInnerMoveOnClick() {
        return this.A;
    }

    public void setToggleInnerMoveOnClick(boolean bl) {
        this.A = bl;
    }

    @Override
    public void setPixmap(fqv fqv2) {
        this.B.clear();
        if (this.c != null) {
            this.c.g();
        }
        this.D = fqv2.getPixmap();
        this.D.a(this);
        fjo_1 fjo_12 = new fjo_1(this.D, 0, 0);
        this.B.add(fjo_12);
    }

    @Override
    public azj_2 getModulationColor() {
        return this.c != null ? this.c.f() : null;
    }

    public int getDeltaX() {
        return this.g;
    }

    public void setDeltaX(int n) {
        int n2 = -(this.x - this.m_appearance.getContentWidth());
        boolean bl = false;
        int n3 = Hw.a(n, n2, 0);
        if (n3 != this.g) {
            this.g = n3;
            this.e = true;
            this.setNeedsToPreProcess();
            if (this.N != null) {
                if (this.g == n2) {
                    this.N.a((byte)2);
                } else if (this.g == 0) {
                    this.N.a((byte)0);
                } else {
                    this.N.a((byte)1);
                }
            }
        }
    }

    public int getDeltaY() {
        return this.h;
    }

    public void setDeltaY(int n) {
        boolean bl = false;
        int n2 = this.y - this.m_appearance.getContentHeight();
        int n3 = Hw.a(n, 0, n2);
        if (n3 != this.h) {
            this.h = n3;
            this.e = true;
            this.setNeedsToPreProcess();
            if (this.N != null) {
                if (this.h == 0) {
                    this.N.b((byte)2);
                } else if (this.h == n2) {
                    this.N.b((byte)0);
                } else {
                    this.N.b((byte)1);
                }
            }
        }
    }

    public String getParticlePath() {
        return this.M;
    }

    public void setParticlePath(String string) {
        this.M = string;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return true;
    }

    public void setImagePath(String string) {
        ath_2 ath_22;
        URL uRL;
        if (string == null) {
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
        this.B.clear();
        if (this.c != null) {
            this.c.g();
        }
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        ArrayList<? extends aqx_2> arrayList = ath_22.a().k();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            int n2;
            aqx_2 aqx_22 = arrayList.get(k);
            if (aqx_22.b().equals("#text") || aqx_22.b().equals("#comment")) continue;
            if (aqx_22.b().equalsIgnoreCase("parameters")) {
                aqx_2 aqx_23 = aqx_22.f("maxWidth");
                if (aqx_23 != null) {
                    this.i = aqx_23.g();
                }
                if ((aqx_23 = aqx_22.f("maxHeight")) != null) {
                    this.j = aqx_23.g();
                }
                if ((aqx_23 = aqx_22.f("totalWidth")) != null) {
                    this.x = aqx_23.g();
                }
                if ((aqx_23 = aqx_22.f("totalHeight")) == null) continue;
                this.y = aqx_23.g();
                continue;
            }
            if (aqx_22.b().equalsIgnoreCase("image")) {
                int n3 = 0;
                n2 = 0;
                ays_2 ays_22 = null;
                aqx_2 aqx_24 = aqx_22.f("x");
                if (aqx_24 != null) {
                    n3 = aqx_24.g();
                }
                if ((aqx_24 = aqx_22.f("y")) != null) {
                    n2 = aqx_24.g();
                }
                if ((aqx_24 = aqx_22.f("texture")) != null) {
                    object4 = aqx_24.c();
                    try {
                        object3 = cd_0.a(uRL, (String)object4);
                        object2 = ((URL)object3).toString();
                        ays_22 = this.a((String)object2);
                    }
                    catch (Exception exception) {
                        m_logger.error((Object)"Probl\u00e8me lors de la r\u00e9cup\u00e9ration de la texture de la map");
                    }
                }
                object4 = new fjo_1(new ayo_2(ays_22), n3, n2);
                this.B.add((fjo_1)object4);
                continue;
            }
            if (!aqx_22.b().equalsIgnoreCase("text")) continue;
            int n4 = 0;
            n2 = 0;
            int n5 = 40;
            int n6 = 40;
            object4 = null;
            object3 = aqx_22.f("x");
            if (object3 != null) {
                n4 = object3.g();
            }
            if ((object3 = aqx_22.f("y")) != null) {
                n2 = object3.g();
            }
            if ((object3 = aqx_22.f("width")) != null) {
                n5 = object3.g();
            }
            if ((object3 = aqx_22.f("height")) != null) {
                n6 = object3.g();
            }
            if ((object3 = aqx_22.f("key")) != null) {
                object4 = object3.c();
            }
            object2 = null;
            if (this.M != null && (object2 = fdp_2.a().a(this.M)) != null) {
                fdq_2.a.a((ParticleSystem)object2);
                ((abp_1)object2).k_();
                ((ParticleSystem)object2).a((float)(n4 + n5 / 2), n2 + n6 / 2);
                ((XulorParticleSystem)object2).b(this.c.k());
                object = this.c.f();
                if (object != null) {
                    ((ParticleSystem)object2).b(object.q() * object.p(), object.r() * object.p(), object.s() * object.p(), object.p());
                }
            }
            object = new fjz_1((String)object4, n4, n2, n5, n6, (XulorParticleSystem)object2);
            this.C.add((fjz_1)object);
        }
        this.f = true;
        this.e = true;
        this.setNeedsToPreProcess();
    }

    private boolean d() {
        boolean bl = false;
        int n = 0;
        int n2 = 0;
        if (this.t) {
            n2 = this.y;
        }
        if (this.u) {
            n = this.x;
        }
        if (this.m_minSize == null || n != this.m_minSize.width || n2 != this.m_minSize.height) {
            this.setMinSize(new fjf_2(n, n2));
            bl = true;
        }
        return bl;
    }

    public void a(float f2, float f3, float f4, float f5, int n) {
        this.removeTweensOfType(ftl_0.class);
        this.L = new ftl_0(this, f2, f3, f4, f5, this, 0, n, fjw_2.b);
        this.L.d(-1);
        this.addTween(this.L);
    }

    public void a() {
        this.removeTweensOfType(ftl_0.class);
    }

    public void setTweenPaused(boolean bl) {
        if (this.L != null) {
            this.L.a(bl);
        }
    }

    public boolean b() {
        return this.L != null;
    }

    private ays_2 a(String string) {
        return ayu_2.a().b((aui_2)auj_1.a.a(), (long)auc_1.d(string), string, false);
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.K = (fuk_0)this.getElementMap().a(b);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.L = null;
        fta_0.getInstance().removeEventListener(frd_0.B, this.G, false);
        this.H = null;
        this.I = null;
        this.G = null;
        this.F = null;
        this.N = null;
        if (this.c != null) {
            this.c.h();
            this.c = null;
        }
        if (this.D != null) {
            this.D.b(this);
            this.D = null;
        }
        this.B.clear();
        this.M = null;
        for (int k = this.C.size() - 1; k >= 0; --k) {
            XulorParticleSystem xulorParticleSystem = this.C.get(k).f();
            if (xulorParticleSystem == null) continue;
            xulorParticleSystem.u();
        }
        this.C.clear();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.setNonBlocking(false);
        this.setLayoutManager(null);
        fqj fqj2 = fqj.checkOut();
        fqj2.setWidget(this);
        this.add(fqj2);
        this.setNeedsToPreProcess();
        this.c = new fxf_0();
        this.c.i();
        this.e();
    }

    @Override
    public void addedToWidgetTree() {
        super.addedToWidgetTree();
        this.m_containerParent.setNeedsScissor(true);
    }

    @Override
    public void validate() {
        if (this.c != null) {
            this.c.a(this.m_size, this.m_appearance.getMargin(), this.m_appearance.getBorder(), this.m_appearance.getPadding());
        }
        if (this.J != null) {
            if (this.E != null) {
                this.J.setVisible(true);
                this.J.setSizeToPrefSize();
                int n = -frs_0.e.a(this.E.d(), this.J.getWidth()) + this.E.b() + this.g;
                int n2 = this.E.c() + this.h + this.E.e();
                this.J.setPosition(n, n2);
            } else {
                this.J.setVisible(false);
            }
        }
        super.validate();
    }

    private void e() {
        this.F = new ftf_0(this);
        this.addEventListener(frd_0.A, this.F, false);
        this.G = new ftg(this);
        fta_0.getInstance().addEventListener(frd_0.x, this.G, false);
        this.H = new fth(this);
        this.addEventListener(frd_0.w, this.H, false);
        this.I = new fti_0(this);
        this.addEventListener(frd_0.u, this.I, false);
        this.addEventListener(frd_0.C, new ftj(this), false);
    }

    boolean isInside(fjz_1 fjz_12, int n, int n2) {
        return fjz_12.b() <= n && fjz_12.b() + fjz_12.d() >= n && fjz_12.c() <= n2 && fjz_12.c() + fjz_12.e() >= n2;
    }

    @Override
    public boolean preProcess(int n) {
        int n2;
        int n3;
        boolean bl = super.preProcess(n);
        boolean bl2 = false;
        boolean bl3 = this.d();
        if (this.d) {
            this.y = this.j = this.D.d();
            this.x = this.i = this.D.e();
            this.setDeltaX(this.g);
            this.setDeltaY(this.h);
            this.d = false;
            this.e = true;
            this.f = true;
        }
        if (this.c != null && this.e) {
            this.c.a(this.g);
            this.c.b(this.h);
            this.c.c(this.j);
            this.c.d(this.i);
            this.e = false;
            bl2 = true;
        }
        if (this.c != null && this.f) {
            this.c.g();
            n3 = this.B.size();
            for (n2 = 0; n2 < n3; ++n2) {
                this.c.a(this.B.get(n2));
            }
            this.f = false;
            bl2 = true;
        }
        n3 = this.C.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.C.get(n2).a(this.g, this.h);
        }
        if (bl2) {
            try {
                if (this.m_appearance != null) {
                    this.c.a(this.m_size, this.m_appearance.getMargin(), this.m_appearance.getBorder(), this.m_appearance.getPadding());
                }
            }
            catch (NullPointerException nullPointerException) {
                m_logger.error((Object)("imageMesh = " + this.c + ", appearance = " + this.m_appearance), (Throwable)nullPointerException);
            }
        }
        if (bl3) {
            this.invalidateMinSize();
        }
        return bl;
    }

    @Override
    public boolean postProcess(int n) {
        super.postProcess(n);
        this.c.k().c();
        int n2 = this.C.size();
        for (int k = 0; k < n2; ++k) {
            XulorParticleSystem xulorParticleSystem = this.C.get(k).f();
            if (xulorParticleSystem == null) continue;
            xulorParticleSystem.b(this.c.k());
        }
        return true;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fte_0 fte_02 = (fte_0)fyo2;
        super.copyElement(fyo2);
        fte_02.removeEventListener(frd_0.x, this.G, false);
        fte_02.removeEventListener(frd_0.w, this.H, false);
        fte_02.removeEventListener(frd_0.u, this.I, false);
        fte_02.removeEventListener(frd_0.A, this.F, false);
        fte_02.setModulationColor(fte_02.getModulationColor());
        fte_02.setManualInnerMove(this.z);
        fte_02.setShrinkToImageWidth(this.u);
        fte_02.setShrinkToImageHeight(this.t);
        fte_02.setToggleInnerMoveOnClick(this.A);
    }

    @Override
    public void a(ayo_2 ayo_22) {
        this.d = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1415534255) {
            this.setShrinkToImageWidth(Co.a(string));
        } else if (n == 498894174) {
            this.setShrinkToImageHeight(Co.a(string));
        } else if (n == -1161348842) {
            this.setToggleInnerMoveOnClick(Co.a(string));
        } else if (n == 370229451) {
            this.setUseInnerMoveTween(Co.a(string));
        } else if (n == -1450345951) {
            this.setManualInnerMove(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1415534255) {
            this.setShrinkToImageWidth(Co.b(object));
        } else if (n == 498894174) {
            this.setShrinkToImageHeight(Co.b(object));
        } else if (n == k) {
            this.setModulationColor((azj_2)object);
        } else if (n == l) {
            this.setImagePath((String)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

