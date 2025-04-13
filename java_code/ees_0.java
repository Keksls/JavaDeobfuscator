/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from eES
 */
public class ees_0 {
    private static final Logger a = Logger.getLogger(ees_0.class);

    public boolean a(long l, long l2, int n, int n2) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.info((Object)"Can't change dungeon difficulty, player null");
            return false;
        }
        Optional<fkU> optional = ((epq_2)t).dP();
        if (optional == null || optional.isEmpty()) {
            a.info((Object)("Can't change dungeon difficulty, instance info null, playerId = " + ((epq_2)t).a_()));
            return false;
        }
        fkU fkU2 = optional.get();
        if (fkU2.a() != l2) {
            a.warn((Object)("Can't change dungeon difficulty, player not in instance, playerId = " + ((epq_2)t).a_() + ", worldId = " + fkU2.a()));
            return false;
        }
        if (fkU2.g()) {
            a.warn((Object)("Can't change dungeon difficulty during a fight, playerId = " + ((epq_2)t).a_() + ", worldId = " + fkU2.a()));
            return false;
        }
        int n3 = this.b(n);
        if (n2 < n3 || n2 > 10) {
            a.warn((Object)("Can't change dungeon difficulty, selected difficulty outside the authorized limits, playerId = " + ((epq_2)t).a_() + ", worldId = " + fkU2.a() + ", difficulty = " + n2));
            return false;
        }
        if (!fkU2.e()) {
            a.warn((Object)("Can't change dungeon difficulty, difficulty not available, playerId = " + ((epq_2)t).a_() + ", worldId = " + fkU2.a()));
            return false;
        }
        if (fkU2.d() < n2 && !fkU2.f()) {
            a.warn((Object)("Can't change dungeon difficulty, difficulty can't be increased, playerId = " + ((epq_2)t).a_() + ", worldId = " + fkU2.a()));
            return false;
        }
        return true;
    }

    public boolean a(long l, int n, int n2, boolean bl) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            a.info((Object)"Can't change dungeon difficulty, player null");
            return false;
        }
        int n3 = this.b(n2);
        if (n < n3 || n > 10) {
            a.warn((Object)("Can't change dungeon difficulty. The selected difficulty is outside the authorized limits, playerId = " + ((epq_2)t).a_() + ", instanceId = , difficulty = " + n));
            return false;
        }
        return true;
    }

    private int b(int n) {
        ezb_2 ezb_22 = ezd_2.a.a(n);
        if (ezb_22 == null) {
            return 1;
        }
        return ezb_22.d();
    }

    public static boolean a(int n) {
        ezb_2 ezb_22 = ezd_2.a.a(n);
        if (ezb_22 == null) {
            return false;
        }
        return ezb_22.c() > 186;
    }
}

