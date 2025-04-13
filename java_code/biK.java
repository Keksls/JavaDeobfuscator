/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.log4j.Logger
 */
import javax.annotation.Nullable;
import org.apache.log4j.Logger;

public final class biK
extends Enum<biK> {
    public static final /* enum */ biK a = new biK(exh_2.a.A, "Chapeau", "Chapeau02", "CheveuxHaut");
    public static final /* enum */ biK b = new biK(exh_2.b.A, "Cheveux", "Natte");
    public static final /* enum */ biK c = new biK(exh_2.c.A, "Barbe");
    public static final /* enum */ biK d = new biK(exh_2.d.A, "Epaulette-G", "Epaulette-D");
    public static final /* enum */ biK e = new biK(exh_2.f.A, "CorpsHabit", "Jupe", "CuisseHabit");
    public static final /* enum */ biK f = new biK(exh_2.l.A, "BassinPeau");
    public static final /* enum */ biK g = new biK(exh_2.m.A, "JambeHabit", "PiedHabit01", "PiedHabit02", "CuisseHabit");
    public static final /* enum */ biK h = new biK(exh_2.n.A, "Cape", "CapeBas");
    public static final /* enum */ biK i = new biK(exh_2.p.A, "Arme");
    public static final /* enum */ biK j = new biK(exh_2.q.A, "Bouclier");
    public static final /* enum */ biK k = new biK(exh_2.r.A, "Accessoire", "Accessoire-0", "Accessoire-1", "Accessoire-2");
    private static final Logger o;
    private static final ack_2<biK> p;
    private static final acw_1 q;
    private final short r;
    public final String[] l;
    public final int[] m;
    private static final /* synthetic */ biK[] s;

    public static biK[] values() {
        return (biK[])s.clone();
    }

    public static biK valueOf(String string) {
        return Enum.valueOf(biK.class, string);
    }

    private biK(short s2, String ... stringArray) {
        this.r = s2;
        this.l = stringArray;
        this.m = auc_1.a(stringArray);
    }

    @Nullable
    public static biK a(short s2) {
        return p.e(s2);
    }

    static {
        s = new biK[]{a, b, c, d, e, f, g, h, i, j, k};
        o = Logger.getLogger(biK.class);
        p = new ack_2();
        for (biK biK2 : biK.values()) {
            assert (!p.c(biK2.r));
            p.a(biK2.r, biK2);
        }
        q = new acw_1();
        q.f(exh_2.i.A);
        q.f(exh_2.h.A);
        q.f(exh_2.w.A);
        q.f(exh_2.y.A);
        q.f(exh_2.k.A);
        q.f(exh_2.e.A);
    }
}

