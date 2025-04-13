/*
 * Decompiled with CFR 0.152.
 */
public final class fqb
extends fqj {
    public static final String TAG = "AnimatedElementViewerAppearance";
    private boolean k;
    private boolean T;
    public static final int a = -962590849;
    public static final int b = -735662143;
    public static final int c = -795787204;
    public static final int d = -1548407259;
    public static final int e = -1548407258;
    public static final int f = 109250890;
    public static final int g = "useDefaultMaterial".hashCode();
    public static final int h = -1122949950;
    public static final int i = -1290304399;
    public static final int j = 2129268483;
    private String U;
    private String V;
    private float W;
    private float X;
    private float Y;
    private int Z;
    private boolean aa = true;

    @Override
    public String getTag() {
        return TAG;
    }

    public final String getFilePath() {
        return this.U;
    }

    public final void setFilePath(String string) {
        this.U = string;
        if (this.I != null) {
            this.getAnimatedElementViewer().setFilePath(string);
        }
    }

    public String getAnimName() {
        return this.V;
    }

    public void setAnimName(String string) {
        this.V = string;
        if (this.I != null) {
            this.getAnimatedElementViewer().setAnimName(this.V);
        }
    }

    public float getOffsetX() {
        return this.W;
    }

    public void setOffsetX(float f2) {
        this.W = f2;
        if (this.I != null) {
            this.getAnimatedElementViewer().setOffsetX(this.W);
        }
    }

    public float getOffsetY() {
        return this.X;
    }

    public void setOffsetY(float f2) {
        this.X = f2;
        if (this.I != null) {
            this.getAnimatedElementViewer().setOffsetY(this.X);
        }
    }

    public float getScale() {
        return this.Y;
    }

    public void setScale(float f2) {
        this.Y = f2;
        if (this.I != null) {
            this.getAnimatedElementViewer().setScale(this.Y);
        }
    }

    public void setFlipHorizontal(boolean bl) {
        this.k = bl;
        if (this.I != null) {
            this.getAnimatedElementViewer().setFlipHorizontal(this.k);
        }
    }

    public void setFlipVertical(boolean bl) {
        this.T = bl;
        if (this.I != null) {
            this.getAnimatedElementViewer().setFlipVertical(this.T);
        }
    }

    public int getDirection() {
        return this.Z;
    }

    public void setDirection(int n) {
        this.Z = n;
        if (this.I != null) {
            this.getAnimatedElementViewer().setDirection(this.Z);
        }
    }

    public void setUseBlendPremult(boolean bl) {
        this.aa = bl;
        if (this.I != null) {
            this.getAnimatedElementViewer().setUseBlendPremult(this.aa);
        }
    }

    public final frO getAnimatedElementViewer() {
        return (frO)this.I;
    }

    @Override
    public final void setWidget(fvE fvE2) {
        super.setWidget(fvE2);
        frO frO2 = this.getAnimatedElementViewer();
        frO2.setFilePath(this.U);
        frO2.setAnimName(this.V);
        frO2.setOffsetX(this.W);
        frO2.setOffsetY(this.X);
        frO2.setScale(this.Y);
        frO2.setFlipHorizontal(this.k);
        frO2.setFlipVertical(this.T);
        frO2.setDirection(this.Z);
        frO2.setUseBlendPremult(this.aa);
    }

    @Override
    public final void copyElement(fyo fyo2) {
        fqb fqb2 = (fqb)fyo2;
        super.copyElement(fqb2);
        if (this.U != null) {
            fqb2.setFilePath(this.U);
            fqb2.setAnimName(this.V);
            fqb2.setOffsetX(this.W);
            fqb2.setOffsetY(this.X);
            fqb2.setScale(this.Y);
            fqb2.setFlipHorizontal(this.k);
            fqb2.setFlipVertical(this.T);
            fqb2.setDirection(this.Z);
            fqb2.setUseBlendPremult(this.aa);
        }
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
        } else if (n == -1122949950) {
            this.setUseBlendPremult(Co.a(string));
        } else if (n == -1290304399) {
            this.setFlipHorizontal(Co.a(string));
        } else if (n == 2129268483) {
            this.setFlipVertical(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -735662143) {
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
        } else if (n == -1122949950) {
            this.setUseBlendPremult(Co.b(object));
        } else if (n == -1290304399) {
            this.setFlipHorizontal(Co.b(object));
        } else if (n == 2129268483) {
            this.setFlipVertical(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

