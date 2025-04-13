/*
 * Decompiled with CFR 0.152.
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/*
 * Renamed from fsD
 */
public class fsd_0
extends fvE
implements ayp_2,
fqt {
    public static final String TAG = "FlippingImage";
    private final ArrayList<ayo_2> h = new ArrayList();
    fxb_0 i;
    protected frk_0 a = frk_0.i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private fsE o;
    boolean p;
    private boolean q;
    public static final int b = "textures".hashCode();
    public static final int c = -1992012396;
    public static final int d = 1538563234;
    public static final int e = -1984141450;
    public static final int f = -903579675;
    public static final int g = -1156593849;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return true;
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
        if (this.m_entity != null && this.i.n() != null) {
            this.m_entity.a(this.i.n());
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.a = null;
        this.e();
        if (this.i != null) {
            ayo_2 ayo_22 = this.i.f();
            if (ayo_22 != null) {
                ayo_22.b(this);
            }
            this.i.l();
            this.i = null;
        }
    }

    private void e() {
        int n = this.h.size();
        for (int k = 0; k < n; ++k) {
            this.h.get(k).a((ays_2)null);
        }
        this.h.clear();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.i = new fxb_0();
        this.i.m();
        fqj fqj2 = fqj.checkOut();
        fqj2.setWidget(this);
        this.add(fqj2);
    }

    @Override
    public void validate() {
        if (this.i != null) {
            this.f();
            this.i.a(this.m_size, this.m_appearance.getMargin(), this.m_appearance.getBorder(), this.m_appearance.getPadding());
        }
        super.validate();
    }

    public frk_0 getAlign() {
        return this.a;
    }

    public void setAlign(frk_0 frk_02) {
        if (!frk_02.equals((Object)this.a)) {
            this.a = frk_02;
            this.j = true;
            this.setNeedsToPreProcess();
        }
    }

    private void f() {
        if (this.i == null) {
            return;
        }
        ayo_2 ayo_22 = this.i.f();
        if (ayo_22 == null) {
            return;
        }
        this.setMeshBoundsFromComponent(ayo_22.e(), ayo_22.d(), this.m_appearance.getContentWidth(), this.m_appearance.getContentHeight());
    }

    private void setMeshBoundsFromComponent(int n, int n2, int n3, int n4) {
        int n5 = this.a.a(n, n3);
        int n6 = this.a.b(n2, n4);
        this.setMeshBounds(n5, n6, n, n2);
    }

    private void setMeshBounds(int n, int n2, int n3, int n4) {
        this.i.a(n);
        this.i.b(n2);
        this.i.d(n3);
        this.i.c(n4);
    }

    public boolean a() {
        boolean bl = false;
        int n = this.getBiggestWidth();
        int n2 = this.getBiggestHeight();
        if (this.m_minSize == null || this.m_minSize.width != n || this.m_minSize.height != n2) {
            this.setMinSize(new fjf_2(n, n2));
            bl = true;
        }
        return bl;
    }

    private int getBiggestWidth() {
        int n = 0;
        for (ayo_2 ayo_22 : this.h) {
            int n2 = ayo_22.e();
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    private int getBiggestHeight() {
        int n = 0;
        for (ayo_2 ayo_22 : this.h) {
            int n2 = ayo_22.d();
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.q) {
            for (ayo_2 ayo_22 : this.h) {
                if (ayo_22.a().j()) continue;
                return true;
            }
            this.a();
            this.q = false;
        }
        if (this.i != null && (this.j || this.i.f() != null && this.i.f().p())) {
            boolean bl2 = this.a();
            this.f();
            try {
                if (this.m_appearance != null) {
                    this.i.a(this.m_size, this.m_appearance.getMargin(), this.m_appearance.getBorder(), this.m_appearance.getPadding());
                }
            }
            catch (NullPointerException nullPointerException) {
                m_logger.error((Object)("imageMesh = " + this.i + ", appearance = " + this.m_appearance), (Throwable)nullPointerException);
            }
            if (bl2 && this.m_containerParent != null) {
                this.m_containerParent.invalidateMinSize();
            }
            this.j = false;
        }
        return bl;
    }

    public String getShader() {
        return this.i.k();
    }

    public void setShader(String string) {
        this.i.a(string);
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.i != null) {
            this.i.a(azj_22);
        }
    }

    @Override
    public azj_2 getModulationColor() {
        return this.i != null ? this.i.h() : null;
    }

    @Override
    public void a(ayo_2 ayo_22) {
        this.j = true;
        this.setNeedsToPreProcess();
    }

    public void setPixmaps(String[] stringArray) {
        this.e();
        if (stringArray.length == 0) {
            return;
        }
        for (String string : stringArray) {
            this.a(string);
        }
        this.setTextureIndex(0);
        this.a();
        this.q = true;
        this.setNeedsToPreProcess();
    }

    public void setTextures(Iterable<String> iterable) {
        this.h.clear();
        for (String string : iterable) {
            this.a(string);
        }
        this.setTextureIndex(0);
        this.a();
        this.q = true;
        this.setNeedsToPreProcess();
    }

    private void a(String string) {
        try {
            URL uRL = gg_0.d(string);
            if (!cd_0.a(uRL)) {
                m_logger.error((Object)("Impossible de charger la texture=" + string));
                return;
            }
            ays_2 ays_22 = fdo_2.b().a(uRL);
            this.h.add(new ayo_2(ays_22));
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        }
    }

    public void setTextureIndex(int n) {
        this.l = n;
        if (n < 0 || n >= this.h.size()) {
            m_logger.error((Object)("Index de texture inconnu=" + n));
            return;
        }
        this.i.a(this.h.get(n));
        this.j = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public void copyElement(fyo fyo2) {
        fsd_0 fsd_02 = (fsd_0)fyo2;
        super.copyElement(fyo2);
        fsd_02.setAlign(this.a);
        fsd_02.setModulationColor(this.getModulationColor());
        fsd_02.setShader(this.getShader());
        fsd_02.setDuration(this.k);
        fsd_02.setFlipCount(this.m);
        fsd_02.setVertical(this.p);
        fsd_02.m_styleIsDirty = true;
    }

    public void setDuration(int n) {
        this.k = n;
    }

    public void b() {
        if (this.h.isEmpty()) {
            m_logger.error((Object)"Impossible de lancer le flip sans texture !!!");
            return;
        }
        this.n = true;
        this.removeTweensOfType(fsE.class);
        this.o = new fsE(this, Float.valueOf(0.0f), Float.valueOf((float)Math.PI * 2), 0, this.k, fjw_2.a, this.m);
        this.addTween(this.o);
    }

    public void c() {
        this.n = false;
        this.o.a();
        this.removeTweensOfType(fsE.class);
    }

    public void setFlipCount(int n) {
        this.m = n;
        if (this.n) {
            this.c();
        }
    }

    public void setVertical(boolean bl) {
        this.p = bl;
    }

    void g() {
        int n = this.l + 1;
        if (n >= this.h.size()) {
            n = 0;
        }
        this.setTextureIndex(n);
    }

    public void d() {
        this.g();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1992012396) {
            this.setDuration(Co.c(string));
        } else if (n == 1538563234) {
            this.setFlipCount(Co.c(string));
        } else if (n == -1984141450) {
            this.setVertical(Co.a(string));
        } else if (n == -903579675) {
            this.setShader(string);
        } else if (n == -1156593849) {
            this.setModulationColor(fze2.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == b) {
            if (object == null || object instanceof String[]) {
                this.setPixmaps((String[])object);
                return true;
            } else {
                if (!(object instanceof Iterable)) return false;
                this.setTextures((Iterable)object);
            }
            return true;
        } else if (n == -1992012396) {
            this.setDuration(Co.c(object));
            return true;
        } else if (n == 1538563234) {
            this.setFlipCount(Co.c(object));
            return true;
        } else if (n == -1984141450) {
            this.setVertical(Co.b(object));
            return true;
        } else {
            if (n != -903579675) return super.setPropertyAttribute(n, object);
            this.setShader(Co.a(object));
        }
        return true;
    }
}

