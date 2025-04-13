/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsK
 */
public class fsk_0
extends fvE
implements ayp_2,
fqu {
    public static final String TAG = "Image";
    private static final double a = 0.001;
    protected fxb_0 b;
    protected boolean c = false;
    protected boolean d = false;
    protected boolean e = true;
    protected boolean f = false;
    protected frk_0 g = frk_0.i;
    protected fjf_2 h;
    private boolean t;
    public static final int i = 92903173;
    public static final int j = -928111907;
    public static final int k = 1603825663;
    public static final int l = 1714306019;
    public static final int m = -1344730584;
    public static final int n = 1582813654;
    public static final int o = -954021426;
    public static final int p = -1156593849;
    public static final int q = "pixmap".hashCode();
    public static final int r = -908189606;
    public static final int s = -903579675;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            this.setPixmap((fqv)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
        if (this.m_entity != null && this.b.n() != null) {
            this.m_entity.a(this.b.n());
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fqp getAppearance() {
        return (fqp)this.m_appearance;
    }

    public ayo_2 getPixmap() {
        return this.b != null ? this.b.f() : null;
    }

    public void setPixmap(ayo_2 ayo_22) {
        if (this.b != null) {
            ayo_2 ayo_23 = this.b.f();
            if (ayo_23 != null) {
                ayo_23.b(this);
            }
            this.b.a(ayo_22);
            ayo_22.a(this);
            this.e = true;
            this.setNeedsToPreProcess();
        }
    }

    public boolean getFadeOnPixmapLoaded() {
        return this.t;
    }

    public void setFadeOnPixmapLoaded(boolean bl) {
        if (this.t == bl) {
            return;
        }
        this.t = bl;
        this.f = bl;
        if (this.t && this.b != null) {
            this.b.a(new azf_2(azf_2.b));
        }
        this.setNeedsToPreProcess();
    }

    private void b() {
        if (this.b == null) {
            return;
        }
        if (!this.t) {
            return;
        }
        if (!this.f) {
            return;
        }
        ayo_2 ayo_22 = this.b.f();
        if (ayo_22 == null) {
            return;
        }
        if (ayo_22.a() == null) {
            return;
        }
        if (!ayo_22.a().j()) {
            return;
        }
        this.removeTweensOfType(fjp_2.class);
        this.addTween(new fjp_2(azf_2.b, azf_2.e, this, 0, 250, 1, false, fjw_2.b));
        this.f = false;
    }

    @Override
    public void setPixmap(fqv fqv2) {
        if (this.b != null) {
            ayo_2 ayo_22 = this.b.f();
            if (ayo_22 != null) {
                ayo_22.b(this);
            }
            if ((ayo_22 = fqv2.getPixmap()) != null) {
                ayo_22.a(this);
            }
            this.b.a(fqv2.getPixmap());
            this.e = true;
            this.setNeedsToPreProcess();
        }
    }

    public boolean getScaled() {
        return this.c;
    }

    public void setScaled(boolean bl) {
        if (this.c != bl) {
            this.c = bl;
            this.e = true;
            this.setNeedsToPreProcess();
        }
    }

    public void setDisplayShape(fqq_0 fqq_02) {
        if (this.b != null) {
            this.b.a(fqq_02);
        }
    }

    public fqq_0 getDisplayShape() {
        return this.b != null ? this.b.e() : null;
    }

    public boolean getKeepAspectRatio() {
        return this.d;
    }

    public void setKeepAspectRatio(boolean bl) {
        if (this.d != bl) {
            this.d = bl;
            this.e = true;
            this.setNeedsToPreProcess();
        }
    }

    public frk_0 getAlign() {
        return this.g;
    }

    public void setAlign(frk_0 frk_02) {
        if (!frk_02.equals((Object)this.g)) {
            this.g = frk_02;
            this.e = true;
            this.setNeedsToPreProcess();
        }
    }

    public void setDisplaySize(fjf_2 fjf_22) {
        this.h = fjf_22;
        this.e = true;
        this.setNeedsToPreProcess();
    }

    public fjf_2 getDisplaySize() {
        return this.h;
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.b != null) {
            this.b.a(azj_22);
        }
    }

    @Override
    public azj_2 getModulationColor() {
        return this.b != null ? this.b.h() : null;
    }

    public void setFlipHorizontaly(boolean bl) {
        if (this.b != null) {
            this.b.a(bl);
            this.e = true;
            this.setNeedsToPreProcess();
        }
    }

    public boolean getFlipHorizontaly() {
        return this.b != null && this.b.i();
    }

    public void setFlipVerticaly(boolean bl) {
        if (this.b != null) {
            this.b.b(bl);
            this.e = true;
            this.setNeedsToPreProcess();
        }
    }

    public boolean getFlipVerticaly() {
        return this.b != null && this.b.j();
    }

    public fxb_0 getImageMesh() {
        return this.b;
    }

    public String getShader() {
        return this.b.k();
    }

    public void setShader(String string) {
        this.b.a(string);
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return fqj2 instanceof fqp;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.g = null;
        this.h = null;
        if (this.b != null) {
            ayo_2 ayo_22 = this.b.f();
            if (ayo_22 != null) {
                ayo_22.b(this);
            }
            this.b.l();
            this.b = null;
        }
    }

    @Override
    public void onCheckOut() {
        this.g = frk_0.i;
        super.onCheckOut();
        this.b = new fxb_0();
        this.b.m();
        fqp fqp2 = fqp.checkOut();
        fqp2.setWidget(this);
        this.add(fqp2);
        this.t = false;
    }

    @Override
    public void validate() {
        if (this.b != null) {
            this.c();
            this.b.a(this.m_size, this.m_appearance.getMargin(), this.m_appearance.getBorder(), this.m_appearance.getPadding());
        }
        super.validate();
    }

    private void c() {
        if (this.b == null) {
            return;
        }
        ayo_2 ayo_22 = this.b.f();
        if (ayo_22 == null) {
            return;
        }
        if (this.h != null) {
            this.a(ayo_22, this.m_appearance.getContentWidth(), this.m_appearance.getContentHeight());
            return;
        }
        if (this.c) {
            this.b(ayo_22, this.m_appearance.getContentWidth(), this.m_appearance.getContentHeight());
            return;
        }
        this.setMeshBoundsFromComponent(ayo_22.e(), ayo_22.d(), this.m_appearance.getContentWidth(), this.m_appearance.getContentHeight());
    }

    private void a(ayo_2 ayo_22, int n, int n2) {
        if (this.d) {
            afe_1 afe_12 = this.c(ayo_22, this.h.width, this.h.height);
            this.setMeshBoundsFromComponent(afe_12.a(), afe_12.b(), n, n2);
            return;
        }
        this.setMeshBoundsFromComponent(this.h.width, this.h.height, n, n2);
    }

    private void b(ayo_2 ayo_22, int n, int n2) {
        if (this.d) {
            afe_1 afe_12 = this.c(ayo_22, n, n2);
            this.setMeshBoundsFromComponent(afe_12.a(), afe_12.b(), n, n2);
            return;
        }
        this.setMeshBounds(0, 0, n, n2);
    }

    private afe_1 c(ayo_2 ayo_22, int n, int n2) {
        float f2;
        if (n == 0 || ayo_22.e() == 0 || n2 == 0 || ayo_22.d() == 0) {
            return new afe_1(n, n2);
        }
        float f3 = (float)ayo_22.e() / (float)ayo_22.d();
        if (Hw.d(f3, f2 = (float)n / (float)n2)) {
            return new afe_1(n, n2);
        }
        if (f3 > f2) {
            return new afe_1(n, (int)((float)n / f3));
        }
        return new afe_1((int)((float)n2 * f3), n2);
    }

    private void setMeshBoundsFromComponent(int n, int n2, int n3, int n4) {
        int n5 = this.g.a(n, n3);
        int n6 = this.g.b(n2, n4);
        this.setMeshBounds(n5, n6, n, n2);
    }

    private void setMeshBounds(int n, int n2, int n3, int n4) {
        this.b.a(n);
        this.b.b(n2);
        this.b.d(n3);
        this.b.c(n4);
    }

    public boolean a() {
        boolean bl = false;
        if (this.b == null) {
            return false;
        }
        if (this.b.f() != null) {
            int n;
            int n2;
            if (this.h != null) {
                n2 = this.h.width;
                n = this.h.height;
            } else if (this.m_shrinkable) {
                n2 = 0;
                n = 0;
            } else {
                n2 = this.b.f().e();
                n = this.b.f().d();
            }
            if (this.m_minSize == null || n2 != this.m_minSize.width || n != this.m_minSize.height) {
                this.setMinSize(new fjf_2(n2, n));
                bl = true;
            }
        } else if (this.m_minSize == null || this.m_minSize.width != 0 || this.m_minSize.height != 0) {
            this.setMinSize(new fjf_2(0, 0));
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.b != null && (this.e || this.b.f() != null && this.b.f().p())) {
            boolean bl2 = this.a();
            this.c();
            try {
                if (this.m_appearance != null) {
                    this.b.a(this.m_size, this.m_appearance.getMargin(), this.m_appearance.getBorder(), this.m_appearance.getPadding());
                }
            }
            catch (NullPointerException nullPointerException) {
                m_logger.error((Object)("imageMesh = " + this.b + ", appearance = " + this.m_appearance), (Throwable)nullPointerException);
            }
            if (bl2 && this.m_containerParent != null) {
                this.m_containerParent.invalidateMinSize();
            }
            this.e = false;
        }
        if (this.f) {
            this.b();
            bl |= this.f;
        }
        return bl;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fsk_0 fsk_02 = (fsk_0)fyo2;
        super.copyElement(fyo2);
        fsk_02.setAlign(this.g);
        fsk_02.setDisplaySize(this.h != null ? (fjf_2)this.h.clone() : null);
        fsk_02.setKeepAspectRatio(this.d);
        fsk_02.setScaled(this.c);
        fsk_02.setModulationColor(fsk_02.getModulationColor());
        fsk_02.setFlipHorizontaly(this.getFlipHorizontaly());
        fsk_02.setFlipVerticaly(this.getFlipVerticaly());
        fsk_02.setDisplayShape(this.getDisplayShape());
        fsk_02.setFadeOnPixmapLoaded(this.t);
    }

    @Override
    public void a(ayo_2 ayo_22) {
        this.e = true;
        if (this.b != null && this.t) {
            this.b.a(new azf_2(azf_2.b));
            this.f = true;
        }
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 92903173) {
            this.setAlign(frk_0.a(string));
        } else if (n == 1603825663) {
            this.setDisplayShape(fqq_0.a(string));
        } else if (n == -928111907) {
            this.setFadeOnPixmapLoaded(Co.a(string));
        } else if (n == 1714306019) {
            this.setDisplaySize(fze2.b(string));
        } else if (n == -1344730584) {
            this.setFlipHorizontaly(Co.a(string));
        } else if (n == 1582813654) {
            this.setFlipVerticaly(Co.a(string));
        } else if (n == -954021426) {
            this.setKeepAspectRatio(Co.a(string));
        } else if (n == -1156593849) {
            this.setModulationColor(fze2.a(string));
        } else if (n == -908189606) {
            this.setScaled(Co.a(string));
        } else if (n == -903579675) {
            this.setShader(string);
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 92903173) {
            this.setAlign((frk_0)((Object)object));
        } else if (n == 1603825663) {
            this.setDisplayShape((fqq_0)((Object)object));
        } else if (n == 1714306019) {
            this.setDisplaySize((fjf_2)object);
        } else if (n == -1344730584) {
            this.setFlipHorizontaly(Co.b(object));
        } else if (n == 1582813654) {
            this.setFlipVerticaly(Co.b(object));
        } else if (n == -954021426) {
            this.setKeepAspectRatio(Co.b(object));
        } else if (n == -1156593849) {
            this.setModulationColor((azj_2)object);
        } else if (n == q) {
            this.setPixmap((ayo_2)object);
        } else if (n == -908189606) {
            this.setScaled(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

