/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.material.Material;
import java.io.IOException;

public class frO
extends fvE
implements fqt {
    public static final String TAG = "AnimatedElementViewer";
    private static final axt_2 v = new frP();
    private static final axt_2 w = new frQ();
    protected aby_0 a;
    private String x;
    private String y;
    protected float b;
    protected float c;
    protected float d;
    private boolean z;
    private int A;
    private Material B;
    private boolean C = true;
    private atu_1 D = atu_1.a;
    private atu_1 E = null;
    private atp_2 F = atp_2.a;
    private axn_2 G = axn_2.b;
    private axn_2 H = axn_2.f;
    private boolean I = false;
    protected boolean e;
    private boolean J;
    private boolean K = false;
    private boolean L;
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private boolean P;
    private boolean Q = true;
    public static final int f = "animatedElement".hashCode();
    public static final int g = -962590849;
    public static final int h = -735662143;
    public static final int i = "equipment".hashCode();
    public static final int j = -795787204;
    public static final int k = -1548407259;
    public static final int l = -1548407258;
    public static final int m = 109250890;
    public static final int n = 1594237441;
    public static final int o = -1122949950;
    public static final int p = -158227633;
    public static final int q = -1290304399;
    public static final int r = 2129268483;
    public static final int s = -1884319283;
    public static final int t = 1657247819;

    @Override
    public fqb getAppearance() {
        return (fqb)this.m_appearance;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public final String getFilePath() {
        return this.x;
    }

    public final void setFilePath(String string) {
        if (string == null) {
            return;
        }
        this.x = string;
        String string2 = fpm_0.b().z;
        if (string2 == null) {
            return;
        }
        this.a.a(gi_0.k(string));
        Object object = string.startsWith("jar:") || string.startsWith("file:") ? string : string2 + string;
        this.a((String)object);
    }

    private void a(String string) {
        try {
            this.a.a(string, false);
        }
        catch (IOException iOException) {
            m_logger.error((Object)"Unable to load anm file", (Throwable)iOException);
        }
        this.a.a(this.G, this.H);
    }

    public final String getAnimName() {
        return this.y;
    }

    public final void setAnimName(String string) {
        if (string != null) {
            this.y = string;
            this.z = true;
        }
    }

    public abu getAnimatedElement() {
        return this.a;
    }

    public void setAnimatedElement(abu abu2) {
        if (this.a == null) {
            return;
        }
        this.a.a(abu2);
        if (this.C) {
            this.a.B();
        }
        this.e = true;
        this.I = true;
        this.J = true;
    }

    public boolean isForceReloadOnAnimNameChange() {
        return this.M;
    }

    public void setForceReloadOnAnimNameChange(boolean bl) {
        this.M = bl;
    }

    public void setFlipVertical(boolean bl) {
        this.O = bl;
    }

    public void setFlipHorizontal(boolean bl) {
        this.N = bl;
    }

    public float getOffsetX() {
        return this.b;
    }

    public final void setOffsetX(float f2) {
        this.b = f2;
        this.e = true;
    }

    public final float getOffsetY() {
        return this.c;
    }

    public final void setOffsetY(float f2) {
        this.c = f2;
        this.e = true;
    }

    public float getScale() {
        return this.d;
    }

    public void setScale(float f2) {
        this.d = f2;
        this.e = true;
    }

    public int getDirection() {
        return this.A;
    }

    public void setDirection(int n) {
        this.A = n;
        this.J = true;
    }

    public final void setMaterial(Material material) {
        if (material == null) {
            return;
        }
        this.B.a(material);
        this.I = true;
    }

    public void setEquipment(atd_2 atd_22) {
        if (atd_22 == null) {
            return;
        }
        this.D = atd_22.F();
        this.E = atd_22.G();
        this.F = atd_22.H();
        this.K = true;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return true;
    }

    public boolean isUseDefaultMaterial() {
        return this.C;
    }

    public void setUseDefaultMaterial(boolean bl) {
        this.C = bl;
    }

    public void setUseBlendPremult(boolean bl) {
        this.G = bl ? axn_2.b : axn_2.e;
        this.L = true;
    }

    private void setStopped(boolean bl) {
        this.P = bl;
        this.setNeedsToPostProcess();
    }

    public void setCanPlaySound(boolean bl) {
        this.Q = bl;
        this.setNeedsToPostProcess();
    }

    @Override
    public final void onCheckIn() {
        super.onCheckIn();
        if (this.a != null) {
            this.a.R();
            this.a = null;
        }
        this.D = atu_1.a;
        this.F = atp_2.a;
        if (this.B != null) {
            this.B.u();
            this.B = null;
        }
    }

    @Override
    public final void onCheckOut() {
        super.onCheckOut();
        assert (this.a == null);
        this.a = new aby_0(0L);
        this.e = true;
        fqb fqb2 = new fqb();
        fqb2.onCheckOut();
        fqb2.setWidget(this);
        this.add(fqb2);
        this.setNeedsToPostProcess();
        this.G = axn_2.b;
        this.H = axn_2.f;
        this.B = (Material)Material.d.d();
        this.B.a(Material.b);
        this.I = true;
        this.C = true;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = true;
    }

    @Override
    public boolean postProcess(int n) {
        super.postProcess(n);
        if (!this.m_visible) {
            return true;
        }
        this.a();
        if (this.z) {
            this.a.e(this.y);
            if (this.M) {
                this.a.E();
            }
            this.z = false;
        }
        if (this.J) {
            this.a.a(aej_2.a(this.A));
            this.J = false;
        }
        if (this.K) {
            atd_2 atd_22 = this.a.an();
            atd_22.a(this.D, this.E);
            atd_22.a(this.F);
            this.a.C();
            this.K = false;
        }
        if (this.I) {
            this.a.a(this.B);
            this.I = false;
        }
        if (this.L) {
            this.a.a(this.G, this.H);
            this.L = false;
        }
        if (this.a.V() != this.P) {
            this.a.d(this.P);
        }
        if (this.a.M() != this.Q) {
            this.a.b(this.Q);
        }
        this.a.a((ahg_0)null, n);
        return true;
    }

    @Override
    public final void copyElement(fyo fyo2) {
        frO frO2 = (frO)fyo2;
        super.copyElement(frO2);
        frO2.setFilePath(this.x);
        frO2.setOffsetX(this.b);
        frO2.setOffsetY(this.c);
        frO2.setScale(this.d);
        frO2.setDirection(this.A);
        frO2.setMaterial(this.B);
        frO2.setAnimName(this.y);
        frO2.setAnimatedElement(this.a);
        frO2.setForceReloadOnAnimNameChange(this.M);
        frO2.setFlipHorizontal(this.N);
        frO2.setFlipVertical(this.O);
        frO2.setStopped(this.P);
        frO2.setCanPlaySound(this.Q);
        frO2.C = this.C;
        frO2.setNeedsToPostProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -735662143) {
            this.setFilePath(string);
        } else if (n == -795787204) {
            this.setAnimName(string);
        } else if (n == -962590849) {
            this.setDirection(Co.c(string));
        } else if (n == -1548407259) {
            this.setOffsetX(Co.e(string));
        } else if (n == -1548407258) {
            this.setOffsetY(Co.e(string));
        } else if (n == 109250890) {
            this.setScale(Co.e(string));
        } else if (n == 1594237441) {
            this.setUseDefaultMaterial(Co.a(string));
        } else if (n == -1122949950) {
            this.setUseDefaultMaterial(Co.a(string));
        } else if (n == -158227633) {
            this.setForceReloadOnAnimNameChange(Co.a(string));
        } else if (n == -1290304399) {
            this.setFlipHorizontal(Co.a(string));
        } else if (n == 2129268483) {
            this.setFlipVertical(Co.a(string));
        } else if (n == -1884319283) {
            this.setStopped(Co.a(string));
        } else if (n == 1657247819) {
            this.setCanPlaySound(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == f) {
            this.setAnimatedElement((abu)object);
        } else if (n == -735662143) {
            this.setFilePath((String)object);
        } else if (n == -795787204) {
            this.setAnimName((String)object);
        } else if (n == -962590849) {
            this.setDirection(Co.c(object));
        } else if (n == -1548407259) {
            this.setOffsetX(Co.e(object));
        } else if (n == -1548407258) {
            this.setOffsetY(Co.e(object));
        } else if (n == 109250890) {
            this.setScale(Co.e(object));
        } else if (n == i) {
            this.setEquipment((atd_2)object);
        } else if (n == 1594237441) {
            this.setUseDefaultMaterial(Co.b(object));
        } else if (n == -158227633) {
            this.setForceReloadOnAnimNameChange(Co.b(object));
        } else if (n == -1290304399) {
            this.setFlipHorizontal(Co.b(object));
        } else if (n == 2129268483) {
            this.setFlipVertical(Co.b(object));
        } else if (n == -1884319283) {
            this.setStopped(Co.b(object));
        } else if (n == 1657247819) {
            this.setCanPlaySound(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
        Entity entity = this.a.t();
        this.m_entity.a(entity);
        entity.a(v);
        entity.b(w);
    }

    protected void a() {
        Entity entity = this.a.t();
        ayx_2 ayx_22 = (ayx_2)entity.D().c(0);
        ayx_22.a((float)this.m_size.getWidth() / 2.0f + this.b, (float)this.m_size.getHeight() / 2.0f + this.c, 0.0f);
        float f2 = 1.0f;
        if (this.a.an() != null) {
            f2 = this.a.an().p();
        }
        ayx_22.b(this.d / f2 * (this.N ? -1.0f : 1.0f), this.d / f2 * (this.O ? -1.0f : 1.0f), 0.0f);
        entity.D().e();
        this.e = false;
        if (this.B != null && this.I) {
            this.a.a(this.B);
            this.a.u().a(this.a.w());
            this.I = false;
        }
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.a == null || azj_22 == null) {
            return;
        }
        Entity3D entity3D = this.a.u();
        if (entity3D == null) {
            return;
        }
        float[] fArray = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        float[] fArray2 = new float[]{azj_22.q() * azj_22.p(), azj_22.r() * azj_22.p(), azj_22.s() * azj_22.p(), azj_22.p()};
        this.B.d(fArray2);
        this.B.i(fArray);
        this.a.a(this.B);
        entity3D.a(this.a.w());
    }

    @Override
    public azj_2 getModulationColor() {
        float[] fArray = this.a.w().a();
        return new azf_2(fArray[0], fArray[1], fArray[2], fArray[3]);
    }
}

