/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from eaP
 */
public class eap_1
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(3, 0, 3, 0));
        fvE2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqd_0 fqd_02 = (fqd_0)fvE4.getAppearance();
        fqd_02.setElementMap(fyy_03);
        fqd_02.setAlignment(frs_0.e);
        fqd_02.setState("default");
        fvE2.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(18);
        fqv2.setPosition(frk_0.i);
        fqv2.setRotation(avg_1.d);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(16);
        fqv2.setX(281);
        fqv2.setY(60);
        fqd_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqd_0 fqd_03 = (fqd_0)fvE5.getAppearance();
        fqd_03.setElementMap(fyy_03);
        fqd_03.setAlignment(frs_0.e);
        fqd_03.setState("mouseHover");
        fvE2.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(18);
        fqv3.setPosition(frk_0.i);
        fqv3.setRotation(avg_1.d);
        fqv3.setTexture(this.a.c("themeOver"));
        fqv3.setWidth(16);
        fqv3.setX(281);
        fqv3.setY(60);
        fqd_03.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqd_03.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqd_0 fqd_04 = (fqd_0)fvE6.getAppearance();
        fqd_04.setElementMap(fyy_03);
        fqd_04.setAlignment(frs_0.e);
        fqd_04.setState("pressed");
        fvE2.addBasicElement(fqd_04);
        fqd_04.onAttributesInitialized();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(18);
        fqv4.setPosition(frk_0.i);
        fqv4.setRotation(avg_1.d);
        fqv4.setTexture(this.a.c("themePressed"));
        fqv4.setWidth(16);
        fqv4.setX(281);
        fqv4.setY(60);
        fqd_04.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqd_04.onChildrenAdded();
    }
}

