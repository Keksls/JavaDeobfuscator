/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class dVP
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqx fqx2 = (fqx)fvE3.getAppearance();
        fqx2.setElementMap(fyy_03);
        fvE2.addBasicElement(fqx2);
        fqx2.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(9);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("txXpBar"));
        fqv2.setWidth(1);
        fqv2.setX(0);
        fqv2.setY(22);
        fqx2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(2);
        fqv3.setPosition(frk_0.h);
        fqv3.setTexture(this.a.c("txXpBar"));
        fqv3.setWidth(1);
        fqv3.setX(0);
        fqv3.setY(31);
        fqx2.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(9);
        fqv4.setPosition(frk_0.m);
        fqv4.setTexture(this.a.c("txXpBar"));
        fqv4.setWidth(1);
        fqv4.setX(0);
        fqv4.setY(33);
        fqx2.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(9);
        fqv5.setPosition(frk_0.c);
        fqv5.setTexture(this.a.c("txXpBar"));
        fqv5.setWidth(1);
        fqv5.setX(10);
        fqv5.setY(22);
        fqx2.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(2);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("txXpBar"));
        fqv6.setWidth(1);
        fqv6.setX(10);
        fqv6.setY(31);
        fqx2.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(9);
        fqv7.setPosition(frk_0.o);
        fqv7.setTexture(this.a.c("txXpBar"));
        fqv7.setWidth(1);
        fqv7.setX(10);
        fqv7.setY(33);
        fqx2.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(9);
        fqv8.setPosition(frk_0.e);
        fqv8.setTexture(this.a.c("txXpBar"));
        fqv8.setWidth(2);
        fqv8.setX(18);
        fqv8.setY(22);
        fqx2.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(2);
        fqv9.setPosition(frk_0.j);
        fqv9.setTexture(this.a.c("txXpBar"));
        fqv9.setWidth(2);
        fqv9.setX(18);
        fqv9.setY(31);
        fqx2.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(9);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("txXpBar"));
        fqv10.setWidth(2);
        fqv10.setX(18);
        fqv10.setY(33);
        fqx2.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fqx2.onChildrenAdded();
    }
}

