/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class eLD
extends fl_1
implements abo_1 {
    private static final Logger c = Logger.getLogger(eLD.class);
    eLm<eLo> a;
    private boolean d;
    private static final ObjectPool e = new abm_1(new eLE());
    public final fo_1 b = new eLF(this);

    eLD() {
    }

    public static eLD a(eLm<eLo> eLm2) {
        eLD eLD2;
        try {
            eLD2 = (eLD)e.borrowObject();
            eLD2.a(true);
            eLD2.b(eLm2);
        }
        catch (Exception exception) {
            eLD2 = new eLD();
            c.error((Object)("Erreur lors d'un checkOut sur un message de type WakfuEventsCalendarSerializable : " + exception.getMessage()));
        }
        return eLD2;
    }

    public void b() {
        if (this.d) {
            try {
                e.returnObject((Object)this);
                this.d = false;
            }
            catch (Exception exception) {
                c.error((Object)"Exception during release WakfuEventsCalendarSerializer", (Throwable)exception);
            }
        } else {
            this.onCheckIn();
        }
    }

    @Override
    public void onCheckOut() {
        this.a = null;
    }

    @Override
    public void onCheckIn() {
        this.a = null;
    }

    private void a(boolean bl) {
        this.d = bl;
    }

    public eLD(eLm<eLo> eLm2) {
        this.a = eLm2;
    }

    @Override
    public fo_1[] b_() {
        return new fo_1[]{this.b};
    }

    public eLm<eLo> c() {
        return this.a;
    }

    public void b(eLm<eLo> eLm2) {
        this.a = eLm2;
    }

    public byte[] d() {
        return this.a(this.b_());
    }

    public int e() {
        return this.b.j();
    }
}

