/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dXJ
 */
public class dxj_0
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        fqv fqv2;
        Object object;
        fyg_0 fyg_02;
        Object object2;
        fyg_0 fyg_03;
        Object object3;
        fyg_0 fyg_04;
        Object object4;
        fyg_0 fyg_05;
        Object object5;
        fyb_0 fyb_02;
        Object object6;
        fyg_0 fyg_06;
        Object object7;
        fyb_0 fyb_03;
        Object object8;
        fyb_0 fyb_04;
        fvE fvE3;
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE4 = fvE2;
        fvE fvE5 = fvE2;
        fqj fqj2 = fvE5.getAppearance();
        fqj2.setElementMap(fyy_03);
        fvE2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fvE fvE6 = fqj2.getParentOfType(fvE.class);
        fvE fvE7 = fvE6.getWidgetByThemeElementName("verticalDecreaseButton", false);
        if (fvE7 != null) {
            fvE3 = fvE7;
            fyb_04 = (fqd_0)fvE3.getAppearance();
            fyb_04.setElementMap(fyy_03);
            ((fqj)fyb_04).setState("default");
            fvE7.addBasicElement(fyb_04);
            fyb_04.onAttributesInitialized();
            object8 = "pmSmallDownSideArrow3Default";
            fyb_03 = fqv.checkOut();
            fyb_03.setElementMap(fyy_03);
            if (fyy_03 != null && object8 != null) {
                fyy_03.a((String)object8, fyb_03);
            }
            ((fqv)fyb_03).setFlipVerticaly(true);
            ((fqv)fyb_03).setHeight(8);
            ((fqv)fyb_03).setPosition(frk_0.i);
            ((fqv)fyb_03).setTexture(this.a.c("themeDefault"));
            ((fqv)fyb_03).setWidth(8);
            ((fqv)fyb_03).setX(875);
            ((fqv)fyb_03).setY(303);
            fyb_04.addBasicElement(fyb_03);
            fyb_03.onAttributesInitialized();
            fyb_03.onChildrenAdded();
            fyb_04.onChildrenAdded();
            object7 = fvE7;
            fyg_06 = (fqd_0)((fvE)object7).getAppearance();
            fyg_06.setElementMap(fyy_03);
            ((fqj)fyg_06).setState("mouseHover");
            fvE7.addBasicElement(fyg_06);
            fyg_06.onAttributesInitialized();
            object6 = "pmSmallDownSideArrow3Over";
            fyb_02 = fqv.checkOut();
            fyb_02.setElementMap(fyy_03);
            if (fyy_03 != null && object6 != null) {
                fyy_03.a((String)object6, fyb_02);
            }
            ((fqv)fyb_02).setFlipVerticaly(true);
            ((fqv)fyb_02).setHeight(8);
            ((fqv)fyb_02).setPosition(frk_0.i);
            ((fqv)fyb_02).setTexture(this.a.c("themeOver"));
            ((fqv)fyb_02).setWidth(8);
            ((fqv)fyb_02).setX(875);
            ((fqv)fyb_02).setY(303);
            fyg_06.addBasicElement(fyb_02);
            fyb_02.onAttributesInitialized();
            fyb_02.onChildrenAdded();
            fyg_06.onChildrenAdded();
            object5 = fvE7;
            fyg_05 = (fqd_0)((fvE)object5).getAppearance();
            fyg_05.setElementMap(fyy_03);
            ((fqj)fyg_05).setState("pressed");
            fvE7.addBasicElement(fyg_05);
            fyg_05.onAttributesInitialized();
            object4 = "pmSmallDownSideArrow3Pressed";
            fyg_04 = fqv.checkOut();
            fyg_04.setElementMap(fyy_03);
            if (fyy_03 != null && object4 != null) {
                fyy_03.a((String)object4, fyg_04);
            }
            ((fqv)fyg_04).setFlipVerticaly(true);
            ((fqv)fyg_04).setHeight(8);
            ((fqv)fyg_04).setPosition(frk_0.i);
            ((fqv)fyg_04).setTexture(this.a.c("themePressed"));
            ((fqv)fyg_04).setWidth(8);
            ((fqv)fyg_04).setX(875);
            ((fqv)fyg_04).setY(303);
            fyg_05.addBasicElement(fyg_04);
            fyg_04.onAttributesInitialized();
            fyg_04.onChildrenAdded();
            fyg_05.onChildrenAdded();
            object3 = fvE7;
            fyg_03 = (fqd_0)((fvE)object3).getAppearance();
            fyg_03.setElementMap(fyy_03);
            ((fqj)fyg_03).setState("disabled");
            fvE7.addBasicElement(fyg_03);
            fyg_03.onAttributesInitialized();
            object2 = "pmSmallDownSideArrow3Disabled";
            fyg_02 = fqv.checkOut();
            fyg_02.setElementMap(fyy_03);
            if (fyy_03 != null && object2 != null) {
                fyy_03.a((String)object2, fyg_02);
            }
            ((fqv)fyg_02).setFlipVerticaly(true);
            ((fqv)fyg_02).setHeight(8);
            ((fqv)fyg_02).setPosition(frk_0.i);
            ((fqv)fyg_02).setTexture(this.a.c("themeDisabled"));
            ((fqv)fyg_02).setWidth(8);
            ((fqv)fyg_02).setX(875);
            ((fqv)fyg_02).setY(303);
            fyg_03.addBasicElement(fyg_02);
            fyg_02.onAttributesInitialized();
            fyg_02.onChildrenAdded();
            fyg_03.onChildrenAdded();
        }
        if ((fyb_04 = (fvE3 = fqj2.getParentOfType(fvE.class)).getWidgetByThemeElementName("verticalIncreaseButton", false)) != null) {
            object8 = (fvE)fyb_04;
            fyb_03 = (fqd_0)((fvE)object8).getAppearance();
            fyb_03.setElementMap(fyy_03);
            ((fqj)fyb_03).setState("default");
            fyb_04.addBasicElement(fyb_03);
            fyb_03.onAttributesInitialized();
            object7 = "pmSmallUpSideArrow3Default";
            fyg_06 = fqv.checkOut();
            fyg_06.setElementMap(fyy_03);
            if (fyy_03 != null && object7 != null) {
                fyy_03.a((String)object7, fyg_06);
            }
            ((fqv)fyg_06).setHeight(8);
            ((fqv)fyg_06).setPosition(frk_0.i);
            ((fqv)fyg_06).setTexture(this.a.c("themeDefault"));
            ((fqv)fyg_06).setWidth(8);
            ((fqv)fyg_06).setX(875);
            ((fqv)fyg_06).setY(303);
            fyb_03.addBasicElement(fyg_06);
            fyg_06.onAttributesInitialized();
            fyg_06.onChildrenAdded();
            fyb_03.onChildrenAdded();
            object6 = (fvE)fyb_04;
            fyb_02 = (fqd_0)((fvE)object6).getAppearance();
            fyb_02.setElementMap(fyy_03);
            ((fqj)fyb_02).setState("mouseHover");
            fyb_04.addBasicElement(fyb_02);
            fyb_02.onAttributesInitialized();
            object5 = "pmSmallUpSideArrow3Over";
            fyg_05 = fqv.checkOut();
            fyg_05.setElementMap(fyy_03);
            if (fyy_03 != null && object5 != null) {
                fyy_03.a((String)object5, fyg_05);
            }
            ((fqv)fyg_05).setHeight(8);
            ((fqv)fyg_05).setPosition(frk_0.i);
            ((fqv)fyg_05).setTexture(this.a.c("themeOver"));
            ((fqv)fyg_05).setWidth(8);
            ((fqv)fyg_05).setX(875);
            ((fqv)fyg_05).setY(303);
            fyb_02.addBasicElement(fyg_05);
            fyg_05.onAttributesInitialized();
            fyg_05.onChildrenAdded();
            fyb_02.onChildrenAdded();
            object4 = (fvE)fyb_04;
            fyg_04 = (fqd_0)((fvE)object4).getAppearance();
            fyg_04.setElementMap(fyy_03);
            ((fqj)fyg_04).setState("pressed");
            fyb_04.addBasicElement(fyg_04);
            fyg_04.onAttributesInitialized();
            object3 = "pmSmallUpSideArrow3Pressed";
            fyg_03 = fqv.checkOut();
            fyg_03.setElementMap(fyy_03);
            if (fyy_03 != null && object3 != null) {
                fyy_03.a((String)object3, fyg_03);
            }
            ((fqv)fyg_03).setHeight(8);
            ((fqv)fyg_03).setPosition(frk_0.i);
            ((fqv)fyg_03).setTexture(this.a.c("themePressed"));
            ((fqv)fyg_03).setWidth(8);
            ((fqv)fyg_03).setX(875);
            ((fqv)fyg_03).setY(303);
            fyg_04.addBasicElement(fyg_03);
            fyg_03.onAttributesInitialized();
            fyg_03.onChildrenAdded();
            fyg_04.onChildrenAdded();
            object2 = (fvE)fyb_04;
            fyg_02 = (fqd_0)((fvE)object2).getAppearance();
            fyg_02.setElementMap(fyy_03);
            ((fqj)fyg_02).setState("disabled");
            fyb_04.addBasicElement(fyg_02);
            fyg_02.onAttributesInitialized();
            object = "pmSmallUpSideArrow3Disabled";
            fqv2 = fqv.checkOut();
            fqv2.setElementMap(fyy_03);
            if (fyy_03 != null && object != null) {
                fyy_03.a((String)object, fqv2);
            }
            fqv2.setHeight(8);
            fqv2.setPosition(frk_0.i);
            fqv2.setTexture(this.a.c("themeDisabled"));
            fqv2.setWidth(8);
            fqv2.setX(875);
            fqv2.setY(303);
            fyg_02.addBasicElement(fqv2);
            fqv2.onAttributesInitialized();
            fqv2.onChildrenAdded();
            fyg_02.onChildrenAdded();
        }
        if ((fyb_03 = ((fvE)(object8 = fqj2.getParentOfType(fvE.class))).getWidgetByThemeElementName("verticalSlider", false)) != null) {
            object7 = (fvE)fyb_03;
            fyg_06 = ((fvE)object7).getAppearance();
            fyg_06.setElementMap(fyy_03);
            fyb_03.addBasicElement(fyg_06);
            fyg_06.onAttributesInitialized();
            object6 = fyg_06.getParentOfType(fvE.class);
            fyb_02 = ((fvE)object6).getWidgetByThemeElementName("verticalButton", false);
            if (fyb_02 != null) {
                object5 = fyb_02;
                fyg_05 = (fqd_0)((fvE)object5).getAppearance();
                fyg_05.setElementMap(fyy_03);
                ((fqj)fyg_05).setState("default");
                fyb_02.addBasicElement(fyg_05);
                fyg_05.onAttributesInitialized();
                object4 = "blueWindowSliderButtonDefault";
                fyg_04 = fby_2.checkOut();
                fyg_04.setElementMap(fyy_03);
                if (fyy_03 != null && object4 != null) {
                    fyy_03.a((String)object4, fyg_04);
                }
                ((fby_2)fyg_04).setScaled(true);
                fyg_05.addBasicElement(fyg_04);
                fyg_04.onAttributesInitialized();
                object3 = fqv.checkOut();
                ((fyb_0)object3).setElementMap(fyy_03);
                ((fqv)object3).setHeight(4);
                ((fqv)object3).setPosition(frk_0.a);
                ((fqv)object3).setTexture(this.a.c("themeDefault"));
                ((fqv)object3).setWidth(4);
                ((fqv)object3).setX(861);
                ((fqv)object3).setY(302);
                fyg_04.addBasicElement((fyo)object3);
                ((fyo)object3).onAttributesInitialized();
                ((fyb_0)object3).onChildrenAdded();
                fyg_03 = fqv.checkOut();
                fyg_03.setElementMap(fyy_03);
                ((fqv)fyg_03).setHeight(4);
                ((fqv)fyg_03).setPosition(frk_0.c);
                ((fqv)fyg_03).setTexture(this.a.c("themeDefault"));
                ((fqv)fyg_03).setWidth(1);
                ((fqv)fyg_03).setX(866);
                ((fqv)fyg_03).setY(302);
                fyg_04.addBasicElement(fyg_03);
                fyg_03.onAttributesInitialized();
                fyg_03.onChildrenAdded();
                object2 = fqv.checkOut();
                ((fyb_0)object2).setElementMap(fyy_03);
                ((fqv)object2).setHeight(4);
                ((fqv)object2).setPosition(frk_0.e);
                ((fqv)object2).setTexture(this.a.c("themeDefault"));
                ((fqv)object2).setWidth(4);
                ((fqv)object2).setX(867);
                ((fqv)object2).setY(302);
                fyg_04.addBasicElement((fyo)object2);
                ((fyo)object2).onAttributesInitialized();
                ((fyb_0)object2).onChildrenAdded();
                fyg_02 = fqv.checkOut();
                fyg_02.setElementMap(fyy_03);
                ((fqv)fyg_02).setHeight(1);
                ((fqv)fyg_02).setPosition(frk_0.h);
                ((fqv)fyg_02).setTexture(this.a.c("themeDefault"));
                ((fqv)fyg_02).setWidth(4);
                ((fqv)fyg_02).setX(861);
                ((fqv)fyg_02).setY(307);
                fyg_04.addBasicElement(fyg_02);
                fyg_02.onAttributesInitialized();
                fyg_02.onChildrenAdded();
                object = fqv.checkOut();
                ((fyb_0)object).setElementMap(fyy_03);
                ((fqv)object).setHeight(1);
                ((fqv)object).setPosition(frk_0.i);
                ((fqv)object).setTexture(this.a.c("themeDefault"));
                ((fqv)object).setWidth(1);
                ((fqv)object).setX(866);
                ((fqv)object).setY(307);
                fyg_04.addBasicElement((fyo)object);
                ((fyo)object).onAttributesInitialized();
                ((fyb_0)object).onChildrenAdded();
                fqv2 = fqv.checkOut();
                fqv2.setElementMap(fyy_03);
                fqv2.setHeight(1);
                fqv2.setPosition(frk_0.j);
                fqv2.setTexture(this.a.c("themeDefault"));
                fqv2.setWidth(4);
                fqv2.setX(867);
                fqv2.setY(307);
                fyg_04.addBasicElement(fqv2);
                fqv2.onAttributesInitialized();
                fqv2.onChildrenAdded();
                fqv fqv3 = fqv.checkOut();
                fqv3.setElementMap(fyy_03);
                fqv3.setHeight(4);
                fqv3.setPosition(frk_0.m);
                fqv3.setTexture(this.a.c("themeDefault"));
                fqv3.setWidth(4);
                fqv3.setX(861);
                fqv3.setY(308);
                fyg_04.addBasicElement(fqv3);
                fqv3.onAttributesInitialized();
                fqv3.onChildrenAdded();
                fqv fqv4 = fqv.checkOut();
                fqv4.setElementMap(fyy_03);
                fqv4.setHeight(4);
                fqv4.setPosition(frk_0.o);
                fqv4.setTexture(this.a.c("themeDefault"));
                fqv4.setWidth(1);
                fqv4.setX(866);
                fqv4.setY(308);
                fyg_04.addBasicElement(fqv4);
                fqv4.onAttributesInitialized();
                fqv4.onChildrenAdded();
                fqv fqv5 = fqv.checkOut();
                fqv5.setElementMap(fyy_03);
                fqv5.setHeight(4);
                fqv5.setPosition(frk_0.q);
                fqv5.setTexture(this.a.c("themeDefault"));
                fqv5.setWidth(4);
                fqv5.setX(867);
                fqv5.setY(308);
                fyg_04.addBasicElement(fqv5);
                fqv5.onAttributesInitialized();
                fqv5.onChildrenAdded();
                fyg_04.onChildrenAdded();
                fyg_05.onChildrenAdded();
                fvE fvE8 = (fvE)fyb_02;
                fqd_0 fqd_02 = (fqd_0)fvE8.getAppearance();
                fqd_02.setElementMap(fyy_03);
                fqd_02.setState("mouseHover");
                fyb_02.addBasicElement(fqd_02);
                fqd_02.onAttributesInitialized();
                String string = "blueWindowSliderButtonOver";
                fby_2 fby_22 = fby_2.checkOut();
                fby_22.setElementMap(fyy_03);
                if (fyy_03 != null && string != null) {
                    fyy_03.a(string, fby_22);
                }
                fby_22.setScaled(true);
                fqd_02.addBasicElement(fby_22);
                fby_22.onAttributesInitialized();
                fqv fqv6 = fqv.checkOut();
                fqv6.setElementMap(fyy_03);
                fqv6.setHeight(4);
                fqv6.setPosition(frk_0.a);
                fqv6.setTexture(this.a.c("themeOver"));
                fqv6.setWidth(4);
                fqv6.setX(861);
                fqv6.setY(302);
                fby_22.addBasicElement(fqv6);
                fqv6.onAttributesInitialized();
                fqv6.onChildrenAdded();
                fqv fqv7 = fqv.checkOut();
                fqv7.setElementMap(fyy_03);
                fqv7.setHeight(4);
                fqv7.setPosition(frk_0.c);
                fqv7.setTexture(this.a.c("themeOver"));
                fqv7.setWidth(1);
                fqv7.setX(866);
                fqv7.setY(302);
                fby_22.addBasicElement(fqv7);
                fqv7.onAttributesInitialized();
                fqv7.onChildrenAdded();
                fqv fqv8 = fqv.checkOut();
                fqv8.setElementMap(fyy_03);
                fqv8.setHeight(4);
                fqv8.setPosition(frk_0.e);
                fqv8.setTexture(this.a.c("themeOver"));
                fqv8.setWidth(4);
                fqv8.setX(867);
                fqv8.setY(302);
                fby_22.addBasicElement(fqv8);
                fqv8.onAttributesInitialized();
                fqv8.onChildrenAdded();
                fqv fqv9 = fqv.checkOut();
                fqv9.setElementMap(fyy_03);
                fqv9.setHeight(1);
                fqv9.setPosition(frk_0.h);
                fqv9.setTexture(this.a.c("themeOver"));
                fqv9.setWidth(4);
                fqv9.setX(861);
                fqv9.setY(307);
                fby_22.addBasicElement(fqv9);
                fqv9.onAttributesInitialized();
                fqv9.onChildrenAdded();
                fqv fqv10 = fqv.checkOut();
                fqv10.setElementMap(fyy_03);
                fqv10.setHeight(1);
                fqv10.setPosition(frk_0.i);
                fqv10.setTexture(this.a.c("themeOver"));
                fqv10.setWidth(1);
                fqv10.setX(866);
                fqv10.setY(307);
                fby_22.addBasicElement(fqv10);
                fqv10.onAttributesInitialized();
                fqv10.onChildrenAdded();
                fqv fqv11 = fqv.checkOut();
                fqv11.setElementMap(fyy_03);
                fqv11.setHeight(1);
                fqv11.setPosition(frk_0.j);
                fqv11.setTexture(this.a.c("themeOver"));
                fqv11.setWidth(4);
                fqv11.setX(867);
                fqv11.setY(307);
                fby_22.addBasicElement(fqv11);
                fqv11.onAttributesInitialized();
                fqv11.onChildrenAdded();
                fqv fqv12 = fqv.checkOut();
                fqv12.setElementMap(fyy_03);
                fqv12.setHeight(4);
                fqv12.setPosition(frk_0.m);
                fqv12.setTexture(this.a.c("themeOver"));
                fqv12.setWidth(4);
                fqv12.setX(861);
                fqv12.setY(308);
                fby_22.addBasicElement(fqv12);
                fqv12.onAttributesInitialized();
                fqv12.onChildrenAdded();
                fqv fqv13 = fqv.checkOut();
                fqv13.setElementMap(fyy_03);
                fqv13.setHeight(4);
                fqv13.setPosition(frk_0.o);
                fqv13.setTexture(this.a.c("themeOver"));
                fqv13.setWidth(1);
                fqv13.setX(866);
                fqv13.setY(308);
                fby_22.addBasicElement(fqv13);
                fqv13.onAttributesInitialized();
                fqv13.onChildrenAdded();
                fqv fqv14 = fqv.checkOut();
                fqv14.setElementMap(fyy_03);
                fqv14.setHeight(4);
                fqv14.setPosition(frk_0.q);
                fqv14.setTexture(this.a.c("themeOver"));
                fqv14.setWidth(4);
                fqv14.setX(867);
                fqv14.setY(308);
                fby_22.addBasicElement(fqv14);
                fqv14.onAttributesInitialized();
                fqv14.onChildrenAdded();
                fby_22.onChildrenAdded();
                fqd_02.onChildrenAdded();
                fvE fvE9 = (fvE)fyb_02;
                fqd_0 fqd_03 = (fqd_0)fvE9.getAppearance();
                fqd_03.setElementMap(fyy_03);
                fqd_03.setState("pressed");
                fyb_02.addBasicElement(fqd_03);
                fqd_03.onAttributesInitialized();
                String string2 = "blueWindowSliderButtonPressed";
                fby_2 fby_23 = fby_2.checkOut();
                fby_23.setElementMap(fyy_03);
                if (fyy_03 != null && string2 != null) {
                    fyy_03.a(string2, fby_23);
                }
                fby_23.setScaled(true);
                fqd_03.addBasicElement(fby_23);
                fby_23.onAttributesInitialized();
                fqv fqv15 = fqv.checkOut();
                fqv15.setElementMap(fyy_03);
                fqv15.setHeight(4);
                fqv15.setPosition(frk_0.a);
                fqv15.setTexture(this.a.c("themePressed"));
                fqv15.setWidth(4);
                fqv15.setX(861);
                fqv15.setY(302);
                fby_23.addBasicElement(fqv15);
                fqv15.onAttributesInitialized();
                fqv15.onChildrenAdded();
                fqv fqv16 = fqv.checkOut();
                fqv16.setElementMap(fyy_03);
                fqv16.setHeight(4);
                fqv16.setPosition(frk_0.c);
                fqv16.setTexture(this.a.c("themePressed"));
                fqv16.setWidth(1);
                fqv16.setX(866);
                fqv16.setY(302);
                fby_23.addBasicElement(fqv16);
                fqv16.onAttributesInitialized();
                fqv16.onChildrenAdded();
                fqv fqv17 = fqv.checkOut();
                fqv17.setElementMap(fyy_03);
                fqv17.setHeight(4);
                fqv17.setPosition(frk_0.e);
                fqv17.setTexture(this.a.c("themePressed"));
                fqv17.setWidth(4);
                fqv17.setX(867);
                fqv17.setY(302);
                fby_23.addBasicElement(fqv17);
                fqv17.onAttributesInitialized();
                fqv17.onChildrenAdded();
                fqv fqv18 = fqv.checkOut();
                fqv18.setElementMap(fyy_03);
                fqv18.setHeight(1);
                fqv18.setPosition(frk_0.h);
                fqv18.setTexture(this.a.c("themePressed"));
                fqv18.setWidth(4);
                fqv18.setX(861);
                fqv18.setY(307);
                fby_23.addBasicElement(fqv18);
                fqv18.onAttributesInitialized();
                fqv18.onChildrenAdded();
                fqv fqv19 = fqv.checkOut();
                fqv19.setElementMap(fyy_03);
                fqv19.setHeight(1);
                fqv19.setPosition(frk_0.i);
                fqv19.setTexture(this.a.c("themePressed"));
                fqv19.setWidth(1);
                fqv19.setX(866);
                fqv19.setY(307);
                fby_23.addBasicElement(fqv19);
                fqv19.onAttributesInitialized();
                fqv19.onChildrenAdded();
                fqv fqv20 = fqv.checkOut();
                fqv20.setElementMap(fyy_03);
                fqv20.setHeight(1);
                fqv20.setPosition(frk_0.j);
                fqv20.setTexture(this.a.c("themePressed"));
                fqv20.setWidth(4);
                fqv20.setX(867);
                fqv20.setY(307);
                fby_23.addBasicElement(fqv20);
                fqv20.onAttributesInitialized();
                fqv20.onChildrenAdded();
                this.a(fby_23);
                this.b(fby_23);
                this.c(fby_23);
                fby_23.onChildrenAdded();
                fqd_03.onChildrenAdded();
                this.d(fyb_02);
            }
            this.e(fyg_06);
            fyg_06.onChildrenAdded();
        }
        fqj2.onChildrenAdded();
    }

    public fyo a(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.m);
        fqv2.setTexture(this.a.c("themePressed"));
        fqv2.setWidth(4);
        fqv2.setX(861);
        fqv2.setY(308);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo b(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.o);
        fqv2.setTexture(this.a.c("themePressed"));
        fqv2.setWidth(1);
        fqv2.setX(866);
        fqv2.setY(308);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo c(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.q);
        fqv2.setTexture(this.a.c("themePressed"));
        fqv2.setWidth(4);
        fqv2.setX(867);
        fqv2.setY(308);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo d(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fvE fvE2 = (fvE)fyo2;
        fqd_0 fqd_02 = (fqd_0)fvE2.getAppearance();
        fqd_02.setElementMap(fyy_02);
        fqd_02.setState("disabled");
        fyo2.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        String string = "blueWindowSliderButtonDisabled";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_02);
        if (fyy_02 != null && string != null) {
            fyy_02.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fqd_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeDisabled"));
        fqv2.setWidth(4);
        fqv2.setX(861);
        fqv2.setY(302);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_02);
        fqv3.setHeight(4);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeDisabled"));
        fqv3.setWidth(1);
        fqv3.setX(866);
        fqv3.setY(302);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_02);
        fqv4.setHeight(4);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeDisabled"));
        fqv4.setWidth(4);
        fqv4.setX(867);
        fqv4.setY(302);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_02);
        fqv5.setHeight(1);
        fqv5.setPosition(frk_0.h);
        fqv5.setTexture(this.a.c("themeDisabled"));
        fqv5.setWidth(4);
        fqv5.setX(861);
        fqv5.setY(307);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_02);
        fqv6.setHeight(1);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("themeDisabled"));
        fqv6.setWidth(1);
        fqv6.setX(866);
        fqv6.setY(307);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_02);
        fqv7.setHeight(1);
        fqv7.setPosition(frk_0.j);
        fqv7.setTexture(this.a.c("themeDisabled"));
        fqv7.setWidth(4);
        fqv7.setX(867);
        fqv7.setY(307);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_02);
        fqv8.setHeight(4);
        fqv8.setPosition(frk_0.m);
        fqv8.setTexture(this.a.c("themeDisabled"));
        fqv8.setWidth(4);
        fqv8.setX(861);
        fqv8.setY(308);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_02);
        fqv9.setHeight(4);
        fqv9.setPosition(frk_0.o);
        fqv9.setTexture(this.a.c("themeDisabled"));
        fqv9.setWidth(1);
        fqv9.setX(866);
        fqv9.setY(308);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_02);
        fqv10.setHeight(4);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("themeDisabled"));
        fqv10.setWidth(4);
        fqv10.setX(867);
        fqv10.setY(308);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqd_02.onChildrenAdded();
        return fqd_02;
    }

    public fyo e(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        String string = "blueWindowScrollbarBackground";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_02);
        if (fyy_02 != null && string != null) {
            fyy_02.a(string, fby_22);
        }
        fby_22.setScaled(true);
        fyo2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("themeSimple3"));
        fqv2.setWidth(4);
        fqv2.setX(414);
        fqv2.setY(122);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_02);
        fqv3.setHeight(4);
        fqv3.setPosition(frk_0.c);
        fqv3.setTexture(this.a.c("themeSimple3"));
        fqv3.setWidth(1);
        fqv3.setX(419);
        fqv3.setY(122);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_02);
        fqv4.setHeight(4);
        fqv4.setPosition(frk_0.e);
        fqv4.setTexture(this.a.c("themeSimple3"));
        fqv4.setWidth(4);
        fqv4.setX(420);
        fqv4.setY(122);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_02);
        fqv5.setHeight(1);
        fqv5.setPosition(frk_0.h);
        fqv5.setTexture(this.a.c("themeSimple3"));
        fqv5.setWidth(4);
        fqv5.setX(414);
        fqv5.setY(127);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_02);
        fqv6.setHeight(1);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("themeSimple3"));
        fqv6.setWidth(1);
        fqv6.setX(419);
        fqv6.setY(127);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_02);
        fqv7.setHeight(1);
        fqv7.setPosition(frk_0.j);
        fqv7.setTexture(this.a.c("themeSimple3"));
        fqv7.setWidth(4);
        fqv7.setX(420);
        fqv7.setY(127);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_02);
        fqv8.setHeight(4);
        fqv8.setPosition(frk_0.m);
        fqv8.setTexture(this.a.c("themeSimple3"));
        fqv8.setWidth(4);
        fqv8.setX(414);
        fqv8.setY(128);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_02);
        fqv9.setHeight(4);
        fqv9.setPosition(frk_0.o);
        fqv9.setTexture(this.a.c("themeSimple3"));
        fqv9.setWidth(1);
        fqv9.setX(419);
        fqv9.setY(128);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_02);
        fqv10.setHeight(4);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("themeSimple3"));
        fqv10.setWidth(4);
        fqv10.setX(420);
        fqv10.setY(128);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        return fby_22;
    }
}

