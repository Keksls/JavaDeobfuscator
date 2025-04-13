/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from dVF
 */
public class dvf_1
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqx fqx2 = (fqx)fvE3.getAppearance();
        fqx2.setElementMap(fyy_03);
        fqx2.setInnerBorder(new Insets(2, 0, 0, 0));
        fvE2.addBasicElement(fqx2);
        fqx2.onAttributesInitialized();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("blackColor"));
        fqx2.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fqg_0 fqg_03 = fqg_0.checkOut();
        fqg_03.setElementMap(fyy_03);
        fqg_03.setColor(new azf_2(1.0f, 1.0f, 1.0f, 1.0f));
        fqg_03.setName("progressBar");
        fqx2.addBasicElement(fqg_03);
        fqg_03.onAttributesInitialized();
        fqg_03.onChildrenAdded();
        fqx2.onChildrenAdded();
    }
}

