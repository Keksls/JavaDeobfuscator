/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from deS
 */
public class des_0
implements adx_1 {
    public boolean a(adt_1 adt_12) {
        dfc dfc2 = (dfc)adt_12;
        erl_1 erl_12 = byp_2.a().b(dfc2.d());
        if (erl_12 == null) {
            return false;
        }
        String string = bae.h().a("guild.excludeMember.validate", erl_12.f());
        fzm_0 fzm_02 = fpm_0.b().a(string, 6L, 102, 3);
        fzm_02.a(new det_0(this, erl_12));
        return false;
    }

    @Override
    public int a() {
        return 19709;
    }
}

