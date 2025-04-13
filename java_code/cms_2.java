/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cMs
 */
public class cms_2
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "popup";
        fil_1 fil_12 = new fil_1();
        fil_12.onCheckOut();
        fil_12.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fil_12);
        }
        fil_12.setAlign(frs_0.c);
        fil_12.setHideOnClick(false);
        fil_12.setHotSpotPosition(frs_0.g);
        fil_12.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setSize(new fjf_2(-2, -2));
        fil_12.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        String string2 = "container";
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fso2);
        }
        fil_12.addBasicElement(fso2);
        fso2.onAttributesInitialized();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        fso2.addBasicElement(fic_12);
        fic_12.onAttributesInitialized();
        fic_12.onChildrenAdded();
        fsk_0 fsk_02 = new fsk_0();
        fsk_02.onCheckOut();
        fsk_02.setElementMap(fyy_03);
        fsk_02.setNonBlocking(true);
        fso2.addBasicElement(fsk_02);
        fsk_02.onAttributesInitialized();
        fid_1 fid_13 = new fid_1();
        fid_13.onCheckOut();
        fid_13.setElementMap(fyy_03);
        fid_13.setAlign(frk_0.i);
        fid_13.setSize(new fjf_2(-2, -2));
        fsk_02.addBasicElement(fid_13);
        fid_13.onAttributesInitialized();
        fid_13.onChildrenAdded();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fsk_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fiy_1 fiy_12 = fiy_1.checkOut();
        fiy_12.setElementMap(fyy_03);
        fiy_12.setAttribute("texture");
        fiy_12.setName("currentMapScrollDecoratorPath");
        fqv2.addBasicElement(fiy_12);
        fiy_12.onAttributesInitialized();
        fiy_12.onChildrenAdded();
        fqv2.onChildrenAdded();
        fsk_02.onChildrenAdded();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(fyy_03);
        fuk_02.setEnableAutoZoomShrink(true);
        fuk_02.setExpandable(false);
        fuk_02.setMaxWidth(150);
        fuk_02.setMinWidth(1);
        fuk_02.setMultiline(false);
        fuk_02.setNonBlocking(true);
        fuk_02.setStyle("backgroundBold");
        fso2.addBasicElement(fuk_02);
        fuk_02.onAttributesInitialized();
        fid_1 fid_14 = new fid_1();
        fid_14.onCheckOut();
        fid_14.setElementMap(fyy_03);
        fid_14.setAlign(frk_0.i);
        fid_14.setSize(new fjf_2(-2, -2));
        fuk_02.addBasicElement(fid_14);
        fid_14.onAttributesInitialized();
        fid_14.onChildrenAdded();
        fuk_0 fuk_03 = fuk_02;
        fqh_0 fqh_02 = (fqh_0)((fvE)fuk_03).getAppearance();
        fqh_02.setElementMap(fyy_03);
        fuk_02.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("defaultLightColor"));
        fqh_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fqm_0 fqm_02 = fqm_0.checkOut();
        fqm_02.setElementMap(fyy_03);
        fqm_02.setInsets(new Insets(30, 15, 15, 15));
        fqh_02.addBasicElement(fqm_02);
        fqm_02.onAttributesInitialized();
        fqm_02.onChildrenAdded();
        fqh_02.onChildrenAdded();
        fiy_1 fiy_13 = fiy_1.checkOut();
        fiy_13.setElementMap(fyy_03);
        fiy_13.setAttribute("text");
        fiy_13.setName("mapPopupDescription");
        fuk_02.addBasicElement(fiy_13);
        fiy_13.onAttributesInitialized();
        fiy_13.onChildrenAdded();
        fiy_1 fiy_14 = fiy_1.checkOut();
        fiy_14.setElementMap(fyy_03);
        fiy_14.setAttribute("visible");
        fiy_14.setName("mapPopupIsEditing");
        fuk_02.addBasicElement(fiy_14);
        fiy_14.onAttributesInitialized();
        far_2 far_22 = new far_2();
        far_22.onCheckOut();
        far_22.setElementMap(fyy_03);
        fiy_14.addBasicElement(far_22);
        far_22.onAttributesInitialized();
        fau_1 fau_12 = new fau_1();
        fau_12.onCheckOut();
        fau_12.setElementMap(fyy_03);
        far_22.addBasicElement(fau_12);
        fau_12.onAttributesInitialized();
        fau_12.onChildrenAdded();
        far_22.onChildrenAdded();
        fiy_14.onChildrenAdded();
        fuk_02.onChildrenAdded();
        fso2.onChildrenAdded();
        fil_12.onChildrenAdded();
        return fil_12;
    }
}

