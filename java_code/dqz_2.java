/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dqZ
 */
public class dqz_2
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
        fqg_02.setColor(new fyr_0("mainTextLightColor"));
        fqd_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        String string = "pmbDefaultButtonTertiary";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqd_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(6);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv2.setWidth(6);
        fqv2.setX(0);
        fqv2.setY(0);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(1);
        fqv3.setPosition(frk_0.h);
        fqv3.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv3.setWidth(6);
        fqv3.setX(0);
        fqv3.setY(6);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(6);
        fqv4.setPosition(frk_0.m);
        fqv4.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv4.setWidth(6);
        fqv4.setX(0);
        fqv4.setY(30);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(6);
        fqv5.setPosition(frk_0.c);
        fqv5.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv5.setWidth(1);
        fqv5.setX(18);
        fqv5.setY(0);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        fqv6.setHeight(1);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv6.setWidth(1);
        fqv6.setX(18);
        fqv6.setY(18);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(6);
        fqv7.setPosition(frk_0.o);
        fqv7.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv7.setWidth(1);
        fqv7.setX(18);
        fqv7.setY(30);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        fqv8.setHeight(6);
        fqv8.setPosition(frk_0.e);
        fqv8.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv8.setWidth(6);
        fqv8.setX(30);
        fqv8.setY(0);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(1);
        fqv9.setPosition(frk_0.j);
        fqv9.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv9.setWidth(6);
        fqv9.setX(30);
        fqv9.setY(18);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_03);
        fqv10.setHeight(6);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv10.setWidth(6);
        fqv10.setX(30);
        fqv10.setY(30);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        String string2 = "pmRegroupPrimaryLight";
        fqv fqv11 = fqv.checkOut();
        fqv11.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fqv11);
        }
        fqv11.setHeight(16);
        fqv11.setPosition(frk_0.i);
        fqv11.setTexture(this.a.c("txRegroup"));
        fqv11.setWidth(16);
        fqv11.setX(2);
        fqv11.setY(24);
        fqd_02.addBasicElement(fqv11);
        fqv11.onAttributesInitialized();
        fqv11.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqd_0 fqd_03 = (fqd_0)fvE4.getAppearance();
        fqd_03.setElementMap(fyy_03);
        fqd_03.setState("mouseHover");
        fvE2.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        fqg_0 fqg_03 = fqg_0.checkOut();
        fqg_03.setElementMap(fyy_03);
        fqg_03.setColor(new fyr_0("mainTextLightColor"));
        fqd_03.addBasicElement(fqg_03);
        fqg_03.onAttributesInitialized();
        fqg_03.onChildrenAdded();
        String string3 = "pmbHoverButtonTertiary";
        fby_2 fby_23 = fby_2.checkOut();
        fby_23.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fby_23);
        }
        fby_23.setScaled(true);
        fqd_03.addBasicElement(fby_23);
        fby_23.onAttributesInitialized();
        fqv fqv12 = fqv.checkOut();
        fqv12.setElementMap(fyy_03);
        fqv12.setHeight(6);
        fqv12.setPosition(frk_0.a);
        fqv12.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv12.setWidth(6);
        fqv12.setX(0);
        fqv12.setY(38);
        fby_23.addBasicElement(fqv12);
        fqv12.onAttributesInitialized();
        fqv12.onChildrenAdded();
        fqv fqv13 = fqv.checkOut();
        fqv13.setElementMap(fyy_03);
        fqv13.setHeight(1);
        fqv13.setPosition(frk_0.h);
        fqv13.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv13.setWidth(6);
        fqv13.setX(0);
        fqv13.setY(44);
        fby_23.addBasicElement(fqv13);
        fqv13.onAttributesInitialized();
        fqv13.onChildrenAdded();
        fqv fqv14 = fqv.checkOut();
        fqv14.setElementMap(fyy_03);
        fqv14.setHeight(6);
        fqv14.setPosition(frk_0.m);
        fqv14.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv14.setWidth(6);
        fqv14.setX(0);
        fqv14.setY(68);
        fby_23.addBasicElement(fqv14);
        fqv14.onAttributesInitialized();
        fqv14.onChildrenAdded();
        fqv fqv15 = fqv.checkOut();
        fqv15.setElementMap(fyy_03);
        fqv15.setHeight(6);
        fqv15.setPosition(frk_0.c);
        fqv15.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv15.setWidth(1);
        fqv15.setX(18);
        fqv15.setY(38);
        fby_23.addBasicElement(fqv15);
        fqv15.onAttributesInitialized();
        fqv15.onChildrenAdded();
        fqv fqv16 = fqv.checkOut();
        fqv16.setElementMap(fyy_03);
        fqv16.setHeight(1);
        fqv16.setPosition(frk_0.i);
        fqv16.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv16.setWidth(1);
        fqv16.setX(18);
        fqv16.setY(56);
        fby_23.addBasicElement(fqv16);
        fqv16.onAttributesInitialized();
        fqv16.onChildrenAdded();
        fqv fqv17 = fqv.checkOut();
        fqv17.setElementMap(fyy_03);
        fqv17.setHeight(6);
        fqv17.setPosition(frk_0.o);
        fqv17.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv17.setWidth(1);
        fqv17.setX(18);
        fqv17.setY(68);
        fby_23.addBasicElement(fqv17);
        fqv17.onAttributesInitialized();
        fqv17.onChildrenAdded();
        fqv fqv18 = fqv.checkOut();
        fqv18.setElementMap(fyy_03);
        fqv18.setHeight(6);
        fqv18.setPosition(frk_0.e);
        fqv18.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv18.setWidth(6);
        fqv18.setX(30);
        fqv18.setY(38);
        fby_23.addBasicElement(fqv18);
        fqv18.onAttributesInitialized();
        fqv18.onChildrenAdded();
        fqv fqv19 = fqv.checkOut();
        fqv19.setElementMap(fyy_03);
        fqv19.setHeight(1);
        fqv19.setPosition(frk_0.j);
        fqv19.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv19.setWidth(6);
        fqv19.setX(30);
        fqv19.setY(56);
        fby_23.addBasicElement(fqv19);
        fqv19.onAttributesInitialized();
        fqv19.onChildrenAdded();
        fqv fqv20 = fqv.checkOut();
        fqv20.setElementMap(fyy_03);
        fqv20.setHeight(6);
        fqv20.setPosition(frk_0.q);
        fqv20.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv20.setWidth(6);
        fqv20.setX(30);
        fqv20.setY(68);
        fby_23.addBasicElement(fqv20);
        fqv20.onAttributesInitialized();
        fqv20.onChildrenAdded();
        fby_23.onChildrenAdded();
        String string4 = "pmRegroupPrimaryLight";
        fqv fqv21 = fqv.checkOut();
        fqv21.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fqv21);
        }
        fqv21.setHeight(16);
        fqv21.setPosition(frk_0.i);
        fqv21.setTexture(this.a.c("txRegroup"));
        fqv21.setWidth(16);
        fqv21.setX(2);
        fqv21.setY(24);
        fqd_03.addBasicElement(fqv21);
        fqv21.onAttributesInitialized();
        fqv21.onChildrenAdded();
        fqd_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqd_0 fqd_04 = (fqd_0)fvE5.getAppearance();
        fqd_04.setElementMap(fyy_03);
        fqd_04.setState("pressed");
        fvE2.addBasicElement(fqd_04);
        fqd_04.onAttributesInitialized();
        fqg_0 fqg_04 = fqg_0.checkOut();
        fqg_04.setElementMap(fyy_03);
        fqg_04.setColor(new fyr_0("mainTextTitleColor"));
        fqd_04.addBasicElement(fqg_04);
        fqg_04.onAttributesInitialized();
        fqg_04.onChildrenAdded();
        String string5 = "pmbPressedButtonTertiary";
        fby_2 fby_24 = fby_2.checkOut();
        fby_24.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fby_24);
        }
        fby_24.setScaled(true);
        fqd_04.addBasicElement(fby_24);
        fby_24.onAttributesInitialized();
        fqv fqv22 = fqv.checkOut();
        fqv22.setElementMap(fyy_03);
        fqv22.setHeight(6);
        fqv22.setPosition(frk_0.a);
        fqv22.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv22.setWidth(6);
        fqv22.setX(0);
        fqv22.setY(76);
        fby_24.addBasicElement(fqv22);
        fqv22.onAttributesInitialized();
        fqv22.onChildrenAdded();
        fqv fqv23 = fqv.checkOut();
        fqv23.setElementMap(fyy_03);
        fqv23.setHeight(1);
        fqv23.setPosition(frk_0.h);
        fqv23.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv23.setWidth(6);
        fqv23.setX(0);
        fqv23.setY(82);
        fby_24.addBasicElement(fqv23);
        fqv23.onAttributesInitialized();
        fqv23.onChildrenAdded();
        fqv fqv24 = fqv.checkOut();
        fqv24.setElementMap(fyy_03);
        fqv24.setHeight(6);
        fqv24.setPosition(frk_0.m);
        fqv24.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv24.setWidth(6);
        fqv24.setX(0);
        fqv24.setY(106);
        fby_24.addBasicElement(fqv24);
        fqv24.onAttributesInitialized();
        fqv24.onChildrenAdded();
        fqv fqv25 = fqv.checkOut();
        fqv25.setElementMap(fyy_03);
        fqv25.setHeight(6);
        fqv25.setPosition(frk_0.c);
        fqv25.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv25.setWidth(1);
        fqv25.setX(18);
        fqv25.setY(76);
        fby_24.addBasicElement(fqv25);
        fqv25.onAttributesInitialized();
        fqv25.onChildrenAdded();
        fqv fqv26 = fqv.checkOut();
        fqv26.setElementMap(fyy_03);
        fqv26.setHeight(1);
        fqv26.setPosition(frk_0.i);
        fqv26.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv26.setWidth(1);
        fqv26.setX(18);
        fqv26.setY(94);
        fby_24.addBasicElement(fqv26);
        fqv26.onAttributesInitialized();
        fqv26.onChildrenAdded();
        fqv fqv27 = fqv.checkOut();
        fqv27.setElementMap(fyy_03);
        fqv27.setHeight(6);
        fqv27.setPosition(frk_0.o);
        fqv27.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv27.setWidth(1);
        fqv27.setX(18);
        fqv27.setY(106);
        fby_24.addBasicElement(fqv27);
        fqv27.onAttributesInitialized();
        fqv27.onChildrenAdded();
        fqv fqv28 = fqv.checkOut();
        fqv28.setElementMap(fyy_03);
        fqv28.setHeight(6);
        fqv28.setPosition(frk_0.e);
        fqv28.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv28.setWidth(6);
        fqv28.setX(30);
        fqv28.setY(76);
        fby_24.addBasicElement(fqv28);
        fqv28.onAttributesInitialized();
        fqv28.onChildrenAdded();
        fqv fqv29 = fqv.checkOut();
        fqv29.setElementMap(fyy_03);
        fqv29.setHeight(1);
        fqv29.setPosition(frk_0.j);
        fqv29.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv29.setWidth(6);
        fqv29.setX(30);
        fqv29.setY(94);
        fby_24.addBasicElement(fqv29);
        fqv29.onAttributesInitialized();
        fqv29.onChildrenAdded();
        fqv fqv30 = fqv.checkOut();
        fqv30.setElementMap(fyy_03);
        fqv30.setHeight(6);
        fqv30.setPosition(frk_0.q);
        fqv30.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv30.setWidth(6);
        fqv30.setX(30);
        fqv30.setY(106);
        fby_24.addBasicElement(fqv30);
        fqv30.onAttributesInitialized();
        fqv30.onChildrenAdded();
        fby_24.onChildrenAdded();
        String string6 = "pmRegroupWhite100";
        fqv fqv31 = fqv.checkOut();
        fqv31.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, fqv31);
        }
        fqv31.setHeight(16);
        fqv31.setPosition(frk_0.i);
        fqv31.setTexture(this.a.c("txRegroup"));
        fqv31.setWidth(16);
        fqv31.setX(2);
        fqv31.setY(46);
        fqd_04.addBasicElement(fqv31);
        fqv31.onAttributesInitialized();
        fqv31.onChildrenAdded();
        fqd_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqd_0 fqd_05 = (fqd_0)fvE6.getAppearance();
        fqd_05.setElementMap(fyy_03);
        fqd_05.setState("disabled");
        fvE2.addBasicElement(fqd_05);
        fqd_05.onAttributesInitialized();
        fqg_0 fqg_05 = fqg_0.checkOut();
        fqg_05.setElementMap(fyy_03);
        fqg_05.setColor(new fyr_0("disabledTextColor"));
        fqd_05.addBasicElement(fqg_05);
        fqg_05.onAttributesInitialized();
        fqg_05.onChildrenAdded();
        String string7 = "pmbDisabledButtonTertiary";
        fby_2 fby_25 = fby_2.checkOut();
        fby_25.setElementMap(fyy_03);
        if (fyy_03 != null && string7 != null) {
            fyy_03.a(string7, fby_25);
        }
        fby_25.setScaled(true);
        fqd_05.addBasicElement(fby_25);
        fby_25.onAttributesInitialized();
        fqv fqv32 = fqv.checkOut();
        fqv32.setElementMap(fyy_03);
        fqv32.setHeight(6);
        fqv32.setPosition(frk_0.a);
        fqv32.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv32.setWidth(6);
        fqv32.setX(0);
        fqv32.setY(114);
        fby_25.addBasicElement(fqv32);
        fqv32.onAttributesInitialized();
        fqv32.onChildrenAdded();
        fqv fqv33 = fqv.checkOut();
        fqv33.setElementMap(fyy_03);
        fqv33.setHeight(1);
        fqv33.setPosition(frk_0.h);
        fqv33.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv33.setWidth(6);
        fqv33.setX(0);
        fqv33.setY(120);
        fby_25.addBasicElement(fqv33);
        fqv33.onAttributesInitialized();
        fqv33.onChildrenAdded();
        fqv fqv34 = fqv.checkOut();
        fqv34.setElementMap(fyy_03);
        fqv34.setHeight(6);
        fqv34.setPosition(frk_0.m);
        fqv34.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv34.setWidth(6);
        fqv34.setX(0);
        fqv34.setY(144);
        fby_25.addBasicElement(fqv34);
        fqv34.onAttributesInitialized();
        fqv34.onChildrenAdded();
        fqv fqv35 = fqv.checkOut();
        fqv35.setElementMap(fyy_03);
        fqv35.setHeight(6);
        fqv35.setPosition(frk_0.c);
        fqv35.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv35.setWidth(1);
        fqv35.setX(18);
        fqv35.setY(114);
        fby_25.addBasicElement(fqv35);
        fqv35.onAttributesInitialized();
        fqv35.onChildrenAdded();
        fqv fqv36 = fqv.checkOut();
        fqv36.setElementMap(fyy_03);
        fqv36.setHeight(1);
        fqv36.setPosition(frk_0.i);
        fqv36.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv36.setWidth(1);
        fqv36.setX(18);
        fqv36.setY(132);
        fby_25.addBasicElement(fqv36);
        fqv36.onAttributesInitialized();
        fqv36.onChildrenAdded();
        fqv fqv37 = fqv.checkOut();
        fqv37.setElementMap(fyy_03);
        fqv37.setHeight(6);
        fqv37.setPosition(frk_0.o);
        fqv37.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv37.setWidth(1);
        fqv37.setX(18);
        fqv37.setY(144);
        fby_25.addBasicElement(fqv37);
        fqv37.onAttributesInitialized();
        fqv37.onChildrenAdded();
        this.a(fby_25);
        this.b(fby_25);
        this.c(fby_25);
        fby_25.onChildrenAdded();
        this.d(fqd_05);
        fqd_05.onChildrenAdded();
    }

    public fyo a(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(6);
        fqv2.setPosition(frk_0.e);
        fqv2.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv2.setWidth(6);
        fqv2.setX(30);
        fqv2.setY(114);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo b(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(1);
        fqv2.setPosition(frk_0.j);
        fqv2.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv2.setWidth(6);
        fqv2.setX(30);
        fqv2.setY(132);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo c(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(6);
        fqv2.setPosition(frk_0.q);
        fqv2.setTexture(this.a.c("txTertiaryToggleSmall"));
        fqv2.setWidth(6);
        fqv2.setX(30);
        fqv2.setY(144);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo d(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        String string = "pmRegroupWhite25";
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        if (fyy_02 != null && string != null) {
            fyy_02.a(string, fqv2);
        }
        fqv2.setHeight(16);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("txRegroup"));
        fqv2.setWidth(16);
        fqv2.setX(2);
        fqv2.setY(90);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }
}

