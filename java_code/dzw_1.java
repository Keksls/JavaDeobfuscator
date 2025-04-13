/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dzW
 */
public class dzw_1
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
        String string = "buttonBackgroundDefault";
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
        fqv2.setHeight(14);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(20);
        fqv2.setX(215);
        fqv2.setY(6);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fby_22.onChildrenAdded();
        String string2 = "buttonBorderDefault";
        fbc_1 fbc_12 = new fbc_1();
        fbc_12.onCheckOut();
        fbc_12.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fbc_12);
        }
        fqj2.addBasicElement(fbc_12);
        fbc_12.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(4);
        fqv3.setPosition(frk_0.a);
        fqv3.setTexture(this.a.c("themeDefault"));
        fqv3.setWidth(4);
        fqv3.setX(211);
        fqv3.setY(2);
        fbc_12.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(4);
        fqv4.setPosition(frk_0.c);
        fqv4.setTexture(this.a.c("themeDefault"));
        fqv4.setWidth(20);
        fqv4.setX(215);
        fqv4.setY(2);
        fbc_12.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(4);
        fqv5.setPosition(frk_0.e);
        fqv5.setTexture(this.a.c("themeDefault"));
        fqv5.setWidth(5);
        fqv5.setX(235);
        fqv5.setY(2);
        fbc_12.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(14);
        fqv6.setPosition(frk_0.j);
        fqv6.setTexture(this.a.c("themeDefault"));
        fqv6.setWidth(5);
        fqv6.setX(235);
        fqv6.setY(6);
        fbc_12.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(5);
        fqv7.setPosition(frk_0.q);
        fqv7.setTexture(this.a.c("themeDefault"));
        fqv7.setWidth(5);
        fqv7.setX(235);
        fqv7.setY(20);
        fbc_12.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(5);
        fqv8.setPosition(frk_0.o);
        fqv8.setTexture(this.a.c("themeDefault"));
        fqv8.setWidth(20);
        fqv8.setX(215);
        fqv8.setY(20);
        fbc_12.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(5);
        fqv9.setPosition(frk_0.m);
        fqv9.setTexture(this.a.c("themeDefault"));
        fqv9.setWidth(4);
        fqv9.setX(211);
        fqv9.setY(20);
        fbc_12.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(14);
        fqv10.setPosition(frk_0.h);
        fqv10.setTexture(this.a.c("themeDefault"));
        fqv10.setWidth(4);
        fqv10.setX(211);
        fqv10.setY(6);
        fbc_12.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fbc_12.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

