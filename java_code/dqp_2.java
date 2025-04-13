/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dqP
 */
public class dqp_2
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
        fqj_02.setAlignment(frs_0.d);
        fqj_02.setState("default");
        fvE2.addBasicElement(fqj_02);
        fqj_02.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(94);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(94);
        fqv2.setX(918);
        fqv2.setY(812);
        fqj_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqj_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqj_0 fqj_03 = (fqj_0)fvE4.getAppearance();
        fqj_03.setElementMap(fyy_03);
        fqj_03.setAlignment(frs_0.d);
        fqj_03.setState("mouseHover");
        fvE2.addBasicElement(fqj_03);
        fqj_03.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(94);
        fqv3.setPosition(frk_0.i);
        fqv3.setTexture(this.a.c("themeOver"));
        fqv3.setWidth(94);
        fqv3.setX(918);
        fqv3.setY(812);
        fqj_03.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqj_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqj_0 fqj_04 = (fqj_0)fvE5.getAppearance();
        fqj_04.setElementMap(fyy_03);
        fqj_04.setAlignment(frs_0.d);
        fqj_04.setState("disabled");
        fvE2.addBasicElement(fqj_04);
        fqj_04.onAttributesInitialized();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(94);
        fqv4.setPosition(frk_0.i);
        fqv4.setTexture(this.a.c("themeDisabled"));
        fqv4.setWidth(94);
        fqv4.setX(918);
        fqv4.setY(812);
        fqj_04.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqj_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqj_0 fqj_05 = (fqj_0)fvE6.getAppearance();
        fqj_05.setElementMap(fyy_03);
        fqj_05.setAlignment(frs_0.d);
        fqj_05.setState("pressed");
        fvE2.addBasicElement(fqj_05);
        fqj_05.onAttributesInitialized();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(94);
        fqv5.setPosition(frk_0.i);
        fqv5.setTexture(this.a.c("themePressed"));
        fqv5.setWidth(94);
        fqv5.setX(918);
        fqv5.setY(812);
        fqj_05.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqj_05.onChildrenAdded();
    }
}

