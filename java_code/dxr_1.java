/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from dxr
 */
public class dxr_1
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
        fqk_0 fqk_02 = new fqk_0();
        fqk_02.onCheckOut();
        fqk_02.setElementMap(fyy_03);
        fqk_02.setInsets(new Insets(12, 12, 25, 12));
        fqj2.addBasicElement(fqk_02);
        fqk_02.onAttributesInitialized();
        fqk_02.onChildrenAdded();
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        fby_22.setScaled(true);
        fqj2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setFlipHorizontaly(true);
        fqv2.setHeight(23);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(82);
        fqv2.setX(101);
        fqv2.setY(672);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(23);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeSimple"));
        fqv3.setWidth(1);
        fqv3.setX(100);
        fqv3.setY(672);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(23);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeSimple"));
        fqv4.setWidth(82);
        fqv4.setX(101);
        fqv4.setY(672);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setFlipHorizontaly(true);
        fqv5.setHeight(1);
        fqv5.setPosition(frk_0.h);
        fqv5.setTexture(this.a.c("themeSimple"));
        fqv5.setWidth(82);
        fqv5.setX(101);
        fqv5.setY(742);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(1);
        fqv6.setPosition(frk_0.j);
        fqv6.setTexture(this.a.c("themeSimple"));
        fqv6.setWidth(82);
        fqv6.setX(101);
        fqv6.setY(742);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setFlipHorizontaly(true);
        fqv7.setHeight(32);
        fqv7.setPosition(frk_0.m);
        fqv7.setTexture(this.a.c("themeSimple"));
        fqv7.setWidth(82);
        fqv7.setX(101);
        fqv7.setY(745);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(32);
        fqv8.setPosition(frk_0.o);
        fqv8.setTexture(this.a.c("themeSimple"));
        fqv8.setWidth(1);
        fqv8.setX(100);
        fqv8.setY(745);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(32);
        fqv9.setPosition(frk_0.q);
        fqv9.setTexture(this.a.c("themeSimple"));
        fqv9.setWidth(82);
        fqv9.setX(101);
        fqv9.setY(745);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(1);
        fqv10.setPosition(frk_0.i);
        fqv10.setTexture(this.a.c("themeSimple"));
        fqv10.setWidth(1);
        fqv10.setX(87);
        fqv10.setY(717);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

