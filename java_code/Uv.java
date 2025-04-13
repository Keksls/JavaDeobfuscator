/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.Collections;
import java.util.List;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class Uv
extends Us
implements abo_1 {
    protected static final Logger a = Logger.getLogger(Uv.class);
    protected Ux g;
    protected List<ts_0> h;
    protected short i;
    private static final ObjectPool j = new abm_1(new Uw());

    public static Uv a(ty_0 ty_02, Ux ux, long l, ts_0 ts_02, short s2) {
        Uv uv;
        try {
            uv = (Uv)j.borrowObject();
            uv.f = j;
        }
        catch (Exception exception) {
            a.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + exception.getMessage()));
            uv = new Uv();
        }
        uv.b(ty_02, ux, l, ts_02, s2);
        return uv;
    }

    public static Uv a(ty_0 ty_02, Ux ux, long l, List<ts_0> list) {
        Uv uv;
        try {
            uv = (Uv)j.borrowObject();
            uv.f = j;
        }
        catch (Exception exception) {
            a.error((Object)("Error while checkOut on ItemExchangerEndEvent type message : " + exception.getMessage()));
            uv = new Uv();
        }
        uv.b(ty_02, ux, l, list);
        return uv;
    }

    private void b(ty_0 ty_02, Ux ux, long l, ts_0 ts_02, short s2) {
        this.b(ty_02, Uu.d);
        this.g = ux;
        this.e = l;
        this.h = Collections.singletonList(ts_02);
        this.i = s2;
    }

    private void b(ty_0 ty_02, Ux ux, long l, List<ts_0> list) {
        this.b(ty_02, Uu.d);
        this.g = ux;
        this.e = l;
        this.h = list;
    }

    public Ux b() {
        return this.g;
    }

    public ts_0 f() {
        return this.h.get(0);
    }

    public List<ts_0> g() {
        return this.h;
    }

    public short h() {
        return this.i;
    }

    public int i() {
        return this.h.size();
    }
}

