/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dAM
 */
public class dam_2
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
        String string = "verticalProgressBigContainerBorder";
        fbc_1 fbc_12 = new fbc_1();
        fbc_12.onCheckOut();
        fbc_12.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fbc_12);
        }
        fqj2.addBasicElement(fbc_12);
        fbc_12.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(16);
        fqv2.setPosition(frk_0.e);
        fqv2.setRotation(avg_1.b);
        fqv2.setTexture(this.a.c("themeSimple2"));
        fqv2.setWidth(4);
        fqv2.setX(361);
        fqv2.setY(341);
        fbc_12.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(16);
        fqv3.setPosition(frk_0.j);
        fqv3.setRotation(avg_1.b);
        fqv3.setTexture(this.a.c("themeSimple2"));
        fqv3.setWidth(1);
        fqv3.setX(370);
        fqv3.setY(341);
        fbc_12.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setFlipHorizontaly(true);
        fqv4.setHeight(16);
        fqv4.setPosition(frk_0.q);
        fqv4.setRotation(avg_1.b);
        fqv4.setTexture(this.a.c("themeSimple2"));
        fqv4.setWidth(4);
        fqv4.setX(361);
        fqv4.setY(341);
        fbc_12.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setFlipHorizontaly(true);
        fqv5.setHeight(1);
        fqv5.setPosition(frk_0.o);
        fqv5.setRotation(avg_1.b);
        fqv5.setTexture(this.a.c("themeSimple2"));
        fqv5.setWidth(4);
        fqv5.setX(361);
        fqv5.setY(357);
        fbc_12.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setFlipHorizontaly(true);
        fqv6.setHeight(9);
        fqv6.setPosition(frk_0.m);
        fqv6.setRotation(avg_1.b);
        fqv6.setTexture(this.a.c("themeSimple2"));
        fqv6.setWidth(5);
        fqv6.setX(361);
        fqv6.setY(358);
        fbc_12.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(9);
        fqv7.setPosition(frk_0.h);
        fqv7.setRotation(avg_1.b);
        fqv7.setTexture(this.a.c("themeSimple2"));
        fqv7.setWidth(1);
        fqv7.setX(370);
        fqv7.setY(358);
        fbc_12.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(9);
        fqv8.setPosition(frk_0.a);
        fqv8.setRotation(avg_1.b);
        fqv8.setTexture(this.a.c("themeSimple2"));
        fqv8.setWidth(5);
        fqv8.setX(361);
        fqv8.setY(358);
        fbc_12.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(1);
        fqv9.setPosition(frk_0.c);
        fqv9.setRotation(avg_1.b);
        fqv9.setTexture(this.a.c("themeSimple2"));
        fqv9.setWidth(4);
        fqv9.setX(361);
        fqv9.setY(357);
        fbc_12.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fbc_12.onChildrenAdded();
        String string2 = "verticalProgressBigContainerBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fby_22);
        }
        fby_22.setScaled(true);
        fqj2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(1);
        fqv10.setPosition(frk_0.i);
        fqv10.setTexture(this.a.c("themeSimple2"));
        fqv10.setWidth(1);
        fqv10.setX(370);
        fqv10.setY(357);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

