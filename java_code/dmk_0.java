/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dmk
 */
public class dmk_0
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqd_0 fqd_02 = (fqd_0)fvE3.getAppearance();
        fqd_02.setElementMap(fyy_03);
        fqd_02.setState("default");
        fvE2.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqn fqn2 = fqn.checkOut();
        fqn2.setRenderer(fpm_0.b().g().d("fontDefault16"));
        fqn2.setElementMap(fyy_03);
        fqd_02.addBasicElement(fqn2);
        fqn2.onAttributesInitialized();
        fqn2.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("mainTextDarkColor"));
        fqd_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        fby_22.setScaled(true);
        fqd_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(48);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("txButtonBig48"));
        fqv2.setWidth(5);
        fqv2.setX(0);
        fqv2.setY(0);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(0);
        fqv3.setPosition(frk_0.h);
        fqv3.setTexture(this.a.c("txButtonBig48"));
        fqv3.setWidth(0);
        fqv3.setX(0);
        fqv3.setY(0);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(0);
        fqv4.setPosition(frk_0.m);
        fqv4.setTexture(this.a.c("txButtonBig48"));
        fqv4.setWidth(0);
        fqv4.setX(0);
        fqv4.setY(0);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(48);
        fqv5.setPosition(frk_0.c);
        fqv5.setTexture(this.a.c("txButtonBig48"));
        fqv5.setWidth(1);
        fqv5.setX(24);
        fqv5.setY(0);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(0);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("txButtonBig48"));
        fqv6.setWidth(0);
        fqv6.setX(0);
        fqv6.setY(0);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(0);
        fqv7.setPosition(frk_0.o);
        fqv7.setTexture(this.a.c("txButtonBig48"));
        fqv7.setWidth(0);
        fqv7.setX(0);
        fqv7.setY(0);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(48);
        fqv8.setPosition(frk_0.e);
        fqv8.setTexture(this.a.c("txButtonBig48"));
        fqv8.setWidth(5);
        fqv8.setX(43);
        fqv8.setY(0);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(0);
        fqv9.setPosition(frk_0.j);
        fqv9.setTexture(this.a.c("txButtonBig48"));
        fqv9.setWidth(0);
        fqv9.setX(0);
        fqv9.setY(0);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(0);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("txButtonBig48"));
        fqv10.setWidth(0);
        fqv10.setX(0);
        fqv10.setY(0);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqd_0 fqd_03 = (fqd_0)fvE4.getAppearance();
        fqd_03.setElementMap(fyy_03);
        fqd_03.setState("mouseHover");
        fvE2.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        fby_2 fby_23 = fby_2.checkOut();
        fby_23.setElementMap(fyy_03);
        fby_23.setScaled(true);
        fqd_03.addBasicElement(fby_23);
        fby_23.onAttributesInitialized();
        fqv fqv11 = fqv.checkOut();
        fqv11.setElementMap(fyy_03);
        fqv11.setHeight(48);
        fqv11.setPosition(frk_0.a);
        fqv11.setTexture(this.a.c("txButtonBig48"));
        fqv11.setWidth(5);
        fqv11.setX(0);
        fqv11.setY(50);
        fby_23.addBasicElement(fqv11);
        fqv11.onAttributesInitialized();
        fqv11.onChildrenAdded();
        fqv fqv12 = fqv.checkOut();
        fqv12.setElementMap(fyy_03);
        fqv12.setHeight(0);
        fqv12.setPosition(frk_0.h);
        fqv12.setTexture(this.a.c("txButtonBig48"));
        fqv12.setWidth(0);
        fqv12.setX(0);
        fqv12.setY(0);
        fby_23.addBasicElement(fqv12);
        fqv12.onAttributesInitialized();
        fqv12.onChildrenAdded();
        fqv fqv13 = fqv.checkOut();
        fqv13.setElementMap(fyy_03);
        fqv13.setHeight(0);
        fqv13.setPosition(frk_0.m);
        fqv13.setTexture(this.a.c("txButtonBig48"));
        fqv13.setWidth(0);
        fqv13.setX(0);
        fqv13.setY(0);
        fby_23.addBasicElement(fqv13);
        fqv13.onAttributesInitialized();
        fqv13.onChildrenAdded();
        fqv fqv14 = fqv.checkOut();
        fqv14.setElementMap(fyy_03);
        fqv14.setHeight(48);
        fqv14.setPosition(frk_0.c);
        fqv14.setTexture(this.a.c("txButtonBig48"));
        fqv14.setWidth(1);
        fqv14.setX(24);
        fqv14.setY(50);
        fby_23.addBasicElement(fqv14);
        fqv14.onAttributesInitialized();
        fqv14.onChildrenAdded();
        fqv fqv15 = fqv.checkOut();
        fqv15.setElementMap(fyy_03);
        fqv15.setHeight(0);
        fqv15.setPosition(frk_0.i);
        fqv15.setTexture(this.a.c("txButtonBig48"));
        fqv15.setWidth(0);
        fqv15.setX(0);
        fqv15.setY(0);
        fby_23.addBasicElement(fqv15);
        fqv15.onAttributesInitialized();
        fqv15.onChildrenAdded();
        fqv fqv16 = fqv.checkOut();
        fqv16.setElementMap(fyy_03);
        fqv16.setHeight(0);
        fqv16.setPosition(frk_0.o);
        fqv16.setTexture(this.a.c("txButtonBig48"));
        fqv16.setWidth(0);
        fqv16.setX(0);
        fqv16.setY(0);
        fby_23.addBasicElement(fqv16);
        fqv16.onAttributesInitialized();
        fqv16.onChildrenAdded();
        fqv fqv17 = fqv.checkOut();
        fqv17.setElementMap(fyy_03);
        fqv17.setHeight(48);
        fqv17.setPosition(frk_0.e);
        fqv17.setTexture(this.a.c("txButtonBig48"));
        fqv17.setWidth(5);
        fqv17.setX(43);
        fqv17.setY(50);
        fby_23.addBasicElement(fqv17);
        fqv17.onAttributesInitialized();
        fqv17.onChildrenAdded();
        fqv fqv18 = fqv.checkOut();
        fqv18.setElementMap(fyy_03);
        fqv18.setHeight(0);
        fqv18.setPosition(frk_0.j);
        fqv18.setTexture(this.a.c("txButtonBig48"));
        fqv18.setWidth(0);
        fqv18.setX(0);
        fqv18.setY(0);
        fby_23.addBasicElement(fqv18);
        fqv18.onAttributesInitialized();
        fqv18.onChildrenAdded();
        fqv fqv19 = fqv.checkOut();
        fqv19.setElementMap(fyy_03);
        fqv19.setHeight(0);
        fqv19.setPosition(frk_0.q);
        fqv19.setTexture(this.a.c("txButtonBig48"));
        fqv19.setWidth(0);
        fqv19.setX(0);
        fqv19.setY(0);
        fby_23.addBasicElement(fqv19);
        fqv19.onAttributesInitialized();
        fqv19.onChildrenAdded();
        fby_23.onChildrenAdded();
        fqd_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqd_0 fqd_04 = (fqd_0)fvE5.getAppearance();
        fqd_04.setElementMap(fyy_03);
        fqd_04.setState("pressed");
        fvE2.addBasicElement(fqd_04);
        fqd_04.onAttributesInitialized();
        fby_2 fby_24 = fby_2.checkOut();
        fby_24.setElementMap(fyy_03);
        fby_24.setScaled(true);
        fqd_04.addBasicElement(fby_24);
        fby_24.onAttributesInitialized();
        fqv fqv20 = fqv.checkOut();
        fqv20.setElementMap(fyy_03);
        fqv20.setHeight(48);
        fqv20.setPosition(frk_0.a);
        fqv20.setTexture(this.a.c("txButtonBig48"));
        fqv20.setWidth(5);
        fqv20.setX(0);
        fqv20.setY(100);
        fby_24.addBasicElement(fqv20);
        fqv20.onAttributesInitialized();
        fqv20.onChildrenAdded();
        fqv fqv21 = fqv.checkOut();
        fqv21.setElementMap(fyy_03);
        fqv21.setHeight(0);
        fqv21.setPosition(frk_0.h);
        fqv21.setTexture(this.a.c("txButtonBig48"));
        fqv21.setWidth(0);
        fqv21.setX(0);
        fqv21.setY(0);
        fby_24.addBasicElement(fqv21);
        fqv21.onAttributesInitialized();
        fqv21.onChildrenAdded();
        fqv fqv22 = fqv.checkOut();
        fqv22.setElementMap(fyy_03);
        fqv22.setHeight(0);
        fqv22.setPosition(frk_0.m);
        fqv22.setTexture(this.a.c("txButtonBig48"));
        fqv22.setWidth(0);
        fqv22.setX(0);
        fqv22.setY(0);
        fby_24.addBasicElement(fqv22);
        fqv22.onAttributesInitialized();
        fqv22.onChildrenAdded();
        fqv fqv23 = fqv.checkOut();
        fqv23.setElementMap(fyy_03);
        fqv23.setHeight(48);
        fqv23.setPosition(frk_0.c);
        fqv23.setTexture(this.a.c("txButtonBig48"));
        fqv23.setWidth(1);
        fqv23.setX(24);
        fqv23.setY(100);
        fby_24.addBasicElement(fqv23);
        fqv23.onAttributesInitialized();
        fqv23.onChildrenAdded();
        fqv fqv24 = fqv.checkOut();
        fqv24.setElementMap(fyy_03);
        fqv24.setHeight(0);
        fqv24.setPosition(frk_0.i);
        fqv24.setTexture(this.a.c("txButtonBig48"));
        fqv24.setWidth(0);
        fqv24.setX(0);
        fqv24.setY(0);
        fby_24.addBasicElement(fqv24);
        fqv24.onAttributesInitialized();
        fqv24.onChildrenAdded();
        fqv fqv25 = fqv.checkOut();
        fqv25.setElementMap(fyy_03);
        fqv25.setHeight(0);
        fqv25.setPosition(frk_0.o);
        fqv25.setTexture(this.a.c("txButtonBig48"));
        fqv25.setWidth(0);
        fqv25.setX(0);
        fqv25.setY(0);
        fby_24.addBasicElement(fqv25);
        fqv25.onAttributesInitialized();
        fqv25.onChildrenAdded();
        fqv fqv26 = fqv.checkOut();
        fqv26.setElementMap(fyy_03);
        fqv26.setHeight(48);
        fqv26.setPosition(frk_0.e);
        fqv26.setTexture(this.a.c("txButtonBig48"));
        fqv26.setWidth(5);
        fqv26.setX(43);
        fqv26.setY(100);
        fby_24.addBasicElement(fqv26);
        fqv26.onAttributesInitialized();
        fqv26.onChildrenAdded();
        fqv fqv27 = fqv.checkOut();
        fqv27.setElementMap(fyy_03);
        fqv27.setHeight(0);
        fqv27.setPosition(frk_0.j);
        fqv27.setTexture(this.a.c("txButtonBig48"));
        fqv27.setWidth(0);
        fqv27.setX(0);
        fqv27.setY(0);
        fby_24.addBasicElement(fqv27);
        fqv27.onAttributesInitialized();
        fqv27.onChildrenAdded();
        fqv fqv28 = fqv.checkOut();
        fqv28.setElementMap(fyy_03);
        fqv28.setHeight(0);
        fqv28.setPosition(frk_0.q);
        fqv28.setTexture(this.a.c("txButtonBig48"));
        fqv28.setWidth(0);
        fqv28.setX(0);
        fqv28.setY(0);
        fby_24.addBasicElement(fqv28);
        fqv28.onAttributesInitialized();
        fqv28.onChildrenAdded();
        fby_24.onChildrenAdded();
        fqd_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqd_0 fqd_05 = (fqd_0)fvE6.getAppearance();
        fqd_05.setElementMap(fyy_03);
        fqd_05.setState("disabled");
        fvE2.addBasicElement(fqd_05);
        fqd_05.onAttributesInitialized();
        fqg_0 fqg_03 = fqg_0.checkOut();
        fqg_03.setElementMap(fyy_03);
        fqg_03.setColor(new fyr_0("disabledTextColor"));
        fqd_05.addBasicElement(fqg_03);
        fqg_03.onAttributesInitialized();
        fqg_03.onChildrenAdded();
        fby_2 fby_25 = fby_2.checkOut();
        fby_25.setElementMap(fyy_03);
        fby_25.setScaled(true);
        fqd_05.addBasicElement(fby_25);
        fby_25.onAttributesInitialized();
        fqv fqv29 = fqv.checkOut();
        fqv29.setElementMap(fyy_03);
        fqv29.setHeight(48);
        fqv29.setPosition(frk_0.a);
        fqv29.setTexture(this.a.c("txButtonBig48"));
        fqv29.setWidth(5);
        fqv29.setX(0);
        fqv29.setY(150);
        fby_25.addBasicElement(fqv29);
        fqv29.onAttributesInitialized();
        fqv29.onChildrenAdded();
        fqv fqv30 = fqv.checkOut();
        fqv30.setElementMap(fyy_03);
        fqv30.setHeight(0);
        fqv30.setPosition(frk_0.h);
        fqv30.setTexture(this.a.c("txButtonBig48"));
        fqv30.setWidth(0);
        fqv30.setX(0);
        fqv30.setY(0);
        fby_25.addBasicElement(fqv30);
        fqv30.onAttributesInitialized();
        fqv30.onChildrenAdded();
        fqv fqv31 = fqv.checkOut();
        fqv31.setElementMap(fyy_03);
        fqv31.setHeight(0);
        fqv31.setPosition(frk_0.m);
        fqv31.setTexture(this.a.c("txButtonBig48"));
        fqv31.setWidth(0);
        fqv31.setX(0);
        fqv31.setY(0);
        fby_25.addBasicElement(fqv31);
        fqv31.onAttributesInitialized();
        fqv31.onChildrenAdded();
        fqv fqv32 = fqv.checkOut();
        fqv32.setElementMap(fyy_03);
        fqv32.setHeight(48);
        fqv32.setPosition(frk_0.c);
        fqv32.setTexture(this.a.c("txButtonBig48"));
        fqv32.setWidth(1);
        fqv32.setX(24);
        fqv32.setY(150);
        fby_25.addBasicElement(fqv32);
        fqv32.onAttributesInitialized();
        fqv32.onChildrenAdded();
        fqv fqv33 = fqv.checkOut();
        fqv33.setElementMap(fyy_03);
        fqv33.setHeight(0);
        fqv33.setPosition(frk_0.i);
        fqv33.setTexture(this.a.c("txButtonBig48"));
        fqv33.setWidth(0);
        fqv33.setX(0);
        fqv33.setY(0);
        fby_25.addBasicElement(fqv33);
        fqv33.onAttributesInitialized();
        fqv33.onChildrenAdded();
        fqv fqv34 = fqv.checkOut();
        fqv34.setElementMap(fyy_03);
        fqv34.setHeight(0);
        fqv34.setPosition(frk_0.o);
        fqv34.setTexture(this.a.c("txButtonBig48"));
        fqv34.setWidth(0);
        fqv34.setX(0);
        fqv34.setY(0);
        fby_25.addBasicElement(fqv34);
        fqv34.onAttributesInitialized();
        fqv34.onChildrenAdded();
        fqv fqv35 = fqv.checkOut();
        fqv35.setElementMap(fyy_03);
        fqv35.setHeight(48);
        fqv35.setPosition(frk_0.e);
        fqv35.setTexture(this.a.c("txButtonBig48"));
        fqv35.setWidth(5);
        fqv35.setX(43);
        fqv35.setY(150);
        fby_25.addBasicElement(fqv35);
        fqv35.onAttributesInitialized();
        fqv35.onChildrenAdded();
        fqv fqv36 = fqv.checkOut();
        fqv36.setElementMap(fyy_03);
        fqv36.setHeight(0);
        fqv36.setPosition(frk_0.j);
        fqv36.setTexture(this.a.c("txButtonBig48"));
        fqv36.setWidth(0);
        fqv36.setX(0);
        fqv36.setY(0);
        fby_25.addBasicElement(fqv36);
        fqv36.onAttributesInitialized();
        fqv36.onChildrenAdded();
        fqv fqv37 = fqv.checkOut();
        fqv37.setElementMap(fyy_03);
        fqv37.setHeight(0);
        fqv37.setPosition(frk_0.q);
        fqv37.setTexture(this.a.c("txButtonBig48"));
        fqv37.setWidth(0);
        fqv37.setX(0);
        fqv37.setY(0);
        fby_25.addBasicElement(fqv37);
        fqv37.onAttributesInitialized();
        fqv37.onChildrenAdded();
        fby_25.onChildrenAdded();
        fqd_05.onChildrenAdded();
    }
}

