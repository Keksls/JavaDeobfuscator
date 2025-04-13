/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cRe
 */
public class cre_1
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
        fid_12.setSize(new fjf_2(500, -2));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fso fso3 = fso2;
        fqj fqj2 = ((fvE)fso3).getAppearance();
        fqj2.setElementMap(fyy_03);
        fso2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fbf_1 fbf_12 = new fbf_1();
        fbf_12.onCheckOut();
        fbf_12.setElementMap(fyy_03);
        fbf_12.setColor(new azf_2(1.0f, 1.0f, 1.0f, 1.0f));
        fqj2.addBasicElement(fbf_12);
        fbf_12.onAttributesInitialized();
        fbf_12.onChildrenAdded();
        fqj2.onChildrenAdded();
        fie_1 fie_12 = new fie_1();
        fie_12.onCheckOut();
        fie_12.setColumns(3);
        fie_12.setRows(2);
        fso2.addBasicElement(fie_12);
        fie_12.onAttributesInitialized();
        fie_12.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setExpandable(false);
        fsM2.c("text court");
        fso2.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fig_1 fig_12 = new fig_1();
        fig_12.onCheckOut();
        fig_12.setElementMap(fyy_03);
        fig_12.setColumn(0);
        fig_12.setHorizontalAlign(frs_0.d);
        fig_12.setRow(0);
        fsM2.addBasicElement(fig_12);
        fig_12.onAttributesInitialized();
        fig_12.onChildrenAdded();
        fsM2.onChildrenAdded();
        fsM fsM3 = new fsM();
        fsM3.onCheckOut();
        fsM3.setElementMap(fyy_03);
        fsM3.setPrefSize(new fjf_2(50, 0));
        fsM3.c("1");
        fso2.addBasicElement(fsM3);
        fsM3.onAttributesInitialized();
        fsM fsM4 = fsM3;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM4).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlign(frs_0.f);
        fsM3.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fig_1 fig_13 = new fig_1();
        fig_13.onCheckOut();
        fig_13.setElementMap(fyy_03);
        fig_13.setColumn(1);
        fig_13.setHorizontalAlign(frs_0.f);
        fig_13.setRow(0);
        fsM3.addBasicElement(fig_13);
        fig_13.onAttributesInitialized();
        fig_13.onChildrenAdded();
        fsM3.onChildrenAdded();
        fsM fsM5 = new fsM();
        fsM5.onCheckOut();
        fsM5.setElementMap(fyy_03);
        fsM5.c("Longue Description de ouf ! Et m\u00eame plus !");
        fso2.addBasicElement(fsM5);
        fsM5.onAttributesInitialized();
        fig_1 fig_14 = new fig_1();
        fig_14.onCheckOut();
        fig_14.setElementMap(fyy_03);
        fig_14.setColumn(2);
        fig_14.setRow(0);
        fsM5.addBasicElement(fig_14);
        fig_14.onAttributesInitialized();
        fig_14.onChildrenAdded();
        fsM5.onChildrenAdded();
        fsM fsM6 = new fsM();
        fsM6.onCheckOut();
        fsM6.setElementMap(fyy_03);
        fsM6.setExpandable(false);
        fsM6.c("Beaucoup plus long !");
        fso2.addBasicElement(fsM6);
        fsM6.onAttributesInitialized();
        fig_1 fig_15 = new fig_1();
        fig_15.onCheckOut();
        fig_15.setElementMap(fyy_03);
        fig_15.setColumn(0);
        fig_15.setRow(1);
        fig_15.setVerticalAlign(frs_0.e);
        fsM6.addBasicElement(fig_15);
        fig_15.onAttributesInitialized();
        fig_15.onChildrenAdded();
        fsM6.onChildrenAdded();
        fsM fsM7 = new fsM();
        fsM7.onCheckOut();
        fsM7.setElementMap(fyy_03);
        fsM7.c("2");
        fso2.addBasicElement(fsM7);
        fsM7.onAttributesInitialized();
        fig_1 fig_16 = new fig_1();
        fig_16.onCheckOut();
        fig_16.setElementMap(fyy_03);
        fig_16.setColumn(1);
        fig_16.setHorizontalAlign(frs_0.f);
        fig_16.setRow(1);
        fsM7.addBasicElement(fig_16);
        fig_16.onAttributesInitialized();
        fig_16.onChildrenAdded();
        fsM7.onChildrenAdded();
        fsM fsM8 = new fsM();
        fsM8.onCheckOut();
        fsM8.setElementMap(fyy_03);
        fsM8.c("Description courte");
        fso2.addBasicElement(fsM8);
        fsM8.onAttributesInitialized();
        fig_1 fig_17 = new fig_1();
        fig_17.onCheckOut();
        fig_17.setElementMap(fyy_03);
        fig_17.setColumn(2);
        fig_17.setRow(1);
        fsM8.addBasicElement(fig_17);
        fig_17.onAttributesInitialized();
        fig_17.onChildrenAdded();
        fsM8.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

