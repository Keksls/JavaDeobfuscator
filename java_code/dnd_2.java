/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dnd
 */
public class dnd_2
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
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(11);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(11);
        fqv2.setX(1470);
        fqv2.setY(266);
        fqd_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new azf_2(1.0f, 1.0f, 1.0f, 1.0f));
        fqg_02.setDecoratorSwitch(true);
        fqg_02.setName("modulation");
        fqd_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqd_0 fqd_03 = (fqd_0)fvE4.getAppearance();
        fqd_03.setElementMap(fyy_03);
        fqd_03.setState("disabled");
        fvE2.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(11);
        fqv3.setPosition(frk_0.i);
        fqv3.setTexture(this.a.c("themeSimple"));
        fqv3.setWidth(11);
        fqv3.setX(1470);
        fqv3.setY(266);
        fqd_03.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqg_0 fqg_03 = fqg_0.checkOut();
        fqg_03.setElementMap(fyy_03);
        fqg_03.setColor(new azf_2(0.7f, 0.7f, 0.7f, 0.4f));
        fqg_03.setDecoratorSwitch(true);
        fqg_03.setName("modulation");
        fqd_03.addBasicElement(fqg_03);
        fqg_03.onAttributesInitialized();
        fqg_03.onChildrenAdded();
        fqd_03.onChildrenAdded();
    }
}

