/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class dVj
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        fyb_0 fyb_02;
        fyg_0 fyg_02;
        fyb_0 fyb_03;
        fyb_0 fyb_04;
        fyg_0 fyg_03;
        fyb_0 fyb_05;
        fyb_0 fyb_06;
        fyb_0 fyb_07;
        fvE fvE3;
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE4 = fvE2;
        fqj fqj2 = fvE4.getAppearance();
        fqj2.setElementMap(fyy_03);
        fvE2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fvE fvE5 = fqj2.getParentOfType(fvE.class);
        fvE fvE6 = fvE5.getWidgetByThemeElementName("decreaseButton", false);
        if (fvE6 != null) {
            fvE3 = fvE6;
            fyb_07 = (fqd_0)fvE3.getAppearance();
            fyb_07.setElementMap(fyy_03);
            ((fqh_0)fyb_07).setAlignment(frs_0.e);
            ((fqj)fyb_07).setState("default");
            fvE6.addBasicElement(fyb_07);
            fyb_07.onAttributesInitialized();
            fyb_06 = fqv.checkOut();
            fyb_06.setElementMap(fyy_03);
            ((fqv)fyb_06).setHeight(30);
            ((fqv)fyb_06).setPosition(frk_0.i);
            ((fqv)fyb_06).setTexture(this.a.c("themeDefault"));
            ((fqv)fyb_06).setWidth(28);
            ((fqv)fyb_06).setX(217);
            ((fqv)fyb_06).setY(490);
            fyb_07.addBasicElement(fyb_06);
            fyb_06.onAttributesInitialized();
            fyb_06.onChildrenAdded();
            fyb_07.onChildrenAdded();
            fyb_05 = fvE6;
            fyg_03 = (fqd_0)((fvE)fyb_05).getAppearance();
            fyg_03.setElementMap(fyy_03);
            ((fqh_0)fyg_03).setAlignment(frs_0.e);
            ((fqj)fyg_03).setState("mouseHover");
            fvE6.addBasicElement(fyg_03);
            fyg_03.onAttributesInitialized();
            fyb_04 = fqv.checkOut();
            fyb_04.setElementMap(fyy_03);
            ((fqv)fyb_04).setHeight(30);
            ((fqv)fyb_04).setPosition(frk_0.i);
            ((fqv)fyb_04).setTexture(this.a.c("themeOver"));
            ((fqv)fyb_04).setWidth(28);
            ((fqv)fyb_04).setX(217);
            ((fqv)fyb_04).setY(490);
            fyg_03.addBasicElement(fyb_04);
            fyb_04.onAttributesInitialized();
            fyb_04.onChildrenAdded();
            fyg_03.onChildrenAdded();
            fyb_03 = fvE6;
            fyg_02 = (fqd_0)((fvE)fyb_03).getAppearance();
            fyg_02.setElementMap(fyy_03);
            ((fqh_0)fyg_02).setAlignment(frs_0.e);
            ((fqj)fyg_02).setState("pressed");
            fvE6.addBasicElement(fyg_02);
            fyg_02.onAttributesInitialized();
            fyb_02 = fqv.checkOut();
            fyb_02.setElementMap(fyy_03);
            ((fqv)fyb_02).setHeight(30);
            ((fqv)fyb_02).setPosition(frk_0.i);
            ((fqv)fyb_02).setTexture(this.a.c("themePressed"));
            ((fqv)fyb_02).setWidth(28);
            ((fqv)fyb_02).setX(217);
            ((fqv)fyb_02).setY(490);
            fyg_02.addBasicElement(fyb_02);
            fyb_02.onAttributesInitialized();
            fyb_02.onChildrenAdded();
            fyg_02.onChildrenAdded();
        }
        if ((fyb_07 = (fvE3 = fqj2.getParentOfType(fvE.class)).getWidgetByThemeElementName("increaseButton", false)) != null) {
            fyb_06 = (fvE)fyb_07;
            fyb_05 = (fqd_0)((fvE)fyb_06).getAppearance();
            fyb_05.setElementMap(fyy_03);
            ((fqh_0)fyb_05).setAlignment(frs_0.e);
            ((fqj)fyb_05).setState("default");
            fyb_07.addBasicElement(fyb_05);
            fyb_05.onAttributesInitialized();
            fyg_03 = fqv.checkOut();
            fyg_03.setElementMap(fyy_03);
            ((fqv)fyg_03).setHeight(30);
            ((fqv)fyg_03).setPosition(frk_0.i);
            ((fqv)fyg_03).setTexture(this.a.c("themeDefault"));
            ((fqv)fyg_03).setWidth(28);
            ((fqv)fyg_03).setX(217);
            ((fqv)fyg_03).setY(541);
            fyb_05.addBasicElement(fyg_03);
            fyg_03.onAttributesInitialized();
            fyg_03.onChildrenAdded();
            fyb_05.onChildrenAdded();
            fyb_04 = (fvE)fyb_07;
            fyb_03 = (fqd_0)((fvE)fyb_04).getAppearance();
            fyb_03.setElementMap(fyy_03);
            ((fqh_0)fyb_03).setAlignment(frs_0.e);
            ((fqj)fyb_03).setState("mouseHover");
            fyb_07.addBasicElement(fyb_03);
            fyb_03.onAttributesInitialized();
            fyg_02 = fqv.checkOut();
            fyg_02.setElementMap(fyy_03);
            ((fqv)fyg_02).setHeight(30);
            ((fqv)fyg_02).setPosition(frk_0.i);
            ((fqv)fyg_02).setTexture(this.a.c("themeOver"));
            ((fqv)fyg_02).setWidth(28);
            ((fqv)fyg_02).setX(217);
            ((fqv)fyg_02).setY(541);
            fyb_03.addBasicElement(fyg_02);
            fyg_02.onAttributesInitialized();
            fyg_02.onChildrenAdded();
            fyb_03.onChildrenAdded();
            fyb_02 = (fvE)fyb_07;
            fqd_0 fqd_02 = (fqd_0)((fvE)fyb_02).getAppearance();
            fqd_02.setElementMap(fyy_03);
            fqd_02.setAlignment(frs_0.e);
            fqd_02.setState("pressed");
            fyb_07.addBasicElement(fqd_02);
            fqd_02.onAttributesInitialized();
            fqv fqv2 = fqv.checkOut();
            fqv2.setElementMap(fyy_03);
            fqv2.setHeight(30);
            fqv2.setPosition(frk_0.i);
            fqv2.setTexture(this.a.c("themePressed"));
            fqv2.setWidth(28);
            fqv2.setX(217);
            fqv2.setY(541);
            fqd_02.addBasicElement(fqv2);
            fqv2.onAttributesInitialized();
            fqv2.onChildrenAdded();
            fqd_02.onChildrenAdded();
        }
        fqj2.onChildrenAdded();
    }
}

