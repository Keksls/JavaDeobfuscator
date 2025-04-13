/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Point;
import org.jetbrains.annotations.Nullable;

public abstract class frB
extends ful_0
implements fxx {
    private static final int f = 50;
    protected fzu a;
    private fzu g;
    private fzu h;
    private fzu i;
    private fzu j;
    private fzu k;
    private fzu l;
    private fzu m;
    private fzu n;
    private fzu o;
    private fzu p;
    private long q = 0L;
    protected boolean b = false;
    private boolean r = false;
    fxH s = null;
    private boolean t = false;
    public static final int c = -1655575466;
    public static final int d = -625591907;
    public static final int e = -470861862;

    @Override
    public boolean isSelectable() {
        return this.getTextBuilder().v();
    }

    @Override
    public void setSelectable(boolean bl) {
        this.getTextBuilder().e(bl);
        this.setFocusable(bl);
        if (bl) {
            this.setCursorType(frb_0.d);
        } else {
            this.setCursorType(frb_0.a);
        }
    }

    @Override
    public boolean isSelectOnFocus() {
        return this.t;
    }

    @Override
    public void setSelectOnFocus(boolean bl) {
        this.t = bl;
    }

    @Override
    public boolean isEnableOnlySelectablePartInteraction() {
        return this.r;
    }

    @Override
    public void setEnableOnlySelectablePartInteraction(boolean bl) {
        this.r = bl;
    }

    @Override
    @Nullable
    public fvE getWidget(int n, int n2) {
        this.s = null;
        if (this.m_unloading) {
            return null;
        }
        if (!this.m_visible || this.m_nonBlocking || !this.getAppearance().a(n, n2) || fta_0.getInstance().isMovePointMode()) {
            return null;
        }
        this.s = this.getContentBlockUnderMouse(n, -n2);
        if (this.r && (this.s == null || this.s.g() != fxI.b || ((fxL)this.s).n() == null || ((fxL)this.s).n().p() == null)) {
            return null;
        }
        return this;
    }

    public fxH getBlockUnderMouse() {
        return this.s;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.s = null;
        fta_0.getInstance().removeEventListener(frd_0.B, this.a, false);
        this.g = null;
        this.h = null;
        this.a = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.r = false;
        this.b();
    }

    public void a() {
        if (this.bu_()) {
            fxP fxP2 = this.getTextBuilder().k();
            if (fxP2.l()) {
                this.getTextBuilder().n();
            }
            this.getTextBuilder().a(fxP2.m(), 0);
            fxQ fxQ2 = fxP2.n();
            this.getTextBuilder().b(fxQ2, fxQ2.f());
        }
    }

    Point getOrientedMouseCoodinates(fck_2 fck_22) {
        int n = 0;
        int n2 = 0;
        switch (this.getTextBuilder().h()) {
            case a: {
                n = fck_22.b(this) - this.m_appearance.getBottomInset();
                n2 = this.m_size.width - fck_22.a(this) - this.m_appearance.getLeftInset() - this.m_appearance.getRightInset();
                break;
            }
            case c: {
                n = fck_22.a(this) - this.m_appearance.getLeftInset();
                n2 = fck_22.b(this) - this.m_appearance.getBottomInset();
                break;
            }
            case b: {
                n = this.m_size.height - fck_22.b(this) - this.m_appearance.getBottomInset() - this.m_appearance.getTopInset();
                n2 = fck_22.a(this) - this.m_appearance.getLeftInset();
                break;
            }
            case d: {
                n = this.m_size.width - fck_22.a(this) - this.m_appearance.getLeftInset() - this.m_appearance.getRightInset();
                n2 = this.m_size.height - fck_22.b(this) - this.m_appearance.getBottomInset() - this.m_appearance.getTopInset();
            }
        }
        return new Point(n, n2);
    }

    protected void b() {
        this.g = new frC(this);
        this.addEventListener(frd_0.i, this.g, false);
        this.a = new frF(this);
        fta_0.getInstance().addEventListener(frd_0.B, this.a, false);
        this.i = fzs2 -> {
            this.a();
            return false;
        };
        this.addEventListener(frd_0.D, this.i, false);
        this.h = new frG(this);
        this.addEventListener(frd_0.A, this.h, false);
        this.j = new frH(this);
        this.addEventListener(frd_0.w, this.j, false);
        this.k = new frI(this);
        this.addEventListener(frd_0.y, this.k, false);
        this.l = new frJ(this);
        this.addEventListener(frd_0.u, this.l, false);
        this.m = new frK(this);
        this.addEventListener(frd_0.z, this.m, false);
        this.n = new frL(this);
        this.addEventListener(frd_0.o, this.n, true);
        this.o = new frM(this);
        this.addEventListener(frd_0.n, this.o, true);
        this.p = new frD(this);
        this.addEventListener(frd_0.p, this.p, true);
    }

    public fxH getContentBlockUnderMouse(fck_2 fck_22) {
        if (fck_22.e() != this) {
            return null;
        }
        Point point = this.getOrientedMouseCoodinates(fck_22);
        return this.getContentBlockUnderMouse(point.x, -point.y);
    }

    private fxH getContentBlockUnderMouse(int n, int n2) {
        abo_2<fxH, fxF> abo_22 = this.getTextBuilder().b(n - this.getLeftMargin(), n2 - this.getTopMargin());
        return abo_22 == null ? null : abo_22.a();
    }

    protected void a(fcz_1 fcz_12) {
        long l = this.q = fcz_12.j() ? System.currentTimeMillis() : 0L;
        if (!fcz_12.j()) {
            this.getTextBuilder().N();
        }
    }

    protected void a(fxH fxH2, int n) {
        if (this.b) {
            this.a();
            this.q = 0L;
            this.b = false;
        }
    }

    protected void b(fxH fxH2, int n) {
        boolean bl = this.b = this.t && System.currentTimeMillis() - this.q < 50L;
        if (!this.b && this.bu_()) {
            this.getTextBuilder().a(fxH2.h(), fxH2.i() + n);
            this.getTextBuilder().b(fxH2.h(), fxH2.i() + n);
        }
    }

    protected void c(fxH fxH2, int n) {
        this.q = 0L;
        this.b = false;
        if (this.bu_()) {
            this.getTextBuilder().b(fxH2.h(), fxH2.i() + n);
        }
    }

    protected boolean a(fcd_2 fcd_22) {
        return false;
    }

    protected boolean b(fcd_2 fcd_22) {
        switch (fcd_22.k()) {
            case 37: {
                if (fcd_22.r() || fcd_22.s() || fcd_22.u()) {
                    return true;
                }
                if (fcd_22.q()) {
                    this.a(true, fcd_22.t());
                    return false;
                }
                this.getTextBuilder().R();
                if (!fcd_22.t()) {
                    this.getTextBuilder().o();
                }
                fta_0.getInstance().setKeyEventConsumed(true);
                return false;
            }
            case 39: {
                if (fcd_22.r() || fcd_22.s() || fcd_22.u()) {
                    return true;
                }
                if (fcd_22.q()) {
                    this.a(false, fcd_22.t());
                    return false;
                }
                this.getTextBuilder().Q();
                if (!fcd_22.t()) {
                    this.getTextBuilder().o();
                }
                fta_0.getInstance().setKeyEventConsumed(true);
                return false;
            }
            case 38: 
            case 40: {
                fta_0.getInstance().setKeyEventConsumed(true);
                return false;
            }
            case 36: {
                this.getTextBuilder().S();
                if (!fcd_22.t()) {
                    this.getTextBuilder().o();
                }
                fta_0.getInstance().setKeyEventConsumed(true);
                return false;
            }
            case 35: {
                this.getTextBuilder().T();
                if (!fcd_22.t()) {
                    this.getTextBuilder().o();
                }
                fta_0.getInstance().setKeyEventConsumed(true);
                return false;
            }
            case 67: {
                if (!fcd_22.q()) break;
                if (!this.getTextBuilder().k().i()) {
                    this.c();
                }
                fta_0.getInstance().setKeyEventConsumed(true);
                return false;
            }
        }
        return true;
    }

    private void a(boolean bl, boolean bl2) {
        fxP fxP2 = this.getTextBuilder().k();
        int n = bl ? fxP2.q() : fxP2.u();
        int n2 = fxP2.t();
        int n3 = n;
        int n4 = n2;
        while (bl ? n4 >= 0 : n4 < fxP2.G()) {
            fxQ fxQ2 = fxP2.a(n2);
            if (fxQ2.b() == ane_2.c) {
                fxP2.a(fxQ2, 0);
                fxP2.b(fxQ2, 0);
            } else if (fxQ2.b() == ane_2.b) {
                int n5;
                String string = ((fxS)fxQ2).j();
                boolean bl3 = false;
                boolean bl4 = true;
                int n6 = n5 = n3 >= string.length() ? 32 : (int)string.charAt(n3);
                while (!bl3 && (n3 += bl ? -1 : 1) >= 0 && n3 <= string.length() - 1) {
                    char c2 = string.charAt(n3);
                    bl3 = bl ? n5 != 32 && c2 == ' ' && !bl4 : n5 == 32 && c2 != ' ';
                    bl4 = false;
                    n5 = c2;
                }
                n3 = n3 < 0 ? (bl ? 0 : string.length()) : (n3 > string.length() ? string.length() : (n3 += bl ? 1 : 0));
                if (!bl2) {
                    this.getTextBuilder().a(fxQ2, n3);
                }
                this.getTextBuilder().b(fxQ2, n3);
                break;
            }
            n4 += bl ? -1 : 1;
        }
    }

    protected boolean c(fcd_2 fcd_22) {
        if (fcd_22.q()) {
            fta_0.getInstance().setKeyEventConsumed(true);
            fta_0.getInstance().setMovePointMode(false);
            return false;
        }
        return true;
    }

    protected void c() {
        String string = this.getTextBuilder().k().y();
        if (string != null && string.length() != 0) {
            ca_0.a(string);
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        frB frB2 = (frB)fyo2;
        super.copyElement(frB2);
        frB2.t = this.t;
        frB2.setSelectable(this.getTextBuilder().v());
        frB2.removeEventListener(frd_0.i, this.g, false);
        frB2.removeEventListener(frd_0.A, this.h, false);
        frB2.removeEventListener(frd_0.D, this.i, false);
        frB2.removeEventListener(frd_0.w, this.j, false);
        frB2.removeEventListener(frd_0.y, this.k, false);
        frB2.removeEventListener(frd_0.u, this.l, false);
        frB2.removeEventListener(frd_0.z, this.m, false);
        frB2.removeEventListener(frd_0.o, this.n, true);
        frB2.removeEventListener(frd_0.n, this.o, true);
        frB2.removeEventListener(frd_0.p, this.p, true);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1655575466) {
            this.setSelectable(Co.a(string));
        } else if (n == -625591907) {
            this.setSelectOnFocus(Co.a(string));
        } else if (n == -470861862) {
            this.setEnableOnlySelectablePartInteraction(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1655575466) {
            this.setSelectable(Co.b(object));
        } else if (n == -625591907) {
            this.setSelectOnFocus(Co.b(object));
        } else if (n == -470861862) {
            this.setEnableOnlySelectablePartInteraction(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

