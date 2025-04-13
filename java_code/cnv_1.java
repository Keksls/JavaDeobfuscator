/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cNv
 */
public class cnv_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "mainWindow";
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fso2);
        }
        fso2.setNonBlocking(false);
        fso2.setStyle("backgroundPopup");
        fso2.onAttributesInitialized();
        fso fso3 = fso2;
        fqj fqj2 = ((fvE)fso3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(7, 10, 9, 10));
        fqj2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqj2.onChildrenAdded();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(100.0f, -2));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fso2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        String string2 = "closeButton";
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fru_02);
        }
        fru_02.setExpandable(false);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.fresco:closeDialog");
        fru_02.setOnClick(fdt_12);
        fru_02.setStyle("close");
        fso2.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setElementMap(fyy_03);
        fip_22.setAlign(frs_0.f);
        fru_02.addBasicElement(fip_22);
        fip_22.onAttributesInitialized();
        fip_22.onChildrenAdded();
        fru_02.onChildrenAdded();
        fso fso4 = fso.checkOut();
        fso4.setElementMap(fyy_03);
        fso2.addBasicElement(fso4);
        fso4.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fso4.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        String string3 = "multipleImage";
        fte_0 fte_02 = new fte_0();
        fte_02.onCheckOut();
        fte_02.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fte_02);
        }
        fte_02.setManualInnerMove(true);
        fte_02.setShrinkToImageHeight(true);
        fso4.addBasicElement(fte_02);
        fte_02.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fte_02.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        String string4 = "internalPopup";
        fso fso5 = fso.checkOut();
        fso5.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fso5);
        }
        fso5.setStyle("popup");
        fte_02.addBasicElement(fso5);
        fso5.onAttributesInitialized();
        String string5 = "internalPopupTextView";
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fuk_02);
        }
        fuk_02.setMinWidth(250);
        fuk_02.setStyle("white");
        fso5.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fuk_02.onChildrenAdded();
        fso5.onChildrenAdded();
        fte_02.onChildrenAdded();
        String string6 = "leftArrowContainer";
        fso fso6 = fso.checkOut();
        fso6.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, fso6);
        }
        fso6.setStyle("leftArrowParticle");
        fso4.addBasicElement(fso6);
        fso6.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.h);
        fid_14.setSize(new fjf_2(50, 50));
        fso6.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fso6.onChildrenAdded();
        String string7 = "rightArrowContainer";
        fso fso7 = fso.checkOut();
        fso7.setElementMap(fyy_03);
        if (fyy_03 != null && string7 != null) {
            fyy_03.a(string7, fso7);
        }
        fso7.setStyle("rightArrowParticle");
        fso4.addBasicElement(fso7);
        fso7.onAttributesInitialized();
        fid_1 fid_15 = new fid_1();
        fid_15.onCheckOut();
        fid_15.setElementMap(fyy_03);
        fid_15.setAlign(frk_0.j);
        fid_15.setSize(new fjf_2(50, 50));
        fso7.addBasicElement(fid_15);
        fid_15.onAttributesInitialized();
        fid_15.onChildrenAdded();
        fso7.onChildrenAdded();
        fso4.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

