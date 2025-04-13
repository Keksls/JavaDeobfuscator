/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dyg
 */
public class dyg_0
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
        String string = "greenBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqj2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        String string2 = "greenBackgroundNorthWest";
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fqv2);
        }
        fqv2.setHeight(10);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(10);
        fqv2.setX(167);
        fqv2.setY(1163);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        String string3 = "greenBackgroundNorth";
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fqv3);
        }
        fqv3.setHeight(10);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeSimple"));
        fqv3.setWidth(1);
        fqv3.setX(180);
        fqv3.setY(1163);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        String string4 = "greenBackgroundNorthEast";
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fqv4);
        }
        fqv4.setFlipHorizontaly(true);
        fqv4.setHeight(10);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeSimple"));
        fqv4.setWidth(10);
        fqv4.setX(167);
        fqv4.setY(1163);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        String string5 = "greenBackgroundWest";
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fqv5);
        }
        fqv5.setHeight(1);
        fqv5.setPosition(frk_0.h);
        fqv5.setTexture(this.a.c("themeSimple"));
        fqv5.setWidth(10);
        fqv5.setX(167);
        fqv5.setY(1176);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        String string6 = "greenBackgroundCenter";
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, fqv6);
        }
        fqv6.setHeight(1);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("themeSimple"));
        fqv6.setWidth(1);
        fqv6.setX(180);
        fqv6.setY(1171);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        String string7 = "greenBackgroundEast";
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        if (fyy_03 != null && string7 != null) {
            fyy_03.a(string7, fqv7);
        }
        fqv7.setFlipHorizontaly(true);
        fqv7.setHeight(1);
        fqv7.setPosition(frk_0.j);
        fqv7.setTexture(this.a.c("themeSimple"));
        fqv7.setWidth(10);
        fqv7.setX(167);
        fqv7.setY(1176);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        String string8 = "greenBackgroundSouthWest";
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        if (fyy_03 != null && string8 != null) {
            fyy_03.a(string8, fqv8);
        }
        fqv8.setFlipVerticaly(true);
        fqv8.setHeight(10);
        fqv8.setPosition(frk_0.m);
        fqv8.setTexture(this.a.c("themeSimple"));
        fqv8.setWidth(10);
        fqv8.setX(167);
        fqv8.setY(1163);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        String string9 = "greenBackgroundSouth";
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        if (fyy_03 != null && string9 != null) {
            fyy_03.a(string9, fqv9);
        }
        fqv9.setFlipVerticaly(true);
        fqv9.setHeight(10);
        fqv9.setPosition(frk_0.o);
        fqv9.setTexture(this.a.c("themeSimple"));
        fqv9.setWidth(1);
        fqv9.setX(180);
        fqv9.setY(1163);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        String string10 = "greenBackgroundSouthEast";
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        if (fyy_03 != null && string10 != null) {
            fyy_03.a(string10, fqv10);
        }
        fqv10.setFlipHorizontaly(true);
        fqv10.setFlipVerticaly(true);
        fqv10.setHeight(10);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("themeSimple"));
        fqv10.setWidth(10);
        fqv10.setX(167);
        fqv10.setY(1163);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

