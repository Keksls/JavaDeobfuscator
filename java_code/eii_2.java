/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from eii
 */
public class eii_2
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
        fqh_02.setAlignment(frs_0.d);
        fvE2.addBasicElement(fqh_02);
        fqh_02.onAttributesInitialized();
        fqn fqn2 = fqn.checkOut();
        fqn2.setRenderer(fpm_0.b().g().d("fontDefault14Bold"));
        fqn2.setElementMap(fyy_03);
        fqh_02.addBasicElement(fqn2);
        fqn2.onAttributesInitialized();
        fqn2.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("mainTextLightColor"));
        fqh_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        String string = "pmbRed100";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqh_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(3);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("txRed100Background"));
        fqv2.setWidth(3);
        fqv2.setX(0);
        fqv2.setY(0);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(1);
        fqv3.setPosition(frk_0.h);
        fqv3.setTexture(this.a.c("txRed100Background"));
        fqv3.setWidth(3);
        fqv3.setX(0);
        fqv3.setY(16);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(3);
        fqv4.setPosition(frk_0.m);
        fqv4.setTexture(this.a.c("txRed100Background"));
        fqv4.setWidth(3);
        fqv4.setX(0);
        fqv4.setY(29);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(3);
        fqv5.setPosition(frk_0.c);
        fqv5.setTexture(this.a.c("txRed100Background"));
        fqv5.setWidth(1);
        fqv5.setX(16);
        fqv5.setY(0);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(1);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("txRed100Background"));
        fqv6.setWidth(1);
        fqv6.setX(16);
        fqv6.setY(16);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(3);
        fqv7.setPosition(frk_0.o);
        fqv7.setTexture(this.a.c("txRed100Background"));
        fqv7.setWidth(1);
        fqv7.setX(16);
        fqv7.setY(29);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(3);
        fqv8.setPosition(frk_0.e);
        fqv8.setTexture(this.a.c("txRed100Background"));
        fqv8.setWidth(3);
        fqv8.setX(29);
        fqv8.setY(0);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(1);
        fqv9.setPosition(frk_0.j);
        fqv9.setTexture(this.a.c("txRed100Background"));
        fqv9.setWidth(3);
        fqv9.setX(29);
        fqv9.setY(16);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(3);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("txRed100Background"));
        fqv10.setWidth(3);
        fqv10.setX(29);
        fqv10.setY(29);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqh_02.onChildrenAdded();
    }
}

