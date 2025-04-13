/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from edu
 */
public class edu_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        String string = "pmMagnifyingGlass";
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fqv2);
        }
        fqv2.setHeight(15);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(15);
        fqv2.setX(788);
        fqv2.setY(111);
        fvE2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
    }
}

