/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from emb
 */
public class emb_2
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
        String string = "windowBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqj2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        String string2 = "windowBackgroundNorthWest";
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fqv2);
        }
        fqv2.setHeight(19);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeSimple2"));
        fqv2.setWidth(20);
        fqv2.setX(998);
        fqv2.setY(10);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        String string3 = "windowBackgroundNorth";
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fqv3);
        }
        fqv3.setHeight(19);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeSimple2"));
        fqv3.setWidth(1);
        fqv3.setX(1022);
        fqv3.setY(10);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        String string4 = "windowBackgroundNorthEast";
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fqv4);
        }
        fqv4.setFlipHorizontaly(true);
        fqv4.setHeight(19);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeSimple2"));
        fqv4.setWidth(20);
        fqv4.setX(998);
        fqv4.setY(10);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        String string5 = "windowBackgroundWest";
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fqv5);
        }
        fqv5.setHeight(1);
        fqv5.setPosition(frk_0.h);
        fqv5.setTexture(this.a.c("themeSimple2"));
        fqv5.setWidth(20);
        fqv5.setX(998);
        fqv5.setY(33);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        String string6 = "windowBackgroundCenter";
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, fqv6);
        }
        fqv6.setHeight(1);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("themeSimple2"));
        fqv6.setWidth(1);
        fqv6.setX(1022);
        fqv6.setY(33);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        String string7 = "windowBackgroundEast";
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        if (fyy_03 != null && string7 != null) {
            fyy_03.a(string7, fqv7);
        }
        fqv7.setFlipHorizontaly(true);
        fqv7.setHeight(1);
        fqv7.setPosition(frk_0.j);
        fqv7.setTexture(this.a.c("themeSimple2"));
        fqv7.setWidth(20);
        fqv7.setX(998);
        fqv7.setY(33);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        String string8 = "windowBackgroundSouthWest";
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        if (fyy_03 != null && string8 != null) {
            fyy_03.a(string8, fqv8);
        }
        fqv8.setFlipVerticaly(true);
        fqv8.setHeight(19);
        fqv8.setPosition(frk_0.m);
        fqv8.setTexture(this.a.c("themeSimple2"));
        fqv8.setWidth(20);
        fqv8.setX(998);
        fqv8.setY(10);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        String string9 = "windowBackgroundSouth";
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        if (fyy_03 != null && string9 != null) {
            fyy_03.a(string9, fqv9);
        }
        fqv9.setFlipVerticaly(true);
        fqv9.setHeight(19);
        fqv9.setPosition(frk_0.o);
        fqv9.setTexture(this.a.c("themeSimple2"));
        fqv9.setWidth(1);
        fqv9.setX(1022);
        fqv9.setY(10);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        String string10 = "windowBackgroundSouthEast";
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        if (fyy_03 != null && string10 != null) {
            fyy_03.a(string10, fqv10);
        }
        fqv10.setFlipHorizontaly(true);
        fqv10.setFlipVerticaly(true);
        fqv10.setHeight(19);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("themeSimple2"));
        fqv10.setWidth(20);
        fqv10.setX(998);
        fqv10.setY(10);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

