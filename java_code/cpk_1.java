/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cPK
 */
public class cpk_1
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
        fso2.setPrefSize(new fjf_2(200, 50));
        fso2.setStyle("popup");
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setResizeOnce(true);
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setAlign(frs_0.b);
        fin_22.setHorizontal(false);
        fso2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        fso2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fih_2 fih_22 = new fih_2();
        fih_22.onCheckOut();
        fso3.addBasicElement(fih_22);
        fih_22.onAttributesInitialized();
        fih_22.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setMaxWidth(170);
        fsM2.setMinWidth(170);
        fsM2.setStyle("BigTitle");
        fso3.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("text");
        fiy_12.setField("name");
        fiy_12.setName("selectedNation");
        fsM2.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlignment(frs_0.d);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fii_2 fii_22 = fii_2.checkOut();
        fii_22.setElementMap(fyy_03);
        fii_22.setData(frg_0.e);
        fsM2.addBasicElement(fii_22);
        fii_22.onAttributesInitialized();
        fii_22.onChildrenAdded();
        fsM2.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fso3.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fii_2 fii_23 = fii_2.checkOut();
        fii_23.setElementMap(fyy_03);
        fii_23.setData(frg_0.d);
        fso4.addBasicElement(fii_23);
        fii_23.onAttributesInitialized();
        fii_23.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.nationChoice:validNationSelection");
        fru_02.setOnClick(fdt_12);
        fru_02.setStyle("smallValid");
        fso4.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fru_02.onChildrenAdded();
        fru_0 fru_03 = new fru_0();
        fru_03.onCheckOut();
        fru_03.setElementMap(fyy_03);
        fdt_1 fdt_13 = new fdt_1();
        fdt_13.a("wakfu.nationChoice:cancelNationSelection");
        fru_03.setOnClick(fdt_13);
        fru_03.setStyle("smallCancel");
        fso4.addBasicElement(fru_03);
        fru_03.onAttributesInitialized();
        fru_0 fru_04 = fru_03;
        fqd_0 fqd_02 = (fqd_0)((fvE)fru_04).getAppearance();
        fqd_02.setElementMap(fyy_03);
        fru_03.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 5, 0, 0));
        fqd_02.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fru_03.onChildrenAdded();
        fso4.onChildrenAdded();
        fso3.onChildrenAdded();
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        fso5.setExpandable(false);
        fso5.setPrefSize(new fjf_2(0, 7));
        fso5.setStyle("lineSeparator");
        fso2.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        fso fso6 = fso5;
        fqj fqj2 = ((fvE)fso6).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso5.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(5, 0, 2, 0));
        fqj2.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqj2.onChildrenAdded();
        fso5.onChildrenAdded();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        fuk_02.setMaxWidth(150);
        fuk_02.setMinWidth(150);
        fuk_02.setStyle("white");
        fso2.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("text");
        fiy_13.setField("description");
        fiy_13.setName("selectedNation");
        fuk_02.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fuk_0 fuk_03 = fuk_02;
        fqh_0 fqh_03 = (fqh_0)((fvE)fuk_03).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fqh_03.setAlignment(frs_0.e);
        fuk_02.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqh_03.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

