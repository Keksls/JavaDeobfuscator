/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class Up
extends Us
implements abo_1 {
    protected static final Logger a = Logger.getLogger(Up.class);
    private Ur g;
    private static final ObjectPool h = new abm_1(new Uq());

    public static Up a(ty_0 ty_02, Ur ur) {
        Up up;
        try {
            up = (Up)h.borrowObject();
            up.f = h;
        }
        catch (Exception exception) {
            a.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + exception.getMessage()));
            up = new Up();
        }
        up.b(ty_02, ur);
        return up;
    }

    protected Up() {
        this.c = null;
        this.d = null;
    }

    protected void b(ty_0 ty_02, Ur ur) {
        this.b(ty_02, Uu.e);
        this.g = ur;
    }

    @Override
    public void a() {
        if (this.f != null) {
            this.f.returnObject((Object)this);
            this.f = null;
        } else {
            a.error((Object)("Double release de " + this.getClass().toString()));
            this.onCheckIn();
        }
    }

    public Ur b() {
        return this.g;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.g = null;
    }
}

