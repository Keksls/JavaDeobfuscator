/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cOc
 */
public class coc_2
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
        fid_12.setSize(new fjf_2(-2, -2));
        ckt_22.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        String string = "container";
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso2);
        }
        fso2.setPrefSize(new fjf_2(240, 40));
        fso2.setStyle("backgroundPopup");
        ckt_22.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fso2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fso fso3 = fso2;
        fqj fqj2 = ((fvE)fso3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(10, 10, 10, 10));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        fuk_02.setMaxWidth(220);
        fuk_02.setMinWidth(220);
        fuk_02.setNonBlocking(true);
        fuk_02.setStyle("white");
        fuk_02.setThemeElementName("text");
        fuk_02.setThemeElementParentType("interactiveBubble");
        fso2.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.e);
        fuk_02.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fso4.setThemeElementName("buttonContainer");
        fso4.setThemeElementParentType("interactiveBubble");
        fso2.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fin_2 fin_23 = fin_2.checkOut();
        fin_23.setAlign(frs_0.f);
        fin_23.setHgap((short)5);
        fso4.addBasicElement(fin_23);
        fin_23.onAttributesInitialized();
        fin_23.onChildrenAdded();
        fso4.onChildrenAdded();
        fso2.onChildrenAdded();
        ckt_22.onChildrenAdded();
        return ckt_22;
    }
}

