/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dlW
 */
public class dlw_0
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
        fqd_02.setAlignment(frs_0.e);
        fqd_02.setState("default");
        fvE2.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fqn fqn2 = fqn.checkOut();
        fqn2.setRenderer(fpm_0.b().g().d("fontDefault14Bold"));
        fqn2.setElementMap(fyy_03);
        fqd_02.addBasicElement(fqn2);
        fqn2.onAttributesInitialized();
        fqn2.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("whiteColor"));
        fqd_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        String string = "ankamaButtonBackgroundDefault";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fby_22);
        }
        fqd_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(48);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(49);
        fqv2.setX(795);
        fqv2.setY(796);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(48);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeDefault"));
        fqv3.setWidth(1);
        fqv3.setX(847);
        fqv3.setY(796);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(48);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeDefault"));
        fqv4.setWidth(11);
        fqv4.setX(851);
        fqv4.setY(796);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(0);
        fqv5.setPosition(frk_0.j);
        fqv5.setTexture(this.a.c("themeDefault"));
        fqv5.setWidth(11);
        fqv5.setX(851);
        fqv5.setY(6);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(0);
        fqv6.setPosition(frk_0.q);
        fqv6.setTexture(this.a.c("themeDefault"));
        fqv6.setWidth(11);
        fqv6.setX(872);
        fqv6.setY(20);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(0);
        fqv7.setPosition(frk_0.o);
        fqv7.setTexture(this.a.c("themeDefault"));
        fqv7.setWidth(1);
        fqv7.setX(847);
        fqv7.setY(20);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(0);
        fqv8.setPosition(frk_0.m);
        fqv8.setTexture(this.a.c("themeDefault"));
        fqv8.setWidth(49);
        fqv8.setX(795);
        fqv8.setY(20);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(0);
        fqv9.setPosition(frk_0.h);
        fqv9.setTexture(this.a.c("themeDefault"));
        fqv9.setWidth(49);
        fqv9.setX(795);
        fqv9.setY(6);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(0);
        fqv10.setPosition(frk_0.i);
        fqv10.setTexture(this.a.c("themeDefault"));
        fqv10.setWidth(1);
        fqv10.setX(847);
        fqv10.setY(6);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqd_0 fqd_03 = (fqd_0)fvE4.getAppearance();
        fqd_03.setElementMap(fyy_03);
        fqd_03.setAlignment(frs_0.e);
        fqd_03.setState("mouseHover");
        fvE2.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        fqg_0 fqg_03 = fqg_0.checkOut();
        fqg_03.setElementMap(fyy_03);
        fqg_03.setColor(new fyr_0("whiteColor"));
        fqd_03.addBasicElement(fqg_03);
        fqg_03.onAttributesInitialized();
        fqg_03.onChildrenAdded();
        String string2 = "ankamaButtonBackgroundOver";
        fby_2 fby_23 = fby_2.checkOut();
        fby_23.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fby_23);
        }
        fqd_03.addBasicElement(fby_23);
        fby_23.onAttributesInitialized();
        fqv fqv11 = fqv.checkOut();
        fqv11.setElementMap(fyy_03);
        fqv11.setHeight(48);
        fqv11.setPosition(frk_0.a);
        fqv11.setTexture(this.a.c("themeOver"));
        fqv11.setWidth(49);
        fqv11.setX(795);
        fqv11.setY(796);
        fby_23.addBasicElement(fqv11);
        fqv11.onAttributesInitialized();
        fqv11.onChildrenAdded();
        fqv fqv12 = fqv.checkOut();
        fqv12.setElementMap(fyy_03);
        fqv12.setHeight(48);
        fqv12.setPosition(frk_0.c);
        fqv12.setTexture(this.a.c("themeOver"));
        fqv12.setWidth(1);
        fqv12.setX(847);
        fqv12.setY(796);
        fby_23.addBasicElement(fqv12);
        fqv12.onAttributesInitialized();
        fqv12.onChildrenAdded();
        fqv fqv13 = fqv.checkOut();
        fqv13.setElementMap(fyy_03);
        fqv13.setHeight(48);
        fqv13.setPosition(frk_0.e);
        fqv13.setTexture(this.a.c("themeOver"));
        fqv13.setWidth(11);
        fqv13.setX(851);
        fqv13.setY(796);
        fby_23.addBasicElement(fqv13);
        fqv13.onAttributesInitialized();
        fqv13.onChildrenAdded();
        fqv fqv14 = fqv.checkOut();
        fqv14.setElementMap(fyy_03);
        fqv14.setHeight(0);
        fqv14.setPosition(frk_0.j);
        fqv14.setTexture(this.a.c("themeOver"));
        fqv14.setWidth(11);
        fqv14.setX(851);
        fqv14.setY(6);
        fby_23.addBasicElement(fqv14);
        fqv14.onAttributesInitialized();
        fqv14.onChildrenAdded();
        fqv fqv15 = fqv.checkOut();
        fqv15.setElementMap(fyy_03);
        fqv15.setHeight(0);
        fqv15.setPosition(frk_0.q);
        fqv15.setTexture(this.a.c("themeOver"));
        fqv15.setWidth(11);
        fqv15.setX(872);
        fqv15.setY(20);
        fby_23.addBasicElement(fqv15);
        fqv15.onAttributesInitialized();
        fqv15.onChildrenAdded();
        fqv fqv16 = fqv.checkOut();
        fqv16.setElementMap(fyy_03);
        fqv16.setHeight(0);
        fqv16.setPosition(frk_0.o);
        fqv16.setTexture(this.a.c("themeOver"));
        fqv16.setWidth(1);
        fqv16.setX(847);
        fqv16.setY(20);
        fby_23.addBasicElement(fqv16);
        fqv16.onAttributesInitialized();
        fqv16.onChildrenAdded();
        fqv fqv17 = fqv.checkOut();
        fqv17.setElementMap(fyy_03);
        fqv17.setHeight(0);
        fqv17.setPosition(frk_0.m);
        fqv17.setTexture(this.a.c("themeOver"));
        fqv17.setWidth(49);
        fqv17.setX(795);
        fqv17.setY(20);
        fby_23.addBasicElement(fqv17);
        fqv17.onAttributesInitialized();
        fqv17.onChildrenAdded();
        fqv fqv18 = fqv.checkOut();
        fqv18.setElementMap(fyy_03);
        fqv18.setHeight(0);
        fqv18.setPosition(frk_0.h);
        fqv18.setTexture(this.a.c("themeOver"));
        fqv18.setWidth(49);
        fqv18.setX(795);
        fqv18.setY(6);
        fby_23.addBasicElement(fqv18);
        fqv18.onAttributesInitialized();
        fqv18.onChildrenAdded();
        fqv fqv19 = fqv.checkOut();
        fqv19.setElementMap(fyy_03);
        fqv19.setHeight(0);
        fqv19.setPosition(frk_0.i);
        fqv19.setTexture(this.a.c("themeOver"));
        fqv19.setWidth(1);
        fqv19.setX(847);
        fqv19.setY(6);
        fby_23.addBasicElement(fqv19);
        fqv19.onAttributesInitialized();
        fqv19.onChildrenAdded();
        fby_23.onChildrenAdded();
        fqd_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqd_0 fqd_04 = (fqd_0)fvE5.getAppearance();
        fqd_04.setElementMap(fyy_03);
        fqd_04.setAlignment(frs_0.e);
        fqd_04.setState("pressed");
        fvE2.addBasicElement(fqd_04);
        fqd_04.onAttributesInitialized();
        fqg_0 fqg_04 = fqg_0.checkOut();
        fqg_04.setElementMap(fyy_03);
        fqg_04.setColor(new fyr_0("whiteColor"));
        fqd_04.addBasicElement(fqg_04);
        fqg_04.onAttributesInitialized();
        fqg_04.onChildrenAdded();
        String string3 = "ankamaButtonBackgroundPressed";
        fby_2 fby_24 = fby_2.checkOut();
        fby_24.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fby_24);
        }
        fqd_04.addBasicElement(fby_24);
        fby_24.onAttributesInitialized();
        fqv fqv20 = fqv.checkOut();
        fqv20.setElementMap(fyy_03);
        fqv20.setHeight(48);
        fqv20.setPosition(frk_0.a);
        fqv20.setTexture(this.a.c("themePressed"));
        fqv20.setWidth(49);
        fqv20.setX(795);
        fqv20.setY(796);
        fby_24.addBasicElement(fqv20);
        fqv20.onAttributesInitialized();
        fqv20.onChildrenAdded();
        fqv fqv21 = fqv.checkOut();
        fqv21.setElementMap(fyy_03);
        fqv21.setHeight(48);
        fqv21.setPosition(frk_0.c);
        fqv21.setTexture(this.a.c("themePressed"));
        fqv21.setWidth(1);
        fqv21.setX(847);
        fqv21.setY(796);
        fby_24.addBasicElement(fqv21);
        fqv21.onAttributesInitialized();
        fqv21.onChildrenAdded();
        fqv fqv22 = fqv.checkOut();
        fqv22.setElementMap(fyy_03);
        fqv22.setHeight(48);
        fqv22.setPosition(frk_0.e);
        fqv22.setTexture(this.a.c("themePressed"));
        fqv22.setWidth(11);
        fqv22.setX(851);
        fqv22.setY(796);
        fby_24.addBasicElement(fqv22);
        fqv22.onAttributesInitialized();
        fqv22.onChildrenAdded();
        fqv fqv23 = fqv.checkOut();
        fqv23.setElementMap(fyy_03);
        fqv23.setHeight(0);
        fqv23.setPosition(frk_0.j);
        fqv23.setTexture(this.a.c("themePressed"));
        fqv23.setWidth(11);
        fqv23.setX(851);
        fqv23.setY(6);
        fby_24.addBasicElement(fqv23);
        fqv23.onAttributesInitialized();
        fqv23.onChildrenAdded();
        fqv fqv24 = fqv.checkOut();
        fqv24.setElementMap(fyy_03);
        fqv24.setHeight(0);
        fqv24.setPosition(frk_0.q);
        fqv24.setTexture(this.a.c("themePressed"));
        fqv24.setWidth(11);
        fqv24.setX(872);
        fqv24.setY(20);
        fby_24.addBasicElement(fqv24);
        fqv24.onAttributesInitialized();
        fqv24.onChildrenAdded();
        fqv fqv25 = fqv.checkOut();
        fqv25.setElementMap(fyy_03);
        fqv25.setHeight(0);
        fqv25.setPosition(frk_0.o);
        fqv25.setTexture(this.a.c("themePressed"));
        fqv25.setWidth(1);
        fqv25.setX(847);
        fqv25.setY(20);
        fby_24.addBasicElement(fqv25);
        fqv25.onAttributesInitialized();
        fqv25.onChildrenAdded();
        fqv fqv26 = fqv.checkOut();
        fqv26.setElementMap(fyy_03);
        fqv26.setHeight(0);
        fqv26.setPosition(frk_0.m);
        fqv26.setTexture(this.a.c("themePressed"));
        fqv26.setWidth(49);
        fqv26.setX(795);
        fqv26.setY(20);
        fby_24.addBasicElement(fqv26);
        fqv26.onAttributesInitialized();
        fqv26.onChildrenAdded();
        fqv fqv27 = fqv.checkOut();
        fqv27.setElementMap(fyy_03);
        fqv27.setHeight(0);
        fqv27.setPosition(frk_0.h);
        fqv27.setTexture(this.a.c("themePressed"));
        fqv27.setWidth(49);
        fqv27.setX(795);
        fqv27.setY(6);
        fby_24.addBasicElement(fqv27);
        fqv27.onAttributesInitialized();
        fqv27.onChildrenAdded();
        fqv fqv28 = fqv.checkOut();
        fqv28.setElementMap(fyy_03);
        fqv28.setHeight(0);
        fqv28.setPosition(frk_0.i);
        fqv28.setTexture(this.a.c("themePressed"));
        fqv28.setWidth(1);
        fqv28.setX(847);
        fqv28.setY(6);
        fby_24.addBasicElement(fqv28);
        fqv28.onAttributesInitialized();
        fqv28.onChildrenAdded();
        fby_24.onChildrenAdded();
        fqd_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqd_0 fqd_05 = (fqd_0)fvE6.getAppearance();
        fqd_05.setElementMap(fyy_03);
        fqd_05.setAlignment(frs_0.e);
        fqd_05.setState("disabled");
        fvE2.addBasicElement(fqd_05);
        fqd_05.onAttributesInitialized();
        fqg_0 fqg_05 = fqg_0.checkOut();
        fqg_05.setElementMap(fyy_03);
        fqg_05.setColor(new fyr_0("whiteColor"));
        fqd_05.addBasicElement(fqg_05);
        fqg_05.onAttributesInitialized();
        fqg_05.onChildrenAdded();
        fby_2 fby_25 = fby_2.checkOut();
        fby_25.setElementMap(fyy_03);
        fqd_05.addBasicElement(fby_25);
        fby_25.onAttributesInitialized();
        fby_25.onChildrenAdded();
        fqd_05.onChildrenAdded();
    }
}

