/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from eao
 */
public class eao_1
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqj fqj2 = fvE3.getAppearance();
        fqj2.setElementMap(fyy_03);
        fvE2.addBasicElement(fqj2);
        fqj2.onAttributesInitialized();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new azf_2(0.0f, 0.0f, 0.0f, 0.0f));
        fqg_02.setName("mouseOverCell");
        fqj2.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fqg_0 fqg_03 = fqg_0.checkOut();
        fqg_03.setElementMap(fyy_03);
        fqg_03.setColor(new azf_2(0.0f, 0.0f, 0.0f, 0.0f));
        fqg_03.setName("selected");
        fqj2.addBasicElement(fqg_03);
        fqg_03.onAttributesInitialized();
        fqg_03.onChildrenAdded();
        fqg_0 fqg_04 = fqg_0.checkOut();
        fqg_04.setElementMap(fyy_03);
        fqg_04.setColor(new fyr_0("marketTableEvenCellColor"));
        fqg_04.setName("evenCell");
        fqj2.addBasicElement(fqg_04);
        fqg_04.onAttributesInitialized();
        fqg_04.onChildrenAdded();
        fqg_0 fqg_05 = fqg_0.checkOut();
        fqg_05.setElementMap(fyy_03);
        fqg_05.setColor(new fyr_0("marketTableOddCellColor"));
        fqg_05.setName("oddCell");
        fqj2.addBasicElement(fqg_05);
        fqg_05.onAttributesInitialized();
        fqg_05.onChildrenAdded();
        fvE fvE4 = fqj2.getParentOfType(fvE.class);
        fvE fvE5 = fvE4.getWidgetByThemeElementName("scrollBar", false);
        if (fvE5 != null) {
            fqv fqv2;
            fyg_0 fyg_02;
            fyb_0 fyb_02;
            fyg_0 fyg_03;
            fyb_0 fyb_03;
            fyb_0 fyb_04;
            fyb_0 fyb_05;
            fyb_0 fyb_06;
            fyb_0 fyb_07;
            fyg_0 fyg_04;
            fyb_0 fyb_08;
            fyb_0 fyb_09;
            fyb_0 fyb_010;
            fvE fvE6;
            fyb_0 fyb_011;
            fvE fvE7 = fvE5;
            fqj fqj3 = fvE7.getAppearance();
            fqj3.setElementMap(fyy_03);
            fvE5.addBasicElement(fqj3);
            fqj3.onAttributesInitialized();
            fvE fvE8 = fqj3.getParentOfType(fvE.class);
            fqj fqj4 = fvE8.getAppearance();
            fqj4.setElementMap(fyy_03);
            fqj4.onAttributesInitialized();
            fvE fvE9 = fqj4.getParentOfType(fvE.class);
            fvE fvE10 = fvE9.getWidgetByThemeElementName("verticalIncreaseButton", false);
            if (fvE10 != null) {
                fyb_011 = new fqo_0();
                ((fql_0)fyb_011).onCheckOut();
                fyb_011.setElementMap(fyy_03);
                ((fql_0)fyb_011).setInsets(new Insets(1, 1, 1, 1));
                fvE10.addBasicElement(fyb_011);
                fyb_011.onAttributesInitialized();
                fyb_011.onChildrenAdded();
                fvE6 = fvE10;
                fyb_010 = (fqd_0)fvE6.getAppearance();
                fyb_010.setElementMap(fyy_03);
                ((fqj)fyb_010).setState("default");
                fvE10.addBasicElement(fyb_010);
                fyb_010.onAttributesInitialized();
                fyb_09 = fqv.checkOut();
                fyb_09.setElementMap(fyy_03);
                ((fqv)fyb_09).setHeight(6);
                ((fqv)fyb_09).setPosition(frk_0.i);
                ((fqv)fyb_09).setTexture(this.a.c("txScrollbarButton"));
                ((fqv)fyb_09).setWidth(8);
                ((fqv)fyb_09).setX(0);
                ((fqv)fyb_09).setY(0);
                fyb_010.addBasicElement(fyb_09);
                fyb_09.onAttributesInitialized();
                fyb_09.onChildrenAdded();
                fyb_010.onChildrenAdded();
                fyb_08 = fvE10;
                fyg_04 = (fqd_0)((fvE)fyb_08).getAppearance();
                fyg_04.setElementMap(fyy_03);
                ((fqj)fyg_04).setState("mouseHover");
                fvE10.addBasicElement(fyg_04);
                fyg_04.onAttributesInitialized();
                fyb_07 = fqv.checkOut();
                fyb_07.setElementMap(fyy_03);
                ((fqv)fyb_07).setHeight(6);
                ((fqv)fyb_07).setPosition(frk_0.i);
                ((fqv)fyb_07).setTexture(this.a.c("txScrollbarButton"));
                ((fqv)fyb_07).setWidth(8);
                ((fqv)fyb_07).setX(0);
                ((fqv)fyb_07).setY(8);
                fyg_04.addBasicElement(fyb_07);
                fyb_07.onAttributesInitialized();
                fyb_07.onChildrenAdded();
                fyg_04.onChildrenAdded();
                fyb_06 = fvE10;
                fyb_05 = (fqd_0)((fvE)fyb_06).getAppearance();
                fyb_05.setElementMap(fyy_03);
                ((fqj)fyb_05).setState("pressed");
                fvE10.addBasicElement(fyb_05);
                fyb_05.onAttributesInitialized();
                fyb_04 = fqv.checkOut();
                fyb_04.setElementMap(fyy_03);
                ((fqv)fyb_04).setHeight(6);
                ((fqv)fyb_04).setPosition(frk_0.i);
                ((fqv)fyb_04).setTexture(this.a.c("txScrollbarButton"));
                ((fqv)fyb_04).setWidth(8);
                ((fqv)fyb_04).setX(0);
                ((fqv)fyb_04).setY(16);
                fyb_05.addBasicElement(fyb_04);
                fyb_04.onAttributesInitialized();
                fyb_04.onChildrenAdded();
                fyb_05.onChildrenAdded();
                fyb_03 = fvE10;
                fyg_03 = (fqd_0)((fvE)fyb_03).getAppearance();
                fyg_03.setElementMap(fyy_03);
                ((fqj)fyg_03).setState("disabled");
                fvE10.addBasicElement(fyg_03);
                fyg_03.onAttributesInitialized();
                fyb_02 = fqv.checkOut();
                fyb_02.setElementMap(fyy_03);
                ((fqv)fyb_02).setHeight(6);
                ((fqv)fyb_02).setPosition(frk_0.i);
                ((fqv)fyb_02).setTexture(this.a.c("txScrollbarButton"));
                ((fqv)fyb_02).setWidth(8);
                ((fqv)fyb_02).setX(0);
                ((fqv)fyb_02).setY(24);
                fyg_03.addBasicElement(fyb_02);
                fyb_02.onAttributesInitialized();
                fyb_02.onChildrenAdded();
                fyg_03.onChildrenAdded();
            }
            if ((fvE6 = ((fvE)(fyb_011 = fqj4.getParentOfType(fvE.class))).getWidgetByThemeElementName("verticalDecreaseButton", false)) != null) {
                fyb_010 = new fqo_0();
                ((fql_0)fyb_010).onCheckOut();
                fyb_010.setElementMap(fyy_03);
                ((fql_0)fyb_010).setInsets(new Insets(1, 1, 1, 1));
                fvE6.addBasicElement(fyb_010);
                fyb_010.onAttributesInitialized();
                fyb_010.onChildrenAdded();
                fyb_09 = fvE6;
                fyb_08 = (fqd_0)((fvE)fyb_09).getAppearance();
                fyb_08.setElementMap(fyy_03);
                ((fqj)fyb_08).setState("default");
                fvE6.addBasicElement(fyb_08);
                fyb_08.onAttributesInitialized();
                fyg_04 = fqv.checkOut();
                fyg_04.setElementMap(fyy_03);
                ((fqv)fyg_04).setFlipVerticaly(true);
                ((fqv)fyg_04).setHeight(6);
                ((fqv)fyg_04).setPosition(frk_0.i);
                ((fqv)fyg_04).setTexture(this.a.c("txScrollbarButton"));
                ((fqv)fyg_04).setWidth(8);
                ((fqv)fyg_04).setX(0);
                ((fqv)fyg_04).setY(0);
                fyb_08.addBasicElement(fyg_04);
                fyg_04.onAttributesInitialized();
                fyg_04.onChildrenAdded();
                fyb_08.onChildrenAdded();
                fyb_07 = fvE6;
                fyb_06 = (fqd_0)((fvE)fyb_07).getAppearance();
                fyb_06.setElementMap(fyy_03);
                ((fqj)fyb_06).setState("mouseHover");
                fvE6.addBasicElement(fyb_06);
                fyb_06.onAttributesInitialized();
                fyb_05 = fqv.checkOut();
                fyb_05.setElementMap(fyy_03);
                ((fqv)fyb_05).setFlipVerticaly(true);
                ((fqv)fyb_05).setHeight(6);
                ((fqv)fyb_05).setPosition(frk_0.i);
                ((fqv)fyb_05).setTexture(this.a.c("txScrollbarButton"));
                ((fqv)fyb_05).setWidth(8);
                ((fqv)fyb_05).setX(0);
                ((fqv)fyb_05).setY(8);
                fyb_06.addBasicElement(fyb_05);
                fyb_05.onAttributesInitialized();
                fyb_05.onChildrenAdded();
                fyb_06.onChildrenAdded();
                fyb_04 = fvE6;
                fyb_03 = (fqd_0)((fvE)fyb_04).getAppearance();
                fyb_03.setElementMap(fyy_03);
                ((fqj)fyb_03).setState("pressed");
                fvE6.addBasicElement(fyb_03);
                fyb_03.onAttributesInitialized();
                fyg_03 = fqv.checkOut();
                fyg_03.setElementMap(fyy_03);
                ((fqv)fyg_03).setFlipVerticaly(true);
                ((fqv)fyg_03).setHeight(6);
                ((fqv)fyg_03).setPosition(frk_0.i);
                ((fqv)fyg_03).setTexture(this.a.c("txScrollbarButton"));
                ((fqv)fyg_03).setWidth(8);
                ((fqv)fyg_03).setX(0);
                ((fqv)fyg_03).setY(16);
                fyb_03.addBasicElement(fyg_03);
                fyg_03.onAttributesInitialized();
                fyg_03.onChildrenAdded();
                fyb_03.onChildrenAdded();
                fyb_02 = fvE6;
                fyg_02 = (fqd_0)((fvE)fyb_02).getAppearance();
                fyg_02.setElementMap(fyy_03);
                ((fqj)fyg_02).setState("disabled");
                fvE6.addBasicElement(fyg_02);
                fyg_02.onAttributesInitialized();
                fqv2 = fqv.checkOut();
                fqv2.setElementMap(fyy_03);
                fqv2.setFlipVerticaly(true);
                fqv2.setHeight(6);
                fqv2.setPosition(frk_0.i);
                fqv2.setTexture(this.a.c("txScrollbarButton"));
                fqv2.setWidth(8);
                fqv2.setX(0);
                fqv2.setY(24);
                fyg_02.addBasicElement(fqv2);
                fqv2.onAttributesInitialized();
                fqv2.onChildrenAdded();
                fyg_02.onChildrenAdded();
            }
            if ((fyb_09 = ((fvE)(fyb_010 = fqj4.getParentOfType(fvE.class))).getWidgetByThemeElementName("verticalSlider", false)) != null) {
                fyb_08 = fyb_09;
                fyg_04 = ((fvE)fyb_08).getAppearance();
                fyg_04.setElementMap(fyy_03);
                fyb_09.addBasicElement(fyg_04);
                fyg_04.onAttributesInitialized();
                fyb_07 = fyg_04.getParentOfType(fvE.class);
                fyb_06 = ((fvE)fyb_07).getWidgetByThemeElementName("verticalButton", false);
                if (fyb_06 != null) {
                    fyb_05 = fyb_06;
                    fyb_04 = (fqd_0)((fvE)fyb_05).getAppearance();
                    fyb_04.setElementMap(fyy_03);
                    ((fqj)fyb_04).setState("default");
                    fyb_06.addBasicElement(fyb_04);
                    fyb_04.onAttributesInitialized();
                    fyb_03 = fby_2.checkOut();
                    fyb_03.setElementMap(fyy_03);
                    ((fbk_1)fyb_03).setEnabled(true);
                    ((fby_2)fyb_03).setScaled(true);
                    fyb_04.addBasicElement(fyb_03);
                    fyb_03.onAttributesInitialized();
                    fyg_03 = fqv.checkOut();
                    fyg_03.setElementMap(fyy_03);
                    ((fqv)fyg_03).setHeight(4);
                    ((fqv)fyg_03).setPosition(frk_0.a);
                    ((fqv)fyg_03).setTexture(this.a.c("txScrollbarSlider"));
                    ((fqv)fyg_03).setWidth(4);
                    ((fqv)fyg_03).setX(0);
                    ((fqv)fyg_03).setY(0);
                    fyb_03.addBasicElement(fyg_03);
                    fyg_03.onAttributesInitialized();
                    fyg_03.onChildrenAdded();
                    fyb_02 = fqv.checkOut();
                    fyb_02.setElementMap(fyy_03);
                    ((fqv)fyb_02).setHeight(1);
                    ((fqv)fyb_02).setPosition(frk_0.h);
                    ((fqv)fyb_02).setTexture(this.a.c("txScrollbarSlider"));
                    ((fqv)fyb_02).setWidth(4);
                    ((fqv)fyb_02).setX(0);
                    ((fqv)fyb_02).setY(4);
                    fyb_03.addBasicElement(fyb_02);
                    fyb_02.onAttributesInitialized();
                    fyb_02.onChildrenAdded();
                    fyg_02 = fqv.checkOut();
                    fyg_02.setElementMap(fyy_03);
                    ((fqv)fyg_02).setHeight(4);
                    ((fqv)fyg_02).setPosition(frk_0.m);
                    ((fqv)fyg_02).setTexture(this.a.c("txScrollbarSlider"));
                    ((fqv)fyg_02).setWidth(4);
                    ((fqv)fyg_02).setX(0);
                    ((fqv)fyg_02).setY(12);
                    fyb_03.addBasicElement(fyg_02);
                    fyg_02.onAttributesInitialized();
                    fyg_02.onChildrenAdded();
                    fqv2 = fqv.checkOut();
                    fqv2.setElementMap(fyy_03);
                    fqv2.setHeight(4);
                    fqv2.setPosition(frk_0.c);
                    fqv2.setTexture(this.a.c("txScrollbarSlider"));
                    fqv2.setWidth(1);
                    fqv2.setX(3);
                    fqv2.setY(0);
                    fyb_03.addBasicElement(fqv2);
                    fqv2.onAttributesInitialized();
                    fqv2.onChildrenAdded();
                    fqv fqv3 = fqv.checkOut();
                    fqv3.setElementMap(fyy_03);
                    fqv3.setHeight(1);
                    fqv3.setPosition(frk_0.i);
                    fqv3.setTexture(this.a.c("txScrollbarSlider"));
                    fqv3.setWidth(1);
                    fqv3.setX(3);
                    fqv3.setY(4);
                    fyb_03.addBasicElement(fqv3);
                    fqv3.onAttributesInitialized();
                    fqv3.onChildrenAdded();
                    fqv fqv4 = fqv.checkOut();
                    fqv4.setElementMap(fyy_03);
                    fqv4.setHeight(4);
                    fqv4.setPosition(frk_0.o);
                    fqv4.setTexture(this.a.c("txScrollbarSlider"));
                    fqv4.setWidth(1);
                    fqv4.setX(3);
                    fqv4.setY(12);
                    fyb_03.addBasicElement(fqv4);
                    fqv4.onAttributesInitialized();
                    fqv4.onChildrenAdded();
                    fqv fqv5 = fqv.checkOut();
                    fqv5.setElementMap(fyy_03);
                    fqv5.setHeight(4);
                    fqv5.setPosition(frk_0.e);
                    fqv5.setTexture(this.a.c("txScrollbarSlider"));
                    fqv5.setWidth(4);
                    fqv5.setX(4);
                    fqv5.setY(0);
                    fyb_03.addBasicElement(fqv5);
                    fqv5.onAttributesInitialized();
                    fqv5.onChildrenAdded();
                    fqv fqv6 = fqv.checkOut();
                    fqv6.setElementMap(fyy_03);
                    fqv6.setHeight(1);
                    fqv6.setPosition(frk_0.j);
                    fqv6.setTexture(this.a.c("txScrollbarSlider"));
                    fqv6.setWidth(4);
                    fqv6.setX(4);
                    fqv6.setY(4);
                    fyb_03.addBasicElement(fqv6);
                    fqv6.onAttributesInitialized();
                    fqv6.onChildrenAdded();
                    fqv fqv7 = fqv.checkOut();
                    fqv7.setElementMap(fyy_03);
                    fqv7.setHeight(4);
                    fqv7.setPosition(frk_0.q);
                    fqv7.setTexture(this.a.c("txScrollbarSlider"));
                    fqv7.setWidth(4);
                    fqv7.setX(4);
                    fqv7.setY(12);
                    fyb_03.addBasicElement(fqv7);
                    fqv7.onAttributesInitialized();
                    fqv7.onChildrenAdded();
                    fyb_03.onChildrenAdded();
                    fqv fqv8 = fqv.checkOut();
                    fqv8.setElementMap(fyy_03);
                    fqv8.setHeight(0);
                    fqv8.setPosition(frk_0.i);
                    fqv8.setTexture(this.a.c("txScrollbarSlider"));
                    fqv8.setWidth(0);
                    fqv8.setX(0);
                    fqv8.setY(16);
                    fyb_04.addBasicElement(fqv8);
                    fqv8.onAttributesInitialized();
                    fqv8.onChildrenAdded();
                    fyb_04.onChildrenAdded();
                    fvE fvE11 = (fvE)fyb_06;
                    fqd_0 fqd_02 = (fqd_0)fvE11.getAppearance();
                    fqd_02.setElementMap(fyy_03);
                    fqd_02.setState("mouseHover");
                    fyb_06.addBasicElement(fqd_02);
                    fqd_02.onAttributesInitialized();
                    fby_2 fby_22 = fby_2.checkOut();
                    fby_22.setElementMap(fyy_03);
                    fby_22.setScaled(true);
                    fqd_02.addBasicElement(fby_22);
                    fby_22.onAttributesInitialized();
                    fqv fqv9 = fqv.checkOut();
                    fqv9.setElementMap(fyy_03);
                    fqv9.setHeight(4);
                    fqv9.setPosition(frk_0.a);
                    fqv9.setTexture(this.a.c("txScrollbarSlider"));
                    fqv9.setWidth(4);
                    fqv9.setX(0);
                    fqv9.setY(18);
                    fby_22.addBasicElement(fqv9);
                    fqv9.onAttributesInitialized();
                    fqv9.onChildrenAdded();
                    fqv fqv10 = fqv.checkOut();
                    fqv10.setElementMap(fyy_03);
                    fqv10.setHeight(1);
                    fqv10.setPosition(frk_0.h);
                    fqv10.setTexture(this.a.c("txScrollbarSlider"));
                    fqv10.setWidth(4);
                    fqv10.setX(0);
                    fqv10.setY(22);
                    fby_22.addBasicElement(fqv10);
                    fqv10.onAttributesInitialized();
                    fqv10.onChildrenAdded();
                    fqv fqv11 = fqv.checkOut();
                    fqv11.setElementMap(fyy_03);
                    fqv11.setHeight(4);
                    fqv11.setPosition(frk_0.m);
                    fqv11.setTexture(this.a.c("txScrollbarSlider"));
                    fqv11.setWidth(4);
                    fqv11.setX(0);
                    fqv11.setY(30);
                    fby_22.addBasicElement(fqv11);
                    fqv11.onAttributesInitialized();
                    fqv11.onChildrenAdded();
                    fqv fqv12 = fqv.checkOut();
                    fqv12.setElementMap(fyy_03);
                    fqv12.setHeight(4);
                    fqv12.setPosition(frk_0.c);
                    fqv12.setTexture(this.a.c("txScrollbarSlider"));
                    fqv12.setWidth(1);
                    fqv12.setX(3);
                    fqv12.setY(18);
                    fby_22.addBasicElement(fqv12);
                    fqv12.onAttributesInitialized();
                    fqv12.onChildrenAdded();
                    fqv fqv13 = fqv.checkOut();
                    fqv13.setElementMap(fyy_03);
                    fqv13.setHeight(1);
                    fqv13.setPosition(frk_0.i);
                    fqv13.setTexture(this.a.c("txScrollbarSlider"));
                    fqv13.setWidth(1);
                    fqv13.setX(3);
                    fqv13.setY(22);
                    fby_22.addBasicElement(fqv13);
                    fqv13.onAttributesInitialized();
                    fqv13.onChildrenAdded();
                    fqv fqv14 = fqv.checkOut();
                    fqv14.setElementMap(fyy_03);
                    fqv14.setHeight(4);
                    fqv14.setPosition(frk_0.o);
                    fqv14.setTexture(this.a.c("txScrollbarSlider"));
                    fqv14.setWidth(1);
                    fqv14.setX(3);
                    fqv14.setY(30);
                    fby_22.addBasicElement(fqv14);
                    fqv14.onAttributesInitialized();
                    fqv14.onChildrenAdded();
                    fqv fqv15 = fqv.checkOut();
                    fqv15.setElementMap(fyy_03);
                    fqv15.setHeight(4);
                    fqv15.setPosition(frk_0.e);
                    fqv15.setTexture(this.a.c("txScrollbarSlider"));
                    fqv15.setWidth(4);
                    fqv15.setX(4);
                    fqv15.setY(18);
                    fby_22.addBasicElement(fqv15);
                    fqv15.onAttributesInitialized();
                    fqv15.onChildrenAdded();
                    fqv fqv16 = fqv.checkOut();
                    fqv16.setElementMap(fyy_03);
                    fqv16.setHeight(1);
                    fqv16.setPosition(frk_0.j);
                    fqv16.setTexture(this.a.c("txScrollbarSlider"));
                    fqv16.setWidth(4);
                    fqv16.setX(4);
                    fqv16.setY(22);
                    fby_22.addBasicElement(fqv16);
                    fqv16.onAttributesInitialized();
                    fqv16.onChildrenAdded();
                    fqv fqv17 = fqv.checkOut();
                    fqv17.setElementMap(fyy_03);
                    fqv17.setHeight(4);
                    fqv17.setPosition(frk_0.q);
                    fqv17.setTexture(this.a.c("txScrollbarSlider"));
                    fqv17.setWidth(4);
                    fqv17.setX(4);
                    fqv17.setY(30);
                    fby_22.addBasicElement(fqv17);
                    fqv17.onAttributesInitialized();
                    fqv17.onChildrenAdded();
                    fby_22.onChildrenAdded();
                    fqd_02.onChildrenAdded();
                    fvE fvE12 = (fvE)fyb_06;
                    fqd_0 fqd_03 = (fqd_0)fvE12.getAppearance();
                    fqd_03.setElementMap(fyy_03);
                    fqd_03.setState("pressed");
                    fyb_06.addBasicElement(fqd_03);
                    fqd_03.onAttributesInitialized();
                    fby_2 fby_23 = fby_2.checkOut();
                    fby_23.setElementMap(fyy_03);
                    fby_23.setScaled(true);
                    fqd_03.addBasicElement(fby_23);
                    fby_23.onAttributesInitialized();
                    fqv fqv18 = fqv.checkOut();
                    fqv18.setElementMap(fyy_03);
                    fqv18.setHeight(4);
                    fqv18.setPosition(frk_0.a);
                    fqv18.setTexture(this.a.c("txScrollbarSlider"));
                    fqv18.setWidth(4);
                    fqv18.setX(0);
                    fqv18.setY(36);
                    fby_23.addBasicElement(fqv18);
                    fqv18.onAttributesInitialized();
                    fqv18.onChildrenAdded();
                    fqv fqv19 = fqv.checkOut();
                    fqv19.setElementMap(fyy_03);
                    fqv19.setHeight(1);
                    fqv19.setPosition(frk_0.h);
                    fqv19.setTexture(this.a.c("txScrollbarSlider"));
                    fqv19.setWidth(4);
                    fqv19.setX(0);
                    fqv19.setY(40);
                    fby_23.addBasicElement(fqv19);
                    fqv19.onAttributesInitialized();
                    fqv19.onChildrenAdded();
                    fqv fqv20 = fqv.checkOut();
                    fqv20.setElementMap(fyy_03);
                    fqv20.setHeight(4);
                    fqv20.setPosition(frk_0.m);
                    fqv20.setTexture(this.a.c("txScrollbarSlider"));
                    fqv20.setWidth(4);
                    fqv20.setX(0);
                    fqv20.setY(48);
                    fby_23.addBasicElement(fqv20);
                    fqv20.onAttributesInitialized();
                    fqv20.onChildrenAdded();
                    this.a(fby_23);
                    this.b(fby_23);
                    this.c(fby_23);
                    this.d(fby_23);
                    this.e(fby_23);
                    this.f(fby_23);
                    fby_23.onChildrenAdded();
                    fqd_03.onChildrenAdded();
                    this.g(fyb_06);
                }
                this.h(fyg_04);
                fyg_04.onChildrenAdded();
            }
            fqj4.onChildrenAdded();
            fqj3.onChildrenAdded();
        }
        fqj2.onChildrenAdded();
    }

    public fyo a(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.c);
        fqv2.setTexture(this.a.c("txScrollbarSlider"));
        fqv2.setWidth(1);
        fqv2.setX(3);
        fqv2.setY(36);
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
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("txScrollbarSlider"));
        fqv2.setWidth(1);
        fqv2.setX(3);
        fqv2.setY(40);
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
        fqv2.setPosition(frk_0.o);
        fqv2.setTexture(this.a.c("txScrollbarSlider"));
        fqv2.setWidth(1);
        fqv2.setX(3);
        fqv2.setY(48);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo d(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.e);
        fqv2.setTexture(this.a.c("txScrollbarSlider"));
        fqv2.setWidth(4);
        fqv2.setX(4);
        fqv2.setY(36);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo e(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(1);
        fqv2.setPosition(frk_0.j);
        fqv2.setTexture(this.a.c("txScrollbarSlider"));
        fqv2.setWidth(4);
        fqv2.setX(4);
        fqv2.setY(40);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo f(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.q);
        fqv2.setTexture(this.a.c("txScrollbarSlider"));
        fqv2.setWidth(4);
        fqv2.setX(4);
        fqv2.setY(48);
        fyo2.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        return fqv2;
    }

    public fyo g(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fvE fvE2 = (fvE)fyo2;
        fqd_0 fqd_02 = (fqd_0)fvE2.getAppearance();
        fqd_02.setElementMap(fyy_02);
        fqd_02.setState("disabled");
        fyo2.addBasicElement(fqd_02);
        fqd_02.onAttributesInitialized();
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_02);
        fby_22.setScaled(true);
        fqd_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(4);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("txScrollbarSlider"));
        fqv2.setWidth(4);
        fqv2.setX(0);
        fqv2.setY(54);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_02);
        fqv3.setHeight(1);
        fqv3.setPosition(frk_0.h);
        fqv3.setTexture(this.a.c("txScrollbarSlider"));
        fqv3.setWidth(4);
        fqv3.setX(0);
        fqv3.setY(58);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_02);
        fqv4.setHeight(4);
        fqv4.setPosition(frk_0.m);
        fqv4.setTexture(this.a.c("txScrollbarSlider"));
        fqv4.setWidth(4);
        fqv4.setX(0);
        fqv4.setY(66);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_02);
        fqv5.setHeight(4);
        fqv5.setPosition(frk_0.c);
        fqv5.setTexture(this.a.c("txScrollbarSlider"));
        fqv5.setWidth(1);
        fqv5.setX(3);
        fqv5.setY(54);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_02);
        fqv6.setHeight(1);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("txScrollbarSlider"));
        fqv6.setWidth(1);
        fqv6.setX(3);
        fqv6.setY(58);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_02);
        fqv7.setHeight(4);
        fqv7.setPosition(frk_0.o);
        fqv7.setTexture(this.a.c("txScrollbarSlider"));
        fqv7.setWidth(1);
        fqv7.setX(3);
        fqv7.setY(66);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_02);
        fqv8.setHeight(4);
        fqv8.setPosition(frk_0.e);
        fqv8.setTexture(this.a.c("txScrollbarSlider"));
        fqv8.setWidth(4);
        fqv8.setX(4);
        fqv8.setY(54);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_02);
        fqv9.setHeight(1);
        fqv9.setPosition(frk_0.j);
        fqv9.setTexture(this.a.c("txScrollbarSlider"));
        fqv9.setWidth(4);
        fqv9.setX(4);
        fqv9.setY(58);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_02);
        fqv10.setHeight(4);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("txScrollbarSlider"));
        fqv10.setWidth(4);
        fqv10.setX(4);
        fqv10.setY(66);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqd_02.onChildrenAdded();
        return fqd_02;
    }

    public fyo h(fyo fyo2) {
        fyy_0 fyy_02 = this.b.peek();
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_02);
        fby_22.setEnabled(true);
        fby_22.setScaled(true);
        fyo2.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_02);
        fqv2.setHeight(3);
        fqv2.setPosition(frk_0.a);
        fqv2.setTexture(this.a.c("txScrollbarBackground"));
        fqv2.setWidth(3);
        fqv2.setX(0);
        fqv2.setY(0);
        fby_22.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_02);
        fqv3.setHeight(0);
        fqv3.setPosition(frk_0.h);
        fqv3.setTexture(this.a.c("txScrollbarBackground"));
        fqv3.setWidth(3);
        fqv3.setX(0);
        fqv3.setY(4);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_02);
        fqv4.setHeight(3);
        fqv4.setPosition(frk_0.m);
        fqv4.setTexture(this.a.c("txScrollbarBackground"));
        fqv4.setWidth(3);
        fqv4.setX(0);
        fqv4.setY(13);
        fby_22.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_02);
        fqv5.setHeight(3);
        fqv5.setPosition(frk_0.c);
        fqv5.setTexture(this.a.c("txScrollbarBackground"));
        fqv5.setWidth(1);
        fqv5.setX(2);
        fqv5.setY(0);
        fby_22.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_02);
        fqv6.setHeight(0);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("txScrollbarBackground"));
        fqv6.setWidth(1);
        fqv6.setX(2);
        fqv6.setY(4);
        fby_22.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_02);
        fqv7.setHeight(3);
        fqv7.setPosition(frk_0.o);
        fqv7.setTexture(this.a.c("txScrollbarBackground"));
        fqv7.setWidth(1);
        fqv7.setX(2);
        fqv7.setY(13);
        fby_22.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_02);
        fqv8.setHeight(3);
        fqv8.setPosition(frk_0.e);
        fqv8.setTexture(this.a.c("txScrollbarBackground"));
        fqv8.setWidth(3);
        fqv8.setX(3);
        fqv8.setY(0);
        fby_22.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_02);
        fqv9.setHeight(0);
        fqv9.setPosition(frk_0.j);
        fqv9.setTexture(this.a.c("txScrollbarBackground"));
        fqv9.setWidth(3);
        fqv9.setX(3);
        fqv9.setY(4);
        fby_22.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fqv fqv10 = fqv.checkOut();
        fqv10.setElementMap(fyy_02);
        fqv10.setHeight(3);
        fqv10.setPosition(frk_0.q);
        fqv10.setTexture(this.a.c("txScrollbarBackground"));
        fqv10.setWidth(3);
        fqv10.setX(3);
        fqv10.setY(13);
        fby_22.addBasicElement(fqv10);
        fqv10.onAttributesInitialized();
        fqv10.onChildrenAdded();
        fby_22.onChildrenAdded();
        return fby_22;
    }
}

