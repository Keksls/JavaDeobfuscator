/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cSo
 */
public class cso_2
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
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.a);
        fid_12.setInitValue(true);
        fid_12.setSize(new fjf_2(-2, -2));
        fid_12.setXOffset(340);
        fvk_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fso2.setStyle("popup");
        fvk_02.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fso2.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        fvM fvM2 = new fvM();
        fvM2.onCheckOut();
        fvM2.setElementMap(fyy_03);
        fso2.addBasicElement(fvM2);
        fvM2.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setAlign(frk_0.i);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fvM2.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fic_1 fic_13 = new fic_1();
        fic_13.onCheckOut();
        fic_13.setAdaptToContentSize(true);
        fvM2.addBasicElement(fic_13);
        fic_13.onAttributesInitialized();
        fic_13.onChildrenAdded();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        fso3.setNonBlocking(true);
        fvM2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.i);
        fid_14.setSize(new fjf_2(100.0f, 100.0f));
        fso3.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fso4.setNonBlocking(true);
        fso3.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(true);
        fso4.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fsk_02.setDisplaySize(new fjf_2(48, 48));
        fsk_02.setExpandable(false);
        fsk_02.setNonBlocking(true);
        fso4.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.e);
        fsk_02.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fsk_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("texture");
        fiy_12.setField("currentWeather/iconUrl");
        fiy_12.setName("weather.manager");
        fqv2.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fqv2.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setExpandable(false);
        fsM2.setNonBlocking(true);
        fsM2.setStyle("defaultWhiteBold22");
        fso4.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fip_2 fip_23 = new fip_2();
        fip_23.onCheckOut();
        fip_23.setElementMap(fyy_03);
        fip_23.setAlign(frs_0.e);
        fsM2.addBasicElement(fip_23);
        fip_23.onAttributesInitialized();
        fip_23.onChildrenAdded();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fbh_1 fbh_12 = new fbh_1();
        fbh_12.onCheckOut();
        fbh_12.setElementMap(fyy_03);
        fbh_12.setColor(new fyr_0("gray80Color", 0.3f));
        fbh_12.setInsets(new Insets(0, 1, 0, 0));
        fqh_02.addBasicElement(fbh_12);
        fbh_12.onAttributesInitialized();
        fbh_12.onChildrenAdded();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(0, 3, 0, 0));
        fqh_02.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fip_2 fip_24 = new fip_2();
        fip_24.onCheckOut();
        fip_24.setElementMap(fyy_03);
        fip_24.setAlign(frs_0.e);
        fsM2.addBasicElement(fip_24);
        fip_24.onAttributesInitialized();
        fip_24.onChildrenAdded();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("text");
        fiy_13.setField("currentWeather/currentTemperature");
        fiy_13.setName("weather.manager");
        fsM2.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fsM2.onChildrenAdded();
        fso4.onChildrenAdded();
        fso3.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fru_02.setExpandable(false);
        fru_02.setNonBlocking(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("unloadDialog");
        fru_02.setOnClick(fdt_12);
        fru_02.setStyle("close");
        fvM2.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fid_1 fid_15 = new fid_1();
        fid_15.onCheckOut();
        fid_15.setElementMap(fyy_03);
        fid_15.setAlign(frk_0.e);
        fid_15.setSize(new fjf_2(-2, -2));
        fru_02.addBasicElement(fid_15);
        fid_15.onAttributesInitialized();
        fid_15.onChildrenAdded();
        fru_02.onChildrenAdded();
        fvM2.onChildrenAdded();
        fso2.onChildrenAdded();
        fvk_02.onChildrenAdded();
        return fvk_02;
    }
}

