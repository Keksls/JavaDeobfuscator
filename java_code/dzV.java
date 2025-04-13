/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class dzV
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
        String string = "rollOverContainer";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqj2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(34);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeSimple3"));
        fqv2.setWidth(36);
        fqv2.setX(322);
        fqv2.setY(319);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(34);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeSimple3"));
        fqv3.setWidth(24);
        fqv3.setX(358);
        fqv3.setY(319);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(34);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeSimple3"));
        fqv4.setWidth(36);
        fqv4.setX(382);
        fqv4.setY(319);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(12);
        fqv5.setPosition(frk_0.j);
        fqv5.setTexture(this.a.c("themeSimple3"));
        fqv5.setWidth(36);
        fqv5.setX(382);
        fqv5.setY(357);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(34);
        fqv6.setPosition(frk_0.q);
        fqv6.setTexture(this.a.c("themeSimple3"));
        fqv6.setWidth(36);
        fqv6.setX(382);
        fqv6.setY(369);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(34);
        fqv7.setPosition(frk_0.o);
        fqv7.setTexture(this.a.c("themeSimple3"));
        fqv7.setWidth(24);
        fqv7.setX(358);
        fqv7.setY(369);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(34);
        fqv8.setPosition(frk_0.m);
        fqv8.setTexture(this.a.c("themeSimple3"));
        fqv8.setWidth(36);
        fqv8.setX(322);
        fqv8.setY(369);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(12);
        fqv9.setPosition(frk_0.h);
        fqv9.setTexture(this.a.c("themeSimple3"));
        fqv9.setWidth(36);
        fqv9.setX(322);
        fqv9.setY(357);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(17);
        fqv10.setPosition(frk_0.i);
        fqv10.setTexture(this.a.c("themeSimple3"));
        fqv10.setWidth(25);
        fqv10.setX(358);
        fqv10.setY(353);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

