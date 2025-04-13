/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class dXX
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqj fqj2 = fvE3.getAppearance();
        fqj2.setElementMap(fyy_03);
        fvE2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fvE fvE4 = fqj2.getParentOfType(fvE.class);
        fvE fvE5 = fvE4.getWidgetByThemeElementName("horizontalButton", false);
        if (fvE5 != null) {
            fvE fvE6 = fvE5;
            fqd_0 fqd_02 = (fqd_0)fvE6.getAppearance();
            fqd_02.setElementMap(fyy_03);
            fqd_02.setState("default");
            fvE5.addBasicElement(fqd_02);
            fqd_02.onAttributesInitialized();
            String string = "pmCurrentWakfuSlider";
            fqv fqv2 = fqv.checkOut();
            fqv2.setElementMap(fyy_03);
            if (fyy_03 != null && string != null) {
                fyy_03.a(string, fqv2);
            }
            fqv2.setHeight(12);
            fqv2.setPosition(frk_0.i);
            fqv2.setTexture(this.a.c("themeSimple"));
            fqv2.setWidth(23);
            fqv2.setX(847);
            fqv2.setY(675);
            fqd_02.addBasicElement(fqv2);
            fqv2.onAttributesInitialized();
            fqv2.onChildrenAdded();
            fqd_02.onChildrenAdded();
        }
        fqj2.onChildrenAdded();
    }
}

