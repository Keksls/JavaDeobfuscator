/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cQz
 */
public class cqz_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "resourcesCollectorWindow";
        fvk_0 fvk_02 = new fvk_0();
        fvk_02.onCheckOut();
        fvk_02.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fvk_02);
        }
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
        String string2 = "%seedSpreader.seed%";
        string2 = string2.replace("%seedSpreader.seed%", fpm_0.b().c("seedSpreader.seed"));
        fsM2.c(string2);
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
        String string3 = "windowContentContainer";
        fso fso10 = fso.checkOut();
        fso10.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fso10);
        }
        fso8.addBasicElement(fso10);
        fso10.onAttributesInitialized();
        fso fso11 = fso.checkOut();
        fso11.setElementMap(fyy_03);
        fso10.addBasicElement(fso11);
        fso11.onAttributesInitialized();
        fin_2 fin_24 = fin_2.checkOut();
        fin_24.setAlign(frs_0.b);
        fin_24.setHorizontal(false);
        fso11.addBasicElement(fin_24);
        fin_24.onAttributesInitialized();
        fin_24.onChildrenAdded();
        fso fso12 = fso.checkOut();
        fso12.setElementMap(fyy_03);
        fso11.addBasicElement(fso12);
        fso12.onAttributesInitialized();
        fso fso13 = fso12;
        fqj fqj6 = ((fvE)fso13).getAppearance();
        fqj6.setElementMap(fyy_03);
        fso12.addBasicElement(fqj6);
        fqj6.onAttributesInitialized();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_03);
        fqm_04.setInsets(new Insets(0, 10, 0, 10));
        fqj6.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqj6.onChildrenAdded();
        fic_1 fic_13 = new fic_1();
        fic_13.onCheckOut();
        fic_13.setAdaptToContentSize(true);
        fso12.addBasicElement(fic_13);
        fic_13.onAttributesInitialized();
        fic_13.onChildrenAdded();
        fso fso14 = fso.checkOut();
        fso14.setElementMap(fyy_03);
        fso14.setStyle("caracs");
        fso12.addBasicElement(fso14);
        fso14.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.i);
        fid_14.setSize(new fjf_2(100.0f, 100.0f));
        fso14.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fso fso15 = fso14;
        fqj fqj7 = ((fvE)fso15).getAppearance();
        fqj7.setElementMap(fyy_03);
        fqj7.setModulationColor(new azf_2(0.9f, 0.9f, 0.9f, 1.0f));
        fso14.addBasicElement(fqj7);
        fqj7.onAttributesInitialized();
        fqm_0 fqm_05 = fqm_0.checkOut();
        fqm_05.setElementMap(fyy_03);
        fqm_05.setInsets(new Insets(0, 0, 0, 0));
        fqj7.addBasicElement(fqm_05);
        fqm_05.onAttributesInitialized();
        fqm_05.onChildrenAdded();
        fqj7.onChildrenAdded();
        fso14.onChildrenAdded();
        fso fso16 = fso.checkOut();
        fso16.setElementMap(fyy_03);
        fso16.setExpandable(false);
        fso12.addBasicElement(fso16);
        fso16.onAttributesInitialized();
        fid_1 fid_15 = new fid_1();
        fid_15.onCheckOut();
        fid_15.setElementMap(fyy_03);
        fid_15.setAlign(frk_0.i);
        fid_15.setSize(new fjf_2(100.0f, 100.0f));
        fid_15.setXOffset(3);
        fso16.addBasicElement(fid_15);
        fid_15.onAttributesInitialized();
        fid_15.onChildrenAdded();
        fso fso17 = fso16;
        fqj fqj8 = ((fvE)fso17).getAppearance();
        fqj8.setElementMap(fyy_03);
        fso16.addBasicElement(fqj8);
        fqj8.onAttributesInitialized();
        fqm_0 fqm_06 = fqm_0.checkOut();
        fqm_06.setElementMap(fyy_03);
        fqm_06.setInsets(new Insets(7, 1, 5, 0));
        fqj8.addBasicElement(fqm_06);
        fqm_06.onAttributesInitialized();
        fqm_06.onChildrenAdded();
        fqj8.onChildrenAdded();
        fso fso18 = fso.checkOut();
        fso18.setElementMap(fyy_03);
        fso18.setExpandable(false);
        fso16.addBasicElement(fso18);
        fso18.onAttributesInitialized();
        fic_1 fic_14 = new fic_1();
        fic_14.onCheckOut();
        fic_14.setAdaptToContentSize(true);
        fso18.addBasicElement(fic_14);
        fic_14.onAttributesInitialized();
        fic_14.onChildrenAdded();
        String string4 = "seedSlot";
        fso fso19 = fso.checkOut();
        fso19.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fso19);
        }
        fso19.setPrefSize(new fjf_2(55, 55));
        fso19.setStyle("itemBackground");
        fso18.addBasicElement(fso19);
        fso19.onAttributesInitialized();
        fid_1 fid_16 = new fid_1();
        fid_16.onCheckOut();
        fid_16.setElementMap(fyy_03);
        fid_16.setAlign(frk_0.i);
        fso19.addBasicElement(fid_16);
        fid_16.onAttributesInitialized();
        fid_16.onChildrenAdded();
        fso19.onChildrenAdded();
        ftj_0 ftj_02 = new ftj_0();
        ftj_02.onCheckOut();
        ftj_02.setElementMap(fyy_03);
        fso18.addBasicElement(ftj_02);
        ftj_02.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("content");
        fiy_12.setName("seedSpreaderItem");
        ftj_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fid_1 fid_17 = new fid_1();
        fid_17.onCheckOut();
        fid_17.setElementMap(fyy_03);
        fid_17.setAlign(frk_0.i);
        fid_17.setSize(new fjf_2(55, 55));
        ftj_02.addBasicElement(fid_17);
        fid_17.onAttributesInitialized();
        fid_17.onChildrenAdded();
        faf_2 faf_22 = new faf_2();
        faf_22.onCheckOut();
        faf_22.setElementMap(fyy_03);
        ftj_02.addBasicElement(faf_22);
        faf_22.onAttributesInitialized();
        fsv_0 fsv_02 = new fsv_0();
        fsv_02.onCheckOut();
        fsv_02.setElementMap(fyy_03);
        fsv_02.setNonBlocking(false);
        fdb_2 fdb_22 = new fdb_2();
        fdb_22.a("wakfu.seedSpreader:removeSeed");
        fsv_02.setOnDrag(fdb_22);
        faf_22.addBasicElement(fsv_02);
        fsv_02.onAttributesInitialized();
        fso fso20 = fso.checkOut();
        fso20.setElementMap(fyy_03);
        fso20.setNonBlocking(true);
        fsv_02.addBasicElement(fso20);
        fso20.onAttributesInitialized();
        fic_1 fic_15 = new fic_1();
        fic_15.onCheckOut();
        fic_15.setAdaptToContentSize(true);
        fso20.addBasicElement(fic_15);
        fic_15.onAttributesInitialized();
        fic_15.onChildrenAdded();
        fsM fsM4 = new fsM();
        fsM4.onCheckOut();
        fsM4.setElementMap(fyy_03);
        fsM4.setNonBlocking(true);
        fsM4.setStyle("White10Bordered");
        fso20.addBasicElement(fsM4);
        fsM4.onAttributesInitialized();
        fir_1 fir_12 = new fir_1();
        fir_12.onCheckOut();
        fir_12.setElementMap(fyy_03);
        fir_12.setAttribute("visible");
        fir_12.setField("quantity");
        fsM4.addBasicElement(fir_12);
        fir_12.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_03);
        fir_12.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fam_1 fam_12 = new fam_1();
        fam_12.onCheckOut();
        fam_12.setElementMap(fyy_03);
        fam_12.setValue("1");
        far_22.addBasicElement(fam_12);
        fam_12.onAttributesInitialized();
        fam_12.onChildrenAdded();
        far_22.onChildrenAdded();
        fir_12.onChildrenAdded();
        fid_1 fid_18 = new fid_1();
        fid_18.onCheckOut();
        fid_18.setElementMap(fyy_03);
        fid_18.setAlign(frk_0.m);
        fsM4.addBasicElement(fid_18);
        fid_18.onAttributesInitialized();
        fid_18.onChildrenAdded();
        fsM fsM5 = fsM4;
        fqh_0 fqh_03 = (fqh_0)((fvE)fsM5).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fsM4.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqm_0 fqm_07 = fqm_0.checkOut();
        fqm_07.setElementMap(fyy_03);
        fqm_07.setInsets(new Insets(0, 6, 6, 0));
        fqh_03.addBasicElement(fqm_07);
        fqm_07.onAttributesInitialized();
        fqm_07.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fir_1 fir_13 = new fir_1();
        fir_13.onCheckOut();
        fir_13.setElementMap(fyy_03);
        fir_13.setAttribute("text");
        fir_13.setField("quantity");
        fsM4.addBasicElement(fir_13);
        fir_13.onAttributesInitialized();
        fir_13.onChildrenAdded();
        fsM4.onChildrenAdded();
        fso20.onChildrenAdded();
        fsv_02.onChildrenAdded();
        faf_22.onChildrenAdded();
        ftj_02.onChildrenAdded();
        fso18.onChildrenAdded();
        fso16.onChildrenAdded();
        fso12.onChildrenAdded();
        fso11.onChildrenAdded();
        fso10.onChildrenAdded();
        fso8.onChildrenAdded();
        fso3.onChildrenAdded();
        fso fso21 = fso.checkOut();
        fso21.setElementMap(fyy_03);
        fvk_02.addBasicElement(fso21);
        fso21.onAttributesInitialized();
        fid_1 fid_19 = new fid_1();
        fid_19.onCheckOut();
        fid_19.setElementMap(fyy_03);
        fid_19.setSize(new fjf_2(100.0f, 100.0f));
        fso21.addBasicElement(fid_19);
        fid_19.onAttributesInitialized();
        fid_19.onChildrenAdded();
        fso21.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fru_02.setExpandable(false);
        fru_02.setStyle("close");
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.seedSpreader:closeWindow");
        fru_02.setOnClick(fdt_12);
        fvk_02.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fid_1 fid_110 = new fid_1();
        fid_110.onCheckOut();
        fid_110.setElementMap(fyy_03);
        fid_110.setAlign(frk_0.e);
        fid_110.setSize(new fjf_2(-2, -2));
        fid_110.setXOffset(-18);
        fid_110.setYOffset(-12);
        fru_02.addBasicElement(fid_110);
        fid_110.onAttributesInitialized();
        fid_110.onChildrenAdded();
        fru_02.onChildrenAdded();
        fid_1 fid_111 = new fid_1();
        fid_111.onCheckOut();
        fid_111.setElementMap(fyy_03);
        fid_111.setAlign(frk_0.h);
        fid_111.setInitValue(true);
        fid_111.setSize(new fjf_2(-2, -2));
        fvk_02.addBasicElement(fid_111);
        fid_111.onAttributesInitialized();
        fid_111.onChildrenAdded();
        fvk_02.onChildrenAdded();
        return fvk_02;
    }
}

