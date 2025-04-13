/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.ArrayList;

public class fqD
extends fyg_0 {
    protected Insets B;
    protected Insets C;
    protected Insets D;
    protected fqq_0 E;
    protected fjf_2 F = null;
    protected boolean G = false;
    protected boolean H = false;
    protected fvE I;
    protected boolean J = false;
    protected boolean K = false;
    protected boolean L = true;
    public static final int M = -1081309778;
    public static final int N = -1383304148;
    public static final int O = -806339567;
    public static final int P = 109399969;
    public static final int Q = 1232803018;
    public static final int R = -1555226005;
    public static final int S = 2006481300;

    public fqD() {
    }

    public fqD(fvE fvE2) {
        this.I = fvE2;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fql_0) {
            fyb_02.addEventListener(frd_0.J, new fqE(this), false);
            this.setSpacing((fql_0)fyb_02);
        }
        super.add(fyb_02);
    }

    public void setSpacing(fql_0 fql_02) {
        if (fql_02 instanceof fqm_0) {
            this.setMargin(fql_02.getInsets());
        } else if (fql_02 instanceof fqo_0) {
            this.setPadding(fql_02.getInsets());
        } else if (fql_02 instanceof fqk_0) {
            this.setBorder(fql_02.getInsets());
        }
    }

    public Insets getBorder() {
        return this.C;
    }

    public void setBorder(Insets insets) {
        this.C.bottom = insets.bottom;
        this.C.top = insets.top;
        this.C.left = insets.left;
        this.C.right = insets.right;
        this.G = true;
        this.setNeedsToPreProcess();
    }

    public Insets getMargin() {
        return this.B;
    }

    public void setMargin(Insets insets) {
        this.B.bottom = insets.bottom;
        this.B.top = insets.top;
        this.B.left = insets.left;
        this.B.right = insets.right;
        this.G = true;
        this.setNeedsToPreProcess();
    }

    public Insets getPadding() {
        return this.D;
    }

    public void setPadding(Insets insets) {
        this.D.bottom = insets.bottom;
        this.D.top = insets.top;
        this.D.left = insets.left;
        this.D.right = insets.right;
        this.G = true;
        this.setNeedsToPreProcess();
    }

    public fvE getWidget() {
        return this.I;
    }

    public void setWidget(fvE fvE2) {
        this.I = fvE2;
        this.H = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
        this.G = true;
    }

    public void setShape(fqq_0 fqq_02) {
        this.E = fqq_02;
    }

    public fqq_0 getShape() {
        return this.E;
    }

    public void setInvalidateOnChange(boolean bl) {
        this.J = bl;
    }

    public void setInvalidateSizeOnChange(boolean bl) {
        this.K = bl;
    }

    public void setPostProcessOfChildrenOnChange(boolean bl) {
        this.L = bl;
    }

    public Insets getTotalInsets() {
        return new Insets(this.D.top + this.C.top + this.B.top, this.D.left + this.C.left + this.B.left, this.D.bottom + this.C.bottom + this.B.bottom, this.D.right + this.C.right + this.B.right);
    }

    public int getTopInset() {
        return this.D.top + this.C.top + this.B.top;
    }

    public int getBottomInset() {
        return this.D.bottom + this.C.bottom + this.B.bottom;
    }

    public int getLeftInset() {
        return this.D.left + this.C.left + this.B.left;
    }

    public int getRightInset() {
        return this.D.right + this.C.right + this.B.right;
    }

    public int getInsetWidth() {
        return this.getRightInset() + this.getLeftInset();
    }

    public int getInsetHeight() {
        return this.getTopInset() + this.getBottomInset();
    }

    private void a() {
        this.F = new fjf_2(this.I.m_size.width - this.B.left - this.B.right - this.D.left - this.D.right - this.C.left - this.C.right, this.I.m_size.height - this.B.top - this.B.bottom - this.D.top - this.D.bottom - this.C.top - this.C.bottom);
    }

    public fjf_2 getContentSize() {
        if (this.F == null) {
            this.a();
        }
        return this.F;
    }

    public int getContentWidth() {
        if (this.F == null) {
            this.a();
        }
        return this.F.width;
    }

    public int getContentHeight() {
        if (this.F == null) {
            this.a();
        }
        return this.F.height;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.F = null;
    }

    public boolean a(int n, int n2) {
        return this.E.a(n - this.B.left, n2 - this.B.bottom, this.I.m_size.width - this.B.left - this.B.right, this.I.m_size.height - this.B.bottom - this.B.top);
    }

    public int getOnScreenX(int n, int n2) {
        return this.E.b(n, n2, this.I.m_size.width - this.B.left - this.B.right, this.I.m_size.height - this.B.bottom - this.B.top);
    }

    public int getOnScreenY(int n, int n2) {
        return this.E.c(n, n2, this.I.m_size.width - this.B.left - this.B.right, this.I.m_size.height - this.B.bottom - this.B.top);
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.G) {
            this.G = false;
            this.invalidate();
            if (this.I != null) {
                if (this.J) {
                    this.I.invalidate();
                }
                if (this.I instanceof fso) {
                    fso fso2 = (fso)this.I;
                    if (this.K) {
                        fso2.invalidateMinSize();
                    }
                    if (this.L) {
                        ArrayList<fvE> arrayList = fso2.getWidgetChildren();
                        for (int k = arrayList.size() - 1; k >= 0; --k) {
                            arrayList.get(k).setNeedsToPostProcess();
                        }
                    }
                }
            }
        }
        return bl;
    }

    @Override
    public boolean postProcess(int n) {
        this.H = false;
        return super.postProcess(n);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.I = null;
        this.F = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.B = new Insets(0, 0, 0, 0);
        this.C = new Insets(0, 0, 0, 0);
        this.D = new Insets(0, 0, 0, 0);
        this.E = fqq_0.a;
        this.G = false;
        this.H = false;
        this.J = false;
        this.K = false;
        this.L = true;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqD fqD2 = (fqD)fyo2;
        super.copyElement(fyo2);
        fqD2.setShape(this.E);
        fqD2.setInvalidateOnChange(this.J);
        fqD2.setInvalidateSizeOnChange(this.K);
        fqD2.setPostProcessOfChildrenOnChange(this.L);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        switch (n) {
            case 109399969: {
                this.setShape(fqq_0.a(string));
                return true;
            }
            case -1383304148: {
                this.setBorder(fze2.c(string));
                return true;
            }
            case -1081309778: {
                this.setMargin(fze2.c(string));
                return true;
            }
            case -806339567: {
                this.setPadding(fze2.c(string));
                return true;
            }
            case 1232803018: {
                this.setInvalidateOnChange(Co.a(string));
                return true;
            }
            case -1555226005: {
                this.setInvalidateSizeOnChange(Co.a(string));
                return true;
            }
            case 2006481300: {
                this.setPostProcessOfChildrenOnChange(Co.a(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 109399969: {
                this.setShape((fqq_0)((Object)object));
                return true;
            }
            case -1383304148: {
                this.setBorder((Insets)object);
                return true;
            }
            case -1081309778: {
                this.setMargin((Insets)object);
                return true;
            }
            case -806339567: {
                this.setPadding((Insets)object);
                return true;
            }
            case 1232803018: {
                this.setInvalidateOnChange(Co.b(object));
                return true;
            }
            case -1555226005: {
                this.setInvalidateSizeOnChange(Co.b(object));
                return true;
            }
            case 2006481300: {
                this.setPostProcessOfChildrenOnChange(Co.b(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

