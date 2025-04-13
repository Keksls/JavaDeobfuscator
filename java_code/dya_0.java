/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dya
 */
public class dya_0
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
        fbf_1 fbf_12 = new fbf_1();
        fbf_12.onCheckOut();
        fbf_12.setElementMap(fyy_03);
        fbf_12.setScaled(false);
        fqj2.addBasicElement(fbf_12);
        fbf_12.onAttributesInitialized();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new azf_2(0.0f, 0.0f, 0.0f, 0.5f));
        fbf_12.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fbf_12.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

