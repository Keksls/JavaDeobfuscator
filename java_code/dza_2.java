/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from dZA
 */
public class dza_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqo_0 fqo_02 = new fqo_0();
        fqo_02.onCheckOut();
        fqo_02.setElementMap(fyy_03);
        fqo_02.setInsets(new Insets(2, 2, 2, 2));
        fvE2.addBasicElement(fqo_02);
        fqo_02.onAttributesInitialized();
        fqo_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqb_0 fqb_02 = (fqb_0)fvE4.getAppearance();
        fqb_02.setElementMap(fyy_03);
        fqb_02.setAlign(frs_0.e);
        fqb_02.setState("default");
        fvE2.addBasicElement(fqb_02);
        fqb_02.onAttributesInitialized();
        fqn fqn2 = fqn.checkOut();
        fqn2.setRenderer(fpm_0.b().g().d("fontDefault10Bold"));
        fqn2.setElementMap(fyy_03);
        fqb_02.addBasicElement(fqn2);
        fqn2.onAttributesInitialized();
        fqn2.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new fyr_0("mecanicBlueColor"));
        fqb_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        String string = "tabDefaultBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqb_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(9);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(9);
        fqv2.setX(460);
        fqv2.setY(12);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fby_22.onChildrenAdded();
        String string2 = "tabDefaultBorder";
        fbc_1 fbc_12 = new fbc_1();
        fbc_12.onCheckOut();
        fbc_12.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fbc_12);
        }
        fqb_02.addBasicElement(fbc_12);
        fbc_12.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(11);
        fqv3.setPosition(frk_0.a);
        fqv3.setTexture(this.a.c("themeDefault"));
        fqv3.setWidth(10);
        fqv3.setX(449);
        fqv3.setY(0);
        fbc_12.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(11);
        fqv4.setPosition(frk_0.c);
        fqv4.setTexture(this.a.c("themeDefault"));
        fqv4.setWidth(9);
        fqv4.setX(460);
        fqv4.setY(0);
        fbc_12.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(11);
        fqv5.setPosition(frk_0.e);
        fqv5.setTexture(this.a.c("themeDefault"));
        fqv5.setWidth(10);
        fqv5.setX(470);
        fqv5.setY(0);
        fbc_12.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(9);
        fqv6.setPosition(frk_0.j);
        fqv6.setTexture(this.a.c("themeDefault"));
        fqv6.setWidth(10);
        fqv6.setX(470);
        fqv6.setY(12);
        fbc_12.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(7);
        fqv7.setPosition(frk_0.q);
        fqv7.setTexture(this.a.c("themeDefault"));
        fqv7.setWidth(10);
        fqv7.setX(470);
        fqv7.setY(20);
        fbc_12.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(7);
        fqv8.setPosition(frk_0.o);
        fqv8.setTexture(this.a.c("themeDefault"));
        fqv8.setWidth(9);
        fqv8.setX(460);
        fqv8.setY(20);
        fbc_12.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(7);
        fqv9.setPosition(frk_0.m);
        fqv9.setTexture(this.a.c("themeDefault"));
        fqv9.setWidth(10);
        fqv9.setX(449);
        fqv9.setY(20);
        fbc_12.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(7);
        fqv10.setPosition(frk_0.h);
        fqv10.setTexture(this.a.c("themeDefault"));
        fqv10.setWidth(10);
        fqv10.setX(449);
        fqv10.setY(12);
        fbc_12.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fbc_12.onChildrenAdded();
        fqb_02.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqb_0 fqb_03 = (fqb_0)fvE5.getAppearance();
        fqb_03.setElementMap(fyy_03);
        fqb_03.setAlign(frs_0.e);
        fqb_03.setState("mouseHover");
        fvE2.addBasicElement(fqb_03);
        fqb_03.onAttributesInitialized();
        fqg_0 fqg_03 = fqg_0.checkOut();
        fqg_03.setElementMap(fyy_03);
        fqg_03.setColor(new fyr_0("blackColor"));
        fqb_03.addBasicElement(fqg_03);
        fqg_03.onAttributesInitialized();
        fqg_03.onChildrenAdded();
        String string3 = "tabOverBackground";
        fby_2 fby_23 = fby_2.checkOut();
        fby_23.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fby_23);
        }
        fby_23.setScaled(true);
        fqb_03.addBasicElement(fby_23);
        fby_23.onAttributesInitialized();
        fqv fqv11 = fqv.checkOut();
        fqv11.setElementMap(fyy_03);
        fqv11.setHeight(9);
        fqv11.setPosition(frk_0.i);
        fqv11.setTexture(this.a.c("themeOver"));
        fqv11.setWidth(9);
        fqv11.setX(460);
        fqv11.setY(12);
        fby_23.addBasicElement(fqv11);
        fqv11.onAttributesInitialized();
        fqv11.onChildrenAdded();
        fby_23.onChildrenAdded();
        String string4 = "tabOverBorder";
        fbc_1 fbc_13 = new fbc_1();
        fbc_13.onCheckOut();
        fbc_13.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fbc_13);
        }
        fqb_03.addBasicElement(fbc_13);
        fbc_13.onAttributesInitialized();
        fqv fqv12 = fqv.checkOut();
        fqv12.setElementMap(fyy_03);
        fqv12.setHeight(11);
        fqv12.setPosition(frk_0.a);
        fqv12.setTexture(this.a.c("themeOver"));
        fqv12.setWidth(10);
        fqv12.setX(449);
        fqv12.setY(0);
        fbc_13.addBasicElement(fqv12);
        fqv12.onAttributesInitialized();
        fqv12.onChildrenAdded();
        fqv fqv13 = fqv.checkOut();
        fqv13.setElementMap(fyy_03);
        fqv13.setHeight(11);
        fqv13.setPosition(frk_0.c);
        fqv13.setTexture(this.a.c("themeOver"));
        fqv13.setWidth(9);
        fqv13.setX(460);
        fqv13.setY(0);
        fbc_13.addBasicElement(fqv13);
        fqv13.onAttributesInitialized();
        fqv13.onChildrenAdded();
        fqv fqv14 = fqv.checkOut();
        fqv14.setElementMap(fyy_03);
        fqv14.setHeight(11);
        fqv14.setPosition(frk_0.e);
        fqv14.setTexture(this.a.c("themeOver"));
        fqv14.setWidth(10);
        fqv14.setX(470);
        fqv14.setY(0);
        fbc_13.addBasicElement(fqv14);
        fqv14.onAttributesInitialized();
        fqv14.onChildrenAdded();
        fqv fqv15 = fqv.checkOut();
        fqv15.setElementMap(fyy_03);
        fqv15.setHeight(9);
        fqv15.setPosition(frk_0.j);
        fqv15.setTexture(this.a.c("themeOver"));
        fqv15.setWidth(10);
        fqv15.setX(470);
        fqv15.setY(12);
        fbc_13.addBasicElement(fqv15);
        fqv15.onAttributesInitialized();
        fqv15.onChildrenAdded();
        fqv fqv16 = fqv.checkOut();
        fqv16.setElementMap(fyy_03);
        fqv16.setHeight(7);
        fqv16.setPosition(frk_0.q);
        fqv16.setTexture(this.a.c("themeOver"));
        fqv16.setWidth(10);
        fqv16.setX(470);
        fqv16.setY(20);
        fbc_13.addBasicElement(fqv16);
        fqv16.onAttributesInitialized();
        fqv16.onChildrenAdded();
        fqv fqv17 = fqv.checkOut();
        fqv17.setElementMap(fyy_03);
        fqv17.setHeight(7);
        fqv17.setPosition(frk_0.o);
        fqv17.setTexture(this.a.c("themeOver"));
        fqv17.setWidth(9);
        fqv17.setX(460);
        fqv17.setY(20);
        fbc_13.addBasicElement(fqv17);
        fqv17.onAttributesInitialized();
        fqv17.onChildrenAdded();
        fqv fqv18 = fqv.checkOut();
        fqv18.setElementMap(fyy_03);
        fqv18.setHeight(7);
        fqv18.setPosition(frk_0.m);
        fqv18.setTexture(this.a.c("themeOver"));
        fqv18.setWidth(10);
        fqv18.setX(449);
        fqv18.setY(20);
        fbc_13.addBasicElement(fqv18);
        fqv18.onAttributesInitialized();
        fqv18.onChildrenAdded();
        fqv fqv19 = fqv.checkOut();
        fqv19.setElementMap(fyy_03);
        fqv19.setHeight(7);
        fqv19.setPosition(frk_0.h);
        fqv19.setTexture(this.a.c("themeOver"));
        fqv19.setWidth(10);
        fqv19.setX(449);
        fqv19.setY(12);
        fbc_13.addBasicElement(fqv19);
        fqv19.onAttributesInitialized();
        fqv19.onChildrenAdded();
        fbc_13.onChildrenAdded();
        fqb_03.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqb_0 fqb_04 = (fqb_0)fvE6.getAppearance();
        fqb_04.setElementMap(fyy_03);
        fqb_04.setAlign(frs_0.e);
        fqb_04.setState("pressed");
        fvE2.addBasicElement(fqb_04);
        fqb_04.onAttributesInitialized();
        fqg_0 fqg_04 = fqg_0.checkOut();
        fqg_04.setElementMap(fyy_03);
        fqg_04.setColor(new fyr_0("mecanicBlueColor"));
        fqb_04.addBasicElement(fqg_04);
        fqg_04.onAttributesInitialized();
        fqg_04.onChildrenAdded();
        String string5 = "tabPressedBackground";
        fby_2 fby_24 = fby_2.checkOut();
        fby_24.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fby_24);
        }
        fby_24.setScaled(true);
        fqb_04.addBasicElement(fby_24);
        fby_24.onAttributesInitialized();
        fqv fqv20 = fqv.checkOut();
        fqv20.setElementMap(fyy_03);
        fqv20.setHeight(9);
        fqv20.setPosition(frk_0.i);
        fqv20.setTexture(this.a.c("themePressed"));
        fqv20.setWidth(9);
        fqv20.setX(460);
        fqv20.setY(12);
        fby_24.addBasicElement(fqv20);
        fqv20.onAttributesInitialized();
        fqv20.onChildrenAdded();
        fby_24.onChildrenAdded();
        String string6 = "tabPressedBorder";
        fbc_1 fbc_14 = new fbc_1();
        fbc_14.onCheckOut();
        fbc_14.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, fbc_14);
        }
        fqb_04.addBasicElement(fbc_14);
        fbc_14.onAttributesInitialized();
        fqv fqv21 = fqv.checkOut();
        fqv21.setElementMap(fyy_03);
        fqv21.setHeight(11);
        fqv21.setPosition(frk_0.a);
        fqv21.setTexture(this.a.c("themePressed"));
        fqv21.setWidth(10);
        fqv21.setX(449);
        fqv21.setY(0);
        fbc_14.addBasicElement(fqv21);
        fqv21.onAttributesInitialized();
        fqv21.onChildrenAdded();
        fqv fqv22 = fqv.checkOut();
        fqv22.setElementMap(fyy_03);
        fqv22.setHeight(11);
        fqv22.setPosition(frk_0.c);
        fqv22.setTexture(this.a.c("themePressed"));
        fqv22.setWidth(9);
        fqv22.setX(460);
        fqv22.setY(0);
        fbc_14.addBasicElement(fqv22);
        fqv22.onAttributesInitialized();
        fqv22.onChildrenAdded();
        fqv fqv23 = fqv.checkOut();
        fqv23.setElementMap(fyy_03);
        fqv23.setHeight(11);
        fqv23.setPosition(frk_0.e);
        fqv23.setTexture(this.a.c("themePressed"));
        fqv23.setWidth(10);
        fqv23.setX(470);
        fqv23.setY(0);
        fbc_14.addBasicElement(fqv23);
        fqv23.onAttributesInitialized();
        fqv23.onChildrenAdded();
        fqv fqv24 = fqv.checkOut();
        fqv24.setElementMap(fyy_03);
        fqv24.setHeight(9);
        fqv24.setPosition(frk_0.j);
        fqv24.setTexture(this.a.c("themePressed"));
        fqv24.setWidth(10);
        fqv24.setX(470);
        fqv24.setY(12);
        fbc_14.addBasicElement(fqv24);
        fqv24.onAttributesInitialized();
        fqv24.onChildrenAdded();
        fqv fqv25 = fqv.checkOut();
        fqv25.setElementMap(fyy_03);
        fqv25.setHeight(7);
        fqv25.setPosition(frk_0.q);
        fqv25.setTexture(this.a.c("themePressed"));
        fqv25.setWidth(10);
        fqv25.setX(470);
        fqv25.setY(20);
        fbc_14.addBasicElement(fqv25);
        fqv25.onAttributesInitialized();
        fqv25.onChildrenAdded();
        fqv fqv26 = fqv.checkOut();
        fqv26.setElementMap(fyy_03);
        fqv26.setHeight(7);
        fqv26.setPosition(frk_0.o);
        fqv26.setTexture(this.a.c("themePressed"));
        fqv26.setWidth(9);
        fqv26.setX(460);
        fqv26.setY(20);
        fbc_14.addBasicElement(fqv26);
        fqv26.onAttributesInitialized();
        fqv26.onChildrenAdded();
        fqv fqv27 = fqv.checkOut();
        fqv27.setElementMap(fyy_03);
        fqv27.setHeight(7);
        fqv27.setPosition(frk_0.m);
        fqv27.setTexture(this.a.c("themePressed"));
        fqv27.setWidth(10);
        fqv27.setX(449);
        fqv27.setY(20);
        fbc_14.addBasicElement(fqv27);
        fqv27.onAttributesInitialized();
        fqv27.onChildrenAdded();
        fqv fqv28 = fqv.checkOut();
        fqv28.setElementMap(fyy_03);
        fqv28.setHeight(7);
        fqv28.setPosition(frk_0.h);
        fqv28.setTexture(this.a.c("themePressed"));
        fqv28.setWidth(10);
        fqv28.setX(449);
        fqv28.setY(12);
        fbc_14.addBasicElement(fqv28);
        fqv28.onAttributesInitialized();
        fqv28.onChildrenAdded();
        fbc_14.onChildrenAdded();
        fqb_04.onChildrenAdded();
        fvE fvE7 = fvE2;
        fqb_0 fqb_05 = (fqb_0)fvE7.getAppearance();
        fqb_05.setElementMap(fyy_03);
        fqb_05.setAlign(frs_0.e);
        fqb_05.setState("disabled");
        fvE2.addBasicElement(fqb_05);
        fqb_05.onAttributesInitialized();
        fqg_0 fqg_05 = fqg_0.checkOut();
        fqg_05.setElementMap(fyy_03);
        fqg_05.setColor(new fyr_0("defaultDarkGreyColor"));
        fqb_05.addBasicElement(fqg_05);
        fqg_05.onAttributesInitialized();
        fqg_05.onChildrenAdded();
        String string7 = "tabDisabledBackground";
        fby_2 fby_25 = fby_2.checkOut();
        fby_25.setElementMap(fyy_03);
        if (fyy_03 != null && string7 != null) {
            fyy_03.a(string7, fby_25);
        }
        fby_25.setScaled(true);
        fqb_05.addBasicElement(fby_25);
        fby_25.onAttributesInitialized();
        fqv fqv29 = fqv.checkOut();
        fqv29.setElementMap(fyy_03);
        fqv29.setHeight(9);
        fqv29.setPosition(frk_0.i);
        fqv29.setTexture(this.a.c("themeDisabled"));
        fqv29.setWidth(9);
        fqv29.setX(460);
        fqv29.setY(12);
        fby_25.addBasicElement(fqv29);
        fqv29.onAttributesInitialized();
        fqv29.onChildrenAdded();
        fby_25.onChildrenAdded();
        String string8 = "tabDisabledBorder";
        fbc_1 fbc_15 = new fbc_1();
        fbc_15.onCheckOut();
        fbc_15.setElementMap(fyy_03);
        if (fyy_03 != null && string8 != null) {
            fyy_03.a(string8, fbc_15);
        }
        fqb_05.addBasicElement(fbc_15);
        fbc_15.onAttributesInitialized();
        fqv fqv30 = fqv.checkOut();
        fqv30.setElementMap(fyy_03);
        fqv30.setHeight(11);
        fqv30.setPosition(frk_0.a);
        fqv30.setTexture(this.a.c("themeDisabled"));
        fqv30.setWidth(10);
        fqv30.setX(449);
        fqv30.setY(0);
        fbc_15.addBasicElement(fqv30);
        fqv30.onAttributesInitialized();
        fqv30.onChildrenAdded();
        fqv fqv31 = fqv.checkOut();
        fqv31.setElementMap(fyy_03);
        fqv31.setHeight(11);
        fqv31.setPosition(frk_0.c);
        fqv31.setTexture(this.a.c("themeDisabled"));
        fqv31.setWidth(9);
        fqv31.setX(460);
        fqv31.setY(0);
        fbc_15.addBasicElement(fqv31);
        fqv31.onAttributesInitialized();
        fqv31.onChildrenAdded();
        fqv fqv32 = fqv.checkOut();
        fqv32.setElementMap(fyy_03);
        fqv32.setHeight(11);
        fqv32.setPosition(frk_0.e);
        fqv32.setTexture(this.a.c("themeDisabled"));
        fqv32.setWidth(10);
        fqv32.setX(470);
        fqv32.setY(0);
        fbc_15.addBasicElement(fqv32);
        fqv32.onAttributesInitialized();
        fqv32.onChildrenAdded();
        fqv fqv33 = fqv.checkOut();
        fqv33.setElementMap(fyy_03);
        fqv33.setHeight(9);
        fqv33.setPosition(frk_0.j);
        fqv33.setTexture(this.a.c("themeDisabled"));
        fqv33.setWidth(10);
        fqv33.setX(470);
        fqv33.setY(12);
        fbc_15.addBasicElement(fqv33);
        fqv33.onAttributesInitialized();
        fqv33.onChildrenAdded();
        fqv fqv34 = fqv.checkOut();
        fqv34.setElementMap(fyy_03);
        fqv34.setHeight(7);
        fqv34.setPosition(frk_0.q);
        fqv34.setTexture(this.a.c("themeDisabled"));
        fqv34.setWidth(10);
        fqv34.setX(470);
        fqv34.setY(20);
        fbc_15.addBasicElement(fqv34);
        fqv34.onAttributesInitialized();
        fqv34.onChildrenAdded();
        this.a(fbc_15);
        this.b(fbc_15);
        this.c(fbc_15);
        fbc_15.onChildrenAdded();
        fqb_05.onChildrenAdded();
        this.d(fvE2);
        this.e(fvE2);
        this.f(fvE2);
        this.g(fvE2);
    }

    public fyo a(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(7);
        fqv2.setPosition(frk_0.o);
        fqv2.setTexture(this.a.c("themeDisabled"));
        fqv2.setWidth(9);
        fqv2.setX(460);
        fqv2.setY(20);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo b(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(7);
        fqv2.setPosition(frk_0.m);
        fqv2.setTexture(this.a.c("themeDisabled"));
        fqv2.setWidth(10);
        fqv2.setX(449);
        fqv2.setY(20);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo c(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(7);
        fqv2.setPosition(frk_0.h);
        fqv2.setTexture(this.a.c("themeDisabled"));
        fqv2.setWidth(10);
        fqv2.setX(449);
        fqv2.setY(12);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo d(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fvE fvE2 = (fvE)fyo2;
        fqb_0 fqb_02 = (fqb_0)fvE2.getAppearance();
        fqb_02.setElementMap(fyy_02);
        fqb_02.setAlign(frs_0.e);
        fqb_02.setState("selected");
        fyo2.addBasicElement(fqb_02);
        fqb_02.onAttributesInitialized();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_02);
        fqg_02.setColor(new fyr_0("blackColor"));
        fqb_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        String string = "tabDefaultSelectedBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_02);
        if (fyy_02 != null && string != null) {
            fyy_02.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqb_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(9);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDefaultSelected"));
        fqv2.setWidth(9);
        fqv2.setX(460);
        fqv2.setY(12);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fby_22.onChildrenAdded();
        String string2 = "tabDefaultSelectedBorder";
        fbc_1 fbc_12 = new fbc_1();
        fbc_12.onCheckOut();
        fbc_12.setElementMap(fyy_02);
        if (fyy_02 != null && string2 != null) {
            fyy_02.a(string2, fbc_12);
        }
        fqb_02.addBasicElement(fbc_12);
        fbc_12.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_02);
        fqv3.setHeight(11);
        fqv3.setPosition(frk_0.a);
        fqv3.setTexture(this.a.c("themeDefaultSelected"));
        fqv3.setWidth(10);
        fqv3.setX(449);
        fqv3.setY(0);
        fbc_12.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_02);
        fqv4.setHeight(11);
        fqv4.setPosition(frk_0.c);
        fqv4.setTexture(this.a.c("themeDefaultSelected"));
        fqv4.setWidth(9);
        fqv4.setX(460);
        fqv4.setY(0);
        fbc_12.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_02);
        fqv5.setHeight(11);
        fqv5.setPosition(frk_0.e);
        fqv5.setTexture(this.a.c("themeDefaultSelected"));
        fqv5.setWidth(10);
        fqv5.setX(470);
        fqv5.setY(0);
        fbc_12.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_02);
        fqv6.setHeight(9);
        fqv6.setPosition(frk_0.j);
        fqv6.setTexture(this.a.c("themeDefaultSelected"));
        fqv6.setWidth(10);
        fqv6.setX(470);
        fqv6.setY(12);
        fbc_12.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_02);
        fqv7.setHeight(7);
        fqv7.setPosition(frk_0.q);
        fqv7.setTexture(this.a.c("themeDefaultSelected"));
        fqv7.setWidth(10);
        fqv7.setX(470);
        fqv7.setY(20);
        fbc_12.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_02);
        fqv8.setHeight(7);
        fqv8.setPosition(frk_0.o);
        fqv8.setTexture(this.a.c("themeDefaultSelected"));
        fqv8.setWidth(9);
        fqv8.setX(460);
        fqv8.setY(20);
        fbc_12.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_02);
        fqv9.setHeight(7);
        fqv9.setPosition(frk_0.m);
        fqv9.setTexture(this.a.c("themeDefaultSelected"));
        fqv9.setWidth(10);
        fqv9.setX(449);
        fqv9.setY(20);
        fbc_12.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_02);
        fqv10.setHeight(7);
        fqv10.setPosition(frk_0.h);
        fqv10.setTexture(this.a.c("themeDefaultSelected"));
        fqv10.setWidth(10);
        fqv10.setX(449);
        fqv10.setY(12);
        fbc_12.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fbc_12.onChildrenAdded();
        fqb_02.onChildrenAdded();
        return fqb_02;
    }

    public fyo e(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fvE fvE2 = (fvE)fyo2;
        fqb_0 fqb_02 = (fqb_0)fvE2.getAppearance();
        fqb_02.setElementMap(fyy_02);
        fqb_02.setAlign(frs_0.e);
        fqb_02.setState("mouseHoverSelected");
        fyo2.addBasicElement(fqb_02);
        fqb_02.onAttributesInitialized();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_02);
        fqg_02.setColor(new fyr_0("mecanicBlueColor"));
        fqb_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        String string = "tabOverSelectedBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_02);
        if (fyy_02 != null && string != null) {
            fyy_02.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqb_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(9);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeOverSelected"));
        fqv2.setWidth(9);
        fqv2.setX(460);
        fqv2.setY(12);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fby_22.onChildrenAdded();
        String string2 = "tabOverSelectedBorder";
        fbc_1 fbc_12 = new fbc_1();
        fbc_12.onCheckOut();
        fbc_12.setElementMap(fyy_02);
        if (fyy_02 != null && string2 != null) {
            fyy_02.a(string2, fbc_12);
        }
        fqb_02.addBasicElement(fbc_12);
        fbc_12.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_02);
        fqv3.setHeight(11);
        fqv3.setPosition(frk_0.a);
        fqv3.setTexture(this.a.c("themeOverSelected"));
        fqv3.setWidth(10);
        fqv3.setX(449);
        fqv3.setY(0);
        fbc_12.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_02);
        fqv4.setHeight(11);
        fqv4.setPosition(frk_0.c);
        fqv4.setTexture(this.a.c("themeOverSelected"));
        fqv4.setWidth(9);
        fqv4.setX(460);
        fqv4.setY(0);
        fbc_12.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_02);
        fqv5.setHeight(11);
        fqv5.setPosition(frk_0.e);
        fqv5.setTexture(this.a.c("themeOverSelected"));
        fqv5.setWidth(10);
        fqv5.setX(470);
        fqv5.setY(0);
        fbc_12.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_02);
        fqv6.setHeight(9);
        fqv6.setPosition(frk_0.j);
        fqv6.setTexture(this.a.c("themeOverSelected"));
        fqv6.setWidth(10);
        fqv6.setX(470);
        fqv6.setY(12);
        fbc_12.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_02);
        fqv7.setHeight(7);
        fqv7.setPosition(frk_0.q);
        fqv7.setTexture(this.a.c("themeOverSelected"));
        fqv7.setWidth(10);
        fqv7.setX(470);
        fqv7.setY(20);
        fbc_12.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_02);
        fqv8.setHeight(7);
        fqv8.setPosition(frk_0.o);
        fqv8.setTexture(this.a.c("themeOverSelected"));
        fqv8.setWidth(9);
        fqv8.setX(460);
        fqv8.setY(20);
        fbc_12.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_02);
        fqv9.setHeight(7);
        fqv9.setPosition(frk_0.m);
        fqv9.setTexture(this.a.c("themeOverSelected"));
        fqv9.setWidth(10);
        fqv9.setX(449);
        fqv9.setY(20);
        fbc_12.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_02);
        fqv10.setHeight(7);
        fqv10.setPosition(frk_0.h);
        fqv10.setTexture(this.a.c("themeOverSelected"));
        fqv10.setWidth(10);
        fqv10.setX(449);
        fqv10.setY(12);
        fbc_12.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fbc_12.onChildrenAdded();
        fqb_02.onChildrenAdded();
        return fqb_02;
    }

    public fyo f(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fvE fvE2 = (fvE)fyo2;
        fqb_0 fqb_02 = (fqb_0)fvE2.getAppearance();
        fqb_02.setElementMap(fyy_02);
        fqb_02.setAlign(frs_0.e);
        fqb_02.setState("pressedSelected");
        fyo2.addBasicElement(fqb_02);
        fqb_02.onAttributesInitialized();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_02);
        fqg_02.setColor(new fyr_0("blackColor"));
        fqb_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        String string = "tabPressedSelectedBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_02);
        if (fyy_02 != null && string != null) {
            fyy_02.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqb_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(9);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themePressedSelected"));
        fqv2.setWidth(9);
        fqv2.setX(460);
        fqv2.setY(12);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fby_22.onChildrenAdded();
        String string2 = "tabPressedSelectedBorder";
        fbc_1 fbc_12 = new fbc_1();
        fbc_12.onCheckOut();
        fbc_12.setElementMap(fyy_02);
        if (fyy_02 != null && string2 != null) {
            fyy_02.a(string2, fbc_12);
        }
        fqb_02.addBasicElement(fbc_12);
        fbc_12.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_02);
        fqv3.setHeight(11);
        fqv3.setPosition(frk_0.a);
        fqv3.setTexture(this.a.c("themePressedSelected"));
        fqv3.setWidth(10);
        fqv3.setX(449);
        fqv3.setY(0);
        fbc_12.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_02);
        fqv4.setHeight(11);
        fqv4.setPosition(frk_0.c);
        fqv4.setTexture(this.a.c("themePressedSelected"));
        fqv4.setWidth(9);
        fqv4.setX(460);
        fqv4.setY(0);
        fbc_12.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_02);
        fqv5.setHeight(11);
        fqv5.setPosition(frk_0.e);
        fqv5.setTexture(this.a.c("themePressedSelected"));
        fqv5.setWidth(10);
        fqv5.setX(470);
        fqv5.setY(0);
        fbc_12.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_02);
        fqv6.setHeight(9);
        fqv6.setPosition(frk_0.j);
        fqv6.setTexture(this.a.c("themePressedSelected"));
        fqv6.setWidth(10);
        fqv6.setX(470);
        fqv6.setY(12);
        fbc_12.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_02);
        fqv7.setHeight(7);
        fqv7.setPosition(frk_0.q);
        fqv7.setTexture(this.a.c("themePressedSelected"));
        fqv7.setWidth(10);
        fqv7.setX(470);
        fqv7.setY(20);
        fbc_12.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_02);
        fqv8.setHeight(7);
        fqv8.setPosition(frk_0.o);
        fqv8.setTexture(this.a.c("themePressedSelected"));
        fqv8.setWidth(9);
        fqv8.setX(460);
        fqv8.setY(20);
        fbc_12.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_02);
        fqv9.setHeight(7);
        fqv9.setPosition(frk_0.m);
        fqv9.setTexture(this.a.c("themePressedSelected"));
        fqv9.setWidth(10);
        fqv9.setX(449);
        fqv9.setY(20);
        fbc_12.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_02);
        fqv10.setHeight(7);
        fqv10.setPosition(frk_0.h);
        fqv10.setTexture(this.a.c("themePressedSelected"));
        fqv10.setWidth(10);
        fqv10.setX(449);
        fqv10.setY(12);
        fbc_12.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fbc_12.onChildrenAdded();
        fqb_02.onChildrenAdded();
        return fqb_02;
    }

    public fyo g(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fvE fvE2 = (fvE)fyo2;
        fqb_0 fqb_02 = (fqb_0)fvE2.getAppearance();
        fqb_02.setElementMap(fyy_02);
        fqb_02.setAlign(frs_0.e);
        fqb_02.setState("disabledSelected");
        fyo2.addBasicElement(fqb_02);
        fqb_02.onAttributesInitialized();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_02);
        fqg_02.setColor(new fyr_0("blackColor"));
        fqb_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        String string = "tabDisabledSelectedBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_02);
        if (fyy_02 != null && string != null) {
            fyy_02.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqb_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(9);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeDisabledSelected"));
        fqv2.setWidth(9);
        fqv2.setX(460);
        fqv2.setY(12);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fby_22.onChildrenAdded();
        String string2 = "tabDisabledSelectedBorder";
        fbc_1 fbc_12 = new fbc_1();
        fbc_12.onCheckOut();
        fbc_12.setElementMap(fyy_02);
        if (fyy_02 != null && string2 != null) {
            fyy_02.a(string2, fbc_12);
        }
        fqb_02.addBasicElement(fbc_12);
        fbc_12.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_02);
        fqv3.setHeight(11);
        fqv3.setPosition(frk_0.a);
        fqv3.setTexture(this.a.c("themeDisabledSelected"));
        fqv3.setWidth(10);
        fqv3.setX(449);
        fqv3.setY(0);
        fbc_12.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_02);
        fqv4.setHeight(11);
        fqv4.setPosition(frk_0.c);
        fqv4.setTexture(this.a.c("themeDisabledSelected"));
        fqv4.setWidth(9);
        fqv4.setX(460);
        fqv4.setY(0);
        fbc_12.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_02);
        fqv5.setHeight(11);
        fqv5.setPosition(frk_0.e);
        fqv5.setTexture(this.a.c("themeDisabledSelected"));
        fqv5.setWidth(10);
        fqv5.setX(470);
        fqv5.setY(0);
        fbc_12.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_02);
        fqv6.setHeight(9);
        fqv6.setPosition(frk_0.j);
        fqv6.setTexture(this.a.c("themeDisabledSelected"));
        fqv6.setWidth(10);
        fqv6.setX(470);
        fqv6.setY(12);
        fbc_12.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_02);
        fqv7.setHeight(7);
        fqv7.setPosition(frk_0.q);
        fqv7.setTexture(this.a.c("themeDisabledSelected"));
        fqv7.setWidth(10);
        fqv7.setX(470);
        fqv7.setY(20);
        fbc_12.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_02);
        fqv8.setHeight(7);
        fqv8.setPosition(frk_0.o);
        fqv8.setTexture(this.a.c("themeDisabledSelected"));
        fqv8.setWidth(9);
        fqv8.setX(460);
        fqv8.setY(20);
        fbc_12.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_02);
        fqv9.setHeight(7);
        fqv9.setPosition(frk_0.m);
        fqv9.setTexture(this.a.c("themeDisabledSelected"));
        fqv9.setWidth(10);
        fqv9.setX(449);
        fqv9.setY(20);
        fbc_12.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_02);
        fqv10.setHeight(7);
        fqv10.setPosition(frk_0.h);
        fqv10.setTexture(this.a.c("themeDisabledSelected"));
        fqv10.setWidth(10);
        fqv10.setX(449);
        fqv10.setY(12);
        fbc_12.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fbc_12.onChildrenAdded();
        fqb_02.onChildrenAdded();
        return fqb_02;
    }
}

