/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class Us
implements abo_1 {
    protected static final Logger b = Logger.getLogger(Us.class);
    protected Uu c = null;
    protected ty_0 d = null;
    protected long e = -1L;
    protected ObjectPool f;
    private static final ObjectPool a = new abm_1(new Ut());

    public static Us a(ty_0 ty_02, Uu uu) {
        Us us;
        try {
            us = (Us)a.borrowObject();
            us.f = a;
        }
        catch (Exception exception) {
            b.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEvent : " + exception.getMessage()));
            us = new Us();
        }
        us.b(ty_02, uu);
        return us;
    }

    protected Us() {
    }

    protected void b(ty_0 ty_02, Uu uu) {
        this.d = ty_02;
        this.c = uu;
    }

    public void a() {
        if (this.f != null) {
            this.f.returnObject((Object)this);
            this.f = null;
        } else {
            b.error((Object)("Double release de " + this.getClass().toString()));
            this.onCheckIn();
        }
    }

    public Uu c() {
        return this.c;
    }

    public ty_0 d() {
        return this.d;
    }

    public void a(long l) {
        this.e = l;
    }

    public long e() {
        return this.e;
    }

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
        this.d = null;
        this.c = null;
        this.e = -1L;
    }
}

