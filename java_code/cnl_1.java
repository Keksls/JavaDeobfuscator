/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cNl
 */
public class cnl_1
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
        fso2.setStyle("popup");
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setYOffset(200);
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso3 = fso2;
        fqj fqj2 = ((fvE)fso3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(0, 0, 0, 0));
        fqj2.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fso4.setExpandable(false);
        fso2.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        String string2 = "image1";
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fsk_02);
        }
        fsk_02.setStyle("leftLeafDecorator");
        fso4.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fsk_02.onChildrenAdded();
        String string3 = "container2";
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fso5);
        }
        fso5.setStyle("leafDecorator");
        fso4.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        String string4 = "text";
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fsM2);
        }
        fsM2.setStyle("systemMessage");
        fso5.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM2.onChildrenAdded();
        fso5.onChildrenAdded();
        String string5 = "image2";
        fsk_0 fsk_03 = new fsk_0();
        fsk_03.onCheckOut();
        fsk_03.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fsk_03);
        }
        fsk_03.setStyle("rightLeafDecorator");
        fso4.addBasicElement(fsk_03);
        fsk_03.onAttributesInitialized();
        fsk_03.onChildrenAdded();
        fso4.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

