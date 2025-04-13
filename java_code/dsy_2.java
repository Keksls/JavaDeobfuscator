/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dsY
 */
public class dsy_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqj_0 fqj_02 = (fqj_0)fvE3.getAppearance();
        fqj_02.setElementMap(fyy_03);
        fqj_02.setState("default");
        fvE2.addBasicElement(fqj_02);
        fqj_02.onAttributesInitialized();
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        fby_22.setScaled(true);
        fqj_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        String string = "fightBarButtonDefaultPixmap";
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fqv2);
        }
        fqv2.setHeight(35);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(33);
        fqv2.setX(297);
        fqv2.setY(525);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqj_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqj_0 fqj_03 = (fqj_0)fvE4.getAppearance();
        fqj_03.setElementMap(fyy_03);
        fqj_03.setState("pressed");
        fvE2.addBasicElement(fqj_03);
        fqj_03.onAttributesInitialized();
        fby_2 fby_23 = fby_2.checkOut();
        fby_23.setElementMap(fyy_03);
        fby_23.setScaled(true);
        fqj_03.addBasicElement(fby_23);
        fby_23.onAttributesInitialized();
        String string2 = "fightBarButtonPressedPixmap";
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fqv3);
        }
        fqv3.setHeight(35);
        fqv3.setPosition(frk_0.i);
        fqv3.setTexture(this.a.c("themePressed"));
        fqv3.setWidth(33);
        fqv3.setX(297);
        fqv3.setY(525);
        fby_23.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fby_23.onChildrenAdded();
        fqj_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqj_0 fqj_04 = (fqj_0)fvE5.getAppearance();
        fqj_04.setElementMap(fyy_03);
        fqj_04.setState("mouseHover");
        fvE2.addBasicElement(fqj_04);
        fqj_04.onAttributesInitialized();
        fby_2 fby_24 = fby_2.checkOut();
        fby_24.setElementMap(fyy_03);
        fby_24.setScaled(true);
        fqj_04.addBasicElement(fby_24);
        fby_24.onAttributesInitialized();
        String string3 = "fightBarButtonOverPixmap";
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fqv4);
        }
        fqv4.setHeight(35);
        fqv4.setPosition(frk_0.i);
        fqv4.setTexture(this.a.c("themeOver"));
        fqv4.setWidth(33);
        fqv4.setX(297);
        fqv4.setY(525);
        fby_24.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fby_24.onChildrenAdded();
        fqj_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqj_0 fqj_05 = (fqj_0)fvE6.getAppearance();
        fqj_05.setElementMap(fyy_03);
        fqj_05.setState("disabled");
        fvE2.addBasicElement(fqj_05);
        fqj_05.onAttributesInitialized();
        fby_2 fby_25 = fby_2.checkOut();
        fby_25.setElementMap(fyy_03);
        fby_25.setScaled(true);
        fqj_05.addBasicElement(fby_25);
        fby_25.onAttributesInitialized();
        String string4 = "fightBarButtonDisabledPixmap";
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fqv5);
        }
        fqv5.setHeight(35);
        fqv5.setPosition(frk_0.i);
        fqv5.setTexture(this.a.c("themeDisabled"));
        fqv5.setWidth(33);
        fqv5.setX(297);
        fqv5.setY(525);
        fby_25.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fby_25.onChildrenAdded();
        fqj_05.onChildrenAdded();
        fvE fvE7 = fvE2;
        fqj_0 fqj_06 = (fqj_0)fvE7.getAppearance();
        fqj_06.setElementMap(fyy_03);
        fqj_06.setState("selected");
        fvE2.addBasicElement(fqj_06);
        fqj_06.onAttributesInitialized();
        fby_2 fby_26 = fby_2.checkOut();
        fby_26.setElementMap(fyy_03);
        fby_26.setScaled(true);
        fqj_06.addBasicElement(fby_26);
        fby_26.onAttributesInitialized();
        String string5 = "fightBarButtonSelectedPixmap";
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fqv6);
        }
        fqv6.setHeight(35);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("themeDefaultSelected"));
        fqv6.setWidth(33);
        fqv6.setX(297);
        fqv6.setY(525);
        fby_26.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fby_26.onChildrenAdded();
        fqj_06.onChildrenAdded();
        fvE fvE8 = fvE2;
        fqj_0 fqj_07 = (fqj_0)fvE8.getAppearance();
        fqj_07.setElementMap(fyy_03);
        fqj_07.setState("pressedSelected");
        fvE2.addBasicElement(fqj_07);
        fqj_07.onAttributesInitialized();
        fby_2 fby_27 = fby_2.checkOut();
        fby_27.setElementMap(fyy_03);
        fby_27.setScaled(true);
        fqj_07.addBasicElement(fby_27);
        fby_27.onAttributesInitialized();
        String string6 = "fightBarButtonSelectedPressedPixmap";
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, fqv7);
        }
        fqv7.setHeight(35);
        fqv7.setPosition(frk_0.i);
        fqv7.setTexture(this.a.c("themePressedSelected"));
        fqv7.setWidth(33);
        fqv7.setX(297);
        fqv7.setY(525);
        fby_27.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fby_27.onChildrenAdded();
        fqj_07.onChildrenAdded();
        fvE fvE9 = fvE2;
        fqj_0 fqj_08 = (fqj_0)fvE9.getAppearance();
        fqj_08.setElementMap(fyy_03);
        fqj_08.setState("mouseHoverSelected");
        fvE2.addBasicElement(fqj_08);
        fqj_08.onAttributesInitialized();
        fby_2 fby_28 = fby_2.checkOut();
        fby_28.setElementMap(fyy_03);
        fby_28.setScaled(true);
        fqj_08.addBasicElement(fby_28);
        fby_28.onAttributesInitialized();
        String string7 = "fightBarButtonSelectedOverPixmap";
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        if (fyy_03 != null && string7 != null) {
            fyy_03.a(string7, fqv8);
        }
        fqv8.setHeight(35);
        fqv8.setPosition(frk_0.i);
        fqv8.setTexture(this.a.c("themeOverSelected"));
        fqv8.setWidth(33);
        fqv8.setX(297);
        fqv8.setY(525);
        fby_28.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fby_28.onChildrenAdded();
        fqj_08.onChildrenAdded();
        fvE fvE10 = fvE2;
        fqj_0 fqj_09 = (fqj_0)fvE10.getAppearance();
        fqj_09.setElementMap(fyy_03);
        fqj_09.setState("disabledSelected");
        fvE2.addBasicElement(fqj_09);
        fqj_09.onAttributesInitialized();
        fby_2 fby_29 = fby_2.checkOut();
        fby_29.setElementMap(fyy_03);
        fby_29.setScaled(true);
        fqj_09.addBasicElement(fby_29);
        fby_29.onAttributesInitialized();
        String string8 = "fightBarButtonSelectedDisabledPixmap";
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        if (fyy_03 != null && string8 != null) {
            fyy_03.a(string8, fqv9);
        }
        fqv9.setHeight(35);
        fqv9.setPosition(frk_0.i);
        fqv9.setTexture(this.a.c("themeDisabledSelected"));
        fqv9.setWidth(33);
        fqv9.setX(297);
        fqv9.setY(525);
        fby_29.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fby_29.onChildrenAdded();
        fqj_09.onChildrenAdded();
    }
}

