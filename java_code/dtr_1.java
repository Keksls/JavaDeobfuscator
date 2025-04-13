/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dtr
 */
public class dtr_1
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
        fqj_02.setAlignment(frs_0.e);
        fqj_02.setState("default");
        fvE2.addBasicElement(fqj_02);
        fqj_02.onAttributesInitialized();
        String string = "shortcutBarButtonDefaultPixmap";
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fqv2);
        }
        fqv2.setHeight(18);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(34);
        fqv2.setX(425);
        fqv2.setY(520);
        fqj_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqj_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqj_0 fqj_03 = (fqj_0)fvE4.getAppearance();
        fqj_03.setElementMap(fyy_03);
        fqj_03.setAlignment(frs_0.e);
        fqj_03.setState("mouseHover");
        fvE2.addBasicElement(fqj_03);
        fqj_03.onAttributesInitialized();
        String string2 = "shortcutBarButtonOverPixmap";
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fqv3);
        }
        fqv3.setHeight(18);
        fqv3.setPosition(frk_0.i);
        fqv3.setTexture(this.a.c("themeOver"));
        fqv3.setWidth(34);
        fqv3.setX(425);
        fqv3.setY(520);
        fqj_03.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqj_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqj_0 fqj_04 = (fqj_0)fvE5.getAppearance();
        fqj_04.setElementMap(fyy_03);
        fqj_04.setAlignment(frs_0.e);
        fqj_04.setState("pressed");
        fvE2.addBasicElement(fqj_04);
        fqj_04.onAttributesInitialized();
        String string3 = "shortcutBarButtonPressedPixmap";
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fqv4);
        }
        fqv4.setHeight(18);
        fqv4.setPosition(frk_0.i);
        fqv4.setTexture(this.a.c("themePressed"));
        fqv4.setWidth(34);
        fqv4.setX(425);
        fqv4.setY(520);
        fqj_04.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqj_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqj_0 fqj_05 = (fqj_0)fvE6.getAppearance();
        fqj_05.setElementMap(fyy_03);
        fqj_05.setAlignment(frs_0.e);
        fqj_05.setState("selected");
        fvE2.addBasicElement(fqj_05);
        fqj_05.onAttributesInitialized();
        String string4 = "shortcutBarButtonSelectedPixmap";
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fqv5);
        }
        fqv5.setHeight(18);
        fqv5.setPosition(frk_0.i);
        fqv5.setTexture(this.a.c("themeDefaultSelected"));
        fqv5.setWidth(34);
        fqv5.setX(425);
        fqv5.setY(520);
        fqj_05.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqj_05.onChildrenAdded();
        fvE fvE7 = fvE2;
        fqj_0 fqj_06 = (fqj_0)fvE7.getAppearance();
        fqj_06.setElementMap(fyy_03);
        fqj_06.setAlignment(frs_0.e);
        fqj_06.setState("mouseHoverSelected");
        fvE2.addBasicElement(fqj_06);
        fqj_06.onAttributesInitialized();
        String string5 = "shortcutBarButtonSelectedOverPixmap";
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fqv6);
        }
        fqv6.setHeight(18);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("themeOverSelected"));
        fqv6.setWidth(34);
        fqv6.setX(425);
        fqv6.setY(520);
        fqj_06.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqj_06.onChildrenAdded();
        fvE fvE8 = fvE2;
        fqj_0 fqj_07 = (fqj_0)fvE8.getAppearance();
        fqj_07.setElementMap(fyy_03);
        fqj_07.setAlignment(frs_0.e);
        fqj_07.setState("pressedSelected");
        fvE2.addBasicElement(fqj_07);
        fqj_07.onAttributesInitialized();
        String string6 = "shortcutBarButtonSelectedPressedPixmap";
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, fqv7);
        }
        fqv7.setHeight(18);
        fqv7.setPosition(frk_0.i);
        fqv7.setTexture(this.a.c("themePressedSelected"));
        fqv7.setWidth(34);
        fqv7.setX(425);
        fqv7.setY(520);
        fqj_07.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqj_07.onChildrenAdded();
    }
}

