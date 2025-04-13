/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cOb
 */
public class cob_1
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
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        ckt_22.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fso2.setPrefSize(new fjf_2(10, 40));
        fso2.setStyle("ChatBubbleBackground");
        fso2.setVisible(false);
        ckt_22.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fso2.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fso fso3 = fso2;
        fqj fqj2 = ((fvE)fso3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(5, 10, 10, 10));
        fqj2.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(5, 5, 5, 5));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fso2.onChildrenAdded();
        String string = "container";
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso4);
        }
        fso4.setStyle("chatBubble");
        ckt_22.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.m);
        fso4.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fso fso5 = fso4;
        fqj fqj3 = ((fvE)fso5).getAppearance();
        fqj3.setElementMap(fyy_03);
        fso4.addBasicElement(fqj3);
        fqj3.onAttributesInitialized();
        fqm_0 fqm_03 = fqm_0.checkOut();
        fqm_03.setElementMap(fyy_03);
        fqm_03.setInsets(new Insets(10, 15, 15, 15));
        fqj3.addBasicElement(fqm_03);
        fqm_03.onAttributesInitialized();
        fqm_03.onChildrenAdded();
        fqo_0 fqo_03 = new fqo_0();
        fqo_03.onCheckOut();
        fqo_03.setElementMap(fyy_03);
        fqo_03.setInsets(new Insets(10, 15, 10, 15));
        fqj3.addBasicElement(fqo_03);
        fqo_03.onAttributesInitialized();
        fqo_03.onChildrenAdded();
        fqj3.onChildrenAdded();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        fuk_02.setMaxWidth(350);
        fuk_02.setMinWidth(10);
        fuk_02.setNonBlocking(true);
        fuk_02.setStyle("DefaultDarkBold14");
        fuk_02.setThemeElementName("text");
        fuk_02.setThemeElementParentType("interactiveBubble");
        fso4.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.e);
        fuk_02.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fso fso6 = fso.checkOut();
        fso6.setElementMap(fyy_03);
        fso6.setThemeElementName("buttonContainer");
        fso6.setThemeElementParentType("interactiveBubble");
        fso4.addBasicElement(fso6);
        fso6.onAttributesInitialized();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setAlign(frs_0.f);
        fin_22.setHgap((short)5);
        fso6.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fso6.onChildrenAdded();
        fso4.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fsk_02.setNonBlocking(true);
        fsk_02.setStyle("BubbleArrowTopRight");
        ckt_22.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fid_1 fid_15 = new fid_1();
        fid_15.onCheckOut();
        fid_15.setElementMap(fyy_03);
        fid_15.setAlign(frk_0.e);
        fid_15.setSize(new fjf_2(60, 10));
        fsk_02.addBasicElement(fid_15);
        fid_15.onAttributesInitialized();
        fid_15.onChildrenAdded();
        fsk_02.onChildrenAdded();
        ckt_22.onChildrenAdded();
        return ckt_22;
    }
}

