/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cMv
 */
public class cmv_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "consoleDialog";
        fvk_0 fvk_02 = new fvk_0();
        fvk_02.onCheckOut();
        fvk_02.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fvk_02);
        }
        fvk_02.setNonBlocking(true);
        fvk_02.setPrefSize(new fjf_2(100, 100));
        fvk_02.setSize(new fjf_2(300, 300));
        fvk_02.setStyle("console");
        fvk_02.setX(100);
        fvk_02.setY(100);
        fvk_02.onAttributesInitialized();
        fih_2 fih_22 = new fih_2();
        fih_22.onCheckOut();
        fvk_02.addBasicElement(fih_22);
        fih_22.onAttributesInitialized();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fih_22.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fii_2 fii_22 = fii_2.checkOut();
        fii_22.setElementMap(fyy_03);
        fii_22.setData(frg_0.a);
        fso2.addBasicElement(fii_22);
        fii_22.onAttributesInitialized();
        fii_22.onChildrenAdded();
        fih_2 fih_23 = new fih_2();
        fih_23.onCheckOut();
        fso2.addBasicElement(fih_23);
        fih_23.onAttributesInitialized();
        fvM fvM2 = new fvM();
        fvM2.onCheckOut();
        fvM2.setElementMap(fyy_03);
        fdu_1 fdu_12 = new fdu_1();
        fdu_12.a("xulor:toggleVisible(windowContentContainer)");
        fvM2.setOnDoubleClick(fdu_12);
        fvM2.setThemeElementName("titleBar");
        fvM2.setThemeElementParentType("window");
        fih_23.addBasicElement(fvM2);
        fvM2.onAttributesInitialized();
        fii_2 fii_23 = fii_2.checkOut();
        fii_23.setElementMap(fyy_03);
        fii_23.setData(frg_0.e);
        fvM2.addBasicElement(fii_23);
        fii_23.onAttributesInitialized();
        fii_23.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fvM2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fru_02.setExpandable(false);
        fru_02.setStyle("smallDelete");
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("unloadDialog");
        fru_02.setOnClick(fdt_12);
        fin_22.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fru_02.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setNonBlocking(true);
        fsM2.setOrientation(frh_0.a);
        fsM2.setThemeElementName("label");
        fsM2.setThemeElementParentType("window");
        String string2 = "%dialog.console.title%";
        string2 = string2.replace("%dialog.console.title%", fpm_0.b().c("dialog.console.title"));
        fsM2.c(string2);
        fin_22.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM2.onChildrenAdded();
        fin_22.onChildrenAdded();
        fvM2.onChildrenAdded();
        String string3 = "windowContentContainer";
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fso3);
        }
        fso3.setThemeElementName("content");
        fso3.setThemeElementParentType("window");
        fih_23.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fii_2 fii_24 = fii_2.checkOut();
        fii_24.setElementMap(fyy_03);
        fii_24.setData(frg_0.a);
        fso3.addBasicElement(fii_24);
        fii_24.onAttributesInitialized();
        fii_24.onChildrenAdded();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fso3.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fic_12.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fso4.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fih_2 fih_24 = new fih_2();
        fih_24.onCheckOut();
        fso4.addBasicElement(fih_24);
        fih_24.onAttributesInitialized();
        fue_0 fue_02 = new fue_0();
        fue_02.onCheckOut();
        fue_02.setElementMap(fyy_03);
        fue_02.setNonBlocking(true);
        fih_24.addBasicElement(fue_02);
        fue_02.onAttributesInitialized();
        fii_2 fii_25 = fii_2.checkOut();
        fii_25.setElementMap(fyy_03);
        fii_25.setData(frg_0.a);
        fue_02.addBasicElement(fii_25);
        fii_25.onAttributesInitialized();
        fii_25.onChildrenAdded();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        fuk_02.setEnableShrinking(false);
        fuk_02.setSelectable(true);
        fuk_02.setStyle("DefaultWhite");
        fue_02.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("text");
        fiy_12.setField("logs");
        fiy_12.setName("adminConsole");
        fuk_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fuk_0 fuk_03 = fuk_02;
        fqh_0 fqh_02 = (fqh_0)((fvE)fuk_03).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fuk_02.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(0, 5, 0, 0));
        fqh_02.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fue_02.onChildrenAdded();
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        fso5.setStyle("ConsoleInput");
        fih_24.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        fii_2 fii_26 = fii_2.checkOut();
        fii_26.setElementMap(fyy_03);
        fii_26.setData(frg_0.c);
        fso5.addBasicElement(fii_26);
        fii_26.onAttributesInitialized();
        fii_26.onChildrenAdded();
        fih_2 fih_25 = new fih_2();
        fih_25.onCheckOut();
        fso5.addBasicElement(fih_25);
        fih_25.onAttributesInitialized();
        fsM fsM3 = new fsM();
        fsM3.onCheckOut();
        fsM3.setElementMap(fyy_03);
        fih_25.addBasicElement(fsM3);
        fsM3.onAttributesInitialized();
        fii_2 fii_27 = fii_2.checkOut();
        fii_27.setElementMap(fyy_03);
        fii_27.setData(frg_0.e);
        fsM3.addBasicElement(fii_27);
        fii_27.onAttributesInitialized();
        fii_27.onChildrenAdded();
        fsM fsM4 = fsM3;
        fqh_0 fqh_03 = (fqh_0)((fvE)fsM4).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fsM3.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 2, 0, 2));
        fqh_03.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("text");
        fiy_13.setField("prompt");
        fiy_13.setName("adminConsole");
        fsM3.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fsM3.onChildrenAdded();
        String string4 = "input";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fug_02);
        }
        fug_02.setAutoHorizontalScrolled(true);
        fug_02.setFocused(true);
        fdm_2 fdm_22 = new fdm_2();
        fdm_22.a("wakfu.adminConsole:processInputKeyEvent(input)");
        fug_02.setOnKeyPress(fdm_22);
        fug_02.setStyle("dark");
        fih_25.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fii_2 fii_28 = fii_2.checkOut();
        fii_28.setElementMap(fyy_03);
        fii_28.setData(frg_0.a);
        fug_02.addBasicElement(fii_28);
        fii_28.onAttributesInitialized();
        fii_28.onChildrenAdded();
        fug_02.onChildrenAdded();
        fru_0 fru_03 = new fru_0();
        fru_03.onCheckOut();
        fru_03.setElementMap(fyy_03);
        fdt_1 fdt_13 = new fdt_1();
        fdt_13.a("wakfu.adminConsole:clear");
        fru_03.setOnClick(fdt_13);
        fru_03.setStyle("small");
        String string5 = "%clear%";
        string5 = string5.replace("%clear%", fpm_0.b().c("clear"));
        fru_03.setText(string5);
        fih_25.addBasicElement(fru_03);
        fru_03.onAttributesInitialized();
        fru_0 fru_04 = fru_03;
        fqd_0 fqd_02 = (fqd_0)((fvE)fru_04).getAppearance();
        fqd_02.setElementMap(fyy_03);
        fru_03.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(0, 0, 0, 20));
        fqd_02.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fii_2 fii_29 = fii_2.checkOut();
        fii_29.setElementMap(fyy_03);
        fii_29.setData(frg_0.d);
        fru_03.addBasicElement(fii_29);
        fii_29.onAttributesInitialized();
        fii_29.onChildrenAdded();
        fru_03.onChildrenAdded();
        fih_25.onChildrenAdded();
        fso5.onChildrenAdded();
        fih_24.onChildrenAdded();
        fso4.onChildrenAdded();
        fvp_0 fvp_02 = new fvp_0();
        fvp_02.onCheckOut();
        fvp_02.setElementMap(fyy_03);
        fvp_02.setPointAlign(frs_0.i);
        fic_12.addBasicElement(fvp_02);
        fvp_02.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setAlign(frk_0.q);
        fvp_02.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fic_1 fic_13 = new fic_1();
        fic_13.onCheckOut();
        fic_13.setAdaptToContentSize(true);
        fvp_02.addBasicElement(fic_13);
        fic_13.onAttributesInitialized();
        fic_13.onChildrenAdded();
        fru_0 fru_05 = new fru_0();
        fru_05.onCheckOut();
        fru_05.setElementMap(fyy_03);
        fru_05.setExpandable(false);
        fru_05.setNonBlocking(true);
        fru_05.setStyle("Yellow");
        fvp_02.addBasicElement(fru_05);
        fru_05.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.i);
        fid_14.setSize(new fjf_2(100.0f, 100.0f));
        fru_05.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fru_0 fru_06 = fru_05;
        fqd_0 fqd_03 = (fqd_0)((fvE)fru_06).getAppearance();
        fqd_03.setElementMap(fyy_03);
        fru_05.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        fqo_0 fqo_03 = new fqo_0();
        fqo_03.onCheckOut();
        fqo_03.setElementMap(fyy_03);
        fqo_03.setInsets(new Insets(2, 2, 2, 3));
        fqd_03.addBasicElement(fqo_03);
        fqo_03.onAttributesInitialized();
        fqo_03.onChildrenAdded();
        fqd_03.onChildrenAdded();
        fru_05.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fsk_02.setNonBlocking(true);
        fsk_02.setStyle("multidirectionnalCross");
        fvp_02.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fid_1 fid_15 = new fid_1();
        fid_15.onCheckOut();
        fid_15.setElementMap(fyy_03);
        fid_15.setAlign(frk_0.i);
        fsk_02.addBasicElement(fid_15);
        fid_15.onAttributesInitialized();
        fid_15.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fvp_02.onChildrenAdded();
        fic_12.onChildrenAdded();
        fso3.onChildrenAdded();
        fih_23.onChildrenAdded();
        fso2.onChildrenAdded();
        fih_22.onChildrenAdded();
        fid_1 fid_16 = new fid_1();
        fid_16.onCheckOut();
        fid_16.setElementMap(fyy_03);
        fid_16.setInitValue(true);
        fid_16.setSize(new fjf_2(600, 300));
        fvk_02.addBasicElement(fid_16);
        fid_16.onAttributesInitialized();
        fid_16.onChildrenAdded();
        fvk_02.onChildrenAdded();
        return fvk_02;
    }
}

