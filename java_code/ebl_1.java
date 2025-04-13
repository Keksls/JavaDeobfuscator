/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from ebl
 */
public class ebl_1
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqh_0 fqh_02 = (fqh_0)fvE3.getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlign(frs_0.d);
        fqh_02.setState("default");
        fvE2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqn fqn2 = fqn.checkOut();
        fqn2.setRenderer(fpm_0.b().g().d("fontDefault9Bold"));
        fqn2.setElementMap(fyy_03);
        fqh_02.addBasicElement(fqn2);
        fqn2.onAttributesInitialized();
        fqn2.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("defaultDarkColor"));
        fqh_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fbf_1 fbf_12 = new fbf_1();
        fbf_12.onCheckOut();
        fbf_12.setElementMap(fyy_03);
        fbf_12.setColor(new azf_2(0.0f, 0.0f, 0.0f, 0.0f));
        fqh_02.addBasicElement(fbf_12);
        fbf_12.onAttributesInitialized();
        fbf_12.onChildrenAdded();
        fqh_02.onChildrenAdded();
    }
}

