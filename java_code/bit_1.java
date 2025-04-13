/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bIT
 */
public class bit_1
extends big_1 {
    private static final Logger a = Logger.getLogger(bit_1.class);

    public bit_1(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.da().i(exk_22.a()) == null) {
            a.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        fzn_0 fzn_02 = new fzn_0(102, 1, bae.h().a("recustomItem.confirmUse", new Object[0]), 2072L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a(new biu_0(this, exk_22));
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
        return eyx_1.D;
    }
}

