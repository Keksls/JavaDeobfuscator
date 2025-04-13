/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cGW {
    public static final String PACKAGE = "wakfu.fightCreationOrPlacement";

    public static void lockFight() {
        fvk_0 fvk_02 = cxu_0.a().c();
        if (fvk_02 != null) {
            fup_0 fup_02;
            fup_02.setSelected(!(fup_02 = (fup_0)fvk_02.getElementMap().a("lockFightBtn")).getSelected());
            cGW.lockFight(null, fup_02);
        }
    }

    public static void lockFight(fzs fzs2, fup_0 fup_02) {
        dfc dfc2 = new dfc();
        dfc2.a(fup_02.getSelected());
        dfc2.a_(18455);
        add_2.b().a(dfc2);
    }
}

