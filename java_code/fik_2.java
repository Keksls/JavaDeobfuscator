/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fIk
 */
public class fik_2
extends fig_2 {
    private static Logger f = Logger.getLogger(fik_2.class);
    public static final String TAG = "GlidingLayout";
    public static final String a = "gl";
    private boolean g = true;
    private short h = 0;
    private short i = 0;
    public static final int b = 3200366;
    public static final int d = 3617440;
    public static final int e = 1387629604;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        int n = 0;
        int n2 = 0;
        boolean bl = true;
        if (this.g) {
            for (fvE fvE2 : fso2.getWidgetChildren()) {
                if (!fvE2.getVisible()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n += this.h;
                }
                n += fvE2.getMinSize().width;
                n2 = Math.max(n2, fvE2.getMinSize().height);
            }
            n += 2 * this.h;
            n2 += 2 * this.i;
        } else {
            for (fvE fvE3 : fso2.getWidgetChildren()) {
                if (!fvE3.getVisible()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n2 += this.i;
                }
                n2 += fvE3.getMinSize().height;
                n = Math.max(n, fvE3.getMinSize().width);
            }
            n += 2 * this.h;
            n2 += 2 * this.i;
        }
        return new fjf_2(n, n2);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        int n = 0;
        int n2 = 0;
        boolean bl = true;
        if (this.g) {
            for (int k = fso2.getWidgetChildren().size() - 1; k >= 0; --k) {
                fvE fvE2 = fso2.getWidget(k);
                if (!fvE2.getVisible()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n += this.h;
                }
                n += fvE2.getPrefSize().width;
                n2 = Math.max(n2, fvE2.getPrefSize().height);
            }
            n += 2 * this.h;
            n2 += 2 * this.i;
        } else {
            for (int k = fso2.getWidgetChildren().size() - 1; k >= 0; --k) {
                fvE fvE3 = fso2.getWidget(k);
                if (!fvE3.getVisible()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n2 += this.i;
                }
                n2 += fvE3.getPrefSize().height;
                n = Math.max(n, fvE3.getPrefSize().width);
            }
            n += 2 * this.h;
            n2 += 2 * this.i;
        }
        return new fjf_2(n, n2);
    }

    public short getHgap() {
        return this.h;
    }

    public void setHgap(short s2) {
        this.h = s2;
    }

    public boolean isHorizontal() {
        return this.g;
    }

    public void setHorizontal(boolean bl) {
        this.g = bl;
    }

    public short getVgap() {
        return this.i;
    }

    public void setVgap(short s2) {
        this.i = s2;
    }

    @Override
    public void a(fso fso2) {
        boolean bl = false;
        boolean bl2 = false;
        ArrayList<fvE> arrayList = fso2.getWidgetChildren();
        if (this.g) {
            int n = fso2.getAppearance().getContentHeight();
            int n2 = fso2.getAppearance().getContentWidth();
            for (int k = 0; k < arrayList.size(); ++k) {
                fvE fvE2 = arrayList.get(k);
                fil_2 fil_22 = null;
                if (fvE2.getLayoutData() instanceof fil_2) {
                    fil_22 = (fil_2)fvE2.getLayoutData();
                }
                if (!fvE2.getVisible()) continue;
                int n3 = fvE2.getPrefSize().width;
                int n4 = 0;
                int n5 = fvE2.getX();
                int n6 = fil_22 != null ? fvE2.getPrefSize().height : n;
                if (fil_22 != null) {
                    frs_0 frs_02 = fil_22.getInitAlign();
                    if ((!fil_22.isInitValue() || !fvE2.isPositionInitByUserDefinition() || fta_0.getInstance().isResized()) && fil_22.isUsable() && frs_02 != null) {
                        n5 = frs_02.a(n3, n2);
                        fil_22.setUsable(false);
                    }
                    n4 += fil_22.getAlign().b(n6, n);
                }
                fvE2.setSize(n3, n6);
                fvE2.setPosition(n5, n4);
            }
        } else {
            int n = fso2.getAppearance().getContentWidth();
            int n7 = fso2.getAppearance().getContentHeight();
            for (int k = 0; k < arrayList.size(); ++k) {
                fvE fvE3 = arrayList.get(k);
                fil_2 fil_23 = null;
                if (fvE3.getLayoutData() instanceof fil_2) {
                    fil_23 = (fil_2)fvE3.getLayoutData();
                }
                if (!fvE3.getVisible()) continue;
                int n8 = fvE3.getPrefSize().height;
                int n9 = 0;
                int n10 = fvE3.getY();
                int n11 = fil_23 != null ? fvE3.getPrefSize().width : n;
                if (fil_23 != null) {
                    frs_0 frs_03 = fil_23.getInitAlign();
                    if ((!fil_23.isInitValue() || !fvE3.isPositionInitByUserDefinition() || fta_0.getInstance().isResized()) && fil_23.isUsable() && frs_03 != null) {
                        n10 = frs_03.b(n8, n7);
                        fil_23.setUsable(false);
                    }
                    n9 += fil_23.getAlign().a(n11, n);
                }
                fvE3.setSize(n11, n8);
                fvE3.setPosition(n9, fvE3.getY());
            }
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        fik_2 fik_22 = (fik_2)fyo2;
        super.copyElement(fik_22);
        fik_22.h = this.h;
        fik_22.i = this.i;
        fik_22.g = this.g;
    }

    public fik_2 a() {
        fik_2 fik_22 = new fik_2();
        fik_22.onCheckOut();
        this.copyElement(fik_22);
        return fik_22;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 3200366) {
            this.setHgap(Co.h(string));
        } else if (n == 3617440) {
            this.setVgap(Co.h(string));
        } else if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
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

