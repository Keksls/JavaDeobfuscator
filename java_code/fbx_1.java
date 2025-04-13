/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fBx
 */
public class fbx_1
extends fbl_2
implements fqt {
    public static final String TAG = "Particle";
    private int x;
    private int y;
    private frs_0 z;
    private boolean A = false;
    private XulorParticleSystem B;
    private EntityGroup C;
    private fdr_2 D;
    private final aft_2 E = new aft_2(0.0f, 0.0f, 0.0f);
    private boolean F = false;
    private float G = 200.0f;
    private int H;
    private boolean I = true;
    private aft_2 J;
    private String K;
    private int L;
    private float M;
    private azj_2 N;
    private boolean O;
    private int P;
    private int Q;
    public static final int a = 1767875043;
    public static final int b = 3143036;
    public static final int c = 944051414;
    public static final int d = 102865796;
    public static final int f = 636283137;
    public static final int g = 109641799;
    public static final int h = 816164660;
    public static final int i = 1355892107;
    public static final int j = 120;
    public static final int k = 121;
    public static final int u = 3744723;
    public static final int v = -41994714;

    @Override
    public final fbs_1 getMesh() {
        return null;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public final Entity getEntity() {
        return null;
    }

    public final void setFile(String string) {
        this.K = string;
        this.setNeedsToPreProcess();
    }

    public final void setLevel(int n) {
        this.L = n;
        if (this.K != null) {
            this.setNeedsToPreProcess();
        }
    }

    private void a() {
        if (this.B != null) {
            if (this.N != null) {
                this.B.b(this.N.q() * this.N.p(), this.N.r() * this.N.p(), this.N.s() * this.N.p(), this.N.p());
            } else {
                this.B.b(1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        this.N = azj_22;
        this.a();
    }

    @Override
    public azj_2 getModulationColor() {
        return this.N;
    }

    public final void setX(int n) {
        this.x = n;
        this.E.a(this.x);
    }

    public final void setY(int n) {
        this.y = n;
        this.E.b(this.y);
    }

    public final void setAlignment(frs_0 frs_02) {
        this.z = frs_02;
    }

    public final void setUseParentScissor(boolean bl) {
        this.A = bl;
        this.D.a(this.A);
    }

    public void setFollowBorders(boolean bl) {
        this.F = bl;
    }

    public float getZoom() {
        return this.M;
    }

    public void setZoom(float f2) {
        this.M = f2;
        ayx_2 ayx_22 = (ayx_2)this.C.D().c(0);
        ayx_22.b(this.M, this.M, this.M);
        this.C.D().e();
    }

    public void setSpeed(float f2) {
        this.G = f2;
    }

    public void setMoveClockWise(boolean bl) {
        this.I = bl;
    }

    public void setTimeToLive(int n) {
        if (this.H == n) {
            return;
        }
        this.H = n;
        if (this.B != null) {
            this.B.j(n);
        }
    }

    public void setParticleSystem(XulorParticleSystem xulorParticleSystem) {
        if (this.B != null) {
            this.B.u();
        }
        this.B = xulorParticleSystem;
        if (this.B != null) {
            this.B.k_();
            if (this.H > 0) {
                this.B.j(this.H);
            }
        }
        this.a();
    }

    @Override
    public final boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.B != null) {
            if (this.B.an()) {
                this.B.Z();
            }
            this.B.u();
            this.B = null;
            this.C.c();
        }
        this.c();
        this.a();
        return bl;
    }

    @Override
    public final boolean postProcess(int n) {
        EntityGroup entityGroup;
        super.postProcess(n);
        this.C.c();
        this.a(n);
        if (this.B != null && this.B.aw() < 0) {
            this.destroySelfFromParent();
            return false;
        }
        if (this.B != null) {
            this.B.b(this.C);
        }
        if (this.C.C() == null && (entityGroup = this.getParentEntity()) != null) {
            entityGroup.b(this.C);
            entityGroup.a((Entity)this.C);
        }
        if (this.B != null && this.B.aw() < 0) {
            this.destroySelfFromParent();
            return false;
        }
        return true;
    }

    @Override
    public final void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fbx_1 fbx_12 = (fbx_1)fyo2;
        fbx_12.setFile(this.K);
        fbx_12.setAlignment(this.z);
        fbx_12.setFollowBorders(this.F);
        fbx_12.setLevel(this.L);
        fbx_12.setMoveClockWise(this.I);
        fbx_12.setSpeed(this.G);
        fbx_12.setTimeToLive(this.H);
        fbx_12.setUseParentScissor(this.A);
        fbx_12.setX(this.x);
        fbx_12.setY(this.y);
        fbx_12.setParticleSystem(this.B);
        fbx_12.setTurnNumber(this.P);
    }

    @Override
    public void onCheckOut() {
        assert (this.C == null);
        super.onCheckOut();
        this.P = -1;
        this.Q = 0;
        this.O = false;
        this.H = -1;
        this.L = 1;
        this.setNeedsToPostProcess();
        this.C = (EntityGroup)EntityGroup.a.d();
        this.C.p = this;
        this.D = new fdr_2();
        this.C.a(this.D);
        this.C.a(this.D);
        this.C.D().a(new ayx_2());
        this.D.a(this.A);
        this.J = this.I ? new aft_2(1.0f, 0.0f, 0.0f) : new aft_2(-1.0f, 0.0f, 0.0f);
        this.M = 1.0f;
    }

    @Override
    public void onCheckIn() {
        EntityGroup entityGroup;
        super.onCheckIn();
        this.K = null;
        if (this.B != null && this.B.an()) {
            this.B.Z();
            this.B.u();
            this.B = null;
        }
        if ((entityGroup = this.getParentEntity()) != null) {
            entityGroup.b(this.C);
        }
        this.C.c();
        this.C.u();
        this.C = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1767875043) {
            this.setAlignment(frs_0.a(string));
        } else if (n == 3143036) {
            this.setFile(fze2.a(string, this.m_elementMap));
        } else if (n == 944051414) {
            this.setFollowBorders(Co.a(string));
        } else if (n == 102865796) {
            this.setLevel(Co.c(string));
        } else if (n == 636283137) {
            this.setMoveClockWise(Co.a(string));
        } else if (n == 109641799) {
            this.setSpeed(Co.e(string));
        } else if (n == 816164660) {
            this.setTimeToLive(Co.c(string));
        } else if (n == 1355892107) {
            this.setUseParentScissor(Co.a(string));
        } else if (n == 120) {
            this.setX(Co.c(string));
        } else if (n == 121) {
            this.setY(Co.c(string));
        } else if (n == 3744723) {
            this.setZoom(Co.e(string));
        } else if (n == -41994714) {
            this.setTurnNumber(Co.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1767875043) {
            this.setAlignment((frs_0)((Object)object));
        } else if (n == 3143036) {
            this.setFile((String)object);
        } else if (n == 944051414) {
            this.setFollowBorders(Co.b(object));
        } else if (n == 102865796) {
            this.setLevel(Co.c(object));
        } else if (n == 636283137) {
            this.setMoveClockWise(Co.b(object));
        } else if (n == 109641799) {
            this.setSpeed(Co.e(object));
        } else if (n == 816164660) {
            this.setTimeToLive(Co.c(object));
        } else if (n == 1355892107) {
            this.setUseParentScissor(Co.b(object));
        } else if (n == 120) {
            this.setX(Co.c(object));
        } else if (n == 121) {
            this.setY(Co.c(object));
        } else if (n == 3744723) {
            this.setZoom(Co.e(object));
        } else if (n == -41994714) {
            this.setTurnNumber(Co.c(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    private void c() {
        assert (this.B == null) : "Particle system is already initialized";
        if (this.K == null) {
            return;
        }
        String string = fpm_0.b().A + this.K;
        this.B = fdp_2.a().a(string, this.L);
        if (this.B != null) {
            if (this.H > 0) {
                this.B.j(this.H);
            }
            fdq_2.a.a(this.B);
        }
    }

    private void a(int n) {
        fvE fvE2 = this.getParentOfType(fvE.class);
        if (fvE2 == null) {
            return;
        }
        fjf_2 fjf_22 = fvE2.getSize();
        if (this.F) {
            if (!this.O) {
                this.E.a((float)(this.x + this.z.a(fjf_22.width)) / this.M, (float)(this.y + this.z.b(fjf_22.height)) / this.M, 0.0f);
                this.O = true;
            }
            this.a(n, fjf_22.width, fjf_22.height);
        } else {
            this.E.a((float)(this.x + this.z.a(fjf_22.width)) / this.M, (float)(this.y + this.z.b(fjf_22.height)) / this.M, 0.0f);
        }
        if (this.B != null) {
            this.B.a(this.E.a(), this.E.b());
        }
    }

    private void a(int n, int n2, int n3) {
        this.E.a(this.G * (float)n / 1000.0f, this.J);
        if (this.E.a() > (float)n2) {
            this.E.a(n2);
            if (this.E.b() == 0.0f) {
                this.J.a(0.0f, 1.0f, 0.0f);
                this.a(frs_0.i, false);
            } else {
                this.J.a(0.0f, -1.0f, 0.0f);
                this.a(frs_0.c, true);
            }
        } else if (this.E.a() < 0.0f) {
            this.E.a(0.0f);
            if (this.E.b() == 0.0f) {
                this.J.a(0.0f, 1.0f, 0.0f);
                this.a(frs_0.g, true);
            } else {
                this.J.a(0.0f, -1.0f, 0.0f);
                this.a(frs_0.a, false);
            }
        }
        if (this.E.b() > (float)n3) {
            this.E.b(n3);
            if (this.E.a() == 0.0f) {
                this.J.a(1.0f, 0.0f, 0.0f);
                this.a(frs_0.a, true);
            } else {
                this.J.a(-1.0f, 0.0f, 0.0f);
                this.a(frs_0.c, false);
            }
        } else if (this.E.b() < 0.0f) {
            this.E.b(0.0f);
            if (this.E.a() == 0.0f) {
                this.J.a(1.0f, 0.0f, 0.0f);
                this.a(frs_0.g, false);
            } else {
                this.J.a(-1.0f, 0.0f, 0.0f);
                this.a(frs_0.i, true);
            }
        }
    }

    private void a(frs_0 frs_02, boolean bl) {
        if (this.P < 0) {
            return;
        }
        if (bl != this.I) {
            return;
        }
        if (frs_02 != this.z) {
            return;
        }
        ++this.Q;
        if (this.Q >= this.P) {
            this.B.Z();
        }
    }

    public aft_2 getPosition() {
        return this.E;
    }

    private EntityGroup getParentEntity() {
        fvE fvE2 = this.getParentOfType(fvE.class);
        return fvE2 == null ? null : fvE2.getEntity();
    }

    public void setTurnNumber(int n) {
        this.P = n;
    }
}

