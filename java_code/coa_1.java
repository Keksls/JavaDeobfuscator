/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cOa
 */
public class coa_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        ckt_2 ckt_22 = new ckt_2();
        ckt_22.onCheckOut();
        ckt_22.setElementMap(fyy_03);
        ckt_22.setNonBlocking(false);
        ckt_22.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setInitValue(true);
        ckt_22.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fso2.setPrefSize(new fjf_2(150, 20));
        ckt_22.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fso fso3 = fso2;
        fqj fqj2 = ((fvE)fso3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(4, 4, 4, 4));
        fqj2.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fso2.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setAlign(frs_0.e);
        fin_22.setHorizontal(false);
        fso2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        fuk_02.setExpandable(true);
        fuk_02.setMaxWidth(300);
        fuk_02.setThemeElementName("text");
        fuk_02.setThemeElementParentType("interactiveBubble");
        fso2.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fuk_0 fuk_03 = fuk_02;
        fqh_0 fqh_02 = (fqh_0)((fvE)fuk_03).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlignment(frs_0.e);
        fuk_02.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqn fqn2 = fqn.checkOut();
        fqn2.setRenderer(fpm_0.b().g().d("fontName14"));
        fqn2.setElementMap(fyy_03);
        fqh_02.addBasicElement(fqn2);
        fqn2.onAttributesInitialized();
        fqn2.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("WPColor"));
        fqh_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fur_0 fur_02 = new fur_0();
        fur_02.onCheckOut();
        fur_02.setElementMap(fyy_03);
        fso2.addBasicElement(fur_02);
        fur_02.onAttributesInitialized();
        fur_02.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fso4.setExpandable(false);
        fso4.setThemeElementName("buttonContainer");
        fso4.setThemeElementParentType("interactiveBubble");
        fso2.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setAlign(frs_0.e);
        fin_23.setHgap((short)100);
        fso4.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fso4.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setExpandable(false);
        fsM2.setStyle("small");
        String string = "%leftClick.continue%";
        string = string.replace("%leftClick.continue%", fpm_0.b().c("leftClick.continue"));
        fsM2.c(string);
        fsM2.setThemeElementName("clickLabel");
        fsM2.setThemeElementParentType("interactiveBubble");
        fsM2.setVisible(false);
        fso2.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM fsM3 = fsM2;
        fqh_0 fqh_03 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_03.setElementMap(fyy_03);
        fqh_03.setAlign(frs_0.e);
        fsM2.addBasicElement(fqh_03);
        fqh_03.onAttributesInitialized();
        fqg_0 fqg_03 = fqg_0.checkOut();
        fqg_03.setElementMap(fyy_03);
        fqg_03.setColor(new azf_2(0.5f, 0.5f, 0.25f, 1.0f));
        fqg_03.setName("text");
        fqh_03.addBasicElement(fqg_03);
        fqg_03.onAttributesInitialized();
        fqg_03.onChildrenAdded();
        fqh_03.onChildrenAdded();
        fsM2.onChildrenAdded();
        fso2.onChildrenAdded();
        ckt_22.onChildrenAdded();
        return ckt_22;
    }
}

