/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cMS
 */
public class cms_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "popup";
        fil_1 fil_12 = new fil_1();
        fil_12.onCheckOut();
        fil_12.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fil_12);
        }
        fil_12.setAlign(frs_0.c);
        fil_12.setHideOnClick(false);
        fil_12.setHotSpotPosition(frs_0.g);
        fil_12.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setSize(new fjf_2(-2, -2));
        fil_12.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fil_12.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fso2.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        String string2 = "container";
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fso3);
        }
        fso3.setStyle("chatBubble");
        fso2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fso3.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fso fso4 = fso3;
        fqj fqj2 = ((fvE)fso4).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso3.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 0, 15, 0));
        fqj2.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(10, 15, 10, 15));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        fuk_02.setStyle("smallboldMap");
        fso3.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("text");
        fiy_12.setName("mapPopupDescription");
        fuk_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fso3.onChildrenAdded();
        String string3 = "image";
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fsk_02);
        }
        fsk_02.setNonBlocking(true);
        fsk_02.setStyle("BubbleArrowLeft");
        fso2.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.m);
        fid_14.setSize(new fjf_2(-2, -2));
        fsk_02.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fso2.onChildrenAdded();
        fil_12.onChildrenAdded();
        return fil_12;
    }
}

