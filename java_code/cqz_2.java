/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cQZ
 */
public class cqz_2
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
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.c);
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        fso2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.b);
        fso3.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fso3.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fso3.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setAlign(frk_0.c);
        fid_13.setSize(new fjf_2(100.0f, -2));
        fso4.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fsk_02.setExpandable(false);
        fsk_02.setNonBlocking(true);
        fsk_02.setStyle("SundialLeftButtonContainer");
        fso4.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fip_2 fip_23 = new fip_2();
        fip_23.onCheckOut();
        fip_23.setElementMap(fyy_03);
        fip_23.setAlign(frs_0.b);
        fsk_02.addBasicElement(fip_23);
        fip_23.onAttributesInitialized();
        fip_23.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fsk_0 fsk_03 = new fsk_0();
        fsk_03.onCheckOut();
        fsk_03.setElementMap(fyy_03);
        fsk_03.setNonBlocking(true);
        fsk_03.setPrefSize(new fjf_2(0, 43));
        fsk_03.setStyle("SundialCenterButtonContainer");
        fso4.addBasicElement(fsk_03);
        fsk_03.onAttributesInitialized();
        fip_2 fip_24 = new fip_2();
        fip_24.onCheckOut();
        fip_24.setElementMap(fyy_03);
        fip_24.setAlign(frs_0.b);
        fsk_03.addBasicElement(fip_24);
        fip_24.onAttributesInitialized();
        fip_24.onChildrenAdded();
        fsk_03.onChildrenAdded();
        fsk_0 fsk_04 = new fsk_0();
        fsk_04.onCheckOut();
        fsk_04.setElementMap(fyy_03);
        fsk_04.setExpandable(false);
        fsk_04.setNonBlocking(true);
        fsk_04.setStyle("SundialRightButtonContainer");
        fso4.addBasicElement(fsk_04);
        fsk_04.onAttributesInitialized();
        fip_2 fip_25 = new fip_2();
        fip_25.onCheckOut();
        fip_25.setElementMap(fyy_03);
        fip_25.setAlign(frs_0.b);
        fsk_04.addBasicElement(fip_25);
        fip_25.onAttributesInitialized();
        fip_25.onChildrenAdded();
        fsk_04.onChildrenAdded();
        fso4.onChildrenAdded();
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        fso3.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        fso fso6 = fso5;
        fqj fqj2 = ((fvE)fso6).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso5.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 20, 5, 20));
        fqj2.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setSize(new fjf_2(100.0f, 100.0f));
        fso5.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fso5.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fso fso7 = fso.checkOut();
        fso7.setElementMap(fyy_03);
        fso7.setExpandable(false);
        fso7.setStyle("titleBar");
        fso5.addBasicElement(fso7);
        fso7.onAttributesInitialized();
        fso fso8 = fso7;
        fqj fqj3 = ((fvE)fso8).getAppearance();
        fqj3.setElementMap(fyy_03);
        fso7.addBasicElement(fqj3);
        fqj3.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(3, 20, 3, 20));
        fqj3.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj3.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setNonBlocking(true);
        fsM2.setStyle("whiteBold");
        String string = "%subscription.end.dialog.title%";
        string = string.replace("%subscription.end.dialog.title%", fpm_0.b().c("subscription.end.dialog.title"));
        fsM2.c(string);
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
        fso fso9 = fso.checkOut();
        fso9.setElementMap(fyy_03);
        fso9.setExpandable(false);
        fso5.addBasicElement(fso9);
        fso9.onAttributesInitialized();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setAlign(frs_0.d);
        fso9.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fsM fsM4 = new fsM();
        fsM4.onCheckOut();
        fsM4.setElementMap(fyy_03);
        fsM4.setExpandable(false);
        fsM4.setNonBlocking(true);
        fsM4.setStyle("bold");
        String string2 = "%subscription.end.dialog.question%";
        string2 = string2.replace("%subscription.end.dialog.question%", fpm_0.b().c("subscription.end.dialog.question"));
        fsM4.c(string2);
        fso9.addBasicElement(fsM4);
        fsM4.onAttributesInitialized();
        fsM fsM5 = fsM4;
        fqh_0 fqh_03 = (fqh_0)((fvE)fsM5).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fqh_03.setAlignment(frs_0.e);
        fsM4.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqh_03.onChildrenAdded();
        fsM4.onChildrenAdded();
        fso fso10 = fso.checkOut();
        fso10.setElementMap(fyy_03);
        fso9.addBasicElement(fso10);
        fso10.onAttributesInitialized();
        fso fso11 = fso10;
        fqj fqj4 = ((fvE)fso11).getAppearance();
        fqj4.setElementMap(fyy_03);
        fso10.addBasicElement(fqj4);
        fqj4.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(0, 3, 0, 0));
        fqj4.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqj4.onChildrenAdded();
        fic_1 fic_13 = new fic_1();
        fic_13.onCheckOut();
        fic_13.setAdaptToContentSize(true);
        fso10.addBasicElement(fic_13);
        fic_13.onAttributesInitialized();
        fic_13.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fru_02.setExpandable(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu:subscriptionEndTeleport");
        fru_02.setOnClick(fdt_12);
        fru_02.setStyle("flat");
        fso10.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fid_1 fid_15 = new fid_1();
        fid_15.onCheckOut();
        fid_15.setElementMap(fyy_03);
        fid_15.setAlign(frk_0.i);
        fid_15.setSize(new fjf_2(100.0f, 100.0f));
        fru_02.addBasicElement(fid_15);
        fid_15.onAttributesInitialized();
        fid_15.onChildrenAdded();
        fru_0 fru_03 = fru_02;
        fqd_0 fqd_02 = (fqd_0)((fvE)fru_03).getAppearance();
        fqd_02.setElementMap(fyy_03);
        fru_02.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqo_0 fqo_03 = new fqo_0();
        fqo_03.onCheckOut();
        fqo_03.setElementMap(fyy_03);
        fqo_03.setInsets(new Insets(7, 7, 7, 7));
        fqd_02.addBasicElement(fqo_03);
        fqo_03.onAttributesInitialized();
        fqo_03.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fru_02.onChildrenAdded();
        fsk_0 fsk_05 = new fsk_0();
        fsk_05.onCheckOut();
        fsk_05.setElementMap(fyy_03);
        fsk_05.setDisplaySize(new fjf_2(16, 16));
        fsk_05.setNonBlocking(true);
        fsk_05.setStyle("apply");
        fso10.addBasicElement(fsk_05);
        fsk_05.onAttributesInitialized();
        fid_1 fid_16 = new fid_1();
        fid_16.onCheckOut();
        fid_16.setElementMap(fyy_03);
        fid_16.setAlign(frk_0.i);
        fid_16.setSize(new fjf_2(100.0f, 100.0f));
        fsk_05.addBasicElement(fid_16);
        fid_16.onAttributesInitialized();
        fid_16.onChildrenAdded();
        fsk_05.onChildrenAdded();
        fso10.onChildrenAdded();
        fso9.onChildrenAdded();
        fso5.onChildrenAdded();
        fsk_0 fsk_06 = new fsk_0();
        fsk_06.onCheckOut();
        fsk_06.setElementMap(fyy_03);
        fsk_06.setDisplaySize(new fjf_2(42, 42));
        fsk_06.setStyle("warning");
        fso3.addBasicElement(fsk_06);
        fsk_06.onAttributesInitialized();
        fid_1 fid_17 = new fid_1();
        fid_17.onCheckOut();
        fid_17.setElementMap(fyy_03);
        fid_17.setAlign(frk_0.a);
        fid_17.setXOffset(-25);
        fid_17.setYOffset(2);
        fsk_06.addBasicElement(fid_17);
        fid_17.onAttributesInitialized();
        fid_17.onChildrenAdded();
        fsk_06.onChildrenAdded();
        fso3.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

