/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dsZ
 */
public class dsz_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqj_0 fqj_02 = (fqj_0)fvE3.getAppearance();
        fqj_02.setElementMap(fyy_03);
        fqj_02.setAlignment(frs_0.d);
        fqj_02.setState("default");
        fvE2.addBasicElement(fqj_02);
        fqj_02.onAttributesInitialized();
        fqn fqn2 = fqn.checkOut();
        fqn2.setRenderer(fpm_0.b().g().d("fontDefault10"));
        fqn2.setElementMap(fyy_03);
        fqj_02.addBasicElement(fqn2);
        fqn2.onAttributesInitialized();
        fqn2.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("defaultLightColor"));
        fqj_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(20);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(20);
        fqv2.setX(363);
        fqv2.setY(61);
        fqj_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqj_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqj_0 fqj_03 = (fqj_0)fvE4.getAppearance();
        fqj_03.setElementMap(fyy_03);
        fqj_03.setAlignment(frs_0.d);
        fqj_03.setState("mouseHover");
        fvE2.addBasicElement(fqj_03);
        fqj_03.onAttributesInitialized();
        fqn fqn3 = fqn.checkOut();
        fqn3.setRenderer(fpm_0.b().g().d("fontDefault10"));
        fqn3.setElementMap(fyy_03);
        fqj_03.addBasicElement(fqn3);
        fqn3.onAttributesInitialized();
        fqn3.onChildrenAdded();
        fqg_0 fqg_03 = fqg_0.checkOut();
        fqg_03.setElementMap(fyy_03);
        fqg_03.setColor(new fyr_0("defaultLightColor"));
        fqj_03.addBasicElement(fqg_03);
        fqg_03.onAttributesInitialized();
        fqg_03.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(20);
        fqv3.setPosition(frk_0.i);
        fqv3.setTexture(this.a.c("themeOver"));
        fqv3.setWidth(20);
        fqv3.setX(363);
        fqv3.setY(61);
        fqj_03.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqj_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqj_0 fqj_04 = (fqj_0)fvE5.getAppearance();
        fqj_04.setElementMap(fyy_03);
        fqj_04.setAlignment(frs_0.d);
        fqj_04.setState("pressed");
        fvE2.addBasicElement(fqj_04);
        fqj_04.onAttributesInitialized();
        fqn fqn4 = fqn.checkOut();
        fqn4.setRenderer(fpm_0.b().g().d("fontDefault10"));
        fqn4.setElementMap(fyy_03);
        fqj_04.addBasicElement(fqn4);
        fqn4.onAttributesInitialized();
        fqn4.onChildrenAdded();
        fqg_0 fqg_04 = fqg_0.checkOut();
        fqg_04.setElementMap(fyy_03);
        fqg_04.setColor(new fyr_0("defaultLightColor"));
        fqj_04.addBasicElement(fqg_04);
        fqg_04.onAttributesInitialized();
        fqg_04.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(20);
        fqv4.setPosition(frk_0.i);
        fqv4.setTexture(this.a.c("themePressed"));
        fqv4.setWidth(20);
        fqv4.setX(363);
        fqv4.setY(61);
        fqj_04.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqj_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqj_0 fqj_05 = (fqj_0)fvE6.getAppearance();
        fqj_05.setElementMap(fyy_03);
        fqj_05.setAlignment(frs_0.d);
        fqj_05.setState("selected");
        fvE2.addBasicElement(fqj_05);
        fqj_05.onAttributesInitialized();
        fqn fqn5 = fqn.checkOut();
        fqn5.setRenderer(fpm_0.b().g().d("fontDefault10"));
        fqn5.setElementMap(fyy_03);
        fqj_05.addBasicElement(fqn5);
        fqn5.onAttributesInitialized();
        fqn5.onChildrenAdded();
        fqg_0 fqg_05 = fqg_0.checkOut();
        fqg_05.setElementMap(fyy_03);
        fqg_05.setColor(new fyr_0("defaultLightColor"));
        fqj_05.addBasicElement(fqg_05);
        fqg_05.onAttributesInitialized();
        fqg_05.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(20);
        fqv5.setPosition(frk_0.i);
        fqv5.setTexture(this.a.c("themeDefaultSelected"));
        fqv5.setWidth(20);
        fqv5.setX(363);
        fqv5.setY(61);
        fqj_05.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqj_05.onChildrenAdded();
        fvE fvE7 = fvE2;
        fqj_0 fqj_06 = (fqj_0)fvE7.getAppearance();
        fqj_06.setElementMap(fyy_03);
        fqj_06.setAlignment(frs_0.d);
        fqj_06.setState("mouseHoverSelected");
        fvE2.addBasicElement(fqj_06);
        fqj_06.onAttributesInitialized();
        fqn fqn6 = fqn.checkOut();
        fqn6.setRenderer(fpm_0.b().g().d("fontDefault10"));
        fqn6.setElementMap(fyy_03);
        fqj_06.addBasicElement(fqn6);
        fqn6.onAttributesInitialized();
        fqn6.onChildrenAdded();
        fqg_0 fqg_06 = fqg_0.checkOut();
        fqg_06.setElementMap(fyy_03);
        fqg_06.setColor(new fyr_0("defaultLightColor"));
        fqj_06.addBasicElement(fqg_06);
        fqg_06.onAttributesInitialized();
        fqg_06.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(20);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("themeOverSelected"));
        fqv6.setWidth(20);
        fqv6.setX(363);
        fqv6.setY(61);
        fqj_06.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqj_06.onChildrenAdded();
        fvE fvE8 = fvE2;
        fqj_0 fqj_07 = (fqj_0)fvE8.getAppearance();
        fqj_07.setElementMap(fyy_03);
        fqj_07.setAlignment(frs_0.d);
        fqj_07.setState("pressedSelected");
        fvE2.addBasicElement(fqj_07);
        fqj_07.onAttributesInitialized();
        fqn fqn7 = fqn.checkOut();
        fqn7.setRenderer(fpm_0.b().g().d("fontDefault10"));
        fqn7.setElementMap(fyy_03);
        fqj_07.addBasicElement(fqn7);
        fqn7.onAttributesInitialized();
        fqn7.onChildrenAdded();
        fqg_0 fqg_07 = fqg_0.checkOut();
        fqg_07.setElementMap(fyy_03);
        fqg_07.setColor(new fyr_0("defaultLightColor"));
        fqj_07.addBasicElement(fqg_07);
        fqg_07.onAttributesInitialized();
        fqg_07.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(20);
        fqv7.setPosition(frk_0.i);
        fqv7.setTexture(this.a.c("themePressedSelected"));
        fqv7.setWidth(20);
        fqv7.setX(363);
        fqv7.setY(61);
        fqj_07.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqj_07.onChildrenAdded();
    }
}

