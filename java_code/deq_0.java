/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from deQ
 */
public class deq_0
implements adx_1 {
    @Override
    public int a() {
        return 19012;
    }

    public boolean a(adt_1 adt_12) {
        dgu_0 dgu_02 = (dgu_0)adt_12;
        long l = dgu_02.k();
        long l2 = dgu_02.o();
        erl_1 erl_12 = byp_2.a().b(l);
        long l3 = byp_2.a().v();
        if (l2 != l3 && erl_12.d() != l3) {
            byp_2.a().a(l, l2);
            return false;
        }
        String string = null;
        long l4 = azu_0.j().k().a_();
        string = l != l4 ? bae.h().a("guild.warning.giveMasterRank", erl_12.f()) : bae.h().a("guild.warning.removeSelfMasterRank", erl_12.f());
        fzm_0 fzm_02 = fpm_0.b().a(string, 6L, 102, 3);
        fzm_02.a(new der_0(this, l, l2));
        return false;
    }
}

