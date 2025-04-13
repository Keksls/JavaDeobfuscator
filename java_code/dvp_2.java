/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dvP
 */
public class dvp_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        fqv fqv2;
        fyg_0 fyg_02;
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
        fvE fvE6 = fvE5.getWidgetByThemeElementName("progressBar", false);
        if (fvE6 != null) {
            fvE3 = fvE6;
            fyb_03 = (fqx)fvE3.getAppearance();
            fyb_03.setElementMap(fyy_03);
            fvE6.addBasicElement(fyb_03);
            fyb_03.onAttributesInitialized();
            fyb_02 = fqv.checkOut();
            fyb_02.setElementMap(fyy_03);
            ((fqv)fyb_02).setHeight(32);
            ((fqv)fyb_02).setPosition(frk_0.a);
            ((fqv)fyb_02).setTexture(this.a.c("whiteAlpha"));
            ((fqv)fyb_02).setWidth(32);
            ((fqv)fyb_02).setX(0);
            ((fqv)fyb_02).setY(0);
            fyb_03.addBasicElement(fyb_02);
            fyb_02.onAttributesInitialized();
            fyb_02.onChildrenAdded();
            fyg_02 = fqv.checkOut();
            fyg_02.setElementMap(fyy_03);
            ((fqv)fyg_02).setHeight(32);
            ((fqv)fyg_02).setPosition(frk_0.c);
            ((fqv)fyg_02).setTexture(this.a.c("whiteAlpha"));
            ((fqv)fyg_02).setWidth(32);
            ((fqv)fyg_02).setX(0);
            ((fqv)fyg_02).setY(0);
            fyb_03.addBasicElement(fyg_02);
            fyg_02.onAttributesInitialized();
            fyg_02.onChildrenAdded();
            fqv2 = fqv.checkOut();
            fqv2.setElementMap(fyy_03);
            fqv2.setHeight(32);
            fqv2.setPosition(frk_0.e);
            fqv2.setTexture(this.a.c("whiteAlpha"));
            fqv2.setWidth(32);
            fqv2.setX(0);
            fqv2.setY(0);
            fyb_03.addBasicElement(fqv2);
            fqv2.onAttributesInitialized();
            fqv2.onChildrenAdded();
            fqv fqv3 = fqv.checkOut();
            fqv3.setElementMap(fyy_03);
            fqv3.setHeight(32);
            fqv3.setPosition(frk_0.h);
            fqv3.setTexture(this.a.c("whiteAlpha"));
            fqv3.setWidth(32);
            fqv3.setX(0);
            fqv3.setY(0);
            fyb_03.addBasicElement(fqv3);
            fqv3.onAttributesInitialized();
            fqv3.onChildrenAdded();
            fqv fqv4 = fqv.checkOut();
            fqv4.setElementMap(fyy_03);
            fqv4.setHeight(32);
            fqv4.setPosition(frk_0.i);
            fqv4.setTexture(this.a.c("whiteAlpha"));
            fqv4.setWidth(32);
            fqv4.setX(0);
            fqv4.setY(0);
            fyb_03.addBasicElement(fqv4);
            fqv4.onAttributesInitialized();
            fqv4.onChildrenAdded();
            fqv fqv5 = fqv.checkOut();
            fqv5.setElementMap(fyy_03);
            fqv5.setHeight(32);
            fqv5.setPosition(frk_0.j);
            fqv5.setTexture(this.a.c("whiteAlpha"));
            fqv5.setWidth(32);
            fqv5.setX(0);
            fqv5.setY(0);
            fyb_03.addBasicElement(fqv5);
            fqv5.onAttributesInitialized();
            fqv5.onChildrenAdded();
            fqv fqv6 = fqv.checkOut();
            fqv6.setElementMap(fyy_03);
            fqv6.setHeight(32);
            fqv6.setPosition(frk_0.m);
            fqv6.setTexture(this.a.c("whiteAlpha"));
            fqv6.setWidth(32);
            fqv6.setX(0);
            fqv6.setY(0);
            fyb_03.addBasicElement(fqv6);
            fqv6.onAttributesInitialized();
            fqv6.onChildrenAdded();
            fqv fqv7 = fqv.checkOut();
            fqv7.setElementMap(fyy_03);
            fqv7.setHeight(32);
            fqv7.setPosition(frk_0.o);
            fqv7.setTexture(this.a.c("whiteAlpha"));
            fqv7.setWidth(32);
            fqv7.setX(0);
            fqv7.setY(0);
            fyb_03.addBasicElement(fqv7);
            fqv7.onAttributesInitialized();
            fqv7.onChildrenAdded();
            fqv fqv8 = fqv.checkOut();
            fqv8.setElementMap(fyy_03);
            fqv8.setHeight(32);
            fqv8.setPosition(frk_0.q);
            fqv8.setTexture(this.a.c("whiteAlpha"));
            fqv8.setWidth(32);
            fqv8.setX(0);
            fqv8.setY(0);
            fyb_03.addBasicElement(fqv8);
            fqv8.onAttributesInitialized();
            fqv8.onChildrenAdded();
            fyb_03.onChildrenAdded();
        }
        if ((fyb_03 = (fvE3 = fqj2.getParentOfType(fvE.class)).getWidgetByThemeElementName("compassOrientation", false)) != null) {
            fyb_02 = (fvE)fyb_03;
            fyg_02 = (fqp)((fvE)fyb_02).getAppearance();
            fyg_02.setElementMap(fyy_03);
            ((fqp)fyg_02).setScaled(false);
            fyb_03.addBasicElement(fyg_02);
            fyg_02.onAttributesInitialized();
            fqv2 = fqv.checkOut();
            fqv2.setElementMap(fyy_03);
            fqv2.setHeight(48);
            fqv2.setPosition(frk_0.i);
            fqv2.setTexture(this.a.c("arrow"));
            fqv2.setWidth(48);
            fqv2.setX(0);
            fqv2.setY(0);
            fyg_02.addBasicElement(fqv2);
            fqv2.onAttributesInitialized();
            fqv2.onChildrenAdded();
            fyg_02.onChildrenAdded();
        }
        fqj2.onChildrenAdded();
    }
}

