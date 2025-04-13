/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dtF
 */
public class dtf_1
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        fyb_0 fyb_02;
        fyb_0 fyb_03;
        fvE fvE3;
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE4 = fvE2;
        fqj fqj2 = fvE4.getAppearance();
        fqj2.setElementMap(fyy_03);
        fvE2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fvE fvE5 = fqj2.getParentOfType(fvE.class);
        fvE fvE6 = fvE5.getWidgetByThemeElementName("cursor", false);
        if (fvE6 != null) {
            fvE3 = fvE6;
            fyb_03 = (fqp)fvE3.getAppearance();
            fyb_03.setElementMap(fyy_03);
            fvE6.addBasicElement(fyb_03);
            fyb_03.onAttributesInitialized();
            fyb_02 = fqv.checkOut();
            fyb_02.setElementMap(fyy_03);
            ((fqv)fyb_02).setHeight(11);
            ((fqv)fyb_02).setPosition(frk_0.i);
            ((fqv)fyb_02).setTexture(this.a.c("themeSimple"));
            ((fqv)fyb_02).setWidth(11);
            ((fqv)fyb_02).setX(1569);
            ((fqv)fyb_02).setY(267);
            fyb_03.addBasicElement(fyb_02);
            fyb_02.onAttributesInitialized();
            fyb_02.onChildrenAdded();
            fyb_03.onChildrenAdded();
        }
        if ((fyb_03 = (fvE3 = fqj2.getParentOfType(fvE.class)).getWidgetByThemeElementName("slider", false)) != null) {
            fyb_02 = (fvE)fyb_03;
            fqp fqp2 = (fqp)((fvE)fyb_02).getAppearance();
            fqp2.setElementMap(fyy_03);
            fyb_03.addBasicElement(fqp2);
            fqp2.onAttributesInitialized();
            fqv fqv2 = fqv.checkOut();
            fqv2.setElementMap(fyy_03);
            fqv2.setHeight(14);
            fqv2.setPosition(frk_0.i);
            fqv2.setTexture(this.a.c("themeSimple"));
            fqv2.setWidth(20);
            fqv2.setX(1545);
            fqv2.setY(270);
            fqp2.addBasicElement(fqv2);
            fqv2.onAttributesInitialized();
            fqv2.onChildrenAdded();
            fqp2.onChildrenAdded();
        }
        fqj2.onChildrenAdded();
    }
}

