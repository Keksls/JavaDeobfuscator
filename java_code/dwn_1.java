/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dWn
 */
public class dwn_1
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqb_0 fqb_02 = (fqb_0)fvE3.getAppearance();
        fqb_02.setElementMap(fyy_03);
        fqb_02.setAlignment(frs_0.e);
        fqb_02.setState("default");
        fvE2.addBasicElement(fqb_02);
        fqb_02.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(15);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(20);
        fqv2.setX(11);
        fqv2.setY(451);
        fqb_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqb_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqb_0 fqb_03 = (fqb_0)fvE4.getAppearance();
        fqb_03.setElementMap(fyy_03);
        fqb_03.setAlignment(frs_0.e);
        fqb_03.setState("mouseHover");
        fvE2.addBasicElement(fqb_03);
        fqb_03.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(15);
        fqv3.setPosition(frk_0.i);
        fqv3.setTexture(this.a.c("themeOver"));
        fqv3.setWidth(20);
        fqv3.setX(11);
        fqv3.setY(451);
        fqb_03.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqb_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqb_0 fqb_04 = (fqb_0)fvE5.getAppearance();
        fqb_04.setElementMap(fyy_03);
        fqb_04.setAlignment(frs_0.e);
        fqb_04.setState("pressed");
        fvE2.addBasicElement(fqb_04);
        fqb_04.onAttributesInitialized();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(15);
        fqv4.setPosition(frk_0.i);
        fqv4.setTexture(this.a.c("themePressed"));
        fqv4.setWidth(20);
        fqv4.setX(11);
        fqv4.setY(451);
        fqb_04.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqb_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqb_0 fqb_05 = (fqb_0)fvE6.getAppearance();
        fqb_05.setElementMap(fyy_03);
        fqb_05.setAlignment(frs_0.e);
        fqb_05.setState("selected");
        fvE2.addBasicElement(fqb_05);
        fqb_05.onAttributesInitialized();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(15);
        fqv5.setPosition(frk_0.i);
        fqv5.setTexture(this.a.c("themeDefaultSelected"));
        fqv5.setWidth(20);
        fqv5.setX(11);
        fqv5.setY(451);
        fqb_05.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqb_05.onChildrenAdded();
        fvE fvE7 = fvE2;
        fqb_0 fqb_06 = (fqb_0)fvE7.getAppearance();
        fqb_06.setElementMap(fyy_03);
        fqb_06.setAlignment(frs_0.e);
        fqb_06.setState("mouseHoverSelected");
        fvE2.addBasicElement(fqb_06);
        fqb_06.onAttributesInitialized();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(15);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("themeOverSelected"));
        fqv6.setWidth(20);
        fqv6.setX(11);
        fqv6.setY(451);
        fqb_06.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqb_06.onChildrenAdded();
        fvE fvE8 = fvE2;
        fqb_0 fqb_07 = (fqb_0)fvE8.getAppearance();
        fqb_07.setElementMap(fyy_03);
        fqb_07.setAlignment(frs_0.e);
        fqb_07.setState("pressedSelected");
        fvE2.addBasicElement(fqb_07);
        fqb_07.onAttributesInitialized();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(15);
        fqv7.setPosition(frk_0.i);
        fqv7.setTexture(this.a.c("themePressedSelected"));
        fqv7.setWidth(20);
        fqv7.setX(11);
        fqv7.setY(451);
        fqb_07.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqb_07.onChildrenAdded();
    }
}

