/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from fIE
 */
public class fie_1
extends fig_2 {
    public static final String TAG = "tl";
    private int e;
    private int f;
    private frs_0 g;
    private boolean h = true;
    private fvE[][] i;
    private int[] j;
    private int[] k;
    private boolean[] l;
    private boolean[] m;
    private int n = 0;
    private int o = 0;
    private int p = 0;
    private int q = 0;
    public static final int a = 3506649;
    public static final int b = 949721053;
    public static final int d = 92903173;

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        int n;
        this.b(fso2);
        for (n = 0; n < this.f; ++n) {
            for (int k = 0; k < this.e; ++k) {
                fvE fvE2 = this.i[n][k];
                if (fvE2 == null || !fvE2.isVisible()) continue;
                fjf_2 fjf_22 = fvE2.getPrefSize();
                this.j[n] = Math.max(this.j[n], fjf_22.width);
                this.k[k] = Math.max(this.k[k], fjf_22.height);
                if (!fvE2.isExpandable()) continue;
                if (!this.l[n]) {
                    ++this.n;
                }
                if (!this.m[k]) {
                    ++this.o;
                }
                this.l[n] = true;
                this.m[k] = true;
            }
        }
        this.p = 0;
        this.q = 0;
        for (n = 0; n < this.f; ++n) {
            this.p += this.j[n];
        }
        for (n = 0; n < this.e; ++n) {
            this.q += this.k[n];
        }
        return new fjf_2(this.p, this.q);
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        return this.getContentPreferedSize(fso2);
    }

    @Override
    public void a(fso fso2) {
        Object object;
        int n;
        int n2;
        if (this.j == null || this.k == null) {
            return;
        }
        fif_2[] fif_2Array = new fif_2[this.f * this.e];
        for (n2 = 0; n2 < this.f; ++n2) {
            for (n = 0; n < this.e; ++n) {
                object = this.i[n2][n];
                if (object == null || !((fvE)object).isVisible()) continue;
                fif_2Array[n2 * this.e + n] = new fif_2((fig_1)((fvE)object).getLayoutData(), ((fvE)object).getPrefSize());
            }
        }
        this.a(fso2, fif_2Array);
        this.b(fso2, fif_2Array);
        for (n2 = 0; n2 < this.f; ++n2) {
            for (n = 0; n < this.e; ++n) {
                object = fif_2Array[n2 * this.e + n];
                if (object == null) continue;
                fvE fvE2 = this.i[n2][n];
                fvE2.setPosition(((fif_2)object).c, ((fif_2)object).d);
                fvE2.setSize(((fif_2)object).e, ((fif_2)object).f);
            }
        }
    }

    private void a(fso fso2, fif_2[] fif_2Array) {
        int n = fso2.getAppearance().getContentWidth();
        int n2 = n - this.p;
        int n3 = n2 / Hw.a(this.n, 1, new int[0]);
        int n4 = 0;
        int n5 = 0;
        for (int k = 0; k < this.f; ++k) {
            int n6 = this.j[k];
            if (this.l[k]) {
                if (++n4 == this.n) {
                    n6 += n2;
                    n2 = 0;
                } else {
                    n6 += n3;
                    n2 -= n3;
                }
            }
            for (int i2 = 0; i2 < this.e; ++i2) {
                fif_2 fif_22 = fif_2Array[k * this.e + i2];
                if (fif_22 == null) continue;
                frs_0 frs_02 = fif_22.a.getHorizontalAlign();
                if (frs_02 != null) {
                    fjf_2 fjf_22 = fif_22.b;
                    fif_22.c = n5 + frs_02.a(fjf_22.width, n6);
                    fif_22.e = fjf_22.width;
                    continue;
                }
                fif_22.c = n5;
                fif_22.e = n6;
            }
            n5 += n6;
        }
    }

    private void b(fso fso2, fif_2[] fif_2Array) {
        int n = fso2.getAppearance().getContentHeight();
        int n2 = n - this.q;
        int n3 = n2 / Hw.a(this.o, 1, new int[0]);
        int n4 = 0;
        int n5 = n;
        for (int k = 0; k < this.e; ++k) {
            int n6 = this.k[k];
            if (this.m[k]) {
                if (++n4 == this.o) {
                    n6 += n2;
                    n2 = 0;
                } else {
                    n6 += n3;
                    n2 -= n3;
                }
            }
            n5 -= n6;
            for (int i2 = 0; i2 < this.f; ++i2) {
                fif_2 fif_22 = fif_2Array[i2 * this.e + k];
                if (fif_22 == null) continue;
                frs_0 frs_02 = fif_22.a.getVerticalAlign();
                if (frs_02 != null) {
                    fjf_2 fjf_22 = fif_22.b;
                    fif_22.d = n5 + frs_02.b(fjf_22.height, n6);
                    fif_22.f = fjf_22.height;
                    continue;
                }
                fif_22.d = n5;
                fif_22.f = n6;
            }
        }
    }

    private void b(fso fso2) {
        if (this.h) {
            this.i = new fvE[this.f][];
            for (int k = 0; k < this.f; ++k) {
                this.i[k] = new fvE[this.e];
            }
            this.j = new int[this.f];
            this.k = new int[this.e];
            this.l = new boolean[this.f];
            this.m = new boolean[this.e];
            this.h = false;
        }
        this.b();
        this.e();
        ArrayList<fvE> arrayList = fso2.getWidgetChildren();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            fig_1 fig_12;
            fvE fvE2 = arrayList.get(k);
            if (!(fvE2.getLayoutData() instanceof fig_1) || (fig_12 = (fig_1)fvE2.getLayoutData()).getRow() >= this.e || fig_12.getColumn() >= this.f) continue;
            this.i[fig_12.getColumn()][fig_12.getRow()] = fvE2;
        }
    }

    private void b() {
        if (this.i == null) {
            return;
        }
        for (int k = 0; k < this.f; ++k) {
            for (int i2 = 0; i2 < this.e; ++i2) {
                this.i[k][i2] = null;
            }
        }
    }

    private void e() {
        if (this.j != null) {
            Arrays.fill(this.j, 0);
        }
        if (this.k != null) {
            Arrays.fill(this.k, 0);
        }
        if (this.l != null) {
            Arrays.fill(this.l, false);
        }
        if (this.m != null) {
            Arrays.fill(this.m, false);
        }
        this.n = 0;
        this.o = 0;
    }

    public int getRows() {
        return this.e;
    }

    public void setRows(int n) {
        this.e = n;
        this.h = true;
    }

    public int getColumns() {
        return this.f;
    }

    public void setColumns(int n) {
        this.f = n;
        this.h = true;
    }

    public frs_0 getAlign() {
        return this.g;
    }

    public void setAlign(frs_0 frs_02) {
        this.g = frs_02;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fie_1 fie_12 = (fie_1)fyo2;
        fie_12.setAlign(this.g);
        fie_12.setRows(this.e);
        fie_12.setColumns(this.f);
    }

    public fie_1 a() {
        fie_1 fie_12 = new fie_1();
        fie_12.onCheckOut();
        this.copyElement(fie_12);
        return fie_12;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.h = true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 3506649) {
            this.setRows(Co.c(string));
        } else if (n == 949721053) {
            this.setColumns(Co.c(string));
        } else if (n == 92903173) {
            this.setAlign(frs_0.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }

    @Override
    public /* synthetic */ fig_2 d() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.a();
    }
}

