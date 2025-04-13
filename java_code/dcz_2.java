/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dCZ
 */
public class dcz_2
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
        fvE2.addBasicElement(fqp2);
        fqp2.onAttributesInitialized();
        fqp2.onChildrenAdded();
    }
}

