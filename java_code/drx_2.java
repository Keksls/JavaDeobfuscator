/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from drx
 */
public class drx_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqd_0 fqd_02 = (fqd_0)fvE3.getAppearance();
        fqd_02.setElementMap(fyy_03);
        fqd_02.setState("default");
        fvE2.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        String string = "pmSmallLeftSideArrow1Default";
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fqv2);
        }
        fqv2.setHeight(12);
        fqv2.setPosition(frk_0.i);
        fqv2.setRotation(avg_1.d);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(25);
        fqv2.setX(124);
        fqv2.setY(37);
        fqd_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqd_0 fqd_03 = (fqd_0)fvE4.getAppearance();
        fqd_03.setElementMap(fyy_03);
        fqd_03.setState("mouseHover");
        fvE2.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        String string2 = "pmSmallLeftSideArrow1Over";
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fqv3);
        }
        fqv3.setHeight(12);
        fqv3.setPosition(frk_0.i);
        fqv3.setRotation(avg_1.d);
        fqv3.setTexture(this.a.c("themeOver"));
        fqv3.setWidth(25);
        fqv3.setX(124);
        fqv3.setY(37);
        fqd_03.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqd_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqd_0 fqd_04 = (fqd_0)fvE5.getAppearance();
        fqd_04.setElementMap(fyy_03);
        fqd_04.setState("pressed");
        fvE2.addBasicElement(fqd_04);
        fqd_04.onAttributesInitialized();
        String string3 = "pmSmallLeftSideArrow1Pressed";
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fqv4);
        }
        fqv4.setHeight(12);
        fqv4.setPosition(frk_0.i);
        fqv4.setRotation(avg_1.d);
        fqv4.setTexture(this.a.c("themePressed"));
        fqv4.setWidth(25);
        fqv4.setX(124);
        fqv4.setY(37);
        fqd_04.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqd_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqd_0 fqd_05 = (fqd_0)fvE6.getAppearance();
        fqd_05.setElementMap(fyy_03);
        fqd_05.setState("disabled");
        fvE2.addBasicElement(fqd_05);
        fqd_05.onAttributesInitialized();
        String string4 = "pmSmallLeftSideArrow1Disabled";
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fqv5);
        }
        fqv5.setHeight(12);
        fqv5.setPosition(frk_0.i);
        fqv5.setRotation(avg_1.d);
        fqv5.setTexture(this.a.c("themeDisabled"));
        fqv5.setWidth(25);
        fqv5.setX(124);
        fqv5.setY(37);
        fqd_05.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqd_05.onChildrenAdded();
        fvE fvE7 = fvE2;
        fqd_0 fqd_06 = (fqd_0)fvE7.getAppearance();
        fqd_06.setElementMap(fyy_03);
        fqd_06.setState("selected");
        fvE2.addBasicElement(fqd_06);
        fqd_06.onAttributesInitialized();
        String string5 = "pmSmallLeftSideArrow1DefaultSelected";
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fqv6);
        }
        fqv6.setHeight(12);
        fqv6.setPosition(frk_0.i);
        fqv6.setRotation(avg_1.d);
        fqv6.setTexture(this.a.c("themeDefaultSelected"));
        fqv6.setWidth(25);
        fqv6.setX(124);
        fqv6.setY(37);
        fqd_06.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqd_06.onChildrenAdded();
        fvE fvE8 = fvE2;
        fqd_0 fqd_07 = (fqd_0)fvE8.getAppearance();
        fqd_07.setElementMap(fyy_03);
        fqd_07.setState("mouseHoverSelected");
        fvE2.addBasicElement(fqd_07);
        fqd_07.onAttributesInitialized();
        String string6 = "pmSmallLeftSideArrow1OverSelected";
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, fqv7);
        }
        fqv7.setHeight(12);
        fqv7.setPosition(frk_0.i);
        fqv7.setRotation(avg_1.d);
        fqv7.setTexture(this.a.c("themeOverSelected"));
        fqv7.setWidth(25);
        fqv7.setX(124);
        fqv7.setY(37);
        fqd_07.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqd_07.onChildrenAdded();
        fvE fvE9 = fvE2;
        fqd_0 fqd_08 = (fqd_0)fvE9.getAppearance();
        fqd_08.setElementMap(fyy_03);
        fqd_08.setState("pressedSelected");
        fvE2.addBasicElement(fqd_08);
        fqd_08.onAttributesInitialized();
        String string7 = "pmSmallLeftSideArrow1PressedSelected";
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        if (fyy_03 != null && string7 != null) {
            fyy_03.a(string7, fqv8);
        }
        fqv8.setHeight(12);
        fqv8.setPosition(frk_0.i);
        fqv8.setRotation(avg_1.d);
        fqv8.setTexture(this.a.c("themePressedSelected"));
        fqv8.setWidth(25);
        fqv8.setX(124);
        fqv8.setY(37);
        fqd_08.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqd_08.onChildrenAdded();
        fvE fvE10 = fvE2;
        fqd_0 fqd_09 = (fqd_0)fvE10.getAppearance();
        fqd_09.setElementMap(fyy_03);
        fqd_09.setState("disabledSelected");
        fvE2.addBasicElement(fqd_09);
        fqd_09.onAttributesInitialized();
        String string8 = "pmSmallLeftSideArrow1DisabledSelected";
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        if (fyy_03 != null && string8 != null) {
            fyy_03.a(string8, fqv9);
        }
        fqv9.setHeight(12);
        fqv9.setPosition(frk_0.i);
        fqv9.setRotation(avg_1.d);
        fqv9.setTexture(this.a.c("themeDisabledSelected"));
        fqv9.setWidth(25);
        fqv9.setX(124);
        fqv9.setY(37);
        fqd_09.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqd_09.onChildrenAdded();
    }
}

