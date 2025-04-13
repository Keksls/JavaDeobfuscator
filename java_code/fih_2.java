/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fIh
 */
public class fih_2
extends fig_2 {
    private static Logger e = Logger.getLogger(fih_2.class);
    public static final String TAG = "BorderLayout";
    public static final String a = "bl";
    private int f = 0;
    private int g = 0;
    public static final int b = 3200366;
    public static final int d = 3617440;

    @Override
    public String getTag() {
        return TAG;
    }

    public void setHGap(int n) {
        this.f = n;
    }

    public void setVGap(int n) {
        this.g = n;
    }

    private fvE getWidgetByConstraint(fso fso2, frg_0 frg_02) {
        for (fvE fvE2 : fso2.getWidgetChildren()) {
            fii_2 fii_22;
            if (!fvE2.getVisible() || !(fvE2.getLayoutData() instanceof fii_2) || !(fii_22 = (fii_2)fvE2.getLayoutData()).getData().equals((Object)frg_02)) continue;
            return fvE2;
        }
        return null;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        fjf_2 fjf_22;
        fjf_2 fjf_23 = new fjf_2(0, 0);
        fvE fvE2 = this.getWidgetByConstraint(fso2, frg_0.d);
        if (fvE2 != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getMinSize();
            fjf_23.width += fjf_22.width + this.f;
            fjf_23.height = Math.max(fjf_22.height, fjf_23.height);
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.e)) != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getMinSize();
            fjf_23.width += fjf_22.width + this.f;
            fjf_23.height = Math.max(fjf_22.height, fjf_23.height);
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.a)) != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getMinSize();
            fjf_23.width += fjf_22.width;
            fjf_23.height = Math.max(fjf_22.height, fjf_23.height);
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.b)) != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getMinSize();
            fjf_23.width = Math.max(fjf_22.width, fjf_23.width);
            fjf_23.height += fjf_22.height + this.g;
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.c)) != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getMinSize();
            fjf_23.width = Math.max(fjf_22.width, fjf_23.width);
            fjf_23.height += fjf_22.height + this.g;
        }
        return fjf_23;
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        fjf_2 fjf_22;
        fjf_2 fjf_23 = new fjf_2(0, 0);
        fvE fvE2 = this.getWidgetByConstraint(fso2, frg_0.d);
        if (fvE2 != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getPrefSize();
            fjf_23.width += fjf_22.width + this.f;
            fjf_23.height = Math.max(fjf_22.height, fjf_23.height);
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.e)) != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getPrefSize();
            fjf_23.width += fjf_22.width + this.f;
            fjf_23.height = Math.max(fjf_22.height, fjf_23.height);
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.a)) != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getPrefSize();
            fjf_23.width += fjf_22.width;
            fjf_23.height = Math.max(fjf_22.height, fjf_23.height);
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.b)) != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getPrefSize();
            fjf_23.width = Math.max(fjf_22.width, fjf_23.width);
            fjf_23.height += fjf_22.height + this.g;
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.c)) != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getPrefSize();
            fjf_23.width = Math.max(fjf_22.width, fjf_23.width);
            fjf_23.height += fjf_22.height + this.g;
        }
        return fjf_23;
    }

    @Override
    public void a(fso fso2) {
        int n;
        int n2;
        fjf_2 fjf_22;
        int n3 = fso2.getAppearance().getContentHeight();
        int n4 = 0;
        int n5 = 0;
        int n6 = fso2.getAppearance().getContentWidth();
        fvE fvE2 = this.getWidgetByConstraint(fso2, frg_0.c);
        if (fvE2 != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getPrefSize();
            n2 = n5;
            if (fvE2.isExpandable()) {
                n = n6 - n5;
            } else {
                n = (int)fjf_22.getWidth();
                n2 += (n6 - n5 - n) / 2;
            }
            fvE2.setSize(n, fjf_22.height);
            fvE2.setPosition(n2, n4);
            n4 += fjf_22.height + this.g;
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.b)) != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getPrefSize();
            n2 = n5;
            if (fvE2.isExpandable()) {
                n = n6 - n5;
            } else {
                n = (int)fjf_22.getWidth();
                n2 += (n6 - n5 - n) / 2;
            }
            fvE2.setSize(n, fjf_22.height);
            fvE2.setPosition(n2, n3 - fjf_22.height);
            n3 -= fjf_22.height + this.g;
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.d)) != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getPrefSize();
            n2 = n4;
            if (fvE2.isExpandable()) {
                n = n3 - n4;
            } else {
                n = (int)fjf_22.getHeight();
                n2 += (n3 - n4 - n) / 2;
            }
            fvE2.setSize(fjf_22.width, n);
            fvE2.setPosition(n6 - fjf_22.width, n2);
            n6 -= fjf_22.width + this.f;
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.e)) != null && fvE2.getVisible()) {
            fjf_22 = fvE2.getPrefSize();
            n2 = n4;
            if (fvE2.isExpandable()) {
                n = n3 - n4;
            } else {
                n = fjf_22.height;
                n2 += (n3 - n4 - n) / 2;
            }
            fvE2.setSize(fjf_22.width, n);
            fvE2.setPosition(n5, n2);
            n5 += fjf_22.width + this.f;
        }
        if ((fvE2 = this.getWidgetByConstraint(fso2, frg_0.a)) != null && fvE2.getVisible()) {
            if (fvE2.isExpandable()) {
                fvE2.setSize(n6 - n5, n3 - n4);
                fvE2.setPosition(n5, n4);
            } else {
                fvE2.setSizeToPrefSize();
                fvE2.setPosition(n5 + (n6 - n5 - fvE2.getWidth()) / 2, n4 + (n3 - n4 - fvE2.getHeight()) / 2);
            }
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }

    @Override
    public void copyElement(fyo fyo2) {
        fih_2 fih_22 = (fih_2)fyo2;
        super.copyElement(fih_22);
        fih_22.f = this.f;
        fih_22.g = this.g;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 3200366) {
            this.setHGap(Co.c(string));
        } else if (n == 3617440) {
            this.setVGap(Co.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }

    public fih_2 a() {
        fih_2 fih_22 = new fih_2();
        fih_22.onCheckOut();
        this.copyElement(fih_22);
        return fih_22;
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

