/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from ebK
 */
public class ebk_1
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        fbn_2 fbn_22;
        fbm_2 fbm_22;
        Object object;
        fyb_0 fyb_02;
        Object object2;
        fyb_0 fyb_03;
        fvE fvE3;
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE4 = fvE2;
        fqG fqG2 = (fqG)fvE4.getAppearance();
        fqG2.setElementMap(fyy_03);
        fqG2.setClearButtonDisplaySize(new fjf_2(10, 10));
        fqG2.setPadding(new Insets(-3, 0, -3, 0));
        fqG2.setSearchButtonDisplaySize(new fjf_2(15, 15));
        fvE2.addBasicElement(fqG2);
        fqG2.onAttributesInitialized();
        fvE fvE5 = fqG2.getParentOfType(fvE.class);
        fvE fvE6 = fvE5.getWidgetByThemeElementName("textEditor", false);
        if (fvE6 != null) {
            fvE3 = fvE6;
            fyb_03 = (fqh_0)fvE3.getAppearance();
            fyb_03.setElementMap(fyy_03);
            ((fqh_0)fyb_03).setAlign(frs_0.d);
            ((fqD)fyb_03).setPadding(new Insets(0, 5, 0, 5));
            ((fqj)fyb_03).setState("default");
            fvE6.addBasicElement(fyb_03);
            fyb_03.onAttributesInitialized();
            object2 = fqn.checkOut();
            ((fqn)object2).setRenderer(fpm_0.b().g().d("fontDefault10"));
            ((fyb_0)object2).setElementMap(fyy_03);
            fyb_03.addBasicElement((fyo)object2);
            ((fyo)object2).onAttributesInitialized();
            ((fyb_0)object2).onChildrenAdded();
            fyb_02 = fqg_0.checkOut();
            fyb_02.setElementMap(fyy_03);
            ((fqg_0)fyb_02).setColor(new fyr_0("defaultLightColor"));
            fyb_03.addBasicElement(fyb_02);
            fyb_02.onAttributesInitialized();
            fyb_02.onChildrenAdded();
            object = fqg_0.checkOut();
            ((fyb_0)object).setElementMap(fyy_03);
            ((fqg_0)object).setColor(new fyr_0("textDarkTextEditorColor"));
            ((fqg_0)object).setName("text");
            fyb_03.addBasicElement((fyo)object);
            ((fyo)object).onAttributesInitialized();
            ((fyb_0)object).onChildrenAdded();
            fbm_22 = fqg_0.checkOut();
            fbm_22.setElementMap(fyy_03);
            ((fqg_0)fbm_22).setColor(new fyr_0("selectionDarkTextEditorColor"));
            ((fqg_0)fbm_22).setName("selection");
            fyb_03.addBasicElement(fbm_22);
            fbm_22.onAttributesInitialized();
            fbm_22.onChildrenAdded();
            fbn_22 = fqg_0.checkOut();
            fbn_22.setElementMap(fyy_03);
            ((fqg_0)fbn_22).setColor(new fyr_0("selectionDarkTextEditorColor"));
            ((fqg_0)fbn_22).setName("cursor");
            fyb_03.addBasicElement(fbn_22);
            fbn_22.onAttributesInitialized();
            fbn_22.onChildrenAdded();
            fyb_03.onChildrenAdded();
        }
        if ((fyb_03 = (fvE3 = fqG2.getParentOfType(fvE.class)).getWidgetByThemeElementName("searchButton", false)) != null) {
            object2 = "pmMagnifyingGlass";
            fyb_02 = fqv.checkOut();
            fyb_02.setElementMap(fyy_03);
            if (fyy_03 != null && object2 != null) {
                fyy_03.a((String)object2, fyb_02);
            }
            ((fqv)fyb_02).setHeight(15);
            ((fqv)fyb_02).setPosition(frk_0.i);
            ((fqv)fyb_02).setTexture(this.a.c("themeSimple"));
            ((fqv)fyb_02).setWidth(15);
            ((fqv)fyb_02).setX(788);
            ((fqv)fyb_02).setY(111);
            fyb_03.addBasicElement(fyb_02);
            fyb_02.onAttributesInitialized();
            fyb_02.onChildrenAdded();
        }
        if ((fyb_02 = ((fvE)(object2 = fqG2.getParentOfType(fvE.class))).getWidgetByThemeElementName("clearButton", false)) != null) {
            object = "pmGrayCancel";
            fbm_22 = fqv.checkOut();
            fbm_22.setElementMap(fyy_03);
            if (fyy_03 != null && object != null) {
                fyy_03.a((String)object, fbm_22);
            }
            ((fqv)fbm_22).setHeight(10);
            ((fqv)fbm_22).setPosition(frk_0.i);
            ((fqv)fbm_22).setTexture(this.a.c("themeSimple"));
            ((fqv)fbm_22).setWidth(10);
            ((fqv)fbm_22).setX(1867);
            ((fqv)fbm_22).setY(304);
            fyb_02.addBasicElement(fbm_22);
            fbm_22.onAttributesInitialized();
            fbm_22.onChildrenAdded();
        }
        object = "textEditorDarkBorder";
        fbm_22 = new fbc_1();
        ((fbc_1)fbm_22).onCheckOut();
        fbm_22.setElementMap(fyy_03);
        if (fyy_03 != null && object != null) {
            fyy_03.a((String)object, fbm_22);
        }
        fqG2.addBasicElement(fbm_22);
        fbm_22.onAttributesInitialized();
        fbn_22 = fqv.checkOut();
        fbn_22.setElementMap(fyy_03);
        ((fqv)fbn_22).setHeight(4);
        ((fqv)fbn_22).setPosition(frk_0.a);
        ((fqv)fbn_22).setTexture(this.a.c("themeSimple"));
        ((fqv)fbn_22).setWidth(4);
        ((fqv)fbn_22).setX(396);
        ((fqv)fbn_22).setY(172);
        fbm_22.addBasicElement(fbn_22);
        fbn_22.onAttributesInitialized();
        fbn_22.onChildrenAdded();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.c);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(20);
        fqv2.setX(400);
        fqv2.setY(172);
        fbm_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(4);
        fqv3.setPosition(frk_0.e);
        fqv3.setTexture(this.a.c("themeSimple"));
        fqv3.setWidth(4);
        fqv3.setX(420);
        fqv3.setY(172);
        fbm_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(7);
        fqv4.setPosition(frk_0.j);
        fqv4.setTexture(this.a.c("themeSimple"));
        fqv4.setWidth(4);
        fqv4.setX(420);
        fqv4.setY(176);
        fbm_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(3);
        fqv5.setPosition(frk_0.q);
        fqv5.setTexture(this.a.c("themeSimple"));
        fqv5.setWidth(4);
        fqv5.setX(420);
        fqv5.setY(183);
        fbm_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(3);
        fqv6.setPosition(frk_0.o);
        fqv6.setTexture(this.a.c("themeSimple"));
        fqv6.setWidth(20);
        fqv6.setX(400);
        fqv6.setY(183);
        fbm_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(3);
        fqv7.setPosition(frk_0.m);
        fqv7.setTexture(this.a.c("themeSimple"));
        fqv7.setWidth(4);
        fqv7.setX(396);
        fqv7.setY(183);
        fbm_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(7);
        fqv8.setPosition(frk_0.h);
        fqv8.setTexture(this.a.c("themeSimple"));
        fqv8.setWidth(4);
        fqv8.setX(396);
        fqv8.setY(176);
        fbm_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fbm_22.onChildrenAdded();
        String string = "textEditorDarkBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqG2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(7);
        fqv9.setPosition(frk_0.i);
        fqv9.setTexture(this.a.c("themeSimple"));
        fqv9.setWidth(20);
        fqv9.setX(400);
        fqv9.setY(176);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqG2.onChildrenAdded();
    }
}

