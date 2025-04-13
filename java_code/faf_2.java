/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fAf
 */
public class faf_2
extends fyg_0 {
    public static final String TAG = "ItemRenderer";
    private static final Logger E = Logger.getLogger(faf_2.class);
    private fag_2 F = null;
    private ArrayList<fyb_0> G = new ArrayList();
    private fsv_0 H = null;
    private fak_2 I;
    private ArrayList<fiy_1> J = new ArrayList();
    private ArrayList<fzq> K = new ArrayList();
    private static final ArrayList<fyb_0> L = new ArrayList();
    public static final int a = 1086840917;
    public static final int b = -1351902487;
    public static final int c = -1164731176;
    public static final int d = 1737415497;
    public static final int e = 2096925462;
    public static final int f = 1076426565;
    public static final int g = -842497956;
    public static final int h = -347632250;
    public static final int i = -1037804509;
    public static final int j = 511141863;
    public static final int k = 520837978;
    public static final int l = 1497720703;
    public static final int m = 555106394;
    public static final int n = 881302303;
    public static final int o = 1550573716;
    public static final int p = 29251698;
    public static final int q = 555142212;
    public static final int r = 555372279;
    public static final int s = 39515613;
    public static final int t = 728660769;
    public static final int u = 45681909;
    public static final int v = 552298621;
    public static final int w = 151596945;
    public static final int x = -1013405773;
    public static final int y = -1013405330;
    public static final int z = -1046180197;
    public static final int A = -1032982784;
    public static final int B = 1928152871;
    public static final int C = 1055781365;
    public static final int D = -647313169;

    public void b(ftj_0 ftj_02) {
        for (fzq fzq2 : this.K) {
            ftj_02.addEventListener(fzq2.a(), fzq2, false);
        }
    }

    public void c(ftj_0 ftj_02) {
        for (fzq fzq2 : this.K) {
            ftj_02.removeEventListener(fzq2.a(), fzq2, false);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fag_2 getManager() {
        return this.F;
    }

    public void setManager(fag_2 fag_22) {
        this.F = fag_22;
    }

    public void setOnActivation(fcx_2 fcx_22) {
        this.K.add(fcx_22);
    }

    public void setOnClick(fdt_1 fdt_12) {
        this.K.add(fdt_12);
    }

    public void setOnDoubleClick(fdu_1 fdu_12) {
        this.K.add(fdu_12);
    }

    public void setOnFocusChange(fdh_2 fdh_22) {
        this.K.add(fdh_22);
    }

    public void setOnKeyPress(fdm_2 fdm_22) {
        this.K.add(fdm_22);
    }

    public void setOnKeyRelease(fdn_1 fdn_12) {
        this.K.add(fdn_12);
    }

    public void setOnKeyType(fdo_1 fdo_12) {
        this.K.add(fdo_12);
    }

    public void setOnListSelectionChange(fdp_1 fdp_12) {
        this.K.add(fdp_12);
    }

    public void setOnMouseDrag(fdw_1 fdw_12) {
        this.K.add(fdw_12);
    }

    public void setOnMouseDragIn(fdv_1 fdv_12) {
        this.K.add(fdv_12);
    }

    public void setOnMouseDragOut(fdx_1 fdx_12) {
        this.K.add(fdx_12);
    }

    public void setOnMouseEnter(fdy_1 fdy_12) {
        this.K.add(fdy_12);
    }

    public void setOnMouseExit(fdz_1 fdz_12) {
        this.K.add(fdz_12);
    }

    public void setOnMouseMove(fda_1 fda_12) {
        this.K.add(fda_12);
    }

    public void setOnMousePress(fdb_1 fdb_12) {
        this.K.add(fdb_12);
    }

    public void setOnMouseRelease(fdc_2 fdc_22) {
        this.K.add(fdc_22);
    }

    public void setOnMouseWheel(fdd_1 fdd_12) {
        this.K.add(fdd_12);
    }

    public void setOnItemOut(fdk_2 fdk_22) {
        this.K.add(fdk_22);
    }

    public void setOnItemOver(fdl_2 fdl_22) {
        this.K.add(fdl_22);
    }

    public void setOnItemClick(fdi_1 fdi_12) {
        this.K.add(fdi_12);
    }

    public void setOnItemDoubleClick(fdj_1 fdj_12) {
        this.K.add(fdj_12);
    }

    public void setOnDrag(fdb_2 fdb_22) {
        this.K.add(fdb_22);
    }

    public void setOnDrop(fde_1 fde_12) {
        this.K.add(fde_12);
    }

    public void setOnDropOut(fdf_1 fdf_12) {
        this.K.add(fdf_12);
    }

    public void setOnDragOut(fdc_1 fdc_12) {
        this.K.add(fdc_12);
    }

    public void setOnDragOver(fdd_2 fdd_22) {
        this.K.add(fdd_22);
    }

    public void setOnSliderMove(fdj_2 fdj_22) {
        this.K.add(fdj_22);
    }

    public void setOnSelectionChange(fdi_2 fdi_22) {
        this.K.add(fdi_22);
    }

    public void setOnPopupDisplay(fde_2 fde_22) {
        this.K.add(fde_22);
    }

    public void setOnPopupHide(fdf_2 fdf_22) {
        this.K.add(fdf_22);
    }

    @Override
    public void add(fyb_0 fyb_02) {
        boolean bl = true;
        if (fyb_02 instanceof fak_2) {
            this.I = (fak_2)((Object)fyb_02);
        } else if (fyb_02 instanceof fiy_1) {
            this.J.add((fiy_1)fyb_02);
        } else {
            if (fyb_02 instanceof fvE) {
                ((fvE)fyb_02).setVisible(false);
            }
            this.G.add(fyb_02);
            fyb_02.setIsATemplate(true);
            bl = false;
        }
        if (bl) {
            super.add(fyb_02, false);
        }
    }

    public boolean isRenderableCompatible(ftj_0 ftj_02) {
        Object object;
        if (this.I != null && (object = this.I.getResult(ftj_02)) instanceof Boolean) {
            return (Boolean)object;
        }
        return true;
    }

    public void a(ftj_0 ftj_02) {
        Object object;
        this.H = null;
        ArrayList<fir_1> arrayList = new ArrayList<fir_1>();
        fyy_0 fyy_02 = new fyy_0(null, this.m_elementMap.a());
        fyy_02.a(this.m_elementMap);
        for (fiy_1 fiy_12 : this.J) {
            fiy_12.a();
            object = fiy_12.getProperty();
            if (object != null) {
                ((fit_1)object).a(ftj_02);
            }
            fiy_12.a(ftj_02);
        }
        this.b(ftj_02);
        int n = this.G.size();
        for (int k = 0; k < n; ++k) {
            object = this.G.get(k).cloneElementStructure();
            if (object instanceof fvE) {
                ((fvE)object).setVisible(true);
            }
            this.a((fyb_0)object, L, arrayList, ftj_02, null, fyy_02);
            ftj_02.a((fyb_0)object);
        }
        if (this.H != null) {
            ftj_02.setDragNDropable(this.H);
        }
        ftj_02.setInnerElementMap(fyy_02);
        ftj_02.setRenderableChildren(L.toArray(new fyb_0[L.size()]));
        ftj_02.setItemElements(arrayList);
        L.clear();
    }

    private void a(fyb_0 fyb_02, ArrayList<fyb_0> arrayList, ArrayList<fir_1> arrayList2, ftj_0 ftj_02, fsv_0 fsv_02, fyy_0 fyy_02) {
        fyb_02.setElementMap(fyy_02);
        if (fyb_02.getId() != null) {
            fyy_02.a(fyb_02.getId(), fyb_02);
        }
        if (fyb_02 instanceof fir_1 && fyb_02.getParentOfType(faf_2.class) == null) {
            arrayList2.add((fir_1)fyb_02);
            fyb_0 fyb_03 = fyb_02.getParent() != null ? fyb_02.getParent() : ftj_02;
            if (!arrayList.contains(fyb_03)) {
                arrayList.add(fyb_03);
            }
        }
        if (fyb_02 instanceof fvE) {
            fyb_02.setRenderableParent(ftj_02);
            if (fyb_02 instanceof fsv_0) {
                this.H = fsv_02 = (fsv_0)fyb_02;
                ((fvE)fyb_02).setDragAndDropParent(fsv_02);
            }
        }
        for (fyb_0 fyb_04 : fyb_02.getChildren()) {
            this.a(fyb_04, arrayList, arrayList2, ftj_02, fsv_02, fyy_02);
        }
    }

    private void a(fyb_0 fyb_02, String string, int n, fiq_1 fiq_12, String string2, fak_2 fak_22) {
        if (fyb_02 == null || string == null) {
            return;
        }
        try {
            fju_1.a(string, fyb_02, fiq_12, n, string2, fak_22);
        }
        catch (Exception exception) {
            E.error((Object)("Erreur \u00e0 l'invoke method=" + string), (Throwable)exception);
        }
    }

    public void a(fyb_0[] fyb_0Array, fiq_1 fiq_12) {
        if (fyb_0Array == null) {
            return;
        }
        for (fyb_0 fyb_02 : fyb_0Array) {
            ArrayList<fyb_0> arrayList = fyb_02.getChildren();
            fyb_0[] fyb_0Array2 = arrayList.toArray(new fyb_0[arrayList.size()]);
            fyb_02.prepareRender();
            for (fyb_0 fyb_03 : fyb_0Array2) {
                if (!(fyb_03 instanceof fir_1)) continue;
                fir_1 fir_12 = (fir_1)fyb_03;
                String string = fiq_12 != null ? fir_12.getField() : null;
                this.a(fyb_02, fir_12.getAttribute(), fir_12.getAttributeHash(), fiq_12, string, fir_12.getResultProvider());
            }
        }
    }

    @Override
    public boolean runBeforeListeners(fzs fzs2) {
        return false;
    }

    @Override
    public boolean runAfterListeners(fzs fzs2) {
        return false;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.I = null;
        this.H = null;
        this.K.clear();
        this.K = null;
        this.J.clear();
        this.J = null;
        if (this.G != null) {
            for (int k = this.G.size() - 1; k >= 0; --k) {
                this.G.get(k).release();
            }
            this.G.clear();
            this.G = null;
        }
        this.F = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        faf_2 faf_22 = (faf_2)fyo2;
        faf_22.K.addAll(this.K);
        for (int k = 0; k < this.G.size(); ++k) {
            faf_22.G.add(this.G.get(k).cloneElementStructure());
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1086840917) {
            this.setOnActivation(fze2.a(fcx_2.class, string));
        } else if (n == -1351902487) {
            this.setOnClick(fze2.a(fdt_1.class, string));
        } else if (n == -1164731176) {
            this.setOnDoubleClick(fze2.a(fdu_1.class, string));
        } else if (n == 1737415497) {
            this.setOnFocusChange(fze2.a(fdh_2.class, string));
        } else if (n == 2096925462) {
            this.setOnItemClick(fze2.a(fdi_1.class, string));
        } else if (n == 1076426565) {
            this.setOnItemDoubleClick(fze2.a(fdj_1.class, string));
        } else if (n == -842497956) {
            this.setOnItemOut(fze2.a(fdk_2.class, string));
        } else if (n == -347632250) {
            this.setOnItemOver(fze2.a(fdl_2.class, string));
        } else if (n == -1013405773) {
            this.setOnDrag(fze2.a(fdb_2.class, string));
        } else if (n == -1013405330) {
            this.setOnDrop(fze2.a(fde_1.class, string));
        } else if (n == -1046180197) {
            this.setOnDragOut(fze2.a(fdc_1.class, string));
        } else if (n == -1032982784) {
            this.setOnDropOut(fze2.a(fdf_1.class, string));
        } else if (n == 1928152871) {
            this.setOnDragOver(fze2.a(fdd_2.class, string));
        } else if (n == -1037804509) {
            this.setOnKeyPress(fze2.a(fdm_2.class, string));
        } else if (n == 511141863) {
            this.setOnKeyRelease(fze2.a(fdn_1.class, string));
        } else if (n == 520837978) {
            this.setOnKeyType(fze2.a(fdo_1.class, string));
        } else if (n == 1497720703) {
            this.setOnListSelectionChange(fze2.a(fdp_1.class, string));
        } else if (n == 555106394) {
            this.setOnMouseDrag(fze2.a(fdw_1.class, string));
        } else if (n == 881302303) {
            this.setOnMouseDragIn(fze2.a(fdv_1.class, string));
        } else if (n == 1550573716) {
            this.setOnMouseDragOut(fze2.a(fdx_1.class, string));
        } else if (n == 29251698) {
            this.setOnMouseEnter(fze2.a(fdy_1.class, string));
        } else if (n == 555142212) {
            this.setOnMouseExit(fze2.a(fdz_1.class, string));
        } else if (n == 555372279) {
            this.setOnMouseMove(fze2.a(fda_1.class, string));
        } else if (n == 39515613) {
            this.setOnMousePress(fze2.a(fdb_1.class, string));
        } else if (n == 728660769) {
            this.setOnMouseRelease(fze2.a(fdc_2.class, string));
        } else if (n == 45681909) {
            this.setOnMouseWheel(fze2.a(fdd_1.class, string));
        } else if (n == 552298621) {
            this.setOnSelectionChange(fze2.a(fdi_2.class, string));
        } else if (n == 151596945) {
            this.setOnSliderMove(fze2.a(fdj_2.class, string));
        } else if (n == 1055781365) {
            this.setOnPopupDisplay(fze2.a(fde_2.class, string));
        } else if (n == -647313169) {
            this.setOnPopupHide(fze2.a(fdf_2.class, string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }
}

