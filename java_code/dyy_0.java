/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dyY
 */
public class dyy_0
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
        fbx_1 fbx_12 = new fbx_1();
        fbx_12.onCheckOut();
        fbx_12.setElementMap(fyy_03);
        fbx_12.setAlignment(frs_0.e);
        fbx_12.setFile("6001009.xps");
        fbx_12.setLevel(1);
        fbx_12.setZoom(0.4f);
        fqj2.addBasicElement(fbx_12);
        fbx_12.onAttributesInitialized();
        fbx_12.onChildrenAdded();
        fqj2.onChildrenAdded();
    }
}

