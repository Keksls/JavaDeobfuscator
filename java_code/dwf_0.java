/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dWF
 */
public class dwf_0
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
        fqd_02.setAlignment(frs_0.d);
        fqd_02.setState("default");
        fvE2.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(18);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(18);
        fqv2.setX(206);
        fqv2.setY(659);
        fqd_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqd_0 fqd_03 = (fqd_0)fvE4.getAppearance();
        fqd_03.setElementMap(fyy_03);
        fqd_03.setAlignment(frs_0.d);
        fqd_03.setState("mouseHover");
        fvE2.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(18);
        fqv3.setPosition(frk_0.i);
        fqv3.setTexture(this.a.c("themeDefault"));
        fqv3.setWidth(18);
        fqv3.setX(206);
        fqv3.setY(659);
        fqd_03.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqd_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqd_0 fqd_04 = (fqd_0)fvE5.getAppearance();
        fqd_04.setElementMap(fyy_03);
        fqd_04.setAlignment(frs_0.d);
        fqd_04.setState("disabled");
        fvE2.addBasicElement(fqd_04);
        fqd_04.onAttributesInitialized();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(18);
        fqv4.setPosition(frk_0.i);
        fqv4.setTexture(this.a.c("themeDefault"));
        fqv4.setWidth(18);
        fqv4.setX(206);
        fqv4.setY(659);
        fqd_04.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqd_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqd_0 fqd_05 = (fqd_0)fvE6.getAppearance();
        fqd_05.setElementMap(fyy_03);
        fqd_05.setAlignment(frs_0.d);
        fqd_05.setState("pressed");
        fvE2.addBasicElement(fqd_05);
        fqd_05.onAttributesInitialized();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(18);
        fqv5.setPosition(frk_0.i);
        fqv5.setTexture(this.a.c("themeDefault"));
        fqv5.setWidth(18);
        fqv5.setX(206);
        fqv5.setY(659);
        fqd_05.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqd_05.onChildrenAdded();
        fvE fvE7 = fvE2;
        fqd_0 fqd_06 = (fqd_0)fvE7.getAppearance();
        fqd_06.setElementMap(fyy_03);
        fqd_06.setAlignment(frs_0.d);
        fqd_06.setState("selected");
        fvE2.addBasicElement(fqd_06);
        fqd_06.onAttributesInitialized();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(18);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("themeDefaultSelected"));
        fqv6.setWidth(18);
        fqv6.setX(206);
        fqv6.setY(659);
        fqd_06.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqd_06.onChildrenAdded();
        fvE fvE8 = fvE2;
        fqd_0 fqd_07 = (fqd_0)fvE8.getAppearance();
        fqd_07.setElementMap(fyy_03);
        fqd_07.setAlignment(frs_0.d);
        fqd_07.setState("mouseHoverSelected");
        fvE2.addBasicElement(fqd_07);
        fqd_07.onAttributesInitialized();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(18);
        fqv7.setPosition(frk_0.i);
        fqv7.setTexture(this.a.c("themeDefaultSelected"));
        fqv7.setWidth(18);
        fqv7.setX(206);
        fqv7.setY(659);
        fqd_07.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqd_07.onChildrenAdded();
        fvE fvE9 = fvE2;
        fqd_0 fqd_08 = (fqd_0)fvE9.getAppearance();
        fqd_08.setElementMap(fyy_03);
        fqd_08.setAlignment(frs_0.d);
        fqd_08.setState("disabledSelected");
        fvE2.addBasicElement(fqd_08);
        fqd_08.onAttributesInitialized();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(18);
        fqv8.setPosition(frk_0.i);
        fqv8.setTexture(this.a.c("themeDefaultSelected"));
        fqv8.setWidth(18);
        fqv8.setX(206);
        fqv8.setY(659);
        fqd_08.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqd_08.onChildrenAdded();
        fvE fvE10 = fvE2;
        fqd_0 fqd_09 = (fqd_0)fvE10.getAppearance();
        fqd_09.setElementMap(fyy_03);
        fqd_09.setAlignment(frs_0.d);
        fqd_09.setState("pressedSelected");
        fvE2.addBasicElement(fqd_09);
        fqd_09.onAttributesInitialized();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(18);
        fqv9.setPosition(frk_0.i);
        fqv9.setTexture(this.a.c("themeDefaultSelected"));
        fqv9.setWidth(18);
        fqv9.setX(206);
        fqv9.setY(659);
        fqd_09.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqd_09.onChildrenAdded();
    }
}

