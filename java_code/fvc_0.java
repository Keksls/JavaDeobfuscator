/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fvC
 */
public class fvc_0
extends fso
implements YR,
frN,
fzu {
    public static final String TAG = "WatcherContainer";
    protected YQ j;
    protected boolean k = true;
    private frs_0 a = null;
    int b = 0;
    int c = 0;
    private boolean d = true;
    protected fvD l;
    public static final int m = 92903173;
    public static final int n = "target".hashCode();
    public static final int o = -636864651;
    public static final int p = 1485313835;
    public static final int q = -1922149780;

    public fvD getWatcherContainerAdviser() {
        return this.l;
    }

    protected void a(int n, float f2) {
    }

    @Override
    public int e() {
        return zd_0.a().a(this.l);
    }

    @Override
    public void f() {
    }

    @Override
    public float getWorldX() {
        if (this.j != null) {
            return this.j.J();
        }
        return 0.0f;
    }

    @Override
    public float getWorldY() {
        if (this.j != null) {
            return this.j.K();
        }
        return 0.0f;
    }

    @Override
    public float getAltitude() {
        if (this.j != null) {
            return this.j.L();
        }
        return 0.0f;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public frs_0 getAlign() {
        return this.a;
    }

    public void setAlign(frs_0 frs_02) {
        this.a = frs_02;
    }

    public YQ getTarget() {
        return this.j;
    }

    public void setTarget(YQ yQ) {
        if (this.j != yQ) {
            if (this.j != null) {
                this.j.b(this);
            }
            this.j = yQ;
            if (this.j != null) {
                this.j.a(this);
            }
        }
        if (this.j != null) {
            this.a(null, this.j.i(), this.j.j(), this.j.k());
        }
    }

    public void setTarget(YQ yQ, int n, int n2) {
        this.b = n;
        this.c = n2;
        if (this.j != null && this.j != yQ) {
            this.j.b(this);
        }
        this.j = yQ;
        if (this.j != null) {
            this.j.a(this);
            this.a(null, this.j.i(), this.j.j(), this.j.k());
        }
    }

    public boolean isUseTargetPositionning() {
        return this.d;
    }

    public void setUseTargetPositionning(boolean bl) {
        this.d = bl;
    }

    @Override
    public int getXOffset() {
        return this.b;
    }

    public void setXOffset(int n) {
        this.b = n;
        if (this.j != null) {
            this.a(null, this.j.i(), this.j.j(), this.j.k());
        }
    }

    @Override
    public int getYOffset() {
        return this.c;
    }

    public void setYOffset(int n) {
        this.c = n;
        if (this.j != null) {
            this.a(null, this.j.i(), this.j.j(), this.j.k());
        }
    }

    public void setOffset(int n, int n2) {
        this.b = n;
        this.c = n2;
        if (this.j != null && this.j.l()) {
            this.a(null, this.j.i(), this.j.j(), this.j.k());
        }
    }

    @Override
    public void setPosition(int n, int n2) {
        if (!this.d) {
            super.setPosition(n, n2);
        }
    }

    @Override
    public void setPosition(int n, int n2, boolean bl) {
        if (!this.d) {
            super.setPosition(n, n2, bl);
        }
    }

    @Override
    public void setPosition(Point point) {
        if (!this.d) {
            super.setPosition(point);
        }
    }

    @Override
    public void setX(int n) {
        if (!this.d) {
            super.setX(n);
        }
    }

    @Override
    public void setY(int n) {
        if (!this.d) {
            super.setY(n);
        }
    }

    @Override
    public void setTargetIsVisible(boolean bl) {
        this.k = bl;
    }

    protected void bi_() {
        this.setVisible(this.k);
    }

    @Override
    public void removedFromWidgetTree() {
        super.removedFromWidgetTree();
        if (this.j != null) {
            this.j.b(this);
        }
    }

    @Override
    public void a(YQ yQ, int n, int n2, int n3) {
        if (this.d) {
            afe_1 afe_12 = this.getComputedPosition(n, n2, n3);
            if (afe_12.a() == 0 && afe_12.b() == 0) {
                return;
            }
            super.setPosition(afe_12.a(), afe_12.b(), true);
        }
    }

    protected final int getHalfDisplayWidth() {
        return fta_0.getInstance().getWidth() / 2;
    }

    protected final int getHalfDisplayHeight() {
        return fta_0.getInstance().getHeight() / 2;
    }

    public afe_1 getPositionWithOutOfScreen(int n, int n2, int n3) {
        return this.getComputedPosition(n, n2, n3, false);
    }

    public afe_1 getComputedPosition(int n, int n2, int n3) {
        return this.getComputedPosition(n, n2, n3, true);
    }

    private afe_1 getComputedPosition(int n, int n2, int n3, boolean bl) {
        float f2 = fpm_0.b().j().I();
        float f3 = this.l.o();
        int n4 = (int)((float)(this.getHalfDisplayWidth() - this.a.a(this.getWidth())) + ((float)n + (float)this.b * f3) / f2);
        int n5 = (int)((float)this.getHalfDisplayHeight() + ((float)(this.a.b(n3) + n2) + (float)this.c * f3) / f2);
        if (!bl) {
            return new afe_1(n4, n5);
        }
        int n6 = Hw.a(n4, 0, this.m_containerParent.getAppearance().getContentWidth() - this.m_size.width);
        int n7 = Hw.a(n5, 0, this.m_containerParent.getAppearance().getContentHeight() - this.m_size.height);
        return new afe_1(n6, n7);
    }

    @Override
    public void validate() {
        super.validate();
        if (this.j != null) {
            this.a(null, this.j.i(), this.j.j(), this.j.k());
        }
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2.f() != frd_0.P) {
            return false;
        }
        if (this.j != null) {
            this.a(null, this.j.i(), this.j.j(), this.j.k());
        }
        return false;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        zd_0.a().b(this.l);
        this.a = null;
        this.j = null;
        this.l = null;
        fta_0.getInstance().removeEventListener(frd_0.P, this, false);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.setVisible(true);
        this.d = true;
        this.a = frs_0.b;
        this.l = new fvD(this);
        fta_0.getInstance().addEventListener(frd_0.P, this, false);
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fvc_0 fvc_02 = (fvc_0)fyo2;
        fvc_02.setUseTargetPositionning(this.isUseTargetPositionning());
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 92903173) {
            this.setAlign(frs_0.a(string));
        } else if (n == -636864651) {
            this.setUseTargetPositionning(Co.a(string));
        } else if (n == 1485313835) {
            this.setXOffset(Co.c(string));
        } else if (n == -1922149780) {
            this.setYOffset(Co.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 92903173) {
            this.setAlign((frs_0)((Object)object));
        } else if (n == -636864651) {
            this.setUseTargetPositionning(Co.b(object));
        } else if (n == 1485313835) {
            this.setXOffset(Co.c(object));
        } else if (n == -1922149780) {
            this.setYOffset(Co.c(object));
        } else if (n == fvc_0.n) {
            this.setTarget((YQ)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

