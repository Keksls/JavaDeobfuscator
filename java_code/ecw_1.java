/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from ecw
 */
public class ecw_1
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
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
            ((fqn)object2).setRenderer(fpm_0.b().g().d("fontDefault9Bold"));
            ((fyb_0)object2).setElementMap(fyy_03);
            fyb_03.addBasicElement((fyo)object2);
            ((fyo)object2).onAttributesInitialized();
            ((fyb_0)object2).onChildrenAdded();
            fyb_02 = fqg_0.checkOut();
            fyb_02.setElementMap(fyy_03);
            ((fqg_0)fyb_02).setColor(new fyr_0("defaultDarkColor"));
            fyb_03.addBasicElement(fyb_02);
            fyb_02.onAttributesInitialized();
            fyb_02.onChildrenAdded();
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
            fqv fqv2 = fqv.checkOut();
            fqv2.setElementMap(fyy_03);
            if (fyy_03 != null && object != null) {
                fyy_03.a((String)object, fqv2);
            }
            fqv2.setHeight(10);
            fqv2.setPosition(frk_0.i);
            fqv2.setTexture(this.a.c("themeSimple"));
            fqv2.setWidth(10);
            fqv2.setX(1867);
            fqv2.setY(304);
            fyb_02.addBasicElement(fqv2);
            fqv2.onAttributesInitialized();
            fqv2.onChildrenAdded();
        }
        object = new fbf_1();
        ((fbf_1)object).onCheckOut();
        ((fyb_0)object).setElementMap(fyy_03);
        ((fbf_1)object).setColor(new azf_2(0.0f, 0.0f, 0.0f, 0.0f));
        fqG2.addBasicElement((fyo)object);
        ((fyo)object).onAttributesInitialized();
        ((fyb_0)object).onChildrenAdded();
        fqG2.onChildrenAdded();
    }
}

