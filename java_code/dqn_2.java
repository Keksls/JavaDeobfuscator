/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dqn
 */
public class dqn_2
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
        String string = "pmPasteWhite100";
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fqv2);
        }
        fqv2.setHeight(16);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("txPaste"));
        fqv2.setWidth(16);
        fqv2.setX(2);
        fqv2.setY(46);
        fqd_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        String string2 = "pmbDefaultButtonSecondarySmall";
        fby_2 fby_22 = fby_2.checkOut();
        fby_22.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fby_22);
        }
        fqd_02.addBasicElement(fby_22);
        fby_22.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(36);
        fqv3.setPosition(frk_0.i);
        fqv3.setTexture(this.a.c("txSecondaryButtonSmall"));
        fqv3.setWidth(36);
        fqv3.setX(0);
        fqv3.setY(0);
        fby_22.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fby_22.onChildrenAdded();
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
        String string3 = "pmPasteWhite100";
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        if (fyy_03 != null && string3 != null) {
            fyy_03.a(string3, fqv4);
        }
        fqv4.setHeight(16);
        fqv4.setPosition(frk_0.i);
        fqv4.setTexture(this.a.c("txPaste"));
        fqv4.setWidth(16);
        fqv4.setX(2);
        fqv4.setY(46);
        fqd_03.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        String string4 = "pmbHoverButtonSecondarySmall";
        fby_2 fby_23 = fby_2.checkOut();
        fby_23.setElementMap(fyy_03);
        if (fyy_03 != null && string4 != null) {
            fyy_03.a(string4, fby_23);
        }
        fqd_03.addBasicElement(fby_23);
        fby_23.onAttributesInitialized();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(36);
        fqv5.setPosition(frk_0.i);
        fqv5.setTexture(this.a.c("txSecondaryButtonSmall"));
        fqv5.setWidth(36);
        fqv5.setX(0);
        fqv5.setY(38);
        fby_23.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fby_23.onChildrenAdded();
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
        String string5 = "pmPasteWhite100";
        fqv fqv6 = fqv.checkOut();
        fqv6.setElementMap(fyy_03);
        if (fyy_03 != null && string5 != null) {
            fyy_03.a(string5, fqv6);
        }
        fqv6.setHeight(16);
        fqv6.setPosition(frk_0.i);
        fqv6.setTexture(this.a.c("txPaste"));
        fqv6.setWidth(16);
        fqv6.setX(2);
        fqv6.setY(46);
        fqd_04.addBasicElement(fqv6);
        fqv6.onAttributesInitialized();
        fqv6.onChildrenAdded();
        String string6 = "pmbPressedButtonSecondarySmall";
        fby_2 fby_24 = fby_2.checkOut();
        fby_24.setElementMap(fyy_03);
        if (fyy_03 != null && string6 != null) {
            fyy_03.a(string6, fby_24);
        }
        fqd_04.addBasicElement(fby_24);
        fby_24.onAttributesInitialized();
        fqv fqv7 = fqv.checkOut();
        fqv7.setElementMap(fyy_03);
        fqv7.setHeight(36);
        fqv7.setPosition(frk_0.i);
        fqv7.setTexture(this.a.c("txSecondaryButtonSmall"));
        fqv7.setWidth(36);
        fqv7.setX(0);
        fqv7.setY(76);
        fby_24.addBasicElement(fqv7);
        fqv7.onAttributesInitialized();
        fqv7.onChildrenAdded();
        fby_24.onChildrenAdded();
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
        String string7 = "pmPasteWhite25";
        fqv fqv8 = fqv.checkOut();
        fqv8.setElementMap(fyy_03);
        if (fyy_03 != null && string7 != null) {
            fyy_03.a(string7, fqv8);
        }
        fqv8.setHeight(16);
        fqv8.setPosition(frk_0.i);
        fqv8.setTexture(this.a.c("txPaste"));
        fqv8.setWidth(16);
        fqv8.setX(2);
        fqv8.setY(90);
        fqd_05.addBasicElement(fqv8);
        fqv8.onAttributesInitialized();
        fqv8.onChildrenAdded();
        String string8 = "pmbDisabledButtonSecondarySmall";
        fby_2 fby_25 = fby_2.checkOut();
        fby_25.setElementMap(fyy_03);
        if (fyy_03 != null && string8 != null) {
            fyy_03.a(string8, fby_25);
        }
        fqd_05.addBasicElement(fby_25);
        fby_25.onAttributesInitialized();
        fqv fqv9 = fqv.checkOut();
        fqv9.setElementMap(fyy_03);
        fqv9.setHeight(36);
        fqv9.setPosition(frk_0.i);
        fqv9.setTexture(this.a.c("txSecondaryButtonSmall"));
        fqv9.setWidth(36);
        fqv9.setX(0);
        fqv9.setY(114);
        fby_25.addBasicElement(fqv9);
        fqv9.onAttributesInitialized();
        fqv9.onChildrenAdded();
        fby_25.onChildrenAdded();
        fqd_05.onChildrenAdded();
    }
}

