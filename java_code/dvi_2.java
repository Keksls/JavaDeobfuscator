/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dVi
 */
public class dvi_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqs fqs2 = (fqs)fvE3.getAppearance();
        fqs2.setElementMap(fyy_03);
        fqs2.setEndX(921);
        fqs2.setEndY(462);
        fqs2.setStartX(89);
        fqs2.setStartY(51);
        fvE2.addBasicElement(fqs2);
        fqs2.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(558);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("parcho"));
        fqv2.setWidth(1018);
        fqv2.setX(1);
        fqv2.setY(0);
        fqs2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqs2.onChildrenAdded();
    }
}

