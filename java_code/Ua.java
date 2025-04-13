/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

public class Ua {
    protected static final Logger a = Logger.getLogger(Ua.class);
    private static final Ua b = new Ua();
    private final TLongObjectHashMap<ty_0> c = new TLongObjectHashMap();
    private final Map<Long, Long> d = new HashMap<Long, Long>();

    public static Ua a() {
        return b;
    }

    private Ua() {
    }

    public ty_0 a(long l) {
        return (ty_0)this.c.get(l);
    }

    public boolean b(long l) {
        if (this.c(l)) {
            return !this.c.forEachValue((TObjectProcedure)new Ub(this, l));
        }
        return false;
    }

    public boolean c(long l) {
        return this.d.containsKey(l);
    }

    public boolean a(ty_0 ty_02) {
        if (this.c.containsKey(ty_02.a())) {
            a.info((Object)("Failed to start exchange " + ty_02.a() + " : the ID is already taken."));
            return false;
        }
        if (this.d.containsKey(ty_02.b())) {
            a.info((Object)("Failed to start exchange " + ty_02.a() + " : requester " + ty_02.e() + " already has one."));
            return false;
        }
        if (this.d.containsKey(ty_02.c())) {
            a.info((Object)("Failed to start exchange " + ty_02.a() + " : target " + ty_02.f() + " already has one."));
            return false;
        }
        this.c.put(ty_02.a(), (Object)ty_02);
        this.d.put(ty_02.b(), ty_02.a());
        this.d.put(ty_02.c(), ty_02.a());
        return true;
    }

    public void b(ty_0 ty_02) {
        this.c.remove(ty_02.a());
        this.d.remove(ty_02.b());
        this.d.remove(ty_02.c());
    }

    public boolean a(long l, long l2) {
        if (!this.c(l)) {
            return false;
        }
        return ((ty_0)this.c.get(this.d.get(l).longValue())).e(l2);
    }
}

