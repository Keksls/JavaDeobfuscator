/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dwE
 */
public class dwe_1
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
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        fby_22.setScaled(false);
        fqj2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(58);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeSimple2"));
        fqv2.setWidth(58);
        fqv2.setX(1183);
        fqv2.setY(1415);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

