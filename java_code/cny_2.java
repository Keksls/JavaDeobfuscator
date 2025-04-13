/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cNy
 */
public class cny_2
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fso2.onAttributesInitialized();
        fso fso3 = fso2;
        fqj fqj2 = ((fvE)fso3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fbh_1 fbh_12 = new fbh_1();
        fbh_12.onCheckOut();
        fbh_12.setElementMap(fyy_03);
        fbh_12.setColor(new azf_2(0.0f, 0.0f, 0.0f, 1.0f));
        fbh_12.setInsets(new Insets(1, 1, 1, 1));
        fqj2.addBasicElement(fbh_12);
        fbh_12.onAttributesInitialized();
        fbh_12.onChildrenAdded();
        fqj2.onChildrenAdded();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(-2, -2));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        String string = "graph";
        fsi_0 fsi_02 = new fsi_0();
        fsi_02.onCheckOut();
        fsi_02.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fsi_02);
        }
        fsi_02.setCellSize(new fjf_2(75, 250));
        fsi_02.setExpandable(false);
        fso2.addBasicElement(fsi_02);
        fsi_02.onAttributesInitialized();
        fsi_0 fsi_03 = fsi_02;
        fqj fqj3 = fsi_03.getAppearance();
        fqj3.setElementMap(fyy_03);
        fsi_02.addBasicElement(fqj3);
        fqj3.onAttributesInitialized();
        fbf_1 fbf_12 = new fbf_1();
        fbf_12.onCheckOut();
        fbf_12.setElementMap(fyy_03);
        fbf_12.setColor(new azf_2(1.0f, 1.0f, 1.0f, 1.0f));
        fqj3.addBasicElement(fbf_12);
        fbf_12.onAttributesInitialized();
        fbf_12.onChildrenAdded();
        fqj3.onChildrenAdded();
        fsi_02.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

