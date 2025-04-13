/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cQI
 */
public class cqi_2
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
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fso2.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        String string = "closeButton";
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fru_02);
        }
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("unloadDialog");
        fru_02.setOnClick(fdt_12);
        fru_02.setStyle("backgroundDisplayClose");
        fso2.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setAlign(frk_0.e);
        fru_02.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fru_0 fru_03 = fru_02;
        fqd_0 fqd_02 = (fqd_0)((fvE)fru_03).getAppearance();
        fqd_02.setElementMap(fyy_03);
        fru_02.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(10, 0, 0, 20));
        fqd_02.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fru_02.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

