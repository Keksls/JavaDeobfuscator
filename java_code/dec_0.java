/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from deC
 */
public class dec_0
implements adx_1 {
    public boolean a(adt_1 adt_12) {
        byn_2 byn_22 = (byn_2)fis_1.a().e("selectedGuildRank");
        if (byn_22 == null) {
            return false;
        }
        String string = byn_22.e();
        if (!string.equals(byp_2.a().a(byn_22.h()).e()) && !xu_0.a().a(string)) {
            fzn_0 fzn_02 = new fzn_0(102, 0, bae.h().a("error.guild.rank.invalidName", new Object[0]), 2L);
            fzn_02.d(cfn_0.a(1));
            fzs_0.a().a(fzn_02);
            return false;
        }
        byp_2.a().a(byn_22);
        fis_1.a().a("rankModificationDirty", false);
        return false;
    }

    @Override
    public int a() {
        return 16811;
    }
}

