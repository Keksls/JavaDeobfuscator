/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dzQ
 */
public class dzq_2
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
        String string = "whiteBorderContainerBackground";
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
        fqv2.setHeight(27);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(22);
        fqv2.setX(888);
        fqv2.setY(464);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(27);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeSimple"));
        fqv3.setWidth(1);
        fqv3.setX(920);
        fqv3.setY(464);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setFlipHorizontaly(true);
        fqv4.setHeight(27);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeSimple"));
        fqv4.setWidth(22);
        fqv4.setX(888);
        fqv4.setY(464);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(1);
        fqv5.setPosition(frk_0.h);
        fqv5.setTexture(this.a.c("themeSimple"));
        fqv5.setWidth(22);
        fqv5.setX(888);
        fqv5.setY(503);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(0);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("themeSimple"));
        fqv6.setWidth(0);
        fqv6.setX(888);
        fqv6.setY(503);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setFlipHorizontaly(true);
        fqv7.setHeight(1);
        fqv7.setPosition(frk_0.j);
        fqv7.setTexture(this.a.c("themeSimple"));
        fqv7.setWidth(22);
        fqv7.setX(888);
        fqv7.setY(503);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setFlipVerticaly(true);
        fqv8.setHeight(27);
        fqv8.setPosition(frk_0.m);
        fqv8.setTexture(this.a.c("themeSimple"));
        fqv8.setWidth(22);
        fqv8.setX(888);
        fqv8.setY(464);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setFlipVerticaly(true);
        fqv9.setHeight(27);
        fqv9.setPosition(frk_0.o);
        fqv9.setTexture(this.a.c("themeSimple"));
        fqv9.setWidth(1);
        fqv9.setX(920);
        fqv9.setY(464);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(27);
        fqv10.setPosition(frk_0.q);
        fqv10.setRotation(avg_1.c);
        fqv10.setTexture(this.a.c("themeSimple"));
        fqv10.setWidth(22);
        fqv10.setX(888);
        fqv10.setY(464);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

