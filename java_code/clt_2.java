/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cLT
 */
public class clt_2
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
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.b);
        fso7.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setHorizontal(false);
        fin_23.setVgap((short)3);
        fso7.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fso fso8 = fso.checkOut();
        fso8.setElementMap(fyy_03);
        fso8.setExpandable(false);
        fso7.addBasicElement(fso8);
        fso8.onAttributesInitialized();
        fso fso9 = fso8;
        fqj fqj5 = ((fvE)fso9).getAppearance();
        fqj5.setElementMap(fyy_03);
        fso8.addBasicElement(fqj5);
        fqj5.onAttributesInitialized();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_03);
        fqm_04.setInsets(new Insets(0, 0, 0, 9));
        fqj5.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqj5.onChildrenAdded();
        fip_2 fip_23 = new fip_2();
        fip_23.onCheckOut();
        fip_23.setElementMap(fyy_03);
        fip_23.setAlign(frs_0.f);
        fso8.addBasicElement(fip_23);
        fip_23.onAttributesInitialized();
        fip_23.onChildrenAdded();
        String string2 = "hour";
        fvk fvk2 = new fvk();
        fvk2.onCheckOut();
        fvk2.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fvk2);
        }
        fvk2.setDisplayFormat("%02d");
        fvk2.setExpandable(false);
        fvk2.setMaxBound(23);
        fvk2.setMinBound(0);
        fvk2.setPrefSize(new fjf_2(35, 0));
        fvk2.setValue(12);
        fso8.addBasicElement(fvk2);
        fvk2.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("value");
        fiy_12.setField("hour");
        fiy_12.setName("calendar.editable");
        fvk2.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fvk2.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setExpandable(false);
        fsM2.setStyle("bold");
        fsM2.c("H");
        fso8.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqm_0 fqm_05 = fqm_0.checkOut();
        fqm_05.setElementMap(fyy_03);
        fqm_05.setInsets(new Insets(0, 2, 0, 2));
        fqh_02.addBasicElement(fqm_05);
        fqm_05.onAttributesInitialized();
        fqm_05.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fsM2.onChildrenAdded();
        String string3 = "minutes";
        fvk fvk3 = new fvk();
        fvk3.onCheckOut();
        fvk3.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fvk3);
        }
        fvk3.setDisplayFormat("%02d");
        fvk3.setExpandable(false);
        fvk3.setMaxBound(59);
        fvk3.setMinBound(0);
        fvk3.setPrefSize(new fjf_2(35, 0));
        fvk3.setValue(0);
        fso8.addBasicElement(fvk3);
        fvk3.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("value");
        fiy_13.setField("minute");
        fiy_13.setName("calendar.editable");
        fvk3.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fvk3.onChildrenAdded();
        fso8.onChildrenAdded();
        fso fso10 = fso.checkOut();
        fso10.setElementMap(fyy_03);
        fso10.setExpandable(false);
        fso7.addBasicElement(fso10);
        fso10.onAttributesInitialized();
        fip_2 fip_24 = new fip_2();
        fip_24.onCheckOut();
        fip_24.setElementMap(fyy_03);
        fip_24.setAlign(frs_0.f);
        fso10.addBasicElement(fip_24);
        fip_24.onAttributesInitialized();
        fip_24.onChildrenAdded();
        fsk fsk2 = new fsk();
        fsk2.onCheckOut();
        fsk2.setElementMap(fyy_03);
        fsk2.setExpandable(false);
        fdp_1 fdp_12 = new fdp_1();
        fdp_12.a("wakfu.eventsCalendar:changeEditableCurrentMonth");
        fsk2.setOnListSelectionChange(fdp_12);
        fsk2.setPrefSize(new fjf_2(100, 15));
        fso10.addBasicElement(fsk2);
        fsk2.onAttributesInitialized();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("content");
        fiy_14.setField("monthesList");
        fiy_14.setName("calendar.editable");
        fsk2.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        fiy_14.onChildrenAdded();
        fiy_1 fiy_15 = fiy_1.checkOut();
        fiy_15.setElementMap(fyy_03);
        fiy_15.setAttribute("selectedValue");
        fiy_15.setField("selectedMonth");
        fiy_15.setName("calendar.editable");
        fsk2.addBasicElement(fiy_15);
        fiy_15.onAttributesInitialized();
        fiy_15.onChildrenAdded();
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
        fip_2 fip_25 = new fip_2();
        fip_25.onCheckOut();
        fip_25.setElementMap(fyy_03);
        fip_25.setAlign(frs_0.e);
        fsM4.addBasicElement(fip_25);
        fip_25.onAttributesInitialized();
        fip_25.onChildrenAdded();
        fir_1 fir_12 = new fir_1();
        fir_12.onCheckOut();
        fir_12.setElementMap(fyy_03);
        fir_12.setAttribute("text");
        fir_12.setField("description");
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
        fir_13.setField("description");
        fsM5.addBasicElement(fir_13);
        fir_13.onAttributesInitialized();
        fir_13.onChildrenAdded();
        fsM fsM6 = fsM5;
        fqh_0 fqh_03 = (fqh_0)((fvE)fsM6).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fsM5.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqm_0 fqm_06 = fqm_0.checkOut();
        fqm_06.setElementMap(fyy_03);
        fqm_06.setInsets(new Insets(0, 10, 0, 0));
        fqh_03.addBasicElement(fqm_06);
        fqm_06.onAttributesInitialized();
        fqm_06.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fsM5.onChildrenAdded();
        faf_23.onChildrenAdded();
        fsQ2.onChildrenAdded();
        fsk2.onChildrenAdded();
        fsk fsk3 = new fsk();
        fsk3.onCheckOut();
        fsk3.setElementMap(fyy_03);
        fsk3.setExpandable(false);
        fdp_1 fdp_13 = new fdp_1();
        fdp_13.a("wakfu.eventsCalendar:changeEditableCurrentYear");
        fsk3.setOnListSelectionChange(fdp_13);
        fsk3.setPrefSize(new fjf_2(50, 15));
        fso10.addBasicElement(fsk3);
        fsk3.onAttributesInitialized();
        fiy_1 fiy_16 = fiy_1.checkOut();
        fiy_16.setElementMap(fyy_03);
        fiy_16.setAttribute("content");
        fiy_16.setField("yearsList");
        fiy_16.setName("calendar.editable");
        fsk3.addBasicElement(fiy_16);
        fiy_16.onAttributesInitialized();
        fiy_16.onChildrenAdded();
        fiy_1 fiy_17 = fiy_1.checkOut();
        fiy_17.setElementMap(fyy_03);
        fiy_17.setAttribute("selectedValue");
        fiy_17.setField("selectedYear");
        fiy_17.setName("calendar.editable");
        fsk3.addBasicElement(fiy_17);
        fiy_17.onAttributesInitialized();
        fiy_17.onChildrenAdded();
        ftj_0 ftj_03 = new ftj_0();
        ftj_03.onCheckOut();
        ftj_03.setElementMap(fyy_03);
        fsk3.addBasicElement(ftj_03);
        ftj_03.onAttributesInitialized();
        faf_2 faf_24 = new faf_2();
        faf_24.onCheckOut();
        faf_24.setElementMap(fyy_03);
        ftj_03.addBasicElement(faf_24);
        faf_24.onAttributesInitialized();
        fsM fsM7 = new fsM();
        fsM7.onCheckOut();
        fsM7.setElementMap(fyy_03);
        fsM7.setNonBlocking(true);
        faf_24.addBasicElement(fsM7);
        fsM7.onAttributesInitialized();
        fip_2 fip_26 = new fip_2();
        fip_26.onCheckOut();
        fip_26.setElementMap(fyy_03);
        fip_26.setAlign(frs_0.e);
        fsM7.addBasicElement(fip_26);
        fip_26.onAttributesInitialized();
        fip_26.onChildrenAdded();
        fir_1 fir_14 = new fir_1();
        fir_14.onCheckOut();
        fir_14.setElementMap(fyy_03);
        fir_14.setAttribute("text");
        fsM7.addBasicElement(fir_14);
        fir_14.onAttributesInitialized();
        fir_14.onChildrenAdded();
        fsM7.onChildrenAdded();
        faf_24.onChildrenAdded();
        ftj_03.onChildrenAdded();
        fsQ fsQ3 = new fsQ();
        fsQ3.onCheckOut();
        fsQ3.setElementMap(fyy_03);
        fsQ3.setCellSize(new fjf_2(100.0f, 16));
        fsQ3.setHorizontal(false);
        fsk3.addBasicElement(fsQ3);
        fsQ3.onAttributesInitialized();
        faf_2 faf_25 = new faf_2();
        faf_25.onCheckOut();
        faf_25.setElementMap(fyy_03);
        fsQ3.addBasicElement(faf_25);
        faf_25.onAttributesInitialized();
        fsM fsM8 = new fsM();
        fsM8.onCheckOut();
        fsM8.setElementMap(fyy_03);
        fsM8.setNonBlocking(true);
        faf_25.addBasicElement(fsM8);
        fsM8.onAttributesInitialized();
        fir_1 fir_15 = new fir_1();
        fir_15.onCheckOut();
        fir_15.setElementMap(fyy_03);
        fir_15.setAttribute("text");
        fsM8.addBasicElement(fir_15);
        fir_15.onAttributesInitialized();
        fir_15.onChildrenAdded();
        fsM fsM9 = fsM8;
        fqh_0 fqh_04 = (fqh_0)((fvE)fsM9).getAppearance();
        fqh_04.setElementMap(fyy_03);
        fsM8.addBasicElement(fqh_04);
        fqh_04.onAttributesInitialized();
        fqm_0 fqm_07 = fqm_0.checkOut();
        fqm_07.setElementMap(fyy_03);
        fqm_07.setInsets(new Insets(0, 10, 0, 0));
        fqh_04.addBasicElement(fqm_07);
        fqm_07.onAttributesInitialized();
        fqm_07.onChildrenAdded();
        fqh_04.onChildrenAdded();
        fsM8.onChildrenAdded();
        faf_25.onChildrenAdded();
        fsQ3.onChildrenAdded();
        fsk3.onChildrenAdded();
        fso10.onChildrenAdded();
        String string4 = "calendar";
        fsb fsb2 = new fsb();
        fsb2.onCheckOut();
        fsb2.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fsb2);
        }
        fsb2.setCellSize(new fjf_2(22, 22));
        fsb2.setExpandable(false);
        fsb2.setStyle("small");
        fso7.addBasicElement(fsb2);
        fsb2.onAttributesInitialized();
        fiy_1 fiy_18 = fiy_1.checkOut();
        fiy_18.setElementMap(fyy_03);
        fiy_18.setAttribute("calendar");
        fiy_18.setField("calendar");
        fiy_18.setName("calendar.editable");
        fsb2.addBasicElement(fiy_18);
        fiy_18.onAttributesInitialized();
        fiy_18.onChildrenAdded();
        fip_2 fip_27 = new fip_2();
        fip_27.onCheckOut();
        fip_27.setElementMap(fyy_03);
        fip_27.setAlign(frs_0.e);
        fsb2.addBasicElement(fip_27);
        fip_27.onAttributesInitialized();
        fip_27.onChildrenAdded();
        faf_2 faf_26 = new faf_2();
        faf_26.onCheckOut();
        faf_26.setElementMap(fyy_03);
        fsb2.addBasicElement(faf_26);
        faf_26.onAttributesInitialized();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fru_02.setStyle("flat");
        faf_26.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fin_2 fin_24 = fin_2.checkOut();
        fin_24.setAlign(frs_0.d);
        fru_02.addBasicElement(fin_24);
        fin_24.onAttributesInitialized();
        fin_24.onChildrenAdded();
        fru_02.onChildrenAdded();
        faf_26.onChildrenAdded();
        fsb2.onChildrenAdded();
        fru_0 fru_03 = new fru_0();
        fru_03.onCheckOut();
        fru_03.setElementMap(fyy_03);
        fru_03.setClickSoundId(600002);
        fru_03.setExpandable(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.eventsCalendar:selectDate(calendar,hour,minutes)");
        fru_03.setOnClick(fdt_12);
        fru_03.setStyle("flat");
        String string5 = "%ok%";
        string5 = string5.replace("%ok%", fpm_0.b().c("ok"));
        fru_03.setText(string5);
        fso7.addBasicElement(fru_03);
        fru_03.onAttributesInitialized();
        fru_0 fru_04 = fru_03;
        fqd_0 fqd_02 = (fqd_0)((fvE)fru_04).getAppearance();
        fqd_02.setElementMap(fyy_03);
        fru_03.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqo_0 fqo_03 = new fqo_0();
        fqo_03.onCheckOut();
        fqo_03.setElementMap(fyy_03);
        fqo_03.setInsets(new Insets(3, 10, 3, 10));
        fqd_02.addBasicElement(fqo_03);
        fqo_03.onAttributesInitialized();
        fqo_03.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fip_2 fip_28 = new fip_2();
        fip_28.onCheckOut();
        fip_28.setElementMap(fyy_03);
        fip_28.setAlign(frs_0.e);
        fru_03.addBasicElement(fip_28);
        fip_28.onAttributesInitialized();
        fip_28.onChildrenAdded();
        fru_03.onChildrenAdded();
        fso7.onChildrenAdded();
        fso5.onChildrenAdded();
        fso3.onChildrenAdded();
        this.a(fvk_02);
        this.b(fvk_02);
        this.c(fvk_02);
        fvk_02.onChildrenAdded();
        return fvk_02;
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
        fdt_12.a("wakfu.eventsCalendar:closeCalendar");
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
        fid_12.setInitValue(true);
        fid_12.setSize(new fjf_2(-2, -2));
        fvk_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        return fid_12;
    }
}

