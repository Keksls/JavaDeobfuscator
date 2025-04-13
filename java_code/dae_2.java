/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from dAE
 */
public class dae_2
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
        fqj2.setModulationColor(new azf_2(1.0f, 1.0f, 1.0f, 0.5f));
        fvE2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        fby_22.setScaled(true);
        fqj2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(14);
        fqv2.setPosition(frk_0.a);
        fqv2.setRotation(avg_1.b);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(20);
        fqv2.setX(885);
        fqv2.setY(431);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(1);
        fqv3.setPosition(frk_0.c);
        fqv3.setRotation(avg_1.b);
        fqv3.setTexture(this.a.c("themeSimple"));
        fqv3.setWidth(20);
        fqv3.setX(885);
        fqv3.setY(430);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(15);
        fqv4.setPosition(frk_0.e);
        fqv4.setRotation(avg_1.b);
        fqv4.setTexture(this.a.c("themeSimple"));
        fqv4.setWidth(20);
        fqv4.setX(885);
        fqv4.setY(414);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(14);
        fqv5.setPosition(frk_0.h);
        fqv5.setRotation(avg_1.b);
        fqv5.setTexture(this.a.c("themeSimple"));
        fqv5.setWidth(1);
        fqv5.setX(909);
        fqv5.setY(431);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(1);
        fqv6.setPosition(frk_0.i);
        fqv6.setRotation(avg_1.b);
        fqv6.setTexture(this.a.c("themeSimple"));
        fqv6.setWidth(1);
        fqv6.setX(909);
        fqv6.setY(430);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(15);
        fqv7.setPosition(frk_0.j);
        fqv7.setRotation(avg_1.b);
        fqv7.setTexture(this.a.c("themeSimple"));
        fqv7.setWidth(1);
        fqv7.setX(909);
        fqv7.setY(414);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setFlipVerticaly(true);
        fqv8.setHeight(14);
        fqv8.setPosition(frk_0.m);
        fqv8.setRotation(avg_1.d);
        fqv8.setTexture(this.a.c("themeSimple"));
        fqv8.setWidth(20);
        fqv8.setX(885);
        fqv8.setY(431);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setFlipVerticaly(true);
        fqv9.setHeight(1);
        fqv9.setPosition(frk_0.o);
        fqv9.setRotation(avg_1.d);
        fqv9.setTexture(this.a.c("themeSimple"));
        fqv9.setWidth(20);
        fqv9.setX(885);
        fqv9.setY(430);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setFlipVerticaly(true);
        fqv10.setHeight(15);
        fqv10.setPosition(frk_0.q);
        fqv10.setRotation(avg_1.d);
        fqv10.setTexture(this.a.c("themeSimple"));
        fqv10.setWidth(20);
        fqv10.setX(885);
        fqv10.setY(414);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(14, 7, 14, 1));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

