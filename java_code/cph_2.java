/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cPh
 */
public class cph_2
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fso2.setNonBlocking(false);
        fso2.setStyle("MainBackground");
        fso2.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("visible");
        fiy_12.setName("isInGame");
        fso2.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_03);
        fiy_12.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fau_1 fau_12 = new fau_1();
        fau_12.onCheckOut();
        fau_12.setElementMap(fyy_03);
        far_22.addBasicElement(fau_12);
        fau_12.onAttributesInitialized();
        fau_12.onChildrenAdded();
        far_22.onChildrenAdded();
        fiy_12.onChildrenAdded();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.q);
        fid_12.setSize(new fjf_2(-2, -2));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso3 = fso2;
        fqj fqj2 = ((fvE)fso3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 0, 2, 2));
        fqj2.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(7, 8, 7, 8));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fso2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fso4.setExpandable(false);
        fso4.setPrefSize(new fjf_2(33, 35));
        fso2.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fso4.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fru_02.setExpandable(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu:openMenuDialog");
        fru_02.setOnClick(fdt_12);
        fde_2 fde_22 = new fde_2();
        fde_22.a("popup(descOpenMenuPopup)");
        fru_02.setOnPopupDisplay(fde_22);
        fdf_2 fdf_22 = new fdf_2();
        fdf_22.a("closePopup");
        fru_02.setOnPopupHide(fdf_22);
        fru_02.setPrefSize(new fjf_2(33, 35));
        fru_02.setStyle("worldBar");
        fso4.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setAlign(frk_0.i);
        fru_02.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        String string = "descOpenMenuPopup";
        fil_1 fil_12 = new fil_1();
        fil_12.onCheckOut();
        fil_12.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fil_12);
        }
        fil_12.setAlign(frs_0.b);
        fil_12.setHotSpotPosition(frs_0.h);
        fru_02.addBasicElement(fil_12);
        fil_12.onAttributesInitialized();
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        fso5.setPrefSize(new fjf_2(10, 0));
        fso5.setStyle("popup");
        fil_12.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        fii_2 fii_22 = fii_2.checkOut();
        fii_22.setElementMap(fyy_03);
        fii_22.setData(frg_0.a);
        fso5.addBasicElement(fii_22);
        fii_22.onAttributesInitialized();
        fii_22.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setStyle("PopupInformation");
        String string2 = "%menu%";
        string2 = string2.replace("%menu%", fpm_0.b().c("menu"));
        fsM2.c(string2);
        fso5.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlignment(frs_0.d);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fsM2.onChildrenAdded();
        fso5.onChildrenAdded();
        fil_12.onChildrenAdded();
        fru_02.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fsk_02.setNonBlocking(true);
        fsk_02.setStyle("Options");
        fso4.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.i);
        fid_14.setSize(new fjf_2(30, 30));
        fid_14.setXOffset(-2);
        fsk_02.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fso4.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

