/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cNF
 */
public class cnf_2
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
        fvM2.onChildrenAdded();
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        fso3.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        fso fso6 = fso5;
        fqj fqj4 = ((fvE)fso6).getAppearance();
        fqj4.setElementMap(fyy_03);
        fso5.addBasicElement(fqj4);
        fqj4.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(0, 12, 0, 12));
        fqj4.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqj4.onChildrenAdded();
        String string = "windowContentContainer";
        fso fso7 = fso.checkOut();
        fso7.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso7);
        }
        fso5.addBasicElement(fso7);
        fso7.onAttributesInitialized();
        fso fso8 = fso.checkOut();
        fso8.setElementMap(fyy_03);
        fso7.addBasicElement(fso8);
        fso8.onAttributesInitialized();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setAlign(frs_0.b);
        fin_23.setHorizontal(false);
        fso8.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fso fso9 = fso.checkOut();
        fso9.setElementMap(fyy_03);
        fso9.setExpandable(false);
        fso8.addBasicElement(fso9);
        fso9.onAttributesInitialized();
        fin_2 fin_24 = fin_2.checkOut();
        fin_24.setAlign(frs_0.b);
        fin_24.setHorizontal(false);
        fso9.addBasicElement(fin_24);
        fin_24.onAttributesInitialized();
        fin_24.onChildrenAdded();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("visible");
        fiy_12.setName("isEditingGuildDescs");
        fso9.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fso fso10 = fso.checkOut();
        fso10.setElementMap(fyy_03);
        fso10.setExpandable(false);
        fso9.addBasicElement(fso10);
        fso10.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("visible");
        fiy_13.setField("hasRightToEditGuildDescription");
        fiy_13.setName("guild");
        fso10.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fin_2 fin_25 = fin_2.checkOut();
        fin_25.setAlign(frs_0.b);
        fin_25.setHorizontal(false);
        fso10.addBasicElement(fin_25);
        fin_25.onAttributesInitialized();
        fin_25.onChildrenAdded();
        fso fso11 = fso.checkOut();
        fso11.setElementMap(fyy_03);
        fso11.setExpandable(false);
        fso11.setStyle("titleBar");
        fso10.addBasicElement(fso11);
        fso11.onAttributesInitialized();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setExpandable(false);
        fsM2.setNonBlocking(true);
        fsM2.setStyle("whiteTitle");
        String string2 = "%guild.description%";
        string2 = string2.replace("%guild.description%", fpm_0.b().c("guild.description"));
        fsM2.c(string2);
        fso11.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlign(frs_0.b);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fsM2.onChildrenAdded();
        fso11.onChildrenAdded();
        fso fso12 = fso.checkOut();
        fso12.setElementMap(fyy_03);
        fso12.setExpandable(false);
        fso12.setStyle("ShortcutRowBackgroundFull");
        fso10.addBasicElement(fso12);
        fso12.onAttributesInitialized();
        fso fso13 = fso12;
        fqj fqj5 = ((fvE)fso13).getAppearance();
        fqj5.setElementMap(fyy_03);
        fso12.addBasicElement(fqj5);
        fqj5.onAttributesInitialized();
        fqo_0 fqo_03 = new fqo_0();
        fqo_03.onCheckOut();
        fqo_03.setElementMap(fyy_03);
        fqo_03.setInsets(new Insets(3, 3, 3, 3));
        fqj5.addBasicElement(fqo_03);
        fqo_03.onAttributesInitialized();
        fqo_03.onChildrenAdded();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_03);
        fqm_04.setInsets(new Insets(2, 2, 5, 2));
        fqj5.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqj5.onChildrenAdded();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.d);
        fso12.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fin_2 fin_26 = fin_2.checkOut();
        fin_26.setAlign(frs_0.d);
        fso12.addBasicElement(fin_26);
        fin_26.onAttributesInitialized();
        fin_26.onChildrenAdded();
        String string3 = "guildDescription";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fug_02);
        }
        fug_02.setExpandable(false);
        fug_02.a(200);
        fug_02.setMultiline(true);
        fdm_2 fdm_22 = new fdm_2();
        fdm_22.a("wakfu.guildManagement:onKeyEvent(applyDescription)");
        fug_02.setOnKeyPress(fdm_22);
        fug_02.setPrefSize(new fjf_2(300, 100));
        fug_02.setRestrict("[.*&[^<>]]");
        fug_02.setStyle("withoutBorder");
        fso12.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fip_2 fip_23 = new fip_2();
        fip_23.onCheckOut();
        fip_23.setElementMap(fyy_03);
        fip_23.setAlign(frs_0.b);
        fug_02.addBasicElement(fip_23);
        fip_23.onAttributesInitialized();
        fip_23.onChildrenAdded();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("text");
        fiy_14.setField("guildDescription");
        fiy_14.setName("guild");
        fug_02.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        fiy_14.onChildrenAdded();
        fug_02.onChildrenAdded();
        fso12.onChildrenAdded();
        String string4 = "applyDescription";
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fru_02);
        }
        fru_02.setEnabled(false);
        fru_02.setExpandable(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.guildManagement:applyGuildDescription(guildDescription)");
        fru_02.setOnClick(fdt_12);
        String string5 = "%apply%";
        string5 = string5.replace("%apply%", fpm_0.b().c("apply"));
        fru_02.setText(string5);
        fso10.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fip_2 fip_24 = new fip_2();
        fip_24.onCheckOut();
        fip_24.setElementMap(fyy_03);
        fip_24.setAlign(frs_0.f);
        fru_02.addBasicElement(fip_24);
        fip_24.onAttributesInitialized();
        fip_24.onChildrenAdded();
        fru_0 fru_03 = fru_02;
        fqd_0 fqd_02 = (fqd_0)((fvE)fru_03).getAppearance();
        fqd_02.setElementMap(fyy_03);
        fru_02.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqo_0 fqo_04 = new fqo_0();
        fqo_04.onCheckOut();
        fqo_04.setElementMap(fyy_03);
        fqo_04.setInsets(new Insets(0, 5, 0, 5));
        fqd_02.addBasicElement(fqo_04);
        fqo_04.onAttributesInitialized();
        fqo_04.onChildrenAdded();
        fqm_0 fqm_05 = fqm_0.checkOut();
        fqm_05.setElementMap(fyy_03);
        fqm_05.setInsets(new Insets(5, 0, 0, 5));
        fqd_02.addBasicElement(fqm_05);
        fqm_05.onAttributesInitialized();
        fqm_05.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fru_02.onChildrenAdded();
        fso10.onChildrenAdded();
        fso fso14 = fso.checkOut();
        fso14.setElementMap(fyy_03);
        fso14.setExpandable(false);
        fso9.addBasicElement(fso14);
        fso14.onAttributesInitialized();
        fiy_1 fiy_15 = fiy_1.checkOut();
        fiy_15.setElementMap(fyy_03);
        fiy_15.setAttribute("visible");
        fiy_15.setField("hasRightToEditGuildMessage");
        fiy_15.setName("guild");
        fso14.addBasicElement(fiy_15);
        fiy_15.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_03);
        fiy_15.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fan_2 fan_22 = new fan_2();
        fan_22.onCheckOut();
        fan_22.setElementMap(fyy_03);
        far_22.addBasicElement(fan_22);
        fan_22.onAttributesInitialized();
        fai_1 fai_12 = new fai_1();
        fai_12.onCheckOut();
        fai_12.setElementMap(fyy_03);
        fan_22.addBasicElement(fai_12);
        fai_12.onAttributesInitialized();
        fai_12.onChildrenAdded();
        fai_1 fai_13 = new fai_1();
        fai_13.onCheckOut();
        fai_13.setElementMap(fyy_03);
        fan_22.addBasicElement(fai_13);
        fai_13.onAttributesInitialized();
        fiy_1 fiy_16 = fiy_1.checkOut();
        fiy_16.setElementMap(fyy_03);
        fiy_16.setAttribute("comparedValue");
        fiy_16.setField("hasRightToEditGuildDescription");
        fiy_16.setName("guild");
        fai_13.addBasicElement(fiy_16);
        fiy_16.onAttributesInitialized();
        fiy_16.onChildrenAdded();
        fai_13.onChildrenAdded();
        fan_22.onChildrenAdded();
        far_22.onChildrenAdded();
        fiy_15.onChildrenAdded();
        fso fso15 = fso14;
        fqj fqj6 = ((fvE)fso15).getAppearance();
        fqj6.setElementMap(fyy_03);
        fso14.addBasicElement(fqj6);
        fqj6.onAttributesInitialized();
        fqm_0 fqm_06 = fqm_0.checkOut();
        fqm_06.setElementMap(fyy_03);
        fqm_06.setInsets(new Insets(10, 0, 0, 0));
        fqj6.addBasicElement(fqm_06);
        fqm_06.onAttributesInitialized();
        fqm_06.onChildrenAdded();
        fqj6.onChildrenAdded();
        fso14.onChildrenAdded();
        fso fso16 = fso.checkOut();
        fso16.setElementMap(fyy_03);
        fso16.setExpandable(false);
        fso9.addBasicElement(fso16);
        fso16.onAttributesInitialized();
        fiy_1 fiy_17 = fiy_1.checkOut();
        fiy_17.setElementMap(fyy_03);
        fiy_17.setAttribute("visible");
        fiy_17.setField("hasRightToEditGuildMessage");
        fiy_17.setName("guild");
        fso16.addBasicElement(fiy_17);
        fiy_17.onAttributesInitialized();
        fiy_17.onChildrenAdded();
        fin_2 fin_27 = fin_2.checkOut();
        fin_27.setAlign(frs_0.b);
        fin_27.setHorizontal(false);
        fso16.addBasicElement(fin_27);
        fin_27.onAttributesInitialized();
        fin_27.onChildrenAdded();
        fso fso17 = fso.checkOut();
        fso17.setElementMap(fyy_03);
        fso17.setExpandable(false);
        fso17.setStyle("titleBar");
        fso16.addBasicElement(fso17);
        fso17.onAttributesInitialized();
        fsM fsM4 = new fsM();
        fsM4.onCheckOut();
        fsM4.setElementMap(fyy_03);
        fsM4.setExpandable(false);
        fsM4.setNonBlocking(true);
        fsM4.setStyle("whiteTitle");
        String string6 = "%guild.message%";
        string6 = string6.replace("%guild.message%", fpm_0.b().c("guild.message"));
        fsM4.c(string6);
        fso17.addBasicElement(fsM4);
        fsM4.onAttributesInitialized();
        fsM fsM5 = fsM4;
        fqh_0 fqh_03 = (fqh_0)((fvE)fsM5).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fqh_03.setAlign(frs_0.b);
        fsM4.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqh_03.onChildrenAdded();
        fsM4.onChildrenAdded();
        fso17.onChildrenAdded();
        fso fso18 = fso.checkOut();
        fso18.setElementMap(fyy_03);
        fso18.setExpandable(false);
        fso18.setStyle("ShortcutRowBackgroundFull");
        fso16.addBasicElement(fso18);
        fso18.onAttributesInitialized();
        fso fso19 = fso18;
        fqj fqj7 = ((fvE)fso19).getAppearance();
        fqj7.setElementMap(fyy_03);
        fso18.addBasicElement(fqj7);
        fqj7.onAttributesInitialized();
        fqo_0 fqo_05 = new fqo_0();
        fqo_05.onCheckOut();
        fqo_05.setElementMap(fyy_03);
        fqo_05.setInsets(new Insets(3, 3, 3, 3));
        fqj7.addBasicElement(fqo_05);
        fqo_05.onAttributesInitialized();
        fqo_05.onChildrenAdded();
        fqm_0 fqm_07 = fqm_0.checkOut();
        fqm_07.setElementMap(fyy_03);
        fqm_07.setInsets(new Insets(2, 2, 5, 2));
        fqj7.addBasicElement(fqm_07);
        fqm_07.onAttributesInitialized();
        fqm_07.onChildrenAdded();
        fqj7.onChildrenAdded();
        fip_2 fip_25 = new fip_2();
        fip_25.onCheckOut();
        fip_25.setElementMap(fyy_03);
        fip_25.setAlign(frs_0.d);
        fso18.addBasicElement(fip_25);
        fip_25.onAttributesInitialized();
        fip_25.onChildrenAdded();
        fin_2 fin_28 = fin_2.checkOut();
        fin_28.setAlign(frs_0.d);
        fso18.addBasicElement(fin_28);
        fin_28.onAttributesInitialized();
        fin_28.onChildrenAdded();
        String string7 = "guildMessage";
        fug_0 fug_03 = new fug_0();
        fug_03.onCheckOut();
        fug_03.setElementMap(fyy_03);
        if (fyy_03 != null && string7 != null) {
            fyy_03.a(string7, fug_03);
        }
        fug_03.setExpandable(false);
        fug_03.a(200);
        fug_03.setMultiline(true);
        fdm_2 fdm_23 = new fdm_2();
        fdm_23.a("wakfu.guildManagement:onKeyEvent(applyMessage)");
        fug_03.setOnKeyPress(fdm_23);
        fug_03.setPrefSize(new fjf_2(300, 100));
        fug_03.setStyle("withoutBorder");
        fso18.addBasicElement(fug_03);
        fug_03.onAttributesInitialized();
        fiy_1 fiy_18 = fiy_1.checkOut();
        fiy_18.setElementMap(fyy_03);
        fiy_18.setAttribute("text");
        fiy_18.setField("guildMessage");
        fiy_18.setName("guild");
        fug_03.addBasicElement(fiy_18);
        fiy_18.onAttributesInitialized();
        fiy_18.onChildrenAdded();
        fip_2 fip_26 = new fip_2();
        fip_26.onCheckOut();
        fip_26.setElementMap(fyy_03);
        fip_26.setAlign(frs_0.b);
        fug_03.addBasicElement(fip_26);
        fip_26.onAttributesInitialized();
        fip_26.onChildrenAdded();
        fug_03.onChildrenAdded();
        fso18.onChildrenAdded();
        String string8 = "applyMessage";
        fru_0 fru_04 = new fru_0();
        fru_04.onCheckOut();
        fru_04.setElementMap(fyy_03);
        if (fyy_03 != null && string8 != null) {
            fyy_03.a(string8, fru_04);
        }
        fru_04.setEnabled(false);
        fru_04.setExpandable(false);
        fdt_1 fdt_13 = new fdt_1();
        fdt_13.a("wakfu.guildManagement:applyGuildMessage(guildMessage)");
        fru_04.setOnClick(fdt_13);
        String string9 = "%apply%";
        string9 = string9.replace("%apply%", fpm_0.b().c("apply"));
        fru_04.setText(string9);
        fso16.addBasicElement(fru_04);
        fru_04.onAttributesInitialized();
        fip_2 fip_27 = new fip_2();
        fip_27.onCheckOut();
        fip_27.setElementMap(fyy_03);
        fip_27.setAlign(frs_0.f);
        fru_04.addBasicElement(fip_27);
        fip_27.onAttributesInitialized();
        fip_27.onChildrenAdded();
        fru_0 fru_05 = fru_04;
        fqd_0 fqd_03 = (fqd_0)((fvE)fru_05).getAppearance();
        fqd_03.setElementMap(fyy_03);
        fru_04.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        fqo_0 fqo_06 = new fqo_0();
        fqo_06.onCheckOut();
        fqo_06.setElementMap(fyy_03);
        fqo_06.setInsets(new Insets(0, 5, 0, 5));
        fqd_03.addBasicElement(fqo_06);
        fqo_06.onAttributesInitialized();
        fqo_06.onChildrenAdded();
        fqm_0 fqm_08 = fqm_0.checkOut();
        fqm_08.setElementMap(fyy_03);
        fqm_08.setInsets(new Insets(5, 0, 0, 5));
        fqd_03.addBasicElement(fqm_08);
        fqm_08.onAttributesInitialized();
        fqm_08.onChildrenAdded();
        fqd_03.onChildrenAdded();
        fru_04.onChildrenAdded();
        fso16.onChildrenAdded();
        fso9.onChildrenAdded();
        this.a(fso8);
        fso8.onChildrenAdded();
        fso7.onChildrenAdded();
        fso5.onChildrenAdded();
        fso3.onChildrenAdded();
        this.a(fvk_02);
        this.b(fvk_02);
        this.c(fvk_02);
        fvk_02.onChildrenAdded();
        return fvk_02;
    }

    public fyo a(fso fso2) {
        fyy_0 fyy_02 = this.a.peek();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_02);
        fso3.setExpandable(false);
        fso2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setAlign(frs_0.b);
        fin_22.setHorizontal(false);
        fso3.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_02);
        fiy_12.setAttribute("visible");
        fiy_12.setName("isEditingGuildDescs");
        fso3.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_02);
        fiy_12.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fau_1 fau_12 = new fau_1();
        fau_12.onCheckOut();
        fau_12.setElementMap(fyy_02);
        far_22.addBasicElement(fau_12);
        fau_12.onAttributesInitialized();
        fau_12.onChildrenAdded();
        far_22.onChildrenAdded();
        fiy_12.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_02);
        fso4.setExpandable(false);
        fso3.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fso fso5 = fso4;
        fqj fqj2 = ((fvE)fso5).getAppearance();
        fqj2.setElementMap(fyy_02);
        fso4.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_02);
        fqm_02.setInsets(new Insets(10, 0, 0, 0));
        fqj2.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setAlign(frs_0.b);
        fin_23.setHorizontal(false);
        fso4.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fso fso6 = fso.checkOut();
        fso6.setElementMap(fyy_02);
        fso6.setExpandable(false);
        fso6.setStyle("titleBar");
        fso4.addBasicElement(fso6);
        fso6.onAttributesInitialized();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_02);
        fsM2.setExpandable(false);
        fsM2.setNonBlocking(true);
        fsM2.setStyle("whiteTitle");
        String string = "%guild.personalNote%";
        string = string.replace("%guild.personalNote%", fpm_0.b().c("guild.personalNote"));
        fsM2.c(string);
        fso6.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_02);
        fqh_02.setAlign(frs_0.b);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fsM2.onChildrenAdded();
        fso6.onChildrenAdded();
        fso fso7 = fso.checkOut();
        fso7.setElementMap(fyy_02);
        fso7.setExpandable(false);
        fso7.setStyle("ShortcutRowBackgroundFull");
        fso4.addBasicElement(fso7);
        fso7.onAttributesInitialized();
        fso fso8 = fso7;
        fqj fqj3 = ((fvE)fso8).getAppearance();
        fqj3.setElementMap(fyy_02);
        fso7.addBasicElement(fqj3);
        fqj3.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_02);
        fqo_02.setInsets(new Insets(3, 3, 3, 3));
        fqj3.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_02);
        fqm_03.setInsets(new Insets(2, 2, 5, 2));
        fqj3.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqj3.onChildrenAdded();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_02);
        fip_22.setAlign(frs_0.d);
        fso7.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fin_2 fin_24 = fin_2.checkOut();
        fin_24.setAlign(frs_0.d);
        fso7.addBasicElement(fin_24);
        fin_24.onAttributesInitialized();
        fin_24.onChildrenAdded();
        String string2 = "guildPersonalMessage";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_02);
        if (fyy_02 != null && string2 != null) {
            fyy_02.a(string2, fug_02);
        }
        fug_02.setExpandable(false);
        fug_02.a(200);
        fug_02.setMultiline(true);
        fdm_2 fdm_22 = new fdm_2();
        fdm_22.a("wakfu.guildManagement:onKeyEvent(applyPersonalMessage)");
        fug_02.setOnKeyPress(fdm_22);
        fug_02.setPrefSize(new fjf_2(200, 50));
        fug_02.setRestrict("[.*&[^<>]]");
        fug_02.setStyle("withoutBorder");
        fso7.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_02);
        fiy_13.setAttribute("text");
        fiy_13.setField("guildMessage");
        fiy_13.setName("selectedGuildRank");
        fug_02.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fip_2 fip_23 = new fip_2();
        fip_23.onCheckOut();
        fip_23.setElementMap(fyy_02);
        fip_23.setAlign(frs_0.b);
        fug_02.addBasicElement(fip_23);
        fip_23.onAttributesInitialized();
        fip_23.onChildrenAdded();
        fug_02.onChildrenAdded();
        fso7.onChildrenAdded();
        String string3 = "applyPersonalMessage";
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_02);
        if (fyy_02 != null && string3 != null) {
            fyy_02.a(string3, fru_02);
        }
        fru_02.setEnabled(false);
        fru_02.setExpandable(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.guildManagement:applyGuildMessage(guildPersonalMessage)");
        fru_02.setOnClick(fdt_12);
        String string4 = "%apply%";
        string4 = string4.replace("%apply%", fpm_0.b().c("apply"));
        fru_02.setText(string4);
        fso4.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fip_2 fip_24 = new fip_2();
        fip_24.onCheckOut();
        fip_24.setElementMap(fyy_02);
        fip_24.setAlign(frs_0.f);
        fru_02.addBasicElement(fip_24);
        fip_24.onAttributesInitialized();
        fip_24.onChildrenAdded();
        fru_0 fru_03 = fru_02;
        fqd_0 fqd_02 = (fqd_0)((fvE)fru_03).getAppearance();
        fqd_02.setElementMap(fyy_02);
        fru_02.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqo_0 fqo_03 = new fqo_0();
        fqo_03.onCheckOut();
        fqo_03.setElementMap(fyy_02);
        fqo_03.setInsets(new Insets(0, 5, 0, 5));
        fqd_02.addBasicElement(fqo_03);
        fqo_03.onAttributesInitialized();
        fqo_03.onChildrenAdded();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_02);
        fqm_04.setInsets(new Insets(5, 0, 0, 5));
        fqd_02.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fru_02.onChildrenAdded();
        fso4.onChildrenAdded();
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
        fdt_12.a("unloadDialog");
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
        fid_12.setResizeOnce(true);
        fid_12.setSize(new fjf_2(-2, -2));
        fvk_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        return fid_12;
    }
}

