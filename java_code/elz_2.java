/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from elz
 */
public class elz_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fvE fvE4 = fvE2;
        fqj fqj2 = fvE4.getAppearance();
        fqj2.setElementMap(fyy_03);
        fqj2.setModulationColor(new azf_2(1.0f, 1.0f, 1.0f, 1.0f));
        fvE2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        String string = "buttonFlatBackgroundDefault";
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
        fqv2.setHeight(7);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(1);
        fqv2.setX(298);
        fqv2.setY(3);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fby_22.onChildrenAdded();
        String string2 = "buttonFlatBorderDefault";
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
        fqv3.setHeight(3);
        fqv3.setPosition(frk_0.a);
        fqv3.setTexture(this.a.c("themeDefault"));
        fqv3.setWidth(3);
        fqv3.setX(291);
        fqv3.setY(0);
        fbc_12.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(3);
        fqv4.setPosition(frk_0.c);
        fqv4.setTexture(this.a.c("themeDefault"));
        fqv4.setWidth(1);
        fqv4.setX(298);
        fqv4.setY(0);
        fbc_12.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(3);
        fqv5.setPosition(frk_0.e);
        fqv5.setTexture(this.a.c("themeDefault"));
        fqv5.setWidth(3);
        fqv5.setX(303);
        fqv5.setY(0);
        fbc_12.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(7);
        fqv6.setPosition(frk_0.h);
        fqv6.setTexture(this.a.c("themeDefault"));
        fqv6.setWidth(3);
        fqv6.setX(291);
        fqv6.setY(3);
        fbc_12.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(7);
        fqv7.setPosition(frk_0.j);
        fqv7.setTexture(this.a.c("themeDefault"));
        fqv7.setWidth(3);
        fqv7.setX(303);
        fqv7.setY(3);
        fbc_12.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(3);
        fqv8.setPosition(frk_0.m);
        fqv8.setTexture(this.a.c("themeDefault"));
        fqv8.setWidth(3);
        fqv8.setX(291);
        fqv8.setY(11);
        fbc_12.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(3);
        fqv9.setPosition(frk_0.o);
        fqv9.setTexture(this.a.c("themeDefault"));
        fqv9.setWidth(1);
        fqv9.setX(298);
        fqv9.setY(11);
        fbc_12.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(3);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("themeDefault"));
        fqv10.setWidth(3);
        fqv10.setX(303);
        fqv10.setY(11);
        fbc_12.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fbc_12.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

