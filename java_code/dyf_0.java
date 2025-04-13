/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dYf
 */
public class dyf_0
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        fyb_0 fyb_02;
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqj fqj2 = fvE3.getAppearance();
        fqj2.setElementMap(fyy_03);
        fvE2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fvE fvE4 = fqj2.getParentOfType(fvE.class);
        fvE fvE5 = fvE4.getWidgetByThemeElementName("verticalButton", false);
        if (fvE5 != null) {
            fyb_02 = fvE5;
            fqd_0 fqd_02 = (fqd_0)((fvE)fyb_02).getAppearance();
            fqd_02.setElementMap(fyy_03);
            fvE5.addBasicElement(fqd_02);
            fqd_02.onAttributesInitialized();
            fqv fqv2 = fqv.checkOut();
            fqv2.setElementMap(fyy_03);
            fqv2.setHeight(26);
            fqv2.setPosition(frk_0.i);
            fqv2.setTexture(this.a.c("themeSimple3"));
            fqv2.setWidth(25);
            fqv2.setX(833);
            fqv2.setY(656);
            fqd_02.addBasicElement(fqv2);
            fqv2.onAttributesInitialized();
            fqv2.onChildrenAdded();
            fqd_02.onChildrenAdded();
        }
        fyb_02 = fqv.checkOut();
        fyb_02.setElementMap(fyy_03);
        ((fqv)fyb_02).setHeight(12);
        ((fqv)fyb_02).setPosition(frk_0.i);
        ((fqv)fyb_02).setTexture(this.a.c("themeSimple2"));
        ((fqv)fyb_02).setWidth(1);
        ((fqv)fyb_02).setX(295);
        ((fqv)fyb_02).setY(254);
        fqj2.addBasicElement(fyb_02);
        fyb_02.onAttributesInitialized();
        fyb_02.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

