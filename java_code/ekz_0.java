/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from eKZ
 */
public class ekz_0
extends ss_0 {
    private static final ObjectPool c = new abm_1(new ela_0());

    public static ekz_0 a(su_0 su_02, So so) {
        ekz_0 ekz_02;
        try {
            ekz_02 = (ekz_0)c.borrowObject();
            ekz_02.a(c);
        }
        catch (Exception exception) {
            a.error((Object)("Erreur lors d'un checkOut sur un message de type EffectAreaManager : " + exception.getMessage()));
            ekz_02 = new ekz_0();
            ekz_02.a((ObjectPool)null);
            ekz_02.onCheckOut();
        }
        ekz_02.a(su_02);
        ekz_02.a(so);
        return ekz_02;
    }

    @Override
    public sr_0 d(long l) {
        ekk_0 ekk_02 = elg_0.a().i(l);
        if (ekk_02 == null) {
            a.error((Object)("pas de modele de zone d'effet d'id " + l));
            return null;
        }
        return ekk_02.a(null);
    }
}

