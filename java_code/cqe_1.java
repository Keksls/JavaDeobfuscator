/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cQE
 */
public class cqe_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "setContainerPopup";
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso2);
        }
        fso2.setPrefSize(new fjf_2(260, 0));
        fso2.setStyle("popup");
        fso2.onAttributesInitialized();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fso2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        fuk_02.setExpandable(false);
        fuk_02.setMinWidth(260);
        fuk_02.setStyle("bigTitle");
        fso2.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.d);
        fuk_02.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("text");
        fiy_12.setField("nameAndNumber");
        fiy_12.setName("itemPopupDetail");
        fuk_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        fso3.setExpandable(false);
        fso3.setPrefSize(new fjf_2(50, 1));
        fso3.setStyle("lineSeparator2");
        fso2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fso fso4 = fso3;
        fqj fqj2 = ((fvE)fso4).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso3.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(5, 20, 5, 20));
        fqj2.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fso3.onChildrenAdded();
        fsQ fsQ2 = new fsQ();
        fsQ2.onCheckOut();
        fsQ2.setElementMap(fyy_03);
        fsQ2.setAutoIdealSize(true);
        fsQ2.setCellSize(new fjf_2(20.0f, 41));
        fsQ2.setExpandable(false);
        fsQ2.setHorizontal(false);
        fsQ2.setIdealSizeMaxColumns(5);
        fsQ2.setIdealSizeMaxRows(3);
        fsQ2.setIdealSizeMinColumns(5);
        fsQ2.setIdealSizeMinRows(1);
        fsQ2.setPrefSize(new fjf_2(205, 0));
        fso2.addBasicElement(fsQ2);
        fsQ2.onAttributesInitialized();
        fip_2 fip_23 = new fip_2();
        fip_23.onCheckOut();
        fip_23.setElementMap(fyy_03);
        fip_23.setAlign(frs_0.e);
        fsQ2.addBasicElement(fip_23);
        fip_23.onAttributesInitialized();
        fip_23.onChildrenAdded();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("content");
        fiy_13.setField("items");
        fiy_13.setName("itemPopupDetail");
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
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        faf_22.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fso5.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fso fso6 = fso.checkOut();
        fso6.setElementMap(fyy_03);
        fic_12.addBasicElement(fso6);
        fso6.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fso6.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fir_1 fir_12 = new fir_1();
        fir_12.onCheckOut();
        fir_12.setElementMap(fyy_03);
        fir_12.setAttribute("style");
        fso6.addBasicElement(fir_12);
        fir_12.onAttributesInitialized();
        far_2 far_23 = new far_2();
        far_23.onCheckOut();
        far_23.setElementMap(fyy_03);
        far_23.setElseValue("itemBackground");
        far_23.setValue("itemVirtualBackground");
        fir_12.addBasicElement(far_23);
        far_23.onAttributesInitialized();
        fan_2 fan_22 = new fan_2();
        fan_22.onCheckOut();
        fan_22.setElementMap(fyy_03);
        far_23.addBasicElement(fan_22);
        fan_22.onAttributesInitialized();
        fau_1 fau_12 = new fau_1();
        fau_12.onCheckOut();
        fau_12.setElementMap(fyy_03);
        fan_22.addBasicElement(fau_12);
        fau_12.onAttributesInitialized();
        fir_1 fir_13 = new fir_1();
        fir_13.onCheckOut();
        fir_13.setElementMap(fyy_03);
        fir_13.setAttribute("comparedValue");
        fir_13.setField("isInInventory");
        fau_12.addBasicElement(fir_13);
        fir_13.onAttributesInitialized();
        fir_13.onChildrenAdded();
        fau_12.onChildrenAdded();
        fau_1 fau_13 = new fau_1();
        fau_13.onCheckOut();
        fau_13.setElementMap(fyy_03);
        fan_22.addBasicElement(fau_13);
        fau_13.onAttributesInitialized();
        fir_1 fir_14 = new fir_1();
        fir_14.onCheckOut();
        fir_14.setElementMap(fyy_03);
        fir_14.setAttribute("comparedValue");
        fir_14.setField("isEquiped");
        fau_13.addBasicElement(fir_14);
        fir_14.onAttributesInitialized();
        fir_14.onChildrenAdded();
        fau_13.onChildrenAdded();
        fan_22.onChildrenAdded();
        far_23.onChildrenAdded();
        fir_12.onChildrenAdded();
        fso fso7 = fso6;
        fqj fqj3 = ((fvE)fso7).getAppearance();
        fqj3.setElementMap(fyy_03);
        fso6.addBasicElement(fqj3);
        fqj3.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(2, 2, 2, 2));
        fqj3.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqj3.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fsk_02.setDisplaySize(new fjf_2(32, 32));
        fsk_02.setNonBlocking(true);
        fso6.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fsk_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fir_1 fir_15 = new fir_1();
        fir_15.onCheckOut();
        fir_15.setElementMap(fyy_03);
        fir_15.setAttribute("texture");
        fir_15.setField("iconUrl");
        fqv2.addBasicElement(fir_15);
        fir_15.onAttributesInitialized();
        fir_15.onChildrenAdded();
        fqv2.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fso6.onChildrenAdded();
        fso fso8 = fso.checkOut();
        fso8.setElementMap(fyy_03);
        fso8.setStyle("itemDisabled");
        fic_12.addBasicElement(fso8);
        fso8.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fso8.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fir_1 fir_16 = new fir_1();
        fir_16.onCheckOut();
        fir_16.setElementMap(fyy_03);
        fir_16.setAttribute("visible");
        fso8.addBasicElement(fir_16);
        fir_16.onAttributesInitialized();
        far_2 far_24 = new far_2();
        far_24.onCheckOut();
        far_24.setElementMap(fyy_03);
        fir_16.addBasicElement(far_24);
        far_24.onAttributesInitialized();
        fan_2 fan_23 = new fan_2();
        fan_23.onCheckOut();
        fan_23.setElementMap(fyy_03);
        far_24.addBasicElement(fan_23);
        fan_23.onAttributesInitialized();
        fai_1 fai_12 = new fai_1();
        fai_12.onCheckOut();
        fai_12.setElementMap(fyy_03);
        fan_23.addBasicElement(fai_12);
        fai_12.onAttributesInitialized();
        fir_1 fir_17 = new fir_1();
        fir_17.onCheckOut();
        fir_17.setElementMap(fyy_03);
        fir_17.setAttribute("comparedValue");
        fir_17.setField("isInInventory");
        fai_12.addBasicElement(fir_17);
        fir_17.onAttributesInitialized();
        fir_17.onChildrenAdded();
        fai_12.onChildrenAdded();
        fau_1 fau_14 = new fau_1();
        fau_14.onCheckOut();
        fau_14.setElementMap(fyy_03);
        fan_23.addBasicElement(fau_14);
        fau_14.onAttributesInitialized();
        fir_1 fir_18 = new fir_1();
        fir_18.onCheckOut();
        fir_18.setElementMap(fyy_03);
        fir_18.setAttribute("comparedValue");
        fir_18.setField("isEquiped");
        fau_14.addBasicElement(fir_18);
        fir_18.onAttributesInitialized();
        fir_18.onChildrenAdded();
        fau_14.onChildrenAdded();
        fan_23.onChildrenAdded();
        far_24.onChildrenAdded();
        fir_16.onChildrenAdded();
        fso8.onChildrenAdded();
        fic_12.onChildrenAdded();
        fso5.onChildrenAdded();
        faf_22.onChildrenAdded();
        fsQ2.onChildrenAdded();
        fso fso9 = fso.checkOut();
        fso9.setElementMap(fyy_03);
        fso9.setExpandable(false);
        fso2.addBasicElement(fso9);
        fso9.onAttributesInitialized();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("visible");
        fiy_14.setField("characteristic");
        fiy_14.setName("itemPopupDetail");
        fso9.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        far_2 far_25 = new far_2();
        far_25.onCheckOut();
        far_25.setElementMap(fyy_03);
        far_25.setElseValue("true");
        far_25.setValue("false");
        fiy_14.addBasicElement(far_25);
        far_25.onAttributesInitialized();
        fat_2 fat_22 = new fat_2();
        fat_22.onCheckOut();
        fat_22.setElementMap(fyy_03);
        fat_22.setValue("");
        far_25.addBasicElement(fat_22);
        fat_22.onAttributesInitialized();
        fat_22.onChildrenAdded();
        far_25.onChildrenAdded();
        fiy_14.onChildrenAdded();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setHorizontal(false);
        fso9.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fso fso10 = fso.checkOut();
        fso10.setElementMap(fyy_03);
        fso10.setExpandable(false);
        fso10.setPrefSize(new fjf_2(50, 1));
        fso10.setStyle("lineSeparator2");
        fso9.addBasicElement(fso10);
        fso10.onAttributesInitialized();
        fso fso11 = fso10;
        fqj fqj4 = ((fvE)fso11).getAppearance();
        fqj4.setElementMap(fyy_03);
        fso10.addBasicElement(fqj4);
        fqj4.onAttributesInitialized();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_03);
        fqm_04.setInsets(new Insets(5, 20, 5, 20));
        fqj4.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqj4.onChildrenAdded();
        fso10.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setExpandable(false);
        fsM2.setStyle("11BoldLight");
        String string2 = "%bonusPenalties%";
        string2 = string2.replace("%bonusPenalties%", fpm_0.b().c("bonusPenalties"));
        fsM2.c(string2);
        fso9.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqm_0 fqm_05 = fqm_0.checkOut();
        fqm_05.setElementMap(fyy_03);
        fqm_05.setInsets(new Insets(0, 5, 5, 0));
        fqh_02.addBasicElement(fqm_05);
        fqm_05.onAttributesInitialized();
        fqm_05.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fsM2.onChildrenAdded();
        fuk_0 fuk_03 = new fuk_0();
        fuk_03.onCheckOut();
        fuk_03.setElementMap(fyy_03);
        fuk_03.setExpandable(false);
        fuk_03.setMinWidth(190);
        fuk_03.setStyle("white11");
        fso9.addBasicElement(fuk_03);
        fuk_03.onAttributesInitialized();
        fuk_0 fuk_04 = fuk_03;
        fqh_0 fqh_03 = (fqh_0)((fvE)fuk_04).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fuk_03.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqm_0 fqm_06 = fqm_0.checkOut();
        fqm_06.setElementMap(fyy_03);
        fqm_06.setInsets(new Insets(0, 20, 0, 0));
        fqh_03.addBasicElement(fqm_06);
        fqm_06.onAttributesInitialized();
        fqm_06.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fiy_1 fiy_15 = fiy_1.checkOut();
        fiy_15.setElementMap(fyy_03);
        fiy_15.setAttribute("text");
        fiy_15.setField("characteristic");
        fiy_15.setName("itemPopupDetail");
        fuk_03.addBasicElement(fiy_15);
        fiy_15.onAttributesInitialized();
        fiy_15.onChildrenAdded();
        fuk_03.onChildrenAdded();
        fso9.onChildrenAdded();
        fso fso12 = fso.checkOut();
        fso12.setElementMap(fyy_03);
        fso12.setExpandable(false);
        fso2.addBasicElement(fso12);
        fso12.onAttributesInitialized();
        fiy_1 fiy_16 = fiy_1.checkOut();
        fiy_16.setElementMap(fyy_03);
        fiy_16.setAttribute("visible");
        fiy_16.setField("bonusByEquiped");
        fiy_16.setName("itemPopupDetail");
        fso12.addBasicElement(fiy_16);
        fiy_16.onAttributesInitialized();
        far_2 far_26 = new far_2();
        far_26.onCheckOut();
        far_26.setElementMap(fyy_03);
        far_26.setElseValue("true");
        far_26.setValue("false");
        fiy_16.addBasicElement(far_26);
        far_26.onAttributesInitialized();
        fat_2 fat_23 = new fat_2();
        fat_23.onCheckOut();
        fat_23.setElementMap(fyy_03);
        fat_23.setValue("");
        far_26.addBasicElement(fat_23);
        fat_23.onAttributesInitialized();
        fat_23.onChildrenAdded();
        far_26.onChildrenAdded();
        fiy_16.onChildrenAdded();
        fin_2 fin_24 = fin_2.checkOut();
        fin_24.setHorizontal(false);
        fso12.addBasicElement(fin_24);
        fin_24.onAttributesInitialized();
        fin_24.onChildrenAdded();
        fso fso13 = fso.checkOut();
        fso13.setElementMap(fyy_03);
        fso13.setExpandable(false);
        fso13.setPrefSize(new fjf_2(50, 1));
        fso13.setStyle("lineSeparator2");
        fso12.addBasicElement(fso13);
        fso13.onAttributesInitialized();
        fso fso14 = fso13;
        fqj fqj5 = ((fvE)fso14).getAppearance();
        fqj5.setElementMap(fyy_03);
        fso13.addBasicElement(fqj5);
        fqj5.onAttributesInitialized();
        fqm_0 fqm_07 = fqm_0.checkOut();
        fqm_07.setElementMap(fyy_03);
        fqm_07.setInsets(new Insets(5, 20, 5, 20));
        fqj5.addBasicElement(fqm_07);
        fqm_07.onAttributesInitialized();
        fqm_07.onChildrenAdded();
        fqj5.onChildrenAdded();
        fso13.onChildrenAdded();
        fsM fsM4 = new fsM();
        fsM4.onCheckOut();
        fsM4.setElementMap(fyy_03);
        fsM4.setExpandable(false);
        fsM4.setStyle("11BoldLight");
        String string3 = "%set.bonus%";
        string3 = string3.replace("%set.bonus%", fpm_0.b().c("set.bonus"));
        fsM4.c(string3);
        fso12.addBasicElement(fsM4);
        fsM4.onAttributesInitialized();
        fsM fsM5 = fsM4;
        fqh_0 fqh_04 = (fqh_0)((fvE)fsM5).getAppearance();
        fqh_04.setElementMap(fyy_03);
        fsM4.addBasicElement(fqh_04);
        fqh_04.onAttributesInitialized();
        fqm_0 fqm_08 = fqm_0.checkOut();
        fqm_08.setElementMap(fyy_03);
        fqm_08.setInsets(new Insets(0, 5, 5, 0));
        fqh_04.addBasicElement(fqm_08);
        fqm_08.onAttributesInitialized();
        fqm_08.onChildrenAdded();
        fqh_04.onChildrenAdded();
        fsM4.onChildrenAdded();
        fuk_0 fuk_05 = new fuk_0();
        fuk_05.onCheckOut();
        fuk_05.setElementMap(fyy_03);
        fuk_05.setExpandable(false);
        fuk_05.setMinWidth(190);
        fuk_05.setStyle("white11");
        fso12.addBasicElement(fuk_05);
        fuk_05.onAttributesInitialized();
        fuk_0 fuk_06 = fuk_05;
        fqh_0 fqh_05 = (fqh_0)((fvE)fuk_06).getAppearance();
        fqh_05.setElementMap(fyy_03);
        fuk_05.addBasicElement(fqh_05);
        fqh_05.onAttributesInitialized();
        fqm_0 fqm_09 = fqm_0.checkOut();
        fqm_09.setElementMap(fyy_03);
        fqm_09.setInsets(new Insets(0, 20, 0, 0));
        fqh_05.addBasicElement(fqm_09);
        fqm_09.onAttributesInitialized();
        fqm_09.onChildrenAdded();
        fqh_05.onChildrenAdded();
        fiy_1 fiy_17 = fiy_1.checkOut();
        fiy_17.setElementMap(fyy_03);
        fiy_17.setAttribute("text");
        fiy_17.setField("bonusByEquiped");
        fiy_17.setName("itemPopupDetail");
        fuk_05.addBasicElement(fiy_17);
        fiy_17.onAttributesInitialized();
        fiy_17.onChildrenAdded();
        fuk_05.onChildrenAdded();
        fso12.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

