/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from egz
 */
public class egz_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqh_0 fqh_02 = (fqh_0)fvE3.getAppearance();
        fqh_02.setElementMap(fyy_03);
        fqh_02.setAlignment(frs_0.e);
        fvE2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(0, 0, 1, 0));
        fqh_02.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fqn fqn2 = fqn.checkOut();
        fqn2.setRenderer(fpm_0.b().g().d("fontDefault10Bold"));
        fqn2.setElementMap(fyy_03);
        fqh_02.addBasicElement(fqn2);
        fqn2.onAttributesInitialized();
        fqn2.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("mecanicBlueColor"));
        fqh_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        String string = "labelMoneyBorder";
        fbc_1 fbc_12 = new fbc_1();
        fbc_12.onCheckOut();
        fbc_12.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fbc_12);
        }
        fqh_02.addBasicElement(fbc_12);
        fbc_12.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(6);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(26);
        fqv2.setX(201);
        fqv2.setY(426);
        fbc_12.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(6);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeSimple"));
        fqv3.setWidth(1);
        fqv3.setX(231);
        fqv3.setY(426);
        fbc_12.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(6);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeSimple"));
        fqv4.setWidth(26);
        fqv4.setX(236);
        fqv4.setY(426);
        fbc_12.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(11);
        fqv5.setPosition(frk_0.j);
        fqv5.setTexture(this.a.c("themeSimple"));
        fqv5.setWidth(26);
        fqv5.setX(236);
        fqv5.setY(432);
        fbc_12.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(6);
        fqv6.setPosition(frk_0.q);
        fqv6.setTexture(this.a.c("themeSimple"));
        fqv6.setWidth(26);
        fqv6.setX(236);
        fqv6.setY(443);
        fbc_12.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(6);
        fqv7.setPosition(frk_0.o);
        fqv7.setTexture(this.a.c("themeSimple"));
        fqv7.setWidth(1);
        fqv7.setX(231);
        fqv7.setY(443);
        fbc_12.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(6);
        fqv8.setPosition(frk_0.m);
        fqv8.setTexture(this.a.c("themeSimple"));
        fqv8.setWidth(26);
        fqv8.setX(201);
        fqv8.setY(443);
        fbc_12.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(11);
        fqv9.setPosition(frk_0.h);
        fqv9.setTexture(this.a.c("themeSimple"));
        fqv9.setWidth(26);
        fqv9.setX(201);
        fqv9.setY(432);
        fbc_12.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fbc_12.onChildrenAdded();
        String string2 = "labelMoneyBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fby_22);
        }
        fby_22.setScaled(true);
        fqh_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(11);
        fqv10.setPosition(frk_0.i);
        fqv10.setTexture(this.a.c("themeSimple"));
        fqv10.setWidth(1);
        fqv10.setX(231);
        fqv10.setY(432);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqh_02.onChildrenAdded();
    }
}

