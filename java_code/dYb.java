/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class dYb
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
        String string = "pmbDefaultSpellSlider";
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
        fqv2.setHeight(8);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("txSliderBackground"));
        fqv2.setWidth(4);
        fqv2.setX(0);
        fqv2.setY(0);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(8);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("txSliderBackground"));
        fqv3.setWidth(1);
        fqv3.setX(8);
        fqv3.setY(0);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(8);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("txSliderBackground"));
        fqv4.setWidth(4);
        fqv4.setX(12);
        fqv4.setY(0);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(0);
        fqv5.setPosition(frk_0.h);
        fqv5.setTexture(this.a.c("txSliderBackground"));
        fqv5.setWidth(0);
        fqv5.setX(0);
        fqv5.setY(9);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(0);
        fqv6.setPosition(frk_0.m);
        fqv6.setTexture(this.a.c("txSliderBackground"));
        fqv6.setWidth(0);
        fqv6.setX(0);
        fqv6.setY(9);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(0);
        fqv7.setPosition(frk_0.i);
        fqv7.setTexture(this.a.c("txSliderBackground"));
        fqv7.setWidth(0);
        fqv7.setX(0);
        fqv7.setY(9);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(0);
        fqv8.setPosition(frk_0.o);
        fqv8.setTexture(this.a.c("txSliderBackground"));
        fqv8.setWidth(0);
        fqv8.setX(0);
        fqv8.setY(9);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(0);
        fqv9.setPosition(frk_0.j);
        fqv9.setTexture(this.a.c("txSliderBackground"));
        fqv9.setWidth(0);
        fqv9.setX(0);
        fqv9.setY(9);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(0);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("txSliderBackground"));
        fqv10.setWidth(0);
        fqv10.setX(0);
        fqv10.setY(9);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fvE fvE4 = fqj2.getParentOfType(fvE.class);
        fvE fvE5 = fvE4.getWidgetByThemeElementName("horizontalButton", false);
        if (fvE5 != null) {
            fvE fvE6 = fvE5;
            fqd_0 fqd_02 = (fqd_0)fvE6.getAppearance();
            fqd_02.setElementMap(fyy_03);
            fqd_02.setState("default");
            fvE5.addBasicElement(fqd_02);
            fqd_02.onAttributesInitialized();
            String string2 = "pmSliderButtonDefault";
            fqv fqv11 = fqv.checkOut();
            fqv11.setElementMap(fyy_03);
            if (fyy_03 != null && string2 != null) {
                fyy_03.a(string2, fqv11);
            }
            fqv11.setHeight(22);
            fqv11.setPosition(frk_0.i);
            fqv11.setTexture(this.a.c("txSliderButton"));
            fqv11.setWidth(22);
            fqv11.setX(0);
            fqv11.setY(0);
            fqd_02.addBasicElement(fqv11);
            fqv11.onAttributesInitialized();
            fqv11.onChildrenAdded();
            fqd_02.onChildrenAdded();
            fvE fvE7 = fvE5;
            fqd_0 fqd_03 = (fqd_0)fvE7.getAppearance();
            fqd_03.setElementMap(fyy_03);
            fqd_03.setState("mouseHover");
            fvE5.addBasicElement(fqd_03);
            fqd_03.onAttributesInitialized();
            String string3 = "pmSliderButtonHover";
            fqv fqv12 = fqv.checkOut();
            fqv12.setElementMap(fyy_03);
            if (fyy_03 != null && string3 != null) {
                fyy_03.a(string3, fqv12);
            }
            fqv12.setHeight(22);
            fqv12.setPosition(frk_0.i);
            fqv12.setTexture(this.a.c("txSliderButton"));
            fqv12.setWidth(22);
            fqv12.setX(0);
            fqv12.setY(24);
            fqd_03.addBasicElement(fqv12);
            fqv12.onAttributesInitialized();
            fqv12.onChildrenAdded();
            fqd_03.onChildrenAdded();
            fvE fvE8 = fvE5;
            fqd_0 fqd_04 = (fqd_0)fvE8.getAppearance();
            fqd_04.setElementMap(fyy_03);
            fqd_04.setState("pressed");
            fvE5.addBasicElement(fqd_04);
            fqd_04.onAttributesInitialized();
            String string4 = "pmSliderButtonPressed";
            fqv fqv13 = fqv.checkOut();
            fqv13.setElementMap(fyy_03);
            if (fyy_03 != null && string4 != null) {
                fyy_03.a(string4, fqv13);
            }
            fqv13.setHeight(22);
            fqv13.setPosition(frk_0.i);
            fqv13.setTexture(this.a.c("txSliderButton"));
            fqv13.setWidth(22);
            fqv13.setX(0);
            fqv13.setY(48);
            fqd_04.addBasicElement(fqv13);
            fqv13.onAttributesInitialized();
            fqv13.onChildrenAdded();
            fqd_04.onChildrenAdded();
            fvE fvE9 = fvE5;
            fqd_0 fqd_05 = (fqd_0)fvE9.getAppearance();
            fqd_05.setElementMap(fyy_03);
            fqd_05.setState("disabled");
            fvE5.addBasicElement(fqd_05);
            fqd_05.onAttributesInitialized();
            String string5 = "pmSliderButtonDisabled";
            fqv fqv14 = fqv.checkOut();
            fqv14.setElementMap(fyy_03);
            if (fyy_03 != null && string5 != null) {
                fyy_03.a(string5, fqv14);
            }
            fqv14.setHeight(22);
            fqv14.setPosition(frk_0.i);
            fqv14.setTexture(this.a.c("txSliderButton"));
            fqv14.setWidth(22);
            fqv14.setX(0);
            fqv14.setY(72);
            fqd_05.addBasicElement(fqv14);
            fqv14.onAttributesInitialized();
            fqv14.onChildrenAdded();
            fqd_05.onChildrenAdded();
        }
        fqj2.onChildrenAdded();
    }
}

