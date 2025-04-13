/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fIn
 */
public class fin_2
extends fig_2
implements abq_1 {
    private static final Logger h = Logger.getLogger(fin_2.class);
    public static final String TAG = "RowLayout";
    public static final String a = "rl";
    private static final ObjectPool i = new abm_1(new fio_2(), 2000);
    private boolean j = true;
    private short k = 0;
    private short l = 0;
    private boolean m = true;
    private frs_0 n = frs_0.e;
    public static final int b = 3200366;
    public static final int d = 3617440;
    public static final int e = 2104043469;
    public static final int f = 1387629604;
    public static final int g = 92903173;

    public static fin_2 checkOut() {
        fin_2 fin_22;
        try {
            fin_22 = (fin_2)i.borrowObject();
            fin_22.m_currentPool = i;
        }
        catch (Exception exception) {
            h.error((Object)"Probl\u00e8me au borrowObject.");
            fin_22 = new fin_2();
            fin_22.onCheckOut();
        }
        return fin_22;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public frs_0 getAlign() {
        return this.n;
    }

    public void setAlign(frs_0 frs_02) {
        this.n = frs_02;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        int n = 0;
        int n2 = 0;
        boolean bl = true;
        if (this.j) {
            for (fvE fvE2 : fso2.getWidgetChildren()) {
                if (!fvE2.getVisible()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n += this.k;
                }
                fjf_2 fjf_22 = fvE2.getMinSize();
                n += fjf_22.width;
                n2 = Math.max(n2, fjf_22.height);
            }
        } else {
            for (fvE fvE3 : fso2.getWidgetChildren()) {
                if (!fvE3.getVisible()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n2 += this.l;
                }
                fjf_2 fjf_23 = fvE3.getMinSize();
                n2 += fjf_23.height;
                n = Math.max(n, fjf_23.width);
            }
        }
        return new fjf_2(n, n2);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        int n = 0;
        int n2 = 0;
        boolean bl = true;
        if (this.j) {
            for (int k = fso2.getWidgetChildren().size() - 1; k >= 0; --k) {
                fvE fvE2 = fso2.getWidget(k);
                if (!fvE2.getVisible()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n += this.k;
                }
                fjf_2 fjf_22 = fvE2.getPrefSize();
                n += fjf_22.width;
                n2 = Math.max(n2, fjf_22.height);
            }
        } else {
            for (int k = fso2.getWidgetChildren().size() - 1; k >= 0; --k) {
                fvE fvE3 = fso2.getWidget(k);
                if (!fvE3.getVisible()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n2 += this.l;
                }
                fjf_2 fjf_23 = fvE3.getPrefSize();
                n2 += fjf_23.height;
                n = Math.max(n, fjf_23.width);
            }
        }
        return new fjf_2(n, n2);
    }

    @Override
    public fjf_2 getContentGreedySize(fso fso2, fvE fvE2, fjf_2 fjf_22) {
        int n = fjf_22.width;
        int n2 = fjf_22.height;
        boolean bl = true;
        if (this.j) {
            for (int k = fso2.getWidgetChildren().size() - 1; k >= 0; --k) {
                fvE fvE3 = fso2.getWidget(k);
                if (!fvE3.getVisible()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n -= this.k;
                }
                if (fvE3 == fvE2) continue;
                n -= fvE3.getPrefSize().width;
            }
        } else {
            for (int k = fso2.getWidgetChildren().size() - 1; k >= 0; --k) {
                fvE fvE4 = fso2.getWidget(k);
                if (!fvE4.getVisible()) continue;
                if (bl) {
                    bl = false;
                } else {
                    n2 -= this.l;
                }
                if (fvE4 == fvE2) continue;
                n2 -= fvE4.getPrefSize().height;
            }
        }
        return new fjf_2(n, n2);
    }

    public void setHgap(short s2) {
        this.k = s2;
    }

    public boolean isHorizontal() {
        return this.j;
    }

    public void setHorizontal(boolean bl) {
        this.j = bl;
    }

    public void setVgap(short s2) {
        this.l = s2;
    }

    public void setUseLegacyVGapBehaviour(boolean bl) {
        this.m = bl;
    }

    public boolean isUseLegacyVGapBehaviour() {
        return this.m;
    }

    private ArrayList<abo_2<fvE, Integer>> a(ArrayList<fvE> arrayList, int n) {
        int n2;
        int n3;
        ArrayList<abo_2<fvE, Integer>> arrayList2 = new ArrayList<abo_2<fvE, Integer>>();
        ArrayList<fvE> arrayList3 = new ArrayList<fvE>();
        if (arrayList != null) {
            for (fvE fvE2 : arrayList) {
                if (!fvE2.isShrinkable()) continue;
                arrayList3.add(fvE2);
            }
        }
        if (arrayList3 == null || arrayList3.size() == 0) {
            return arrayList2;
        }
        for (fvE fvE2 : arrayList3) {
            abo_2<fvE, Integer> abo_22;
            fjf_2 fjf_22 = fvE2.getPrefSize();
            n3 = this.j ? fjf_22.width : fjf_22.height;
            for (n2 = arrayList2.size() - 1; n2 >= 0 && (abo_22 = arrayList2.get(n2)).b() <= n3; --n2) {
            }
            arrayList2.add(n2 + 1, new abo_2<fvE, Integer>(fvE2, n3));
        }
        int n4 = n;
        while (n4 > 0) {
            int n5 = arrayList2.get(0).b();
            int n6 = 0;
            n3 = 0;
            for (abo_2<fvE, Integer> abo_23 : arrayList2) {
                if (abo_23.b() == n5) {
                    ++n6;
                    continue;
                }
                n3 = abo_23.b();
                break;
            }
            if (n4 < n6) {
                for (int k = 0; k < n6 && n4 > 0; --n4, ++k) {
                    arrayList2.get(k).b(arrayList2.get(k).b() - 1);
                }
                break;
            }
            n2 = n5 - n3;
            if (n2 * n6 > n4 || n2 <= 0) {
                n2 = (int)Math.floor((double)n4 / (double)n6);
            }
            n4 -= n2 * n6;
            for (int k = 0; k < n6; ++k) {
                arrayList2.get(k).b(n5 - n2);
            }
        }
        return arrayList2;
    }

    @Override
    public void a(fso fso2) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        boolean bl = false;
        ArrayList<abo_2<fvE, Integer>> arrayList = null;
        ArrayList<fvE> arrayList2 = fso2.getWidgetChildren();
        if (this.j) {
            int n7;
            int n8 = fso2.getAppearance().getContentHeight();
            int n9 = fso2.getAppearance().getContentWidth();
            int n10 = arrayList2.size();
            for (n7 = 0; n7 < n10; ++n7) {
                fvE fvE2 = arrayList2.get(n7);
                if (!fvE2.getVisible()) continue;
                n9 -= fvE2.getPrefSize().width;
                ++n3;
                if (fvE2.isExpandable()) {
                    ++n4;
                }
                if (!fvE2.isShrinkable()) continue;
                ++n5;
            }
            if ((n9 -= (n3 - 1) * this.k) < 0) {
                bl = true;
                n6 = -n9;
                n9 = 0;
                arrayList = this.a(arrayList2, n6);
            }
            n7 = 0;
            if (n4 > 0) {
                n7 = (int)Math.floor((double)n9 / (double)n4);
            }
            n10 = 0;
            if (n4 > 0) {
                n10 = n9 - n7 * n4;
            }
            n = n4 == 0 ? this.n.a(n9) : 0;
            n2 = 0;
            for (int k = 0; k < arrayList2.size(); ++k) {
                int n11;
                fvE fvE3 = arrayList2.get(k);
                if (!fvE3.getVisible()) continue;
                fjf_2 fjf_22 = fvE3.getPrefSize();
                int n12 = fjf_22.width;
                int n13 = n2;
                if (bl && fvE3.isShrinkable() && arrayList != null) {
                    for (abo_2<fvE, Integer> abo_22 : arrayList) {
                        if (abo_22.a() != fvE3) continue;
                        n12 = abo_22.b();
                        break;
                    }
                }
                if (fvE3.isExpandable()) {
                    n12 += n7;
                    if (n10 > 0) {
                        ++n12;
                        --n10;
                    }
                }
                if (fvE3.getLayoutData() instanceof fip_2) {
                    n11 = fjf_22.height;
                    n13 += ((fip_2)fvE3.getLayoutData()).getAlign().b(n11, n8);
                } else {
                    n11 = n8;
                }
                fvE3.setSize(n12, n11);
                fvE3.setPosition(n, n13);
                n += n12 + this.k;
            }
        } else {
            int n14;
            int n15 = fso2.getAppearance().getContentWidth();
            int n16 = fso2.getAppearance().getContentHeight();
            int n17 = arrayList2.size();
            for (n14 = 0; n14 < n17; ++n14) {
                fvE fvE4 = arrayList2.get(n14);
                if (!fvE4.getVisible()) continue;
                n16 -= fvE4.getPrefSize().height;
                ++n3;
                if (fvE4.isExpandable()) {
                    ++n4;
                }
                if (!fvE4.isShrinkable()) continue;
                ++n5;
            }
            if ((n16 -= (n3 - 1) * this.l) < 0) {
                bl = true;
                n6 = -n16;
                n16 = 0;
                arrayList = this.a(arrayList2, n6);
            }
            n14 = 0;
            if (n4 > 0) {
                n14 = (int)Math.floor((double)n16 / (double)n4);
            }
            n17 = 0;
            if (n4 > 0) {
                n17 = n16 - n14 * n4;
            }
            n = 0;
            n2 = fso2.getAppearance().getContentHeight() - (n4 == 0 ? n16 - this.n.b(n16) : 0);
            boolean bl2 = true;
            for (int k = 0; k < arrayList2.size(); ++k) {
                int n18;
                fvE fvE5 = arrayList2.get(k);
                if (!fvE5.getVisible()) continue;
                fjf_2 fjf_23 = fvE5.getPrefSize();
                int n19 = fjf_23.height;
                int n20 = n;
                if (bl && fvE5.isShrinkable() && arrayList != null) {
                    for (abo_2<fvE, Integer> abo_23 : arrayList) {
                        if (abo_23.a() != fvE5) continue;
                        n19 = abo_23.b();
                        break;
                    }
                }
                if (fvE5.isExpandable()) {
                    n19 += n14;
                    if (n17 > 0) {
                        ++n19;
                        --n17;
                    }
                }
                if (fvE5.getLayoutData() instanceof fip_2) {
                    n18 = fjf_23.width;
                    n20 += ((fip_2)fvE5.getLayoutData()).getAlign().a(n18, n15);
                } else {
                    n18 = n15;
                }
                fvE5.setSize(n18, n19);
                n2 -= n19;
                if (!this.isUseLegacyVGapBehaviour() && bl2) {
                    bl2 = false;
                } else {
                    n2 -= this.l;
                }
                fvE5.setPosition(n20, n2);
            }
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        fin_2 fin_22 = (fin_2)fyo2;
        super.copyElement(fin_22);
        fin_22.k = this.k;
        fin_22.l = this.l;
        fin_22.j = this.j;
        fin_22.n = this.n;
        fin_22.m = this.m;
    }

    public fin_2 a() {
        fin_2 fin_22 = fin_2.checkOut();
        this.copyElement(fin_22);
        return fin_22;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.j = true;
        this.k = 0;
        this.l = 0;
        this.m = true;
        this.n = frs_0.e;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 3200366) {
            this.setHgap(Co.h(string));
        } else if (n == 3617440) {
            this.setVgap(Co.h(string));
        } else if (n == 2104043469) {
            this.setUseLegacyVGapBehaviour(Co.a(string));
        } else if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
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

