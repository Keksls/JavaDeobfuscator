/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cPv
 */
public class cpv_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "container1";
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso2);
        }
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setYOffset(150);
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fso2.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        String string2 = "container2";
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fso3);
        }
        fso2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fso3.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fic_1 fic_13 = new fic_1();
        fic_13.onCheckOut();
        fic_13.setAdaptToContentSize(true);
        fso3.addBasicElement(fic_13);
        fic_13.onAttributesInitialized();
        fic_13.onChildrenAdded();
        String string3 = "animatedElementLeft";
        frO frO2 = new frO();
        frO2.onCheckOut();
        frO2.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, frO2);
        }
        frO2.setExpandable(false);
        frO2.setNonBlocking(true);
        frO2.setOffsetX(238.0f);
        frO2.setOffsetY(-13.0f);
        frO2.setPrefSize(new fjf_2(220, 84));
        frO2.setStyle("fightDecoratorLeft");
        fso3.addBasicElement(frO2);
        frO2.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.h);
        fid_14.setSize(new fjf_2(-2, 100.0f));
        frO2.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        frO2.onChildrenAdded();
        String string4 = "animatedElementRight";
        frO frO3 = new frO();
        frO3.onCheckOut();
        frO3.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, frO3);
        }
        frO3.setExpandable(false);
        frO3.setNonBlocking(true);
        frO3.setOffsetX(-238.0f);
        frO3.setOffsetY(-13.0f);
        frO3.setPrefSize(new fjf_2(220, 84));
        frO3.setStyle("fightDecoratorRight");
        fso3.addBasicElement(frO3);
        frO3.onAttributesInitialized();
        fid_1 fid_15 = new fid_1();
        fid_15.onCheckOut();
        fid_15.setElementMap(fyy_03);
        fid_15.setAlign(frk_0.j);
        fid_15.setSize(new fjf_2(-2, -2));
        frO3.addBasicElement(fid_15);
        fid_15.onAttributesInitialized();
        fid_15.onChildrenAdded();
        frO3.onChildrenAdded();
        fso3.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fso2.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fso fso5 = fso4;
        fqj fqj2 = ((fvE)fso5).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso4.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 165, 5, 165));
        fqj2.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fid_1 fid_16 = new fid_1();
        fid_16.onCheckOut();
        fid_16.setElementMap(fyy_03);
        fid_16.setSize(new fjf_2(100.0f, -2));
        fso4.addBasicElement(fid_16);
        fid_16.onAttributesInitialized();
        fid_16.onChildrenAdded();
        fso4.onChildrenAdded();
        String string5 = "text";
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fuk_02);
        }
        fuk_02.setMaxWidth(700);
        fuk_02.setNonBlocking(true);
        fuk_02.setStyle("bigBordered");
        fso2.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fid_1 fid_17 = new fid_1();
        fid_17.onCheckOut();
        fid_17.setElementMap(fyy_03);
        fid_17.setSize(new fjf_2(100.0f, 100.0f));
        fuk_02.addBasicElement(fid_17);
        fid_17.onAttributesInitialized();
        fid_17.onChildrenAdded();
        fuk_0 fuk_03 = fuk_02;
        fqh_0 fqh_02 = (fqh_0)((fvE)fuk_03).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlign(frs_0.h);
        fuk_02.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(0, 275, 20, 275));
        fqh_02.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

