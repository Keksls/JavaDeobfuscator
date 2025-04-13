/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dWh
 */
public class dwh_2
implements fyn_0 {
    private fyw_0 a;
    private Stack<fyy_0> b = new Stack();

    @Override
    public void a(fyy_0 fyy_02, fyw_0 fyw_02, fvE fvE2) {
        this.a = fyw_02;
        this.b.push(fyy_02);
        fyy_0 fyy_03 = this.b.peek();
        fvE fvE3 = fvE2;
        fqb_0 fqb_02 = (fqb_0)fvE3.getAppearance();
        fqb_02.setElementMap(fyy_03);
        fqb_02.setAlignment(frs_0.e);
        fqb_02.setState("default");
        fvE2.addBasicElement(fqb_02);
        fqb_02.onAttributesInitialized();
        fqv fqv2 = fqv.checkOut();
        fqv2.setElementMap(fyy_03);
        fqv2.setHeight(28);
        fqv2.setPosition(frk_0.i);
        fqv2.setTexture(this.a.c("themeSimple"));
        fqv2.setWidth(28);
        fqv2.setX(1414);
        fqv2.setY(266);
        fqb_02.addBasicElement(fqv2);
        fqv2.onAttributesInitialized();
        fqv2.onChildrenAdded();
        fqg_0 fqg_02 = fqg_0.checkOut();
        fqg_02.setElementMap(fyy_03);
        fqg_02.setColor(new azf_2(1.0f, 1.0f, 1.0f, 1.0f));
        fqg_02.setDecoratorSwitch(true);
        fqg_02.setName("modulation");
        fqb_02.addBasicElement(fqg_02);
        fqg_02.onAttributesInitialized();
        fqg_02.onChildrenAdded();
        fqb_02.onChildrenAdded();
        fvE fvE4 = fvE2;
        fqb_0 fqb_03 = (fqb_0)fvE4.getAppearance();
        fqb_03.setElementMap(fyy_03);
        fqb_03.setState("pressed");
        fvE2.addBasicElement(fqb_03);
        fqb_03.onAttributesInitialized();
        fqv fqv3 = fqv.checkOut();
        fqv3.setElementMap(fyy_03);
        fqv3.setHeight(28);
        fqv3.setPosition(frk_0.i);
        fqv3.setTexture(this.a.c("themeSimple"));
        fqv3.setWidth(28);
        fqv3.setX(1382);
        fqv3.setY(266);
        fqb_03.addBasicElement(fqv3);
        fqv3.onAttributesInitialized();
        fqv3.onChildrenAdded();
        fqg_0 fqg_03 = fqg_0.checkOut();
        fqg_03.setElementMap(fyy_03);
        fqg_03.setColor(new azf_2(1.0f, 1.0f, 1.0f, 1.0f));
        fqg_03.setDecoratorSwitch(true);
        fqg_03.setName("modulation");
        fqb_03.addBasicElement(fqg_03);
        fqg_03.onAttributesInitialized();
        fqg_03.onChildrenAdded();
        fqb_03.onChildrenAdded();
        fvE fvE5 = fvE2;
        fqb_0 fqb_04 = (fqb_0)fvE5.getAppearance();
        fqb_04.setElementMap(fyy_03);
        fqb_04.setAlignment(frs_0.e);
        fqb_04.setState("disabled");
        fvE2.addBasicElement(fqb_04);
        fqb_04.onAttributesInitialized();
        fqv fqv4 = fqv.checkOut();
        fqv4.setElementMap(fyy_03);
        fqv4.setHeight(28);
        fqv4.setPosition(frk_0.i);
        fqv4.setTexture(this.a.c("themeSimple"));
        fqv4.setWidth(28);
        fqv4.setX(1414);
        fqv4.setY(266);
        fqb_04.addBasicElement(fqv4);
        fqv4.onAttributesInitialized();
        fqv4.onChildrenAdded();
        fqg_0 fqg_04 = fqg_0.checkOut();
        fqg_04.setElementMap(fyy_03);
        fqg_04.setColor(new azf_2(0.7f, 0.7f, 0.7f, 0.4f));
        fqg_04.setDecoratorSwitch(true);
        fqg_04.setName("modulation");
        fqb_04.addBasicElement(fqg_04);
        fqg_04.onAttributesInitialized();
        fqg_04.onChildrenAdded();
        fqb_04.onChildrenAdded();
        fvE fvE6 = fvE2;
        fqb_0 fqb_05 = (fqb_0)fvE6.getAppearance();
        fqb_05.setElementMap(fyy_03);
        fqb_05.setAlignment(frs_0.e);
        fqb_05.setState("selected");
        fvE2.addBasicElement(fqb_05);
        fqb_05.onAttributesInitialized();
        fqv fqv5 = fqv.checkOut();
        fqv5.setElementMap(fyy_03);
        fqv5.setHeight(28);
        fqv5.setPosition(frk_0.i);
        fqv5.setTexture(this.a.c("themeSimple"));
        fqv5.setWidth(28);
        fqv5.setX(1382);
        fqv5.setY(266);
        fqb_05.addBasicElement(fqv5);
        fqv5.onAttributesInitialized();
        fqv5.onChildrenAdded();
        fqg_0 fqg_05 = fqg_0.checkOut();
        fqg_05.setElementMap(fyy_03);
        fqg_05.setColor(new azf_2(1.0f, 1.0f, 1.0f, 1.0f));
        fqg_05.setDecoratorSwitch(true);
        fqg_05.setName("modulation");
        fqb_05.addBasicElement(fqg_05);
        fqg_05.onAttributesInitialized();
        fqg_05.onChildrenAdded();
        fqb_05.onChildrenAdded();
    }
}

