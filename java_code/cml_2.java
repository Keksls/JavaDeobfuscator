/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cML
 */
public class cml_2
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
        fvk_02.setPack(true);
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
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setHorizontal(false);
        fso5.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fso fso7 = fso.checkOut();
        fso7.setElementMap(fyy_03);
        fso7.setExpandable(false);
        fso5.addBasicElement(fso7);
        fso7.onAttributesInitialized();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.e);
        fso7.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setNonBlocking(true);
        fsM2.setStyle("StyledBold16White");
        String string = "%dimensionalBagFleaRegister.title%";
        string = string.replace("%dimensionalBagFleaRegister.title%", fpm_0.b().c("dimensionalBagFleaRegister.title"));
        fsM2.c(string);
        fso7.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlign(frs_0.e);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fsM2.onChildrenAdded();
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
        String string2 = "windowContentContainer";
        fso fso10 = fso.checkOut();
        fso10.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fso10);
        }
        fso8.addBasicElement(fso10);
        fso10.onAttributesInitialized();
        fip_2 fip_23 = new fip_2();
        fip_23.onCheckOut();
        fip_23.setElementMap(fyy_03);
        fip_23.setAlign(frs_0.b);
        fso10.addBasicElement(fip_23);
        fip_23.onAttributesInitialized();
        fip_23.onChildrenAdded();
        fin_2 fin_24 = fin_2.checkOut();
        fin_24.setHorizontal(false);
        fso10.addBasicElement(fin_24);
        fin_24.onAttributesInitialized();
        fin_24.onChildrenAdded();
        fso fso11 = fso10;
        fqj fqj6 = ((fvE)fso11).getAppearance();
        fqj6.setElementMap(fyy_03);
        fso10.addBasicElement(fqj6);
        fqj6.onAttributesInitialized();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_03);
        fqm_04.setInsets(new Insets(0, 0, 0, 0));
        fqj6.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqj6.onChildrenAdded();
        fso fso12 = fso.checkOut();
        fso12.setElementMap(fyy_03);
        fso12.setStyle("flat");
        fso10.addBasicElement(fso12);
        fso12.onAttributesInitialized();
        fsM fsM4 = new fsM();
        fsM4.onCheckOut();
        fsM4.setElementMap(fyy_03);
        fsM4.setExpandable(false);
        fsM4.setPrefSize(new fjf_2(150, 0));
        fsM4.setStyle("bold");
        String string3 = "%market.location%";
        string3 = string3.replace("%market.location%", fpm_0.b().c("market.location"));
        fsM4.c(string3);
        fso12.addBasicElement(fsM4);
        fsM4.onAttributesInitialized();
        fsM fsM5 = fsM4;
        fqh_0 fqh_03 = (fqh_0)((fvE)fsM5).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fsM4.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqm_0 fqm_05 = fqm_0.checkOut();
        fqm_05.setElementMap(fyy_03);
        fqm_05.setInsets(new Insets(0, 3, 0, 3));
        fqh_03.addBasicElement(fqm_05);
        fqm_05.onAttributesInitialized();
        fqm_05.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fsM4.onChildrenAdded();
        fso fso13 = fso.checkOut();
        fso13.setElementMap(fyy_03);
        fso13.setExpandable(true);
        fso13.setPrefSize(new fjf_2(150, 0));
        fso13.setStyle("ShortcutRowBackgroundFull");
        fso12.addBasicElement(fso13);
        fso13.onAttributesInitialized();
        fso fso14 = fso13;
        fqj fqj7 = ((fvE)fso14).getAppearance();
        fqj7.setElementMap(fyy_03);
        fso13.addBasicElement(fqj7);
        fqj7.onAttributesInitialized();
        fqo_0 fqo_04 = new fqo_0();
        fqo_04.onCheckOut();
        fqo_04.setElementMap(fyy_03);
        fqo_04.setInsets(new Insets(2, 5, 2, 5));
        fqj7.addBasicElement(fqo_04);
        fqo_04.onAttributesInitialized();
        fqo_04.onChildrenAdded();
        fqj7.onChildrenAdded();
        fsM fsM6 = new fsM();
        fsM6.onCheckOut();
        fsM6.setElementMap(fyy_03);
        fsM6.setStyle("bold");
        fso13.addBasicElement(fsM6);
        fsM6.onAttributesInitialized();
        fsM fsM7 = fsM6;
        fqh_0 fqh_04 = (fqh_0)((fvE)fsM7).getAppearance();
        fqh_04.setElementMap(fyy_03);
        fqh_04.setAlign(frs_0.f);
        fsM6.addBasicElement(fqh_04);
        fqh_04.onAttributesInitialized();
        fqh_04.onChildrenAdded();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("text");
        fiy_12.setField("marketName");
        fiy_12.setName("market.flea.register");
        fsM6.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fsM6.onChildrenAdded();
        fso13.onChildrenAdded();
        fso12.onChildrenAdded();
        fso fso15 = fso.checkOut();
        fso15.setElementMap(fyy_03);
        fso15.setStyle("flat");
        fso10.addBasicElement(fso15);
        fso15.onAttributesInitialized();
        fsM fsM8 = new fsM();
        fsM8.onCheckOut();
        fsM8.setElementMap(fyy_03);
        fsM8.setExpandable(false);
        fsM8.setPrefSize(new fjf_2(150, 0));
        fsM8.setStyle("bold");
        String string4 = "%market.taxPercentage%";
        string4 = string4.replace("%market.taxPercentage%", fpm_0.b().c("market.taxPercentage"));
        fsM8.c(string4);
        fso15.addBasicElement(fsM8);
        fsM8.onAttributesInitialized();
        fsM fsM9 = fsM8;
        fqh_0 fqh_05 = (fqh_0)((fvE)fsM9).getAppearance();
        fqh_05.setElementMap(fyy_03);
        fsM8.addBasicElement(fqh_05);
        fqh_05.onAttributesInitialized();
        fqm_0 fqm_06 = fqm_0.checkOut();
        fqm_06.setElementMap(fyy_03);
        fqm_06.setInsets(new Insets(0, 3, 0, 3));
        fqh_05.addBasicElement(fqm_06);
        fqm_06.onAttributesInitialized();
        fqm_06.onChildrenAdded();
        fqh_05.onChildrenAdded();
        fsM8.onChildrenAdded();
        fso fso16 = fso.checkOut();
        fso16.setElementMap(fyy_03);
        fso16.setExpandable(true);
        fso16.setPrefSize(new fjf_2(150, 0));
        fso16.setStyle("ShortcutRowBackgroundFull");
        fso15.addBasicElement(fso16);
        fso16.onAttributesInitialized();
        fso fso17 = fso16;
        fqj fqj8 = ((fvE)fso17).getAppearance();
        fqj8.setElementMap(fyy_03);
        fso16.addBasicElement(fqj8);
        fqj8.onAttributesInitialized();
        fqo_0 fqo_05 = new fqo_0();
        fqo_05.onCheckOut();
        fqo_05.setElementMap(fyy_03);
        fqo_05.setInsets(new Insets(2, 5, 2, 5));
        fqj8.addBasicElement(fqo_05);
        fqo_05.onAttributesInitialized();
        fqo_05.onChildrenAdded();
        fqj8.onChildrenAdded();
        fsM fsM10 = new fsM();
        fsM10.onCheckOut();
        fsM10.setElementMap(fyy_03);
        fsM10.setStyle("bold");
        fso16.addBasicElement(fsM10);
        fsM10.onAttributesInitialized();
        fsM fsM11 = fsM10;
        fqh_0 fqh_06 = (fqh_0)((fvE)fsM11).getAppearance();
        fqh_06.setElementMap(fyy_03);
        fqh_06.setAlign(frs_0.f);
        fsM10.addBasicElement(fqh_06);
        fqh_06.onAttributesInitialized();
        fqh_06.onChildrenAdded();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("text");
        fiy_13.setField("taxPercentage");
        fiy_13.setName("market.flea.register");
        fsM10.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fsM10.onChildrenAdded();
        fso16.onChildrenAdded();
        fso15.onChildrenAdded();
        fso fso18 = fso.checkOut();
        fso18.setElementMap(fyy_03);
        fso18.setStyle("flat");
        fso10.addBasicElement(fso18);
        fso18.onAttributesInitialized();
        fsM fsM12 = new fsM();
        fsM12.onCheckOut();
        fsM12.setElementMap(fyy_03);
        fsM12.setExpandable(false);
        fsM12.setPrefSize(new fjf_2(150, 0));
        fsM12.setStyle("bold");
        String string5 = "%market.fleaValue%";
        string5 = string5.replace("%market.fleaValue%", fpm_0.b().c("market.fleaValue"));
        fsM12.c(string5);
        fso18.addBasicElement(fsM12);
        fsM12.onAttributesInitialized();
        fsM fsM13 = fsM12;
        fqh_0 fqh_07 = (fqh_0)((fvE)fsM13).getAppearance();
        fqh_07.setElementMap(fyy_03);
        fsM12.addBasicElement(fqh_07);
        fqh_07.onAttributesInitialized();
        fqm_0 fqm_07 = fqm_0.checkOut();
        fqm_07.setElementMap(fyy_03);
        fqm_07.setInsets(new Insets(0, 3, 0, 3));
        fqh_07.addBasicElement(fqm_07);
        fqm_07.onAttributesInitialized();
        fqm_07.onChildrenAdded();
        fqh_07.onChildrenAdded();
        fsM12.onChildrenAdded();
        fso fso19 = fso.checkOut();
        fso19.setElementMap(fyy_03);
        fso19.setExpandable(true);
        fso19.setPrefSize(new fjf_2(150, 0));
        fso19.setStyle("ShortcutRowBackgroundFull");
        fso18.addBasicElement(fso19);
        fso19.onAttributesInitialized();
        fso fso20 = fso19;
        fqj fqj9 = ((fvE)fso20).getAppearance();
        fqj9.setElementMap(fyy_03);
        fso19.addBasicElement(fqj9);
        fqj9.onAttributesInitialized();
        fqo_0 fqo_06 = new fqo_0();
        fqo_06.onCheckOut();
        fqo_06.setElementMap(fyy_03);
        fqo_06.setInsets(new Insets(2, 5, 2, 5));
        fqj9.addBasicElement(fqo_06);
        fqo_06.onAttributesInitialized();
        fqo_06.onChildrenAdded();
        fqj9.onChildrenAdded();
        fsM fsM14 = new fsM();
        fsM14.onCheckOut();
        fsM14.setElementMap(fyy_03);
        fsM14.setStyle("bold");
        fso19.addBasicElement(fsM14);
        fsM14.onAttributesInitialized();
        fsM fsM15 = fsM14;
        fqh_0 fqh_08 = (fqh_0)((fvE)fsM15).getAppearance();
        fqh_08.setElementMap(fyy_03);
        fqh_08.setAlign(frs_0.f);
        fsM14.addBasicElement(fqh_08);
        fqh_08.onAttributesInitialized();
        fqm_0 fqm_08 = fqm_0.checkOut();
        fqm_08.setElementMap(fyy_03);
        fqm_08.setInsets(new Insets(0, 0, 0, 2));
        fqh_08.addBasicElement(fqm_08);
        fqm_08.onAttributesInitialized();
        fqm_08.onChildrenAdded();
        fqh_08.onChildrenAdded();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("text");
        fiy_14.setField("totalValue");
        fiy_14.setName("market.flea.register");
        fsM14.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        fiy_14.onChildrenAdded();
        fsM14.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fsk_02.setExpandable(false);
        fsk_02.setStyle("kamas");
        fso19.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fsk_02.onChildrenAdded();
        fso19.onChildrenAdded();
        fso18.onChildrenAdded();
        fso fso21 = fso.checkOut();
        fso21.setElementMap(fyy_03);
        fso21.setStyle("flat");
        fso10.addBasicElement(fso21);
        fso21.onAttributesInitialized();
        fsM fsM16 = new fsM();
        fsM16.onCheckOut();
        fsM16.setElementMap(fyy_03);
        fsM16.setExpandable(false);
        fsM16.setPrefSize(new fjf_2(150, 0));
        fsM16.setStyle("bold");
        String string6 = "%duration.short%";
        string6 = string6.replace("%duration.short%", fpm_0.b().c("duration.short"));
        fsM16.c(string6);
        fso21.addBasicElement(fsM16);
        fsM16.onAttributesInitialized();
        fsM fsM17 = fsM16;
        fqh_0 fqh_09 = (fqh_0)((fvE)fsM17).getAppearance();
        fqh_09.setElementMap(fyy_03);
        fsM16.addBasicElement(fqh_09);
        fqh_09.onAttributesInitialized();
        fqm_0 fqm_09 = fqm_0.checkOut();
        fqm_09.setElementMap(fyy_03);
        fqm_09.setInsets(new Insets(0, 3, 0, 3));
        fqh_09.addBasicElement(fqm_09);
        fqm_09.onAttributesInitialized();
        fqm_09.onChildrenAdded();
        fqh_09.onChildrenAdded();
        fsM16.onChildrenAdded();
        fsk fsk2 = new fsk();
        fsk2.onCheckOut();
        fsk2.setElementMap(fyy_03);
        fsk2.setExpandable(true);
        fdp_1 fdp_12 = new fdp_1();
        fdp_12.a("wakfu.dimensionalBagFleaRegister:selectDuration");
        fsk2.setOnListSelectionChange(fdp_12);
        fsk2.setPrefSize(new fjf_2(150, 15));
        fsk2.setStyle("blue");
        fso21.addBasicElement(fsk2);
        fsk2.onAttributesInitialized();
        fiy_1 fiy_15 = fiy_1.checkOut();
        fiy_15.setElementMap(fyy_03);
        fiy_15.setAttribute("content");
        fiy_15.setField("availableDurations");
        fiy_15.setName("market.flea.register");
        fsk2.addBasicElement(fiy_15);
        fiy_15.onAttributesInitialized();
        fiy_15.onChildrenAdded();
        fiy_1 fiy_16 = fiy_1.checkOut();
        fiy_16.setElementMap(fyy_03);
        fiy_16.setAttribute("selectedValue");
        fiy_16.setField("selectedDuration");
        fiy_16.setName("market.flea.register");
        fsk2.addBasicElement(fiy_16);
        fiy_16.onAttributesInitialized();
        fiy_16.onChildrenAdded();
        ftj_0 ftj_02 = new ftj_0();
        ftj_02.onCheckOut();
        ftj_02.setElementMap(fyy_03);
        fsk2.addBasicElement(ftj_02);
        ftj_02.onAttributesInitialized();
        faf_2 faf_22 = new faf_2();
        faf_22.onCheckOut();
        faf_22.setElementMap(fyy_03);
        ftj_02.addBasicElement(faf_22);
        faf_22.onAttributesInitialized();
        fsM fsM18 = new fsM();
        fsM18.onCheckOut();
        fsM18.setElementMap(fyy_03);
        fsM18.setNonBlocking(true);
        fsM18.setStyle("whiteBold");
        faf_22.addBasicElement(fsM18);
        fsM18.onAttributesInitialized();
        fsM fsM19 = fsM18;
        fqh_0 fqh_010 = (fqh_0)((fvE)fsM19).getAppearance();
        fqh_010.setElementMap(fyy_03);
        fqh_010.setAlign(frs_0.f);
        fsM18.addBasicElement(fqh_010);
        fqh_010.onAttributesInitialized();
        fqm_0 fqm_010 = fqm_0.checkOut();
        fqm_010.setElementMap(fyy_03);
        fqm_010.setInsets(new Insets(0, 0, 0, 3));
        fqh_010.addBasicElement(fqm_010);
        fqm_010.onAttributesInitialized();
        fqm_010.onChildrenAdded();
        fqh_010.onChildrenAdded();
        fip_2 fip_24 = new fip_2();
        fip_24.onCheckOut();
        fip_24.setElementMap(fyy_03);
        fip_24.setAlign(frs_0.e);
        fsM18.addBasicElement(fip_24);
        fip_24.onAttributesInitialized();
        fip_24.onChildrenAdded();
        this.a(fsM18);
        fsM18.onChildrenAdded();
        faf_22.onChildrenAdded();
        ftj_02.onChildrenAdded();
        this.a(fsk2);
        fsk2.onChildrenAdded();
        fso21.onChildrenAdded();
        this.a(fso10);
        this.b(fso10);
        fso10.onChildrenAdded();
        fso8.onChildrenAdded();
        fso3.onChildrenAdded();
        this.a(fvk_02);
        this.b(fvk_02);
        this.c(fvk_02);
        fvk_02.onChildrenAdded();
        return fvk_02;
    }

    public fyo a(fsM fsM2) {
        fyy_0 fyy_02 = this.a.peek();
        fir_1 fir_12 = new fir_1();
        fir_12.onCheckOut();
        fir_12.setElementMap(fyy_02);
        fir_12.setAttribute("text");
        fir_12.setField("description");
        fsM2.addBasicElement(fir_12);
        fir_12.onAttributesInitialized();
        fir_12.onChildrenAdded();
        return fir_12;
    }

    public fyo a(fsk fsk2) {
        fyy_0 fyy_02 = this.a.peek();
        fsQ fsQ2 = new fsQ();
        fsQ2.onCheckOut();
        fsQ2.setElementMap(fyy_02);
        fsQ2.setCellSize(new fjf_2(100.0f, 16));
        fsQ2.setHorizontal(false);
        fsk2.addBasicElement(fsQ2);
        fsQ2.onAttributesInitialized();
        faf_2 faf_22 = new faf_2();
        faf_22.onCheckOut();
        faf_22.setElementMap(fyy_02);
        fsQ2.addBasicElement(faf_22);
        faf_22.onAttributesInitialized();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_02);
        fsM2.setNonBlocking(true);
        fsM2.setStyle("whiteBold");
        faf_22.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fir_1 fir_12 = new fir_1();
        fir_12.onCheckOut();
        fir_12.setElementMap(fyy_02);
        fir_12.setAttribute("text");
        fir_12.setField("description");
        fsM2.addBasicElement(fir_12);
        fir_12.onAttributesInitialized();
        fir_12.onChildrenAdded();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_02);
        fqh_02.setAlign(frs_0.e);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fsM2.onChildrenAdded();
        faf_22.onChildrenAdded();
        fsQ2.onChildrenAdded();
        return fsQ2;
    }

    public fyo a(fso fso2) {
        fyy_0 fyy_02 = this.a.peek();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_02);
        fso3.setStyle("flat");
        fso2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_02);
        fsM2.setExpandable(false);
        fsM2.setPrefSize(new fjf_2(150, 0));
        fsM2.setStyle("bold");
        String string = "%market.registerCost%";
        string = string.replace("%market.registerCost%", fpm_0.b().c("market.registerCost"));
        fsM2.c(string);
        fso3.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_02);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_02);
        fqm_02.setInsets(new Insets(0, 3, 0, 3));
        fqh_02.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fsM2.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_02);
        fso4.setExpandable(true);
        fso4.setPrefSize(new fjf_2(150, 0));
        fso4.setStyle("ShortcutRowBackgroundFull");
        fso3.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fso fso5 = fso4;
        fqj fqj2 = ((fvE)fso5).getAppearance();
        fqj2.setElementMap(fyy_02);
        fso4.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_02);
        fqo_02.setInsets(new Insets(2, 5, 2, 5));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_02);
        fuk_02.setStyle("bold");
        fso4.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fuk_0 fuk_03 = fuk_02;
        fqh_0 fqh_03 = (fqh_0)((fvE)fuk_03).getAppearance();
        fqh_03.setElementMap(fyy_02);
        fqh_03.setAlign(frs_0.f);
        fuk_02.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_02);
        fqm_03.setInsets(new Insets(0, 0, 0, 2));
        fqh_03.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_02);
        fiy_12.setAttribute("text");
        fiy_12.setField("dutyDescription");
        fiy_12.setName("market.flea.register");
        fuk_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_02);
        fsk_02.setExpandable(false);
        fsk_02.setStyle("kamas");
        fso4.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fsk_02.onChildrenAdded();
        fso4.onChildrenAdded();
        fso3.onChildrenAdded();
        return fso3;
    }

    public fyo b(fso fso2) {
        fyy_0 fyy_02 = this.a.peek();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_02);
        fso3.setExpandable(false);
        fso2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fso3.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_02);
        fru_02.setExpandable(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.dimensionalBagFleaRegister:validate");
        fru_02.setOnClick(fdt_12);
        fru_02.setStyle("yellow");
        fso3.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_02);
        fiy_12.setAttribute("enabled");
        fiy_12.setField("hasEnoughMoney");
        fiy_12.setName("market.flea.register");
        fru_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_02);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fru_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fru_0 fru_03 = fru_02;
        fqd_0 fqd_02 = (fqd_0)((fvE)fru_03).getAppearance();
        fqd_02.setElementMap(fyy_02);
        fru_02.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_02);
        fqo_02.setInsets(new Insets(3, 3, 3, 3));
        fqd_02.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fru_02.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_02);
        fsk_02.setDisplaySize(new fjf_2(16, 16));
        fsk_02.setNonBlocking(true);
        fsk_02.setStyle("apply");
        fso3.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_02);
        fid_13.setAlign(frk_0.i);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fsk_02.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fso3.onChildrenAdded();
        return fso3;
    }

    public fyo a(fvk_0 fvk_02) {
        fyy_0 fyy_02 = this.a.peek();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_02);
        fvk_02.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_02);
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }

    public fyo b(fvk_0 fvk_02) {
        fyy_0 fyy_02 = this.a.peek();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_02);
        fru_02.setExpandable(false);
        fru_02.setStyle("close");
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.dimensionalBagFleaRegister:cancel");
        fru_02.setOnClick(fdt_12);
        fvk_02.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_02);
        fid_12.setAlign(frk_0.e);
        fid_12.setSize(new fjf_2(-2, -2));
        fid_12.setXOffset(-18);
        fid_12.setYOffset(-12);
        fru_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fru_02.onChildrenAdded();
        return fru_02;
    }

    public fyo c(fvk_0 fvk_02) {
        fyy_0 fyy_02 = this.a.peek();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_02);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(-2, -2));
        fvk_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        return fid_12;
    }
}

