/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cPX
 */
public class cpx_1
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        fso fso2 = fso.checkOut();
        fso2.setElementMap(fyy_03);
        fso2.setStyle("popup");
        fso2.onAttributesInitialized();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setElementMap(fyy_03);
        fid_12.setAlign(frk_0.i);
        fid_12.setSize(new fjf_2(-2, -2));
        fso2.addBasicElement(fid_12);
        fid_12.onAttributesInitialized();
        fid_12.onChildrenAdded();
        fin_2 fin_22 = fin_2.checkOut();
        fin_22.setHorizontal(false);
        fso2.addBasicElement(fin_22);
        fin_22.onAttributesInitialized();
        fin_22.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setStyle("whiteTitle");
        String string = "%group.party.invite.action%";
        string = string.replace("%group.party.invite.action%", fpm_0.b().c("group.party.invite.action"));
        fsM2.c(string);
        fso2.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM2.onChildrenAdded();
        String string2 = "name";
        fug_0 fug_02 = new fug_0();
        fug_02.onCheckOut();
        fug_02.setElementMap(fyy_03);
        if (fyy_03 != null && string2 != null) {
            fyy_03.a(string2, fug_02);
        }
        fso2.addBasicElement(fug_02);
        fug_02.onAttributesInitialized();
        fug_02.onChildrenAdded();
        fso fso3 = fso.checkOut();
        fso3.setElementMap(fyy_03);
        fso2.addBasicElement(fso3);
        fso3.onAttributesInitialized();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fdt_1 fdt_12 = new fdt_1();
        fdt_12.a("wakfu.partyList:invite(name)");
        fru_02.setOnClick(fdt_12);
        String string3 = "%ok%";
        string3 = string3.replace("%ok%", fpm_0.b().c("ok"));
        fru_02.setText(string3);
        fso3.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fru_02.onChildrenAdded();
        fru_0 fru_03 = new fru_0();
        fru_03.onCheckOut();
        fru_03.setElementMap(fyy_03);
        fdt_1 fdt_13 = new fdt_1();
        fdt_13.a("unloadDialog");
        fru_03.setOnClick(fdt_13);
        String string4 = "%cancel%";
        string4 = string4.replace("%cancel%", fpm_0.b().c("cancel"));
        fru_03.setText(string4);
        fso3.addBasicElement(fru_03);
        fru_03.onAttributesInitialized();
        fru_03.onChildrenAdded();
        fso3.onChildrenAdded();
        fso2.onChildrenAdded();
        return fso2;
    }
}

