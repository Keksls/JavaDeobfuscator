/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class dnX
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
        String string = "transferRightDefaultPixmap";
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fqv2);
        }
        fqv2.setHeight(22);
        fqv2.setTexture(this.a.c("themeDefault"));
        fqv2.setWidth(22);
        fqv2.setX(903);
        fqv2.setY(260);
        fqd_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        fqd_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(36);
        fqv3.setTexture(this.a.c("themeDefault"));
        fqv3.setWidth(33);
        fqv3.setX(915);
        fqv3.setY(284);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fby_22.onChildrenAdded();
        fqd_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqd_0 fqd_03 = (fqd_0)fvE4.getAppearance();
        fqd_03.setElementMap(fyy_03);
        fqd_03.setAlignment(frs_0.e);
        fqd_03.setState("mouseHover");
        fvE2.addBasicElement(fqd_03);
        fqd_03.onAttributesInitialized();
        String string2 = "transferRightOverPixmap";
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fqv4);
        }
        fqv4.setHeight(22);
        fqv4.setTexture(this.a.c("themeOver"));
        fqv4.setWidth(22);
        fqv4.setX(903);
        fqv4.setY(260);
        fqd_03.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fby_2 fby_23 = fby_2.checkOut();
        fby_23.setElementMap(fyy_03);
        fqd_03.addBasicElement(fby_23);
        fby_23.onAttributesInitialized();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(36);
        fqv5.setTexture(this.a.c("themeOver"));
        fqv5.setWidth(33);
        fqv5.setX(915);
        fqv5.setY(284);
        fby_23.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fby_23.onChildrenAdded();
        fqd_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqd_0 fqd_04 = (fqd_0)fvE5.getAppearance();
        fqd_04.setElementMap(fyy_03);
        fqd_04.setAlignment(frs_0.e);
        fqd_04.setState("pressed");
        fvE2.addBasicElement(fqd_04);
        fqd_04.onAttributesInitialized();
        String string3 = "transferRightPressedPixmap";
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fqv6);
        }
        fqv6.setHeight(22);
        fqv6.setTexture(this.a.c("themePressed"));
        fqv6.setWidth(22);
        fqv6.setX(903);
        fqv6.setY(260);
        fqd_04.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        fby_2 fby_24 = fby_2.checkOut();
        fby_24.setElementMap(fyy_03);
        fqd_04.addBasicElement(fby_24);
        fby_24.onAttributesInitialized();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(36);
        fqv7.setTexture(this.a.c("themePressed"));
        fqv7.setWidth(33);
        fqv7.setX(915);
        fqv7.setY(284);
        fby_24.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fby_24.onChildrenAdded();
        fqd_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqd_0 fqd_05 = (fqd_0)fvE6.getAppearance();
        fqd_05.setElementMap(fyy_03);
        fqd_05.setAlignment(frs_0.e);
        fqd_05.setState("disabled");
        fvE2.addBasicElement(fqd_05);
        fqd_05.onAttributesInitialized();
        String string4 = "transferRightDisabledPixmap";
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fqv8);
        }
        fqv8.setHeight(22);
        fqv8.setTexture(this.a.c("themeDisabled"));
        fqv8.setWidth(22);
        fqv8.setX(903);
        fqv8.setY(260);
        fqd_05.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        fby_2 fby_25 = fby_2.checkOut();
        fby_25.setElementMap(fyy_03);
        fqd_05.addBasicElement(fby_25);
        fby_25.onAttributesInitialized();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(36);
        fqv9.setTexture(this.a.c("themeDisabled"));
        fqv9.setWidth(33);
        fqv9.setX(915);
        fqv9.setY(284);
        fby_25.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fby_25.onChildrenAdded();
        fqd_05.onChildrenAdded();
    }
}

