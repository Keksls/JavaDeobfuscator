/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cMO
 */
public class cmo_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        fvk_0 fvk_02 = new fvk_0();
        fvk_02.onCheckOut();
        fvk_02.setElementMap(fyy_03);
        fvk_02.setPrefSize(new fjf_2(180, 180));
        fvk_02.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fvk_02.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fvk_02.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso2.onChildrenAdded();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        fso3.setStyle("windowNew");
        fvk_02.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fso fso4 = fso3;
        fqj fqj2 = ((fvE)fso4).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso3.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(10, 5, 12, 5));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fso3.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setAlign(frs_0.b);
        fin_22.setHorizontal(false);
        fso3.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fvM fvM2 = new fvM();
        fvM2.onCheckOut();
        fvM2.setElementMap(fyy_03);
        fvM2.setExpandable(false);
        fso3.addBasicElement(fvM2);
        fvM2.onAttributesInitialized();
        fvM fvM3 = fvM2;
        fqj fqj3 = ((fvE)fvM3).getAppearance();
        fqj3.setElementMap(fyy_03);
        fvM2.addBasicElement(fqj3);
        fqj3.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 10, 0, 10));
        fqj3.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqj3.onChildrenAdded();
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        fso5.setStyle("titleBar");
        fvM2.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        fso fso6 = fso5;
        fqj fqj4 = ((fvE)fso6).getAppearance();
        fqj4.setElementMap(fyy_03);
        fso5.addBasicElement(fqj4);
        fqj4.onAttributesInitialized();
        fqo_0 fqo_03 = new fqo_0();
        fqo_03.onCheckOut();
        fqo_03.setElementMap(fyy_03);
        fqo_03.setInsets(new Insets(3, 20, 3, 20));
        fqj4.addBasicElement(fqo_03);
        fqo_03.onAttributesInitialized();
        fqo_03.onChildrenAdded();
        fqj4.onChildrenAdded();
        fso fso7 = fso.checkOut();
        fso7.setElementMap(fyy_03);
        fso7.setPrefSize(new fjf_2(0, 22));
        fso5.addBasicElement(fso7);
        fso7.onAttributesInitialized();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.e);
        fso7.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        fuk_02.setMaxWidth(100);
        fuk_02.setMultiline(true);
        fuk_02.setNonBlocking(true);
        fuk_02.setStyle("white");
        fso7.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fuk_0 fuk_03 = fuk_02;
        fqh_0 fqh_02 = (fqh_0)((fvE)fuk_03).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlignment(frs_0.e);
        fuk_02.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("text");
        fiy_12.setField("individualPermsTitle");
        fiy_12.setName("roomViewDisplayed");
        fuk_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fso7.onChildrenAdded();
        fso5.onChildrenAdded();
        fvM2.onChildrenAdded();
        fso fso8 = fso.checkOut();
        fso8.setElementMap(fyy_03);
        fso3.addBasicElement(fso8);
        fso8.onAttributesInitialized();
        fso fso9 = fso8;
        fqj fqj5 = ((fvE)fso9).getAppearance();
        fqj5.setElementMap(fyy_03);
        fso8.addBasicElement(fqj5);
        fqj5.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(0, 12, 0, 12));
        fqj5.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqj5.onChildrenAdded();
        String string = "windowContentContainer";
        fso fso10 = fso.checkOut();
        fso10.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso10);
        }
        fso8.addBasicElement(fso10);
        fso10.onAttributesInitialized();
        fso fso11 = fso.checkOut();
        fso11.setElementMap(fyy_03);
        fso11.setPrefSize(new fjf_2(160, 150));
        fso11.setStyle("white");
        fso10.addBasicElement(fso11);
        fso11.onAttributesInitialized();
        fso fso12 = fso11;
        fqj fqj6 = ((fvE)fso12).getAppearance();
        fqj6.setElementMap(fyy_03);
        fso11.addBasicElement(fqj6);
        fqj6.onAttributesInitialized();
        fqo_0 fqo_04 = new fqo_0();
        fqo_04.onCheckOut();
        fqo_04.setElementMap(fyy_03);
        fqo_04.setInsets(new Insets(10, 10, 10, 10));
        fqj6.addBasicElement(fqo_04);
        fqo_04.onAttributesInitialized();
        fqo_04.onChildrenAdded();
        fqj6.onChildrenAdded();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setAlign(frs_0.b);
        fin_23.setHorizontal(false);
        fso11.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fso fso13 = fso.checkOut();
        fso13.setElementMap(fyy_03);
        fso13.setExpandable(false);
        fso13.setPrefSize(new fjf_2(180, 150));
        fso11.addBasicElement(fso13);
        fso13.onAttributesInitialized();
        fin_2 fin_24 = fin_2.checkOut();
        fin_24.setAlign(frs_0.b);
        fin_24.setHorizontal(false);
        fso13.addBasicElement(fin_24);
        fin_24.onAttributesInitialized();
        fin_24.onChildrenAdded();
        fsQ fsQ2 = new fsQ();
        fsQ2.onCheckOut();
        fsQ2.setElementMap(fyy_03);
        fsQ2.setCellSize(new fjf_2(160, 25));
        fsQ2.setHorizontal(false);
        fsQ2.setPrefSize(new fjf_2(0, 150));
        fsQ2.setScrollBarBehaviour(fra_0.b);
        fso13.addBasicElement(fsQ2);
        fsQ2.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("content");
        fiy_13.setField("individualPerms");
        fiy_13.setName("roomViewDisplayed");
        fsQ2.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        faf_2 faf_22 = new faf_2();
        faf_22.onCheckOut();
        faf_22.setElementMap(fyy_03);
        fsQ2.addBasicElement(faf_22);
        faf_22.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_03);
        faf_22.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fav_1 fav_12 = new fav_1();
        fav_12.onCheckOut();
        fav_12.setElementMap(fyy_03);
        far_22.addBasicElement(fav_12);
        fav_12.onAttributesInitialized();
        fab_2 fab_22 = new fab_2();
        fab_22.onCheckOut();
        fab_22.setElementMap(fyy_03);
        fav_12.addBasicElement(fab_22);
        fab_22.onAttributesInitialized();
        fab_22.onChildrenAdded();
        fav_12.onChildrenAdded();
        far_22.onChildrenAdded();
        fso fso14 = fso.checkOut();
        fso14.setElementMap(fyy_03);
        fso14.setPrefSize(new fjf_2(0, 10));
        fso14.setStyle("caracs");
        faf_22.addBasicElement(fso14);
        fso14.onAttributesInitialized();
        String string2 = "name";
        fij_1 fij_12 = new fij_1();
        fij_12.onCheckOut();
        fij_12.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fij_12);
        }
        fso14.addBasicElement(fij_12);
        fij_12.onAttributesInitialized();
        fir_1 fir_12 = new fir_1();
        fir_12.onCheckOut();
        fir_12.setElementMap(fyy_03);
        fir_12.setAttribute("value");
        fir_12.setField("name");
        fij_12.addBasicElement(fir_12);
        fir_12.onAttributesInitialized();
        fir_12.onChildrenAdded();
        fij_12.onChildrenAdded();
        fih_2 fih_22 = new fih_2();
        fih_22.onCheckOut();
        fso14.addBasicElement(fih_22);
        fih_22.onAttributesInitialized();
        fih_22.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setPrefSize(new fjf_2(130, 0));
        fso14.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fir_1 fir_13 = new fir_1();
        fir_13.onCheckOut();
        fir_13.setElementMap(fyy_03);
        fir_13.setAttribute("text");
        fir_13.setField("name");
        fsM2.addBasicElement(fir_13);
        fir_13.onAttributesInitialized();
        fir_13.onChildrenAdded();
        fii_2 fii_22 = fii_2.checkOut();
        fii_22.setElementMap(fyy_03);
        fii_22.setData(frg_0.e);
        fsM2.addBasicElement(fii_22);
        fii_22.onAttributesInitialized();
        fii_22.onChildrenAdded();
        fsM2.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.roomAdministration:removePermission(name)");
        fru_02.setOnClick(fdt_12);
        fru_02.setStyle("closeWindow");
        fso14.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fii_2 fii_23 = fii_2.checkOut();
        fii_23.setElementMap(fyy_03);
        fii_23.setData(frg_0.d);
        fru_02.addBasicElement(fii_23);
        fii_23.onAttributesInitialized();
        fii_23.onChildrenAdded();
        fru_02.onChildrenAdded();
        fso14.onChildrenAdded();
        faf_22.onChildrenAdded();
        faf_2 faf_23 = new faf_2();
        faf_23.onCheckOut();
        faf_23.setElementMap(fyy_03);
        fsQ2.addBasicElement(faf_23);
        faf_23.onAttributesInitialized();
        far_2 far_23 = new far_2();
        far_23.onCheckOut();
        far_23.setElementMap(fyy_03);
        faf_23.addBasicElement(far_23);
        far_23.onAttributesInitialized();
        fav_1 fav_13 = new fav_1();
        fav_13.onCheckOut();
        fav_13.setElementMap(fyy_03);
        far_23.addBasicElement(fav_13);
        fav_13.onAttributesInitialized();
        fac_1 fac_12 = new fac_1();
        fac_12.onCheckOut();
        fac_12.setElementMap(fyy_03);
        fav_13.addBasicElement(fac_12);
        fac_12.onAttributesInitialized();
        fac_12.onChildrenAdded();
        fav_13.onChildrenAdded();
        far_23.onChildrenAdded();
        fso fso15 = fso.checkOut();
        fso15.setElementMap(fyy_03);
        fso15.setPrefSize(new fjf_2(0, 10));
        fso15.setStyle("caracs");
        faf_23.addBasicElement(fso15);
        fso15.onAttributesInitialized();
        fso15.onChildrenAdded();
        faf_23.onChildrenAdded();
        fsQ2.onChildrenAdded();
        fso13.onChildrenAdded();
        fso fso16 = fso.checkOut();
        fso16.setElementMap(fyy_03);
        fso11.addBasicElement(fso16);
        fso16.onAttributesInitialized();
        fii_2 fii_24 = fii_2.checkOut();
        fii_24.setElementMap(fyy_03);
        fii_24.setData(frg_0.c);
        fso16.addBasicElement(fii_24);
        fii_24.onAttributesInitialized();
        fii_24.onChildrenAdded();
        String string3 = "customName";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fug_02);
        }
        fdm_2 fdm_22 = new fdm_2();
        fdm_22.a("wakfu.roomAdministration:addPermission(customName)");
        fug_02.setOnKeyPress(fdm_22);
        fso16.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fii_2 fii_25 = fii_2.checkOut();
        fii_25.setElementMap(fyy_03);
        fii_25.setData(frg_0.a);
        fug_02.addBasicElement(fii_25);
        fii_25.onAttributesInitialized();
        fii_25.onChildrenAdded();
        fug_0 fug_03 = fug_02;
        fqh_0 fqh_03 = (fqh_0)((fvE)fug_03).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fug_02.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_03);
        fqm_04.setInsets(new Insets(5, 0, 3, 5));
        fqh_03.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fug_02.onChildrenAdded();
        fru_0 fru_03 = new fru_0();
        fru_03.onCheckOut();
        fru_03.setElementMap(fyy_03);
        fru_03.setExpandable(false);
        fdt_1 fdt_13 = new fdt_1();
        fdt_13.a("wakfu.roomAdministration:addPermission(customName)");
        fru_03.setOnClick(fdt_13);
        fde_2 fde_22 = new fde_2();
        fde_22.a("popup(descAddPopup)");
        fru_03.setOnPopupDisplay(fde_22);
        fdf_2 fdf_22 = new fdf_2();
        fdf_22.a("closePopup");
        fru_03.setOnPopupHide(fdf_22);
        fru_03.setStyle("smallValid");
        fso16.addBasicElement(fru_03);
        fru_03.onAttributesInitialized();
        String string4 = "descAddPopup";
        fil_1 fil_12 = new fil_1();
        fil_12.onCheckOut();
        fil_12.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fil_12);
        }
        fil_12.setAlign(frs_0.c);
        fil_12.setHotSpotPosition(frs_0.g);
        fru_03.addBasicElement(fil_12);
        fil_12.onAttributesInitialized();
        fso fso17 = fso.checkOut();
        fso17.setElementMap(fyy_03);
        fso17.setPrefSize(new fjf_2(10, 0));
        fso17.setStyle("popup");
        fil_12.addBasicElement(fso17);
        fso17.onAttributesInitialized();
        fii_2 fii_26 = fii_2.checkOut();
        fii_26.setElementMap(fyy_03);
        fii_26.setData(frg_0.a);
        fso17.addBasicElement(fii_26);
        fii_26.onAttributesInitialized();
        fii_26.onChildrenAdded();
        fsM fsM3 = new fsM();
        fsM3.onCheckOut();
        fsM3.setElementMap(fyy_03);
        fsM3.setStyle("PopupInformation");
        String string5 = "%chat.addName%";
        string5 = string5.replace("%chat.addName%", fpm_0.b().c("chat.addName"));
        fsM3.c(string5);
        fso17.addBasicElement(fsM3);
        fsM3.onAttributesInitialized();
        fsM fsM4 = fsM3;
        fqh_0 fqh_04 = (fqh_0)((fvE)fsM4).getAppearance();
        fqh_04.setElementMap(fyy_03);
        fqh_04.setAlignment(frs_0.d);
        fsM3.addBasicElement(fqh_04);
        fqh_04.onAttributesInitialized();
        fqh_04.onChildrenAdded();
        fsM3.onChildrenAdded();
        fso17.onChildrenAdded();
        fil_12.onChildrenAdded();
        fii_2 fii_27 = fii_2.checkOut();
        fii_27.setElementMap(fyy_03);
        fii_27.setData(frg_0.d);
        fru_03.addBasicElement(fii_27);
        fii_27.onAttributesInitialized();
        fii_27.onChildrenAdded();
        fru_03.onChildrenAdded();
        fso16.onChildrenAdded();
        fso11.onChildrenAdded();
        fso10.onChildrenAdded();
        fso8.onChildrenAdded();
        fso3.onChildrenAdded();
        fso fso18 = fso.checkOut();
        fso18.setElementMap(fyy_03);
        fvk_02.addBasicElement(fso18);
        fso18.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setSize(new fjf_2(100.0f, 100.0f));
        fso18.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fso18.onChildrenAdded();
        fru_0 fru_04 = new fru_0();
        fru_04.onCheckOut();
        fru_04.setElementMap(fyy_03);
        fru_04.setExpandable(false);
        fru_04.setStyle("close");
        fdt_1 fdt_14 = new fdt_1();
        fdt_14.a("wakfu.roomAdministration:closeIndividualPermissions");
        fru_04.setOnClick(fdt_14);
        fvk_02.addBasicElement(fru_04);
        fru_04.onAttributesInitialized();
        fid_1 fid_15 = new fid_1();
        fid_15.onCheckOut();
        fid_15.setElementMap(fyy_03);
        fid_15.setAlign(frk_0.e);
        fid_15.setSize(new fjf_2(-2, -2));
        fid_15.setXOffset(-18);
        fid_15.setYOffset(-12);
        fru_04.addBasicElement(fid_15);
        fid_15.onAttributesInitialized();
        fid_15.onChildrenAdded();
        fru_04.onChildrenAdded();
        fid_1 fid_16 = new fid_1();
        fid_16.onCheckOut();
        fid_16.setElementMap(fyy_03);
        fid_16.setAlign(frk_0.i);
        fid_16.setInitValue(true);
        fid_16.setXOffset(200);
        fvk_02.addBasicElement(fid_16);
        fid_16.onAttributesInitialized();
        fid_16.onChildrenAdded();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("visible");
        fiy_14.setName("roomViewDisplayed");
        fvk_02.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        far_2 far_24 = new far_2();
        far_24.onCheckOut();
        far_24.setElementMap(fyy_03);
        fiy_14.addBasicElement(far_24);
        far_24.onAttributesInitialized();
        fab_2 fab_23 = new fab_2();
        fab_23.onCheckOut();
        fab_23.setElementMap(fyy_03);
        far_24.addBasicElement(fab_23);
        fab_23.onAttributesInitialized();
        fab_23.onChildrenAdded();
        far_24.onChildrenAdded();
        fiy_14.onChildrenAdded();
        fvk_02.onChildrenAdded();
        return fvk_02;
    }
}

