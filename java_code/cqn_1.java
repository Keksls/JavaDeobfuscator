/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cQN
 */
public class cqn_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "splitExchangeCashContainer";
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso2);
        }
        fso2.setPack(true);
        fso2.setStyle("spellInventory");
        fso2.onAttributesInitialized();
        fih_2 fih_22 = new fih_2();
        fih_22.onCheckOut();
        fso2.addBasicElement(fih_22);
        fih_22.onAttributesInitialized();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        fih_22.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fso fso4 = fso3;
        fqj fqj2 = ((fvE)fso4).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso3.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 5, 0, 0));
        fqj2.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fii_2 fii_22 = fii_2.checkOut();
        fii_22.setElementMap(fyy_03);
        fii_22.setData(frg_0.a);
        fso3.addBasicElement(fii_22);
        fii_22.onAttributesInitialized();
        fii_22.onChildrenAdded();
        fih_2 fih_23 = new fih_2();
        fih_23.onCheckOut();
        fso3.addBasicElement(fih_23);
        fih_23.onAttributesInitialized();
        String string2 = "quantityTextEditor";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fug_02);
        }
        fug_02.setFocused(true);
        fug_02.a(10);
        fdo_1 fdo_12 = new fdo_1();
        fdo_12.a("wakfu.exchange:keyType(quantityTextEditor)");
        fug_02.setOnKeyType(fdo_12);
        fug_02.setPrefSize(new fjf_2(80, 0));
        fug_02.setRestrict("[0-9]+");
        fug_02.setSelectOnFocus(true);
        fug_02.setStyle("dark");
        fih_23.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("text");
        fiy_12.setName("exchange.amountOfCash");
        fug_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fii_2 fii_23 = fii_2.checkOut();
        fii_23.setElementMap(fyy_03);
        fii_23.setData(frg_0.a);
        fug_02.addBasicElement(fii_23);
        fii_23.onAttributesInitialized();
        fii_23.onChildrenAdded();
        fug_0 fug_03 = fug_02;
        fqh_0 fqh_02 = (fqh_0)((fvE)fug_03).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlign(frs_0.f);
        fug_02.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(8, 0, 5, 0));
        fqh_02.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fug_02.onChildrenAdded();
        fih_23.onChildrenAdded();
        fso3.onChildrenAdded();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.exchange:applyQuantity");
        fru_02.setOnClick(fdt_12);
        fru_02.setStyle("smallValid");
        fih_22.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fii_2 fii_24 = fii_2.checkOut();
        fii_24.setElementMap(fyy_03);
        fii_24.setData(frg_0.d);
        fru_02.addBasicElement(fii_24);
        fii_24.onAttributesInitialized();
        fii_24.onChildrenAdded();
        fru_0 fru_03 = fru_02;
        fqd_0 fqd_02 = (fqd_0)((fvE)fru_03).getAppearance();
        fqd_02.setElementMap(fyy_03);
        fru_02.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqm_0 fqm_04 = fqm_0.checkOut();
        fqm_04.setElementMap(fyy_03);
        fqm_04.setInsets(new Insets(3, 5, 0, 5));
        fqd_02.addBasicElement(fqm_04);
        fqm_04.onAttributesInitialized();
        fqm_04.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fru_02.onChildrenAdded();
        fih_22.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

