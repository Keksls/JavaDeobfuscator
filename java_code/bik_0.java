/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bIk
 */
public final class bik_0
extends big_1 {
    private static final Logger a = Logger.getLogger(bik_0.class);

    bik_0(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
    }

    @Override
    public boolean a(exk_2 exk_22) {
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.activate.commonAptitudeRestat", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
        fzm_02.a(new bil_1(this, exk_22));
        return true;
    }

    void c(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12 == null) {
            a.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return;
        }
        this.a(exk_22.a());
    }

    @Override
    public void c() {
    }

    @Override
    public eyx_1 f() {
        return eyx_1.x;
    }
}

