/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bIV
 */
public class biv_1
extends big_1 {
    private static final Logger a = Logger.getLogger(biv_1.class);

    public biv_1(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12 == null) {
            a.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        boolean bl = false;
        List<eja_0> list = bmr_12.cy().n();
        for (int k = 0; k < list.size(); ++k) {
            eja_0 eja_02 = list.get(k);
            if (eja_02.aF() != null && !eja_02.aF().G()) continue;
            bl = true;
            break;
        }
        if (!bl) {
            a.warn((Object)"Tentative d'utilisation d'un item de reduction de DEAD_STATE sans en avoir");
            return false;
        }
        this.a(exk_22.a());
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public eyx_1 f() {
        return eyx_1.m;
    }
}

