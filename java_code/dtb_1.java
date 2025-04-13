/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dTb
 */
public class dtb_1
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        ckv_2 ckv_22 = (ckv_2)fvE3.getAppearance();
        ckv_22.setElementMap(fyy_03);
        fvE2.addBasicElement(ckv_22);
        ckv_22.onAttributesInitialized();
        ckv_22.onChildrenAdded();
    }
}

