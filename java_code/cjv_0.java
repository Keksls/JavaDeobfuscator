/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJv
 */
@fpw_0
public class cjv_0 {
    public static final String PACKAGE = "wakfu.selectItemElements";

    public static void selectDamageElement(fzs fzs2, bHq bHq2) {
        fup_0 fup_02 = (fup_0)fzs2.d();
        bHq2.a(fup_02.getSelected());
        bhz_0 bhz_02 = bhz_0.l;
        if (bhz_02.a(bhz_0.m)) {
            bHq2.a(false);
            fup_02.setSelected(false);
        }
        fis_1.a().a((ajf_1)bhz_02, "checkedDamageNbElements");
    }

    public static void selectResElement(fzs fzs2, bHq bHq2) {
        fup_0 fup_02 = (fup_0)fzs2.d();
        bHq2.a(fup_02.getSelected());
        bhz_0 bhz_02 = bhz_0.l;
        if (bhz_02.a(bhz_0.n)) {
            bHq2.a(false);
            fup_02.setSelected(false);
        }
        fis_1.a().a((ajf_1)bhz_02, "checkedResNbElements");
    }

    public static void valid(fzs fzs2) {
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("setItemElements.question", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
        fzm_02.a(new cJw());
    }
}

