/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dVJ
 */
public class dvj_1
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
        fvE2.addBasicElement(fqx2);
        fqx2.onAttributesInitialized();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("xpColorCompanion"));
        fqx2.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fqx2.onChildrenAdded();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(12);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeSimple2"));
        fqv2.setWidth(1);
        fqv2.setX(299);
        fqv2.setY(254);
        fvE2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
    }
}

