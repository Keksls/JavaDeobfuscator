/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from fIC
 */
public class fic_1
extends fig_2 {
    private static Logger d = Logger.getLogger(fic_1.class);
    public static final String TAG = "StaticLayout";
    public static final String a = "sl";
    private boolean e = false;
    private static final HashMap<String, fvE> f = new HashMap();
    public static final int b = 60846749;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean c() {
        return this.e;
    }

    public boolean getAdaptToContentSize() {
        return this.e;
    }

    public void setAdaptToContentSize(boolean bl) {
        this.e = bl;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        if (this.e) {
            int n = 0;
            int n2 = 0;
            ArrayList<fvE> arrayList = fso2.getWidgetChildren();
            for (int k = 0; k < arrayList.size(); ++k) {
                fjf_2 fjf_22;
                fvE fvE2 = arrayList.get(k);
                if (!fvE2.getVisible()) continue;
                fid_1 fid_12 = (fid_1)fvE2.getLayoutData();
                int n3 = 0;
                int n4 = 0;
                if (fid_12.isXInit()) {
                    n3 = fid_12.getX();
                }
                if (fid_12.isYInit()) {
                    n4 = fid_12.getY();
                }
                if (fid_12.getSize() != null) {
                    int n5;
                    fjf_22 = fid_12.getSize();
                    fjf_2 fjf_23 = fvE2.getMinSize();
                    if (fjf_22.a() == -1.0f) {
                        n5 = (int)fjf_22.getWidth();
                        n = Math.max(fjf_22.width + n3, n);
                        if (n5 == -1) {
                            n5 = fvE2.m_size.width;
                        } else if (n5 == -2) {
                            n5 = (int)fjf_23.getWidth();
                        }
                        n = Math.max(n5 + n3, n);
                    } else {
                        n = Math.max(Math.round((float)fjf_23.width / fjf_22.a() * 100.0f) + n3, n);
                    }
                    if (fjf_22.b() == -1.0f) {
                        n5 = (int)fjf_22.getHeight();
                        n = Math.max(fjf_22.height + n4, n);
                        if (n5 == -1) {
                            n5 = fvE2.m_size.height;
                        } else if (n5 == -2) {
                            n5 = (int)fjf_23.getHeight();
                        }
                        n = Math.max(n5 + n4, n);
                        continue;
                    }
                    n = Math.max(Math.round((float)fjf_23.height / fjf_22.b() * 100.0f) + n4, n);
                    continue;
                }
                fjf_22 = fvE2.getMinSize();
                n = Math.max(fjf_22.width + n3, n);
                n2 = Math.max(fjf_22.height + n4, n2);
            }
            return new fjf_2(n, n2);
        }
        return new fjf_2(0, 0);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        if (this.e) {
            int n = 0;
            int n2 = 0;
            ArrayList<fvE> arrayList = fso2.getWidgetChildren();
            for (int k = 0; k < arrayList.size(); ++k) {
                fjf_2 fjf_22;
                fid_1 fid_12;
                fvE fvE2 = arrayList.get(k);
                if (!fvE2.getVisible() || !(fvE2.getLayoutData() instanceof fid_1) || (fid_12 = (fid_1)fvE2.getLayoutData()) == null) continue;
                int n3 = 0;
                int n4 = 0;
                if (fid_12.isXInit()) {
                    n3 = fid_12.getX();
                }
                if (fid_12.isYInit()) {
                    n4 = fid_12.getY();
                }
                if (fid_12.getSize() != null) {
                    int n5;
                    fjf_22 = fid_12.getSize();
                    fjf_2 fjf_23 = fvE2.getPrefSize();
                    if (fjf_22.a() == -1.0f) {
                        n5 = (int)fjf_22.getWidth();
                        n = Math.max(fjf_22.width + n3, n);
                        if (n5 == -1) {
                            n5 = fvE2.m_size.width;
                        } else if (n5 == -2) {
                            n5 = (int)fjf_23.getWidth();
                        }
                        n = Math.max(n5 + n3, n);
                    } else {
                        n = Math.max(Math.round((float)fjf_23.width / fjf_22.a() * 100.0f) + n3, n);
                    }
                    if (fjf_22.b() == -1.0f) {
                        n5 = (int)fjf_22.getHeight();
                        n2 = Math.max(fjf_22.height + n4, n2);
                        if (n5 == -1) {
                            n5 = fvE2.m_size.height;
                        } else if (n5 == -2) {
                            n5 = (int)fjf_23.getHeight();
                        }
                        n2 = Math.max(n5 + n4, n2);
                        continue;
                    }
                    n2 = Math.max(Math.round((float)fjf_23.height / fjf_22.b() * 100.0f) + n4, n2);
                    continue;
                }
                fjf_22 = fvE2.getPrefSize();
                n = Math.max(fjf_22.width + n3, n);
                n2 = Math.max(fjf_22.height + n4, n2);
            }
            return new fjf_2(n, n2);
        }
        return new fjf_2(0, 0);
    }

    @Override
    public fjf_2 getContentGreedySize(fso fso2, fvE fvE2, fjf_2 fjf_22) {
        int n;
        int n2;
        fjf_2 fjf_23;
        if (!this.e || fso2 == null || fvE2 == null) {
            return new fjf_2(0, 0);
        }
        if (!(fvE2.getLayoutData() instanceof fid_1)) {
            return new fjf_2(0, 0);
        }
        int n3 = fjf_22.width;
        int n4 = fjf_22.height;
        fid_1 fid_12 = (fid_1)fvE2.getLayoutData();
        int n5 = 0;
        int n6 = 0;
        if (fid_12.isXInit()) {
            n5 = fid_12.getX();
        }
        if (fid_12.isYInit()) {
            n6 = fid_12.getY();
        }
        if ((fjf_23 = fid_12.getSize()) != null) {
            n2 = fjf_23.a() == -1.0f ? n3 - n5 : (int)((float)n3 * fjf_23.a() / 100.0f) - n5;
            n = fjf_23.b() == -1.0f ? n4 - n6 : (int)((float)n4 * fjf_23.b() / 100.0f) - n6;
        } else {
            n2 = n3 - n5;
            n = n4 - n6;
        }
        return new fjf_2(n2, n);
    }

    public static boolean b(fso fso2, fvE fvE2) {
        int n;
        Object object;
        Object object2;
        if (fso2 == null || fvE2 == null) {
            return false;
        }
        if (fvE2 == null || fvE2.getLayoutData() == null || !fvE2.getVisible() || !(fvE2.getLayoutData() instanceof fid_1)) {
            return false;
        }
        fid_1 fid_12 = (fid_1)fvE2.getLayoutData();
        if (!fid_12.isUsable()) {
            return false;
        }
        fid_12.setUsable(false);
        if (!fid_12.isInitValue() || !fvE2.isSizeInitByUserDefinition()) {
            if (fid_12.getSize() != null) {
                object2 = fid_12.getSize();
                object = fvE2.getPrefSize();
                n = ((fjf_2)object2).a() != -1.0f ? (int)Math.round((double)((float)fso2.getAppearance().getContentWidth() * ((fjf_2)object2).a()) / 100.0) : ((fjf_2)object2).width;
                int n2 = ((fjf_2)object2).b() != -1.0f ? (int)Math.round((double)((float)fso2.getAppearance().getContentHeight() * ((fjf_2)object2).b()) / 100.0) : ((fjf_2)object2).height;
                if (n2 == -1) {
                    n2 = fvE2.m_size.height;
                } else if (n2 == -2) {
                    n2 = (int)((Dimension)object).getHeight();
                }
                if (n == -1) {
                    n = fvE2.m_size.width;
                } else if (n == -2) {
                    n = (int)((Dimension)object).getWidth();
                }
                fvE2.setSize(n, n2);
            } else {
                fvE2.setSizeToPrefSize();
            }
        }
        if (!fid_12.isInitValue() || !fvE2.isPositionInitByUserDefinition()) {
            if (fid_12.isXInit()) {
                fvE2.setX(fid_12.getX());
            }
            if (fid_12.isYInit()) {
                fvE2.setY(fid_12.getY());
            }
            if (fid_12.getAlignment() != null) {
                object2 = fid_12.getAlignment();
                int n3 = fid_12.isXOffsetInit() ? fid_12.getXOffset() : 0;
                n = fid_12.isYOffsetInit() ? fid_12.getYOffset() : 0;
                fvE2.setX(((frk_0)((Object)object2)).a(fvE2.getSize().width, fso2.getAppearance().getContentWidth()) + n3);
                fvE2.setY(((frk_0)((Object)object2)).b(fvE2.getSize().height, fso2.getAppearance().getContentHeight()) + n);
            }
            if (fid_12.getXPerc() != null) {
                fvE2.setX((int)(fid_12.getXPerc().a() / 100.0 * (double)(fso2.getAppearance().getContentWidth() - fvE2.getSize().width)));
            }
            if (fid_12.getYPerc() != null) {
                fvE2.setY((int)(fid_12.getYPerc().a() / 100.0 * (double)(fso2.getAppearance().getContentHeight() - fvE2.getSize().height)));
            }
            if (fid_12.isAutoPositionable()) {
                object2 = fid_12.getReferentWidget();
                object = ((fvE)object2).getWidgetParentOfType(ftv_0.class);
                ((ftv_0)object).getWindowManager().a(fid_12.getControlGroup(), (fvE)object2);
                fid_12.setControlGroup(null);
                fid_12.setReferentWidget(null);
                fid_12.setCascadeMethodEnabled(false);
            }
        }
        if (fid_12.isInitValue() && fvE2.isPositionInitByUserDefinition()) {
            object2 = fvE2.getWidgetParentOfType(ftv_0.class);
            fvE2.setX(Math.max(0, Math.min(fvE2.getX((fso)object2), ((fvE)object2).getWidth() - fvE2.getWidth())));
            fvE2.setY(Math.max(0, Math.min(fvE2.getY((fso)object2), ((fvE)object2).getHeight() - fvE2.getHeight())));
        }
        return true;
    }

    public static void a(fso fso2, ArrayList<fvE> arrayList) {
        fvE fvE2;
        if (fso2 == null || arrayList == null) {
            return;
        }
        f.clear();
        int n = fso2.getAppearance().getContentWidth();
        int n2 = fso2.getAppearance().getContentHeight();
        int n3 = arrayList.size();
        for (int k = 0; k < n3; ++k) {
            int n4;
            int n5;
            fid_1 fid_12;
            fif_1 fif_12;
            fvE2 = arrayList.get(k);
            if (fvE2 == null || (fif_12 = fvE2.getLayoutData()) == null || !fvE2.getVisible() || !(fif_12 instanceof fid_1) || !(fid_12 = (fid_1)fif_12).isUsable()) continue;
            fid_12.setUsable(false);
            if (!fid_12.isInitValue() || !fvE2.isSizeInitByUserDefinition()) {
                fjf_2 fjf_22 = fid_12.getSize();
                if (fjf_22 != null) {
                    fjf_2 fjf_23 = fvE2.getPrefSize();
                    n5 = fjf_22.a() != -1.0f ? Hw.b((float)n * fjf_22.a() / 100.0f) : fjf_22.width;
                    n4 = fjf_22.b() != -1.0f ? Hw.b((float)n2 * fjf_22.b() / 100.0f) : fjf_22.height;
                    if (n4 == -1) {
                        n4 = fvE2.m_size.height;
                    } else if (n4 == -2) {
                        n4 = (int)fjf_23.getHeight();
                    }
                    if (n5 == -1) {
                        n5 = fvE2.m_size.width;
                    } else if (n5 == -2) {
                        n5 = (int)fjf_23.getWidth();
                    }
                    fvE2.setSize(n5, n4);
                } else {
                    fvE2.setSizeToPrefSize();
                }
            }
            int n6 = fvE2.getX();
            int n7 = fvE2.getY();
            if (!fid_12.isInitValue() || !fvE2.isPositionInitByUserDefinition()) {
                if (fid_12.isXInit()) {
                    n6 = fid_12.getX();
                }
                if (fid_12.isYInit()) {
                    n7 = fid_12.getY();
                }
                n5 = fvE2.getSize().width;
                n4 = fvE2.getSize().height;
                if (fid_12.getAlignment() != null) {
                    frk_0 frk_02 = fid_12.getAlignment();
                    int n8 = fid_12.isXOffsetInit() ? fid_12.getXOffset() : 0;
                    int n9 = fid_12.isYOffsetInit() ? fid_12.getYOffset() : 0;
                    n6 = frk_02.a(n5, n) + n8;
                    n7 = frk_02.b(n4, n2) + n9;
                }
                if (fid_12.getXPerc() != null) {
                    int n10 = fid_12.isXOffsetInit() ? fid_12.getXOffset() : 0;
                    n6 = (int)Hw.b(fid_12.getXPerc().a() / 100.0 * (double)(n - n5)) + n10;
                }
                if (fid_12.getYPerc() != null) {
                    int n11 = fid_12.isYOffsetInit() ? fid_12.getYOffset() : 0;
                    n7 = (int)Hw.b(fid_12.getYPerc().a() / 100.0 * (double)(n2 - n4)) + n11;
                }
                if (fid_12.isAutoPositionable()) {
                    f.put(fid_12.getControlGroup(), fid_12.getReferentWidget());
                    fid_12.setReferentWidget(null);
                }
            } else {
                ftv_0 ftv_02 = fvE2.getWidgetParentOfType(ftv_0.class);
                n6 = Math.max(0, Math.min(fvE2.getX(ftv_02), ftv_02.getWidth() - fvE2.getWidth()));
                n7 = Math.max(0, Math.min(fvE2.getY(ftv_02), ftv_02.getHeight() - fvE2.getHeight()));
            }
            fvE2.setPosition(n6, n7);
        }
        if (f.size() != 0) {
            for (Map.Entry<String, fvE> entry : f.entrySet()) {
                fvE2 = entry.getValue().getWidgetParentOfType(ftv_0.class);
                ((ftv_0)fvE2).getWindowManager().a(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public void a(fso fso2) {
        fic_1.a(fso2, fso2.getWidgetChildren());
    }

    @Override
    public void a(fso fso2, fvE fvE2) {
        fic_1.b(fso2, fvE2);
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        ((fic_1)fyo2).setAdaptToContentSize(this.e);
    }

    public fic_1 a() {
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        this.copyElement(fic_12);
        return fic_12;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.c = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 60846749) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setAdaptToContentSize(Co.a(string));
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

