/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJk
 */
public class bjk_2
extends big_1 {
    public bjk_2(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.da().i(exk_22.a()) == null) {
            return false;
        }
        cct_1 cct_12 = ccs_1.a().a(bmr_12.T_());
        if (cct_12 != null && cct_12.a()) {
            aUh.a("action.error.notInBattleground", new Object[0]);
            return false;
        }
        this.a(exk_22.a());
        return true;
    }

    @Override
    protected boolean d() {
        return false;
    }

    @Override
    public void c() {
    }

    @Override
    public eyx_1 f() {
        return eyx_1.g;
    }
}

