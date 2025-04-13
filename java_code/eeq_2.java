/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from eeQ
 */
public class eeq_2
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
        fqn fqn2 = fqn.checkOut();
        fqn2.setRenderer(fpm_0.b().g().d("fontDefault10Bold"));
        fqn2.setElementMap(fyy_03);
        fqh_02.addBasicElement(fqn2);
        fqn2.onAttributesInitialized();
        fqn2.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("defaultLightColor"));
        fqh_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        String string = "darkBorder";
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
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(4);
        fqv2.setX(31);
        fqv2.setY(152);
        fbc_12.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(4);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeSimple"));
        fqv3.setWidth(12);
        fqv3.setX(35);
        fqv3.setY(152);
        fbc_12.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(4);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeSimple"));
        fqv4.setWidth(4);
        fqv4.setX(47);
        fqv4.setY(152);
        fbc_12.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(12);
        fqv5.setPosition(frk_0.j);
        fqv5.setTexture(this.a.c("themeSimple"));
        fqv5.setWidth(4);
        fqv5.setX(47);
        fqv5.setY(156);
        fbc_12.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(4);
        fqv6.setPosition(frk_0.q);
        fqv6.setTexture(this.a.c("themeSimple"));
        fqv6.setWidth(4);
        fqv6.setX(47);
        fqv6.setY(168);
        fbc_12.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(4);
        fqv7.setPosition(frk_0.o);
        fqv7.setTexture(this.a.c("themeSimple"));
        fqv7.setWidth(12);
        fqv7.setX(35);
        fqv7.setY(168);
        fbc_12.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(4);
        fqv8.setPosition(frk_0.m);
        fqv8.setTexture(this.a.c("themeSimple"));
        fqv8.setWidth(4);
        fqv8.setX(31);
        fqv8.setY(168);
        fbc_12.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(12);
        fqv9.setPosition(frk_0.h);
        fqv9.setTexture(this.a.c("themeSimple"));
        fqv9.setWidth(4);
        fqv9.setX(31);
        fqv9.setY(156);
        fbc_12.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fbc_12.onChildrenAdded();
        String string2 = "darkBackground";
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
        fqv10.setHeight(12);
        fqv10.setPosition(frk_0.i);
        fqv10.setTexture(this.a.c("themeSimple"));
        fqv10.setWidth(12);
        fqv10.setX(35);
        fqv10.setY(156);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqh_02.onChildrenAdded();
    }
}

