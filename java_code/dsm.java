/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class dsm
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
        String string = "worldBarButtonDefaultPixmap";
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fqv2);
        }
        fqv2.setHeight(35);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(33);
        fqv2.setX(256);
        fqv2.setY(525);
        fqd_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqd_0 fqd_03 = (fqd_0)fvE4.getAppearance();
        fqd_03.setElementMap(fyy_03);
        fqd_03.setState("pressed");
        fvE2.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        String string2 = "worldBarButtonPressedPixmap";
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fqv3);
        }
        fqv3.setHeight(35);
        fqv3.setPosition(frk_0.i);
        fqv3.setTexture(this.a.c("themePressed"));
        fqv3.setWidth(33);
        fqv3.setX(256);
        fqv3.setY(525);
        fqd_03.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqd_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqd_0 fqd_04 = (fqd_0)fvE5.getAppearance();
        fqd_04.setElementMap(fyy_03);
        fqd_04.setState("mouseHover");
        fvE2.addBasicElement(fqd_04);
        fqd_04.onAttributesInitialized();
        String string3 = "worldBarButtonOverPixmap";
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fqv4);
        }
        fqv4.setHeight(35);
        fqv4.setPosition(frk_0.i);
        fqv4.setTexture(this.a.c("themeOver"));
        fqv4.setWidth(33);
        fqv4.setX(256);
        fqv4.setY(525);
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
        String string4 = "worldBarButtonDisabledPixmap";
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fqv5);
        }
        fqv5.setHeight(35);
        fqv5.setPosition(frk_0.i);
        fqv5.setTexture(this.a.c("themeDisabled"));
        fqv5.setWidth(33);
        fqv5.setX(256);
        fqv5.setY(525);
        fqd_05.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqd_05.onChildrenAdded();
    }
}

