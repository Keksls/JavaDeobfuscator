/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dlL
 */
public class dll_1
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqb fqb2 = (fqb)fvE3.getAppearance();
        fqb2.setElementMap(fyy_03);
        fqb2.setAnimName("AnimTitre-G");
        fqb2.setDirection(0);
        fqb2.setFilePath("Banner_Titre.anm");
        fqb2.setScale(1.0f);
        fvE2.addBasicElement(fqb2);
        fqb2.onAttributesInitialized();
        fqb2.onChildrenAdded();
    }
}

