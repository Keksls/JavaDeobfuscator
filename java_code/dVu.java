/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class dVu
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
        fbc_1 fbc_12 = new fbc_1();
        fbc_12.onCheckOut();
        fbc_12.setElementMap(fyy_03);
        fqj2.addBasicElement(fbc_12);
        fbc_12.onAttributesInitialized();
        String string = "progressBarBackgroundNorthWest";
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fqv2);
        }
        fqv2.setHeight(13);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(13);
        fqv2.setX(779);
        fqv2.setY(29);
        fbc_12.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        String string2 = "progressBarBackgroundNorth";
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fqv3);
        }
        fqv3.setHeight(13);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeSimple"));
        fqv3.setWidth(1);
        fqv3.setX(799);
        fqv3.setY(29);
        fbc_12.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        String string3 = "progressBarBackgroundNorthEast";
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fqv4);
        }
        fqv4.setFlipHorizontaly(true);
        fqv4.setHeight(13);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeSimple"));
        fqv4.setWidth(13);
        fqv4.setX(779);
        fqv4.setY(29);
        fbc_12.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        String string4 = "progressBarBackgroundWest";
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fqv5);
        }
        fqv5.setHeight(1);
        fqv5.setPosition(frk_0.h);
        fqv5.setTexture(this.a.c("themeSimple"));
        fqv5.setWidth(13);
        fqv5.setX(779);
        fqv5.setY(50);
        fbc_12.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        String string5 = "progressBarBackgroundEast";
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fqv6);
        }
        fqv6.setFlipHorizontaly(true);
        fqv6.setHeight(1);
        fqv6.setPosition(frk_0.j);
        fqv6.setTexture(this.a.c("themeSimple"));
        fqv6.setWidth(13);
        fqv6.setX(779);
        fqv6.setY(50);
        fbc_12.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        String string6 = "progressBarBackgroundSouthWest";
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, fqv7);
        }
        fqv7.setFlipVerticaly(true);
        fqv7.setHeight(13);
        fqv7.setPosition(frk_0.m);
        fqv7.setTexture(this.a.c("themeSimple"));
        fqv7.setWidth(13);
        fqv7.setX(779);
        fqv7.setY(29);
        fbc_12.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        String string7 = "progressBarBackgroundSouth";
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        if (fyy_03 != null && string7 != null) {
            fyy_03.a(string7, fqv8);
        }
        fqv8.setFlipVerticaly(true);
        fqv8.setHeight(13);
        fqv8.setPosition(frk_0.o);
        fqv8.setTexture(this.a.c("themeSimple"));
        fqv8.setWidth(1);
        fqv8.setX(799);
        fqv8.setY(29);
        fbc_12.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        String string8 = "progressBarBackgroundSouthEast";
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        if (fyy_03 != null && string8 != null) {
            fyy_03.a(string8, fqv9);
        }
        fqv9.setFlipHorizontaly(true);
        fqv9.setFlipVerticaly(true);
        fqv9.setHeight(13);
        fqv9.setPosition(frk_0.q);
        fqv9.setTexture(this.a.c("themeSimple"));
        fqv9.setWidth(13);
        fqv9.setX(779);
        fqv9.setY(29);
        fbc_12.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fbc_12.onChildrenAdded();
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        fby_22.setScaled(true);
        fqj2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        String string9 = "progressBarBackgroundCenter";
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        if (fyy_03 != null && string9 != null) {
            fyy_03.a(string9, fqv10);
        }
        fqv10.setHeight(1);
        fqv10.setPosition(frk_0.i);
        fqv10.setTexture(this.a.c("themeSimple"));
        fqv10.setWidth(1);
        fqv10.setX(799);
        fqv10.setY(50);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

