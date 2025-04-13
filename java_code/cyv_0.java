/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cYV
 */
public class cyv_0
implements ahr_1 {
    private static final Logger a = Logger.getLogger(cyv_0.class);
    private static final cyv_0 b = new cyv_0();
    private boolean c = false;

    public static cyv_0 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (!this.c) {
            a.warn((Object)"Traitement d'un message alors que la frame n'est plus active");
        }
        switch (adt_12.a()) {
            case 18724: {
                cyp_0.g().l();
                return true;
            }
            case 16119: {
                return true;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.c = true;
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_12.a(eps_0.c, eps_0.b, eps_0.d, eps_0.e);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.c = false;
        cyp_0.g().m();
    }
}

