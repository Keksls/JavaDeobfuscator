/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dTJ
 */
public class dtj_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        fbm_2 fbm_22;
        fyg_0 fyg_02;
        fyb_0 fyb_02;
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fvE fvE4 = fvE2;
        fqj fqj2 = fvE4.getAppearance();
        fqj2.setElementMap(fyy_03);
        fvE2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fvE fvE5 = fqj2.getParentOfType(fvE.class);
        fvE fvE6 = fvE5.getWidgetByThemeElementName("verticalButton", false);
        if (fvE6 != null) {
            fyb_02 = fvE6;
            fyg_02 = (fqd_0)((fvE)fyb_02).getAppearance();
            fyg_02.setElementMap(fyy_03);
            ((fqj)fyg_02).setState("default");
            fvE6.addBasicElement(fyg_02);
            fyg_02.onAttributesInitialized();
            fbm_22 = fby_2.checkOut();
            fbm_22.setElementMap(fyy_03);
            fbm_22.setEnabled(true);
            ((fby_2)fbm_22).setScaled(true);
            fyg_02.addBasicElement(fbm_22);
            fbm_22.onAttributesInitialized();
            fqv fqv2 = fqv.checkOut();
            fqv2.setElementMap(fyy_03);
            fqv2.setHeight(4);
            fqv2.setPosition(frk_0.a);
            fqv2.setTexture(this.a.c("txScrollbarSlider"));
            fqv2.setWidth(4);
            fqv2.setX(0);
            fqv2.setY(0);
            fbm_22.addBasicElement(fqv2);
            fqv2.onAttributesInitialized();
            fqv2.onChildrenAdded();
            fqv fqv3 = fqv.checkOut();
            fqv3.setElementMap(fyy_03);
            fqv3.setHeight(1);
            fqv3.setPosition(frk_0.h);
            fqv3.setTexture(this.a.c("txScrollbarSlider"));
            fqv3.setWidth(4);
            fqv3.setX(0);
            fqv3.setY(4);
            fbm_22.addBasicElement(fqv3);
            fqv3.onAttributesInitialized();
            fqv3.onChildrenAdded();
            fqv fqv4 = fqv.checkOut();
            fqv4.setElementMap(fyy_03);
            fqv4.setHeight(4);
            fqv4.setPosition(frk_0.m);
            fqv4.setTexture(this.a.c("txScrollbarSlider"));
            fqv4.setWidth(4);
            fqv4.setX(0);
            fqv4.setY(12);
            fbm_22.addBasicElement(fqv4);
            fqv4.onAttributesInitialized();
            fqv4.onChildrenAdded();
            fqv fqv5 = fqv.checkOut();
            fqv5.setElementMap(fyy_03);
            fqv5.setHeight(4);
            fqv5.setPosition(frk_0.c);
            fqv5.setTexture(this.a.c("txScrollbarSlider"));
            fqv5.setWidth(1);
            fqv5.setX(3);
            fqv5.setY(0);
            fbm_22.addBasicElement(fqv5);
            fqv5.onAttributesInitialized();
            fqv5.onChildrenAdded();
            fqv fqv6 = fqv.checkOut();
            fqv6.setElementMap(fyy_03);
            fqv6.setHeight(1);
            fqv6.setPosition(frk_0.i);
            fqv6.setTexture(this.a.c("txScrollbarSlider"));
            fqv6.setWidth(1);
            fqv6.setX(3);
            fqv6.setY(4);
            fbm_22.addBasicElement(fqv6);
            fqv6.onAttributesInitialized();
            fqv6.onChildrenAdded();
            fqv fqv7 = fqv.checkOut();
            fqv7.setElementMap(fyy_03);
            fqv7.setHeight(4);
            fqv7.setPosition(frk_0.o);
            fqv7.setTexture(this.a.c("txScrollbarSlider"));
            fqv7.setWidth(1);
            fqv7.setX(3);
            fqv7.setY(12);
            fbm_22.addBasicElement(fqv7);
            fqv7.onAttributesInitialized();
            fqv7.onChildrenAdded();
            fqv fqv8 = fqv.checkOut();
            fqv8.setElementMap(fyy_03);
            fqv8.setHeight(4);
            fqv8.setPosition(frk_0.e);
            fqv8.setTexture(this.a.c("txScrollbarSlider"));
            fqv8.setWidth(4);
            fqv8.setX(4);
            fqv8.setY(0);
            fbm_22.addBasicElement(fqv8);
            fqv8.onAttributesInitialized();
            fqv8.onChildrenAdded();
            fqv fqv9 = fqv.checkOut();
            fqv9.setElementMap(fyy_03);
            fqv9.setHeight(1);
            fqv9.setPosition(frk_0.j);
            fqv9.setTexture(this.a.c("txScrollbarSlider"));
            fqv9.setWidth(4);
            fqv9.setX(4);
            fqv9.setY(4);
            fbm_22.addBasicElement(fqv9);
            fqv9.onAttributesInitialized();
            fqv9.onChildrenAdded();
            fqv fqv10 = fqv.checkOut();
            fqv10.setElementMap(fyy_03);
            fqv10.setHeight(4);
            fqv10.setPosition(frk_0.q);
            fqv10.setTexture(this.a.c("txScrollbarSlider"));
            fqv10.setWidth(4);
            fqv10.setX(4);
            fqv10.setY(12);
            fbm_22.addBasicElement(fqv10);
            fqv10.onAttributesInitialized();
            fqv10.onChildrenAdded();
            fbm_22.onChildrenAdded();
            fqv fqv11 = fqv.checkOut();
            fqv11.setElementMap(fyy_03);
            fqv11.setHeight(0);
            fqv11.setPosition(frk_0.i);
            fqv11.setTexture(this.a.c("txScrollbarSlider"));
            fqv11.setWidth(0);
            fqv11.setX(0);
            fqv11.setY(16);
            fyg_02.addBasicElement(fqv11);
            fqv11.onAttributesInitialized();
            fqv11.onChildrenAdded();
            fyg_02.onChildrenAdded();
            fvE fvE7 = fvE6;
            fqd_0 fqd_02 = (fqd_0)fvE7.getAppearance();
            fqd_02.setElementMap(fyy_03);
            fqd_02.setState("mouseHover");
            fvE6.addBasicElement(fqd_02);
            fqd_02.onAttributesInitialized();
            fby_2 fby_22 = fby_2.checkOut();
            fby_22.setElementMap(fyy_03);
            fby_22.setScaled(true);
            fqd_02.addBasicElement(fby_22);
            fby_22.onAttributesInitialized();
            fqv fqv12 = fqv.checkOut();
            fqv12.setElementMap(fyy_03);
            fqv12.setHeight(4);
            fqv12.setPosition(frk_0.a);
            fqv12.setTexture(this.a.c("txScrollbarSlider"));
            fqv12.setWidth(4);
            fqv12.setX(0);
            fqv12.setY(18);
            fby_22.addBasicElement(fqv12);
            fqv12.onAttributesInitialized();
            fqv12.onChildrenAdded();
            fqv fqv13 = fqv.checkOut();
            fqv13.setElementMap(fyy_03);
            fqv13.setHeight(1);
            fqv13.setPosition(frk_0.h);
            fqv13.setTexture(this.a.c("txScrollbarSlider"));
            fqv13.setWidth(4);
            fqv13.setX(0);
            fqv13.setY(22);
            fby_22.addBasicElement(fqv13);
            fqv13.onAttributesInitialized();
            fqv13.onChildrenAdded();
            fqv fqv14 = fqv.checkOut();
            fqv14.setElementMap(fyy_03);
            fqv14.setHeight(4);
            fqv14.setPosition(frk_0.m);
            fqv14.setTexture(this.a.c("txScrollbarSlider"));
            fqv14.setWidth(4);
            fqv14.setX(0);
            fqv14.setY(30);
            fby_22.addBasicElement(fqv14);
            fqv14.onAttributesInitialized();
            fqv14.onChildrenAdded();
            fqv fqv15 = fqv.checkOut();
            fqv15.setElementMap(fyy_03);
            fqv15.setHeight(4);
            fqv15.setPosition(frk_0.c);
            fqv15.setTexture(this.a.c("txScrollbarSlider"));
            fqv15.setWidth(1);
            fqv15.setX(3);
            fqv15.setY(18);
            fby_22.addBasicElement(fqv15);
            fqv15.onAttributesInitialized();
            fqv15.onChildrenAdded();
            fqv fqv16 = fqv.checkOut();
            fqv16.setElementMap(fyy_03);
            fqv16.setHeight(1);
            fqv16.setPosition(frk_0.i);
            fqv16.setTexture(this.a.c("txScrollbarSlider"));
            fqv16.setWidth(1);
            fqv16.setX(3);
            fqv16.setY(22);
            fby_22.addBasicElement(fqv16);
            fqv16.onAttributesInitialized();
            fqv16.onChildrenAdded();
            fqv fqv17 = fqv.checkOut();
            fqv17.setElementMap(fyy_03);
            fqv17.setHeight(4);
            fqv17.setPosition(frk_0.o);
            fqv17.setTexture(this.a.c("txScrollbarSlider"));
            fqv17.setWidth(1);
            fqv17.setX(3);
            fqv17.setY(30);
            fby_22.addBasicElement(fqv17);
            fqv17.onAttributesInitialized();
            fqv17.onChildrenAdded();
            fqv fqv18 = fqv.checkOut();
            fqv18.setElementMap(fyy_03);
            fqv18.setHeight(4);
            fqv18.setPosition(frk_0.e);
            fqv18.setTexture(this.a.c("txScrollbarSlider"));
            fqv18.setWidth(4);
            fqv18.setX(4);
            fqv18.setY(18);
            fby_22.addBasicElement(fqv18);
            fqv18.onAttributesInitialized();
            fqv18.onChildrenAdded();
            fqv fqv19 = fqv.checkOut();
            fqv19.setElementMap(fyy_03);
            fqv19.setHeight(1);
            fqv19.setPosition(frk_0.j);
            fqv19.setTexture(this.a.c("txScrollbarSlider"));
            fqv19.setWidth(4);
            fqv19.setX(4);
            fqv19.setY(22);
            fby_22.addBasicElement(fqv19);
            fqv19.onAttributesInitialized();
            fqv19.onChildrenAdded();
            fqv fqv20 = fqv.checkOut();
            fqv20.setElementMap(fyy_03);
            fqv20.setHeight(4);
            fqv20.setPosition(frk_0.q);
            fqv20.setTexture(this.a.c("txScrollbarSlider"));
            fqv20.setWidth(4);
            fqv20.setX(4);
            fqv20.setY(30);
            fby_22.addBasicElement(fqv20);
            fqv20.onAttributesInitialized();
            fqv20.onChildrenAdded();
            fby_22.onChildrenAdded();
            fqd_02.onChildrenAdded();
            fvE fvE8 = fvE6;
            fqd_0 fqd_03 = (fqd_0)fvE8.getAppearance();
            fqd_03.setElementMap(fyy_03);
            fqd_03.setState("pressed");
            fvE6.addBasicElement(fqd_03);
            fqd_03.onAttributesInitialized();
            fby_2 fby_23 = fby_2.checkOut();
            fby_23.setElementMap(fyy_03);
            fby_23.setScaled(true);
            fqd_03.addBasicElement(fby_23);
            fby_23.onAttributesInitialized();
            fqv fqv21 = fqv.checkOut();
            fqv21.setElementMap(fyy_03);
            fqv21.setHeight(4);
            fqv21.setPosition(frk_0.a);
            fqv21.setTexture(this.a.c("txScrollbarSlider"));
            fqv21.setWidth(4);
            fqv21.setX(0);
            fqv21.setY(36);
            fby_23.addBasicElement(fqv21);
            fqv21.onAttributesInitialized();
            fqv21.onChildrenAdded();
            fqv fqv22 = fqv.checkOut();
            fqv22.setElementMap(fyy_03);
            fqv22.setHeight(1);
            fqv22.setPosition(frk_0.h);
            fqv22.setTexture(this.a.c("txScrollbarSlider"));
            fqv22.setWidth(4);
            fqv22.setX(0);
            fqv22.setY(40);
            fby_23.addBasicElement(fqv22);
            fqv22.onAttributesInitialized();
            fqv22.onChildrenAdded();
            fqv fqv23 = fqv.checkOut();
            fqv23.setElementMap(fyy_03);
            fqv23.setHeight(4);
            fqv23.setPosition(frk_0.m);
            fqv23.setTexture(this.a.c("txScrollbarSlider"));
            fqv23.setWidth(4);
            fqv23.setX(0);
            fqv23.setY(48);
            fby_23.addBasicElement(fqv23);
            fqv23.onAttributesInitialized();
            fqv23.onChildrenAdded();
            fqv fqv24 = fqv.checkOut();
            fqv24.setElementMap(fyy_03);
            fqv24.setHeight(4);
            fqv24.setPosition(frk_0.c);
            fqv24.setTexture(this.a.c("txScrollbarSlider"));
            fqv24.setWidth(1);
            fqv24.setX(3);
            fqv24.setY(36);
            fby_23.addBasicElement(fqv24);
            fqv24.onAttributesInitialized();
            fqv24.onChildrenAdded();
            fqv fqv25 = fqv.checkOut();
            fqv25.setElementMap(fyy_03);
            fqv25.setHeight(1);
            fqv25.setPosition(frk_0.i);
            fqv25.setTexture(this.a.c("txScrollbarSlider"));
            fqv25.setWidth(1);
            fqv25.setX(3);
            fqv25.setY(40);
            fby_23.addBasicElement(fqv25);
            fqv25.onAttributesInitialized();
            fqv25.onChildrenAdded();
            fqv fqv26 = fqv.checkOut();
            fqv26.setElementMap(fyy_03);
            fqv26.setHeight(4);
            fqv26.setPosition(frk_0.o);
            fqv26.setTexture(this.a.c("txScrollbarSlider"));
            fqv26.setWidth(1);
            fqv26.setX(3);
            fqv26.setY(48);
            fby_23.addBasicElement(fqv26);
            fqv26.onAttributesInitialized();
            fqv26.onChildrenAdded();
            fqv fqv27 = fqv.checkOut();
            fqv27.setElementMap(fyy_03);
            fqv27.setHeight(4);
            fqv27.setPosition(frk_0.e);
            fqv27.setTexture(this.a.c("txScrollbarSlider"));
            fqv27.setWidth(4);
            fqv27.setX(4);
            fqv27.setY(36);
            fby_23.addBasicElement(fqv27);
            fqv27.onAttributesInitialized();
            fqv27.onChildrenAdded();
            fqv fqv28 = fqv.checkOut();
            fqv28.setElementMap(fyy_03);
            fqv28.setHeight(1);
            fqv28.setPosition(frk_0.j);
            fqv28.setTexture(this.a.c("txScrollbarSlider"));
            fqv28.setWidth(4);
            fqv28.setX(4);
            fqv28.setY(40);
            fby_23.addBasicElement(fqv28);
            fqv28.onAttributesInitialized();
            fqv28.onChildrenAdded();
            fqv fqv29 = fqv.checkOut();
            fqv29.setElementMap(fyy_03);
            fqv29.setHeight(4);
            fqv29.setPosition(frk_0.q);
            fqv29.setTexture(this.a.c("txScrollbarSlider"));
            fqv29.setWidth(4);
            fqv29.setX(4);
            fqv29.setY(48);
            fby_23.addBasicElement(fqv29);
            fqv29.onAttributesInitialized();
            fqv29.onChildrenAdded();
            fby_23.onChildrenAdded();
            fqd_03.onChildrenAdded();
            fvE fvE9 = fvE6;
            fqd_0 fqd_04 = (fqd_0)fvE9.getAppearance();
            fqd_04.setElementMap(fyy_03);
            fqd_04.setState("disabled");
            fvE6.addBasicElement(fqd_04);
            fqd_04.onAttributesInitialized();
            fby_2 fby_24 = fby_2.checkOut();
            fby_24.setElementMap(fyy_03);
            fby_24.setScaled(true);
            fqd_04.addBasicElement(fby_24);
            fby_24.onAttributesInitialized();
            fqv fqv30 = fqv.checkOut();
            fqv30.setElementMap(fyy_03);
            fqv30.setHeight(4);
            fqv30.setPosition(frk_0.a);
            fqv30.setTexture(this.a.c("txScrollbarSlider"));
            fqv30.setWidth(4);
            fqv30.setX(0);
            fqv30.setY(54);
            fby_24.addBasicElement(fqv30);
            fqv30.onAttributesInitialized();
            fqv30.onChildrenAdded();
            fqv fqv31 = fqv.checkOut();
            fqv31.setElementMap(fyy_03);
            fqv31.setHeight(1);
            fqv31.setPosition(frk_0.h);
            fqv31.setTexture(this.a.c("txScrollbarSlider"));
            fqv31.setWidth(4);
            fqv31.setX(0);
            fqv31.setY(58);
            fby_24.addBasicElement(fqv31);
            fqv31.onAttributesInitialized();
            fqv31.onChildrenAdded();
            fqv fqv32 = fqv.checkOut();
            fqv32.setElementMap(fyy_03);
            fqv32.setHeight(4);
            fqv32.setPosition(frk_0.m);
            fqv32.setTexture(this.a.c("txScrollbarSlider"));
            fqv32.setWidth(4);
            fqv32.setX(0);
            fqv32.setY(66);
            fby_24.addBasicElement(fqv32);
            fqv32.onAttributesInitialized();
            fqv32.onChildrenAdded();
            fqv fqv33 = fqv.checkOut();
            fqv33.setElementMap(fyy_03);
            fqv33.setHeight(4);
            fqv33.setPosition(frk_0.c);
            fqv33.setTexture(this.a.c("txScrollbarSlider"));
            fqv33.setWidth(1);
            fqv33.setX(3);
            fqv33.setY(54);
            fby_24.addBasicElement(fqv33);
            fqv33.onAttributesInitialized();
            fqv33.onChildrenAdded();
            fqv fqv34 = fqv.checkOut();
            fqv34.setElementMap(fyy_03);
            fqv34.setHeight(1);
            fqv34.setPosition(frk_0.i);
            fqv34.setTexture(this.a.c("txScrollbarSlider"));
            fqv34.setWidth(1);
            fqv34.setX(3);
            fqv34.setY(58);
            fby_24.addBasicElement(fqv34);
            fqv34.onAttributesInitialized();
            fqv34.onChildrenAdded();
            fqv fqv35 = fqv.checkOut();
            fqv35.setElementMap(fyy_03);
            fqv35.setHeight(4);
            fqv35.setPosition(frk_0.o);
            fqv35.setTexture(this.a.c("txScrollbarSlider"));
            fqv35.setWidth(1);
            fqv35.setX(3);
            fqv35.setY(66);
            fby_24.addBasicElement(fqv35);
            fqv35.onAttributesInitialized();
            fqv35.onChildrenAdded();
            fqv fqv36 = fqv.checkOut();
            fqv36.setElementMap(fyy_03);
            fqv36.setHeight(4);
            fqv36.setPosition(frk_0.e);
            fqv36.setTexture(this.a.c("txScrollbarSlider"));
            fqv36.setWidth(4);
            fqv36.setX(4);
            fqv36.setY(54);
            fby_24.addBasicElement(fqv36);
            fqv36.onAttributesInitialized();
            fqv36.onChildrenAdded();
            fqv fqv37 = fqv.checkOut();
            fqv37.setElementMap(fyy_03);
            fqv37.setHeight(1);
            fqv37.setPosition(frk_0.j);
            fqv37.setTexture(this.a.c("txScrollbarSlider"));
            fqv37.setWidth(4);
            fqv37.setX(4);
            fqv37.setY(58);
            fby_24.addBasicElement(fqv37);
            fqv37.onAttributesInitialized();
            fqv37.onChildrenAdded();
            fqv fqv38 = fqv.checkOut();
            fqv38.setElementMap(fyy_03);
            fqv38.setHeight(4);
            fqv38.setPosition(frk_0.q);
            fqv38.setTexture(this.a.c("txScrollbarSlider"));
            fqv38.setWidth(4);
            fqv38.setX(4);
            fqv38.setY(66);
            fby_24.addBasicElement(fqv38);
            fqv38.onAttributesInitialized();
            fqv38.onChildrenAdded();
            fby_24.onChildrenAdded();
            fqd_04.onChildrenAdded();
        }
        fyb_02 = fby_2.checkOut();
        fyb_02.setElementMap(fyy_03);
        ((fbk_1)fyb_02).setEnabled(true);
        ((fby_2)fyb_02).setScaled(true);
        fqj2.addBasicElement(fyb_02);
        fyb_02.onAttributesInitialized();
        fyg_02 = fqv.checkOut();
        fyg_02.setElementMap(fyy_03);
        ((fqv)fyg_02).setHeight(3);
        ((fqv)fyg_02).setPosition(frk_0.a);
        ((fqv)fyg_02).setTexture(this.a.c("txScrollbarBackground"));
        ((fqv)fyg_02).setWidth(3);
        ((fqv)fyg_02).setX(0);
        ((fqv)fyg_02).setY(0);
        fyb_02.addBasicElement(fyg_02);
        fyg_02.onAttributesInitialized();
        fyg_02.onChildrenAdded();
        fbm_22 = fqv.checkOut();
        fbm_22.setElementMap(fyy_03);
        ((fqv)fbm_22).setHeight(0);
        ((fqv)fbm_22).setPosition(frk_0.h);
        ((fqv)fbm_22).setTexture(this.a.c("txScrollbarBackground"));
        ((fqv)fbm_22).setWidth(3);
        ((fqv)fbm_22).setX(0);
        ((fqv)fbm_22).setY(4);
        fyb_02.addBasicElement(fbm_22);
        fbm_22.onAttributesInitialized();
        fbm_22.onChildrenAdded();
        this.a(fyb_02);
        this.b(fyb_02);
        this.c(fyb_02);
        this.d(fyb_02);
        this.e(fyb_02);
        this.f(fyb_02);
        this.g(fyb_02);
        fyb_02.onChildrenAdded();
        fqj2.onChildrenAdded();
    }

    public fyo a(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(3);
        fqv2.setPosition(frk_0.m);
        fqv2.setTexture(this.a.c("txScrollbarBackground"));
        fqv2.setWidth(3);
        fqv2.setX(0);
        fqv2.setY(13);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo b(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(3);
        fqv2.setPosition(frk_0.c);
        fqv2.setTexture(this.a.c("txScrollbarBackground"));
        fqv2.setWidth(1);
        fqv2.setX(2);
        fqv2.setY(0);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo c(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(0);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("txScrollbarBackground"));
        fqv2.setWidth(1);
        fqv2.setX(2);
        fqv2.setY(4);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo d(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(3);
        fqv2.setPosition(frk_0.o);
        fqv2.setTexture(this.a.c("txScrollbarBackground"));
        fqv2.setWidth(1);
        fqv2.setX(2);
        fqv2.setY(13);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo e(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(3);
        fqv2.setPosition(frk_0.e);
        fqv2.setTexture(this.a.c("txScrollbarBackground"));
        fqv2.setWidth(3);
        fqv2.setX(3);
        fqv2.setY(0);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo f(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(0);
        fqv2.setPosition(frk_0.j);
        fqv2.setTexture(this.a.c("txScrollbarBackground"));
        fqv2.setWidth(3);
        fqv2.setX(3);
        fqv2.setY(4);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo g(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(3);
        fqv2.setPosition(frk_0.q);
        fqv2.setTexture(this.a.c("txScrollbarBackground"));
        fqv2.setWidth(3);
        fqv2.setX(3);
        fqv2.setY(13);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }
}

