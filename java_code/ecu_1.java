/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from ecU
 */
public class ecu_1
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        fbm_2 fbm_22;
        String string;
        fyb_0 fyb_02;
        Object object;
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
            object = fqn.checkOut();
            ((fqn)object).setRenderer(fpm_0.b().g().d("fontDefault14Bold"));
            ((fyb_0)object).setElementMap(fyy_03);
            fyb_03.addBasicElement((fyo)object);
            ((fyo)object).onAttributesInitialized();
            ((fyb_0)object).onChildrenAdded();
            fyb_02 = fqg_0.checkOut();
            fyb_02.setElementMap(fyy_03);
            ((fqg_0)fyb_02).setColor(new fyr_0("defaultDarkColor"));
            fyb_03.addBasicElement(fyb_02);
            fyb_02.onAttributesInitialized();
            fyb_02.onChildrenAdded();
            fyb_03.onChildrenAdded();
        }
        if ((fyb_03 = (fvE3 = fqG2.getParentOfType(fvE.class)).getWidgetByThemeElementName("searchButton", false)) != null) {
            object = "pmMagnifyingGlass";
            fyb_02 = fqv.checkOut();
            fyb_02.setElementMap(fyy_03);
            if (fyy_03 != null && object != null) {
                fyy_03.a((String)object, fyb_02);
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
        if ((fyb_02 = ((fvE)(object = fqG2.getParentOfType(fvE.class))).getWidgetByThemeElementName("clearButton", false)) != null) {
            string = "pmGrayCancel";
            fbm_22 = fqv.checkOut();
            fbm_22.setElementMap(fyy_03);
            if (fyy_03 != null && string != null) {
                fyy_03.a(string, fbm_22);
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
        string = "textEditorLightBorder";
        fbm_22 = new fbc_1();
        ((fbc_1)fbm_22).onCheckOut();
        fbm_22.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fbm_22);
        }
        fqG2.addBasicElement(fbm_22);
        fbm_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(4);
        fqv2.setX(396);
        fqv2.setY(153);
        fbm_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(4);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeSimple"));
        fqv3.setWidth(20);
        fqv3.setX(400);
        fqv3.setY(153);
        fbm_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(4);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeSimple"));
        fqv4.setWidth(4);
        fqv4.setX(420);
        fqv4.setY(153);
        fbm_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(7);
        fqv5.setPosition(frk_0.j);
        fqv5.setTexture(this.a.c("themeSimple"));
        fqv5.setWidth(4);
        fqv5.setX(420);
        fqv5.setY(157);
        fbm_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(3);
        fqv6.setPosition(frk_0.q);
        fqv6.setTexture(this.a.c("themeSimple"));
        fqv6.setWidth(4);
        fqv6.setX(420);
        fqv6.setY(164);
        fbm_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(3);
        fqv7.setPosition(frk_0.o);
        fqv7.setTexture(this.a.c("themeSimple"));
        fqv7.setWidth(20);
        fqv7.setX(400);
        fqv7.setY(164);
        fbm_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(3);
        fqv8.setPosition(frk_0.m);
        fqv8.setTexture(this.a.c("themeSimple"));
        fqv8.setWidth(4);
        fqv8.setX(396);
        fqv8.setY(164);
        fbm_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(7);
        fqv9.setPosition(frk_0.h);
        fqv9.setTexture(this.a.c("themeSimple"));
        fqv9.setWidth(4);
        fqv9.setX(396);
        fqv9.setY(157);
        fbm_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fbm_22.onChildrenAdded();
        String string2 = "textEditorLightBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fby_22);
        }
        fby_22.setScaled(true);
        fqG2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(7);
        fqv10.setPosition(frk_0.i);
        fqv10.setTexture(this.a.c("themeSimple"));
        fqv10.setWidth(20);
        fqv10.setX(400);
        fqv10.setY(157);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqG2.onChildrenAdded();
    }
}

