/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cMF
 */
public class cmf_2
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
        fsM2.c("Debug Anm");
        fso7.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlignment(frs_0.e);
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
        String string = "windowContentContainer";
        fso fso10 = fso.checkOut();
        fso10.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso10);
        }
        fso8.addBasicElement(fso10);
        fso10.onAttributesInitialized();
        fin_2 fin_24 = fin_2.checkOut();
        fin_24.setHorizontal(false);
        fso10.addBasicElement(fin_24);
        fin_24.onAttributesInitialized();
        fin_24.onChildrenAdded();
        fso fso11 = fso.checkOut();
        fso11.setElementMap(fyy_03);
        fso10.addBasicElement(fso11);
        fso11.onAttributesInitialized();
        String string2 = "type";
        fim_1 fim_12 = new fim_1();
        fim_12.onCheckOut();
        fim_12.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, (fyb_0)fim_12);
        }
        fso11.addBasicElement(fim_12);
        fim_12.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("value");
        fiy_12.setField("type");
        fiy_12.setName("debug.anm");
        fim_12.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fim_12.onChildrenAdded();
        ftI ftI2 = new ftI();
        ftI2.onCheckOut();
        ftI2.setElementMap(fyy_03);
        ftI2.setEnabled(true);
        ftI2.setGroupId("type");
        fdc_2 fdc_22 = new fdc_2();
        fdc_22.a("wakfu.debugAnm:setType(players)");
        ftI2.setOnMouseRelease(fdc_22);
        ftI2.setText("player");
        ftI2.setValue("players");
        fso11.addBasicElement(ftI2);
        ftI2.onAttributesInitialized();
        ftI ftI3 = ftI2;
        fqb_0 fqb_02 = (fqb_0)((fvE)ftI3).getAppearance();
        fqb_02.setElementMap(fyy_03);
        ftI2.addBasicElement(fqb_02);
        fqb_02.onAttributesInitialized();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_03);
        fqm_04.setInsets(new Insets(0, 2, 0, 2));
        fqb_02.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqb_02.onChildrenAdded();
        ftI2.onChildrenAdded();
        ftI ftI4 = new ftI();
        ftI4.onCheckOut();
        ftI4.setElementMap(fyy_03);
        ftI4.setEnabled(true);
        ftI4.setGroupId("type");
        fdc_2 fdc_23 = new fdc_2();
        fdc_23.a("wakfu.debugAnm:setType(npcs)");
        ftI4.setOnMouseRelease(fdc_23);
        ftI4.setText("monstre");
        ftI4.setValue("npcs");
        fso11.addBasicElement(ftI4);
        ftI4.onAttributesInitialized();
        ftI ftI5 = ftI4;
        fqb_0 fqb_03 = (fqb_0)((fvE)ftI5).getAppearance();
        fqb_03.setElementMap(fyy_03);
        ftI4.addBasicElement(fqb_03);
        fqb_03.onAttributesInitialized();
        fqm_0 fqm_05 = fqm_0.checkOut();
        fqm_05.setElementMap(fyy_03);
        fqm_05.setInsets(new Insets(0, 2, 0, 2));
        fqb_03.addBasicElement(fqm_05);
        fqm_05.onAttributesInitialized();
        fqm_05.onChildrenAdded();
        fqb_03.onChildrenAdded();
        ftI4.onChildrenAdded();
        ftI ftI6 = new ftI();
        ftI6.onCheckOut();
        ftI6.setElementMap(fyy_03);
        ftI6.setEnabled(true);
        ftI6.setGroupId("type");
        fdc_2 fdc_24 = new fdc_2();
        fdc_24.a("wakfu.debugAnm:setType(pets)");
        ftI6.setOnMouseRelease(fdc_24);
        ftI6.setText("pets");
        ftI6.setValue("pets");
        fso11.addBasicElement(ftI6);
        ftI6.onAttributesInitialized();
        ftI ftI7 = ftI6;
        fqb_0 fqb_04 = (fqb_0)((fvE)ftI7).getAppearance();
        fqb_04.setElementMap(fyy_03);
        ftI6.addBasicElement(fqb_04);
        fqb_04.onAttributesInitialized();
        fqm_0 fqm_06 = fqm_0.checkOut();
        fqm_06.setElementMap(fyy_03);
        fqm_06.setInsets(new Insets(0, 2, 0, 2));
        fqb_04.addBasicElement(fqm_06);
        fqm_06.onAttributesInitialized();
        fqm_06.onChildrenAdded();
        fqb_04.onChildrenAdded();
        ftI6.onChildrenAdded();
        ftI ftI8 = new ftI();
        ftI8.onCheckOut();
        ftI8.setElementMap(fyy_03);
        ftI8.setEnabled(true);
        ftI8.setGroupId("type");
        fdc_2 fdc_25 = new fdc_2();
        fdc_25.a("wakfu.debugAnm:setType(interactives)");
        ftI8.setOnMouseRelease(fdc_25);
        ftI8.setText("interactif");
        ftI8.setValue("interactives");
        fso11.addBasicElement(ftI8);
        ftI8.onAttributesInitialized();
        ftI ftI9 = ftI8;
        fqb_0 fqb_05 = (fqb_0)((fvE)ftI9).getAppearance();
        fqb_05.setElementMap(fyy_03);
        ftI8.addBasicElement(fqb_05);
        fqb_05.onAttributesInitialized();
        fqm_0 fqm_07 = fqm_0.checkOut();
        fqm_07.setElementMap(fyy_03);
        fqm_07.setInsets(new Insets(0, 2, 0, 2));
        fqb_05.addBasicElement(fqm_07);
        fqm_07.onAttributesInitialized();
        fqm_07.onChildrenAdded();
        fqb_05.onChildrenAdded();
        ftI8.onChildrenAdded();
        ftI ftI10 = new ftI();
        ftI10.onCheckOut();
        ftI10.setElementMap(fyy_03);
        ftI10.setEnabled(true);
        ftI10.setGroupId("type");
        fdc_2 fdc_26 = new fdc_2();
        fdc_26.a("wakfu.debugAnm:setType(dynamics)");
        ftI10.setOnMouseRelease(fdc_26);
        ftI10.setText("dynamique");
        ftI10.setValue("dynamics");
        fso11.addBasicElement(ftI10);
        ftI10.onAttributesInitialized();
        ftI ftI11 = ftI10;
        fqb_0 fqb_06 = (fqb_0)((fvE)ftI11).getAppearance();
        fqb_06.setElementMap(fyy_03);
        ftI10.addBasicElement(fqb_06);
        fqb_06.onAttributesInitialized();
        fqm_0 fqm_08 = fqm_0.checkOut();
        fqm_08.setElementMap(fyy_03);
        fqm_08.setInsets(new Insets(0, 2, 0, 2));
        fqb_06.addBasicElement(fqm_08);
        fqm_08.onAttributesInitialized();
        fqm_08.onChildrenAdded();
        fqb_06.onChildrenAdded();
        ftI10.onChildrenAdded();
        ftI ftI12 = new ftI();
        ftI12.onCheckOut();
        ftI12.setElementMap(fyy_03);
        ftI12.setEnabled(true);
        ftI12.setGroupId("type");
        fdc_2 fdc_27 = new fdc_2();
        fdc_27.a("wakfu.debugAnm:setType(resources)");
        ftI12.setOnMouseRelease(fdc_27);
        ftI12.setText("ressources");
        ftI12.setValue("resources");
        fso11.addBasicElement(ftI12);
        ftI12.onAttributesInitialized();
        ftI ftI13 = ftI12;
        fqb_0 fqb_07 = (fqb_0)((fvE)ftI13).getAppearance();
        fqb_07.setElementMap(fyy_03);
        ftI12.addBasicElement(fqb_07);
        fqb_07.onAttributesInitialized();
        fqm_0 fqm_09 = fqm_0.checkOut();
        fqm_09.setElementMap(fyy_03);
        fqm_09.setInsets(new Insets(0, 2, 0, 2));
        fqb_07.addBasicElement(fqm_09);
        fqm_09.onAttributesInitialized();
        fqm_09.onChildrenAdded();
        fqb_07.onChildrenAdded();
        ftI12.onChildrenAdded();
        fso11.onChildrenAdded();
        fso fso12 = fso.checkOut();
        fso12.setElementMap(fyy_03);
        fso10.addBasicElement(fso12);
        fso12.onAttributesInitialized();
        String string3 = "gfxId";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fug_02);
        }
        fso12.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fug_02.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fru_02.setExpandable(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.debugAnm:setSkin(gfxId)");
        fru_02.setOnClick(fdt_12);
        fru_02.setText("set skin");
        fso12.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fru_02.onChildrenAdded();
        fso12.onChildrenAdded();
        fru_0 fru_03 = new fru_0();
        fru_03.onCheckOut();
        fru_03.setElementMap(fyy_03);
        fru_03.setExpandable(false);
        fdt_1 fdt_13 = new fdt_1();
        fdt_13.a("wakfu.debugAnm:updateLinkageList");
        fru_03.setOnClick(fdt_13);
        fru_03.setText("Mettre \u00e0 jour les linkages");
        fso10.addBasicElement(fru_03);
        fru_03.onAttributesInitialized();
        fru_03.onChildrenAdded();
        fsk fsk2 = new fsk();
        fsk2.onCheckOut();
        fsk2.setElementMap(fyy_03);
        fsk2.setExpandable(false);
        fdp_1 fdp_12 = new fdp_1();
        fdp_12.a("wakfu.debugAnm:selectionChanged");
        fsk2.setOnListSelectionChange(fdp_12);
        fsk2.setPrefSize(new fjf_2(200, 15));
        fso10.addBasicElement(fsk2);
        fsk2.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("content");
        fiy_13.setField("linkages");
        fiy_13.setName("debug.anm");
        fsk2.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("selectedValue");
        fiy_14.setField("selectedLinkage");
        fiy_14.setName("debug.anm");
        fsk2.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        fiy_14.onChildrenAdded();
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
        fsM fsM4 = new fsM();
        fsM4.onCheckOut();
        fsM4.setElementMap(fyy_03);
        fsM4.setNonBlocking(true);
        faf_22.addBasicElement(fsM4);
        fsM4.onAttributesInitialized();
        fip_2 fip_23 = new fip_2();
        fip_23.onCheckOut();
        fip_23.setElementMap(fyy_03);
        fip_23.setAlign(frs_0.e);
        fsM4.addBasicElement(fip_23);
        fip_23.onAttributesInitialized();
        fip_23.onChildrenAdded();
        fir_1 fir_12 = new fir_1();
        fir_12.onCheckOut();
        fir_12.setElementMap(fyy_03);
        fir_12.setAttribute("text");
        fsM4.addBasicElement(fir_12);
        fir_12.onAttributesInitialized();
        fir_12.onChildrenAdded();
        fsM4.onChildrenAdded();
        faf_22.onChildrenAdded();
        ftj_02.onChildrenAdded();
        fsQ fsQ2 = new fsQ();
        fsQ2.onCheckOut();
        fsQ2.setElementMap(fyy_03);
        fsQ2.setCellSize(new fjf_2(100.0f, 16));
        fsQ2.setHorizontal(false);
        fsk2.addBasicElement(fsQ2);
        fsQ2.onAttributesInitialized();
        faf_2 faf_23 = new faf_2();
        faf_23.onCheckOut();
        faf_23.setElementMap(fyy_03);
        fsQ2.addBasicElement(faf_23);
        faf_23.onAttributesInitialized();
        fsM fsM5 = new fsM();
        fsM5.onCheckOut();
        fsM5.setElementMap(fyy_03);
        fsM5.setNonBlocking(true);
        faf_23.addBasicElement(fsM5);
        fsM5.onAttributesInitialized();
        fir_1 fir_13 = new fir_1();
        fir_13.onCheckOut();
        fir_13.setElementMap(fyy_03);
        fir_13.setAttribute("text");
        fsM5.addBasicElement(fir_13);
        fir_13.onAttributesInitialized();
        fir_13.onChildrenAdded();
        fsM fsM6 = fsM5;
        fqh_0 fqh_03 = (fqh_0)((fvE)fsM6).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fsM5.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqm_0 fqm_010 = fqm_0.checkOut();
        fqm_010.setElementMap(fyy_03);
        fqm_010.setInsets(new Insets(0, 10, 0, 0));
        fqh_03.addBasicElement(fqm_010);
        fqm_010.onAttributesInitialized();
        fqm_010.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fsM5.onChildrenAdded();
        faf_23.onChildrenAdded();
        fsQ2.onChildrenAdded();
        fsk2.onChildrenAdded();
        fru_0 fru_04 = new fru_0();
        fru_04.onCheckOut();
        fru_04.setElementMap(fyy_03);
        fdt_1 fdt_14 = new fdt_1();
        fdt_14.a("wakfu.debugAnm:play");
        fru_04.setOnClick(fdt_14);
        fru_04.setText("Play");
        fso10.addBasicElement(fru_04);
        fru_04.onAttributesInitialized();
        fru_04.onChildrenAdded();
        fso10.onChildrenAdded();
        fso8.onChildrenAdded();
        fso3.onChildrenAdded();
        fso fso13 = fso.checkOut();
        fso13.setElementMap(fyy_03);
        fvk_02.addBasicElement(fso13);
        fso13.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setSize(new fjf_2(100.0f, 100.0f));
        fso13.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fso13.onChildrenAdded();
        fru_0 fru_05 = new fru_0();
        fru_05.onCheckOut();
        fru_05.setElementMap(fyy_03);
        fru_05.setExpandable(false);
        fru_05.setStyle("close");
        fdt_1 fdt_15 = new fdt_1();
        fdt_15.a("unloadDialog");
        fru_05.setOnClick(fdt_15);
        fvk_02.addBasicElement(fru_05);
        fru_05.onAttributesInitialized();
        fid_1 fid_15 = new fid_1();
        fid_15.onCheckOut();
        fid_15.setElementMap(fyy_03);
        fid_15.setAlign(frk_0.e);
        fid_15.setSize(new fjf_2(-2, -2));
        fid_15.setXOffset(-18);
        fid_15.setYOffset(-12);
        fru_05.addBasicElement(fid_15);
        fid_15.onAttributesInitialized();
        fid_15.onChildrenAdded();
        fru_05.onChildrenAdded();
        this.a(fvk_02);
        fvk_02.onChildrenAdded();
        return fvk_02;
    }

    public fyo a(fvk_0 fvk_02) {
        fyy_0 fyy_02 = this.a.peek();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_02);
        fid_12.setAlign(frk_0.i);
        fid_12.setInitValue(true);
        fid_12.setSize(new fjf_2(-2, -2));
        fvk_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        return fid_12;
    }
}

