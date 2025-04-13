/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dIM
 */
public class dim_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqp fqp2 = (fqp)fvE3.getAppearance();
        fqp2.setElementMap(fyy_03);
        fqp2.setScaled(false);
        fvE2.addBasicElement(fqp2);
        fqp2.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(11);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeSimple2"));
        fqv2.setWidth(19);
        fqv2.setX(457);
        fqv2.setY(453);
        fqp2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqp2.onChildrenAdded();
    }
}

