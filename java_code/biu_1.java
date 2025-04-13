/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bIu
 */
public final class biu_1
extends big_1 {
    private static final Logger a = Logger.getLogger(biu_1.class);
    private int g;

    biu_1(int n) {
        super(n);
    }

    public int g() {
        return this.g;
    }

    @Override
    public void a(String[] stringArray) {
        if (stringArray.length > 2) {
            a.error((Object)("[GD] Mauvais nombre de param\u00e8tres sur une action d'item id=" + this.b));
            return;
        }
        this.g = Integer.parseInt(stringArray[0]);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12 == null) {
            a.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.activateCompanion", exk_22.N()), cfn_0.a(0), 2073L, 102, 1);
        fzm_02.a(new biv_0(this, exk_22));
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public eyx_1 f() {
        return eyx_1.C;
    }
}

