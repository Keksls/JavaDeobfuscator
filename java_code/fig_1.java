/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIG
 */
public class fig_1
extends fif_1 {
    public static final String TAG = "tld";
    private int e;
    private int f;
    private frs_0 g = null;
    private frs_0 h = null;
    public static final int a = 113114;
    public static final int b = -1354837162;
    public static final int c = 1041699137;
    public static final int d = -1139902161;

    public int getRow() {
        return this.e;
    }

    public void setRow(int n) {
        this.e = n;
    }

    public int getColumn() {
        return this.f;
    }

    public void setColumn(int n) {
        this.f = n;
    }

    public frs_0 getHorizontalAlign() {
        return this.g;
    }

    public void setHorizontalAlign(frs_0 frs_02) {
        this.g = frs_02;
    }

    public frs_0 getVerticalAlign() {
        return this.h;
    }

    public void setVerticalAlign(frs_0 frs_02) {
        this.h = frs_02;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fig_1 fig_12 = (fig_1)fyo2;
        fig_12.setRow(this.e);
        fig_12.setColumn(this.f);
        fig_12.setHorizontalAlign(this.g);
        fig_12.setVerticalAlign(this.h);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.g = null;
        this.h = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 113114) {
            this.setRow(Co.c(string));
        } else if (n == -1354837162) {
            this.setColumn(Co.c(string));
        } else if (n == 1041699137) {
            this.setHorizontalAlign(frs_0.a(string));
        } else if (n == -1139902161) {
            this.setVerticalAlign(frs_0.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

