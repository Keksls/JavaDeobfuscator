/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cNp
 */
public class cnp_2
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        fvk_0 fvk_02 = new fvk_0();
        fvk_02.onCheckOut();
        fvk_02.setElementMap(fyy_03);
        fvk_02.setPack(true);
        fvk_02.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.a);
        fid_12.setInitValue(true);
        fid_12.setSize(new fjf_2(60, 59));
        fid_12.setYOffset(-140);
        fvk_02.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("visible");
        fiy_12.setName("isInFight");
        fvk_02.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fvM fvM2 = new fvM();
        fvM2.onCheckOut();
        fvM2.setElementMap(fyy_03);
        fvk_02.addBasicElement(fvM2);
        fvM2.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fvM2.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fsk_02.setNonBlocking(true);
        fsk_02.setStyle("controlCenterTimer");
        fvM2.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setSize(new fjf_2(100.0f, 100.0f));
        fsk_02.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fsk_0 fsk_03 = fsk_02;
        fqp fqp2 = (fqp)((fvE)fsk_03).getAppearance();
        fqp2.setElementMap(fyy_03);
        fsk_02.addBasicElement(fqp2);
        fqp2.onAttributesInitialized();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("modulationColor");
        fiy_13.setName("countdownState");
        fqp2.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_03);
        far_22.setElseValue("1,1,1");
        fiy_13.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        far_2 far_23 = new far_2();
        far_23.onCheckOut();
        far_23.setElementMap(fyy_03);
        far_23.setValue("timelineOrangeOverlayColor");
        far_22.addBasicElement(far_23);
        far_23.onAttributesInitialized();
        fat_2 fat_22 = new fat_2();
        fat_22.onCheckOut();
        fat_22.setElementMap(fyy_03);
        fat_22.setValue("1");
        far_23.addBasicElement(fat_22);
        fat_22.onAttributesInitialized();
        fat_22.onChildrenAdded();
        far_23.onChildrenAdded();
        far_2 far_24 = new far_2();
        far_24.onCheckOut();
        far_24.setElementMap(fyy_03);
        far_24.setValue("timelineRedOverlayColor");
        far_22.addBasicElement(far_24);
        far_24.onAttributesInitialized();
        fat_2 fat_23 = new fat_2();
        fat_23.onCheckOut();
        fat_23.setElementMap(fyy_03);
        fat_23.setValue("2");
        far_24.addBasicElement(fat_23);
        fat_23.onAttributesInitialized();
        fat_23.onChildrenAdded();
        far_24.onChildrenAdded();
        far_22.onChildrenAdded();
        fiy_13.onChildrenAdded();
        fqp2.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setNonBlocking(true);
        fsM2.setPrefSize(new fjf_2(20, 0));
        fsM2.setStyle("BigTitle");
        fvM2.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.i);
        fsM2.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fsM fsM3 = fsM2;
        fqh_0 fqh_02 = (fqh_0)((fvE)fsM3).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlignment(frs_0.e);
        fsM2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqh_02.onChildrenAdded();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("text");
        fiy_14.setName("countdownText");
        fsM2.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        fiy_14.onChildrenAdded();
        fsM2.onChildrenAdded();
        fvM2.onChildrenAdded();
        fvk_02.onChildrenAdded();
        return fvk_02;
    }
}

