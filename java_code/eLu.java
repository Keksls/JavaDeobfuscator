/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class eLu
extends fl_1
implements abo_1 {
    protected static final Logger a = Logger.getLogger(eLu.class);
    eLo b;
    static eLt j;
    private boolean k = false;
    private static final ObjectPool l;
    public final fo_1 c = new eLw(this);
    public final fo_1 d = new eLx(this);
    public final fo_1 e = new eLy(this);
    public final fo_1 f = new eLz(this);
    public final fo_1 g = new eLA(this);
    public final fo_1 h = new eLB(this);
    public final fo_1 i = new eLC(this);

    public static void a(eLt eLt2) {
        j = eLt2;
    }

    public static eLu b() {
        eLu eLu2;
        try {
            eLu2 = (eLu)l.borrowObject();
            eLu2.k = true;
        }
        catch (Exception exception) {
            eLu2 = new eLu();
            a.error((Object)("Erreur lors d'un checkOut sur un message de type WakfuCalendarEventSerializable : " + exception.getMessage()));
        }
        return eLu2;
    }

    @Override
    public void onCheckOut() {
        this.b = null;
    }

    @Override
    public void onCheckIn() {
        this.b = null;
    }

    public void c() {
        if (this.k) {
            try {
                l.returnObject((Object)this);
                this.k = false;
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        } else {
            this.onCheckIn();
        }
    }

    public void a(eLo eLo2) {
        this.b = eLo2;
    }

    public void d() {
        this.b = j.b();
    }

    public void e() {
        j.a(this.b);
    }

    public eLo f() {
        return this.b;
    }

    @Override
    public fo_1[] b_() {
        return new fo_1[]{this.d, this.c, this.i, this.e, this.f, this.h, this.g};
    }

    public void a(ByteBuffer byteBuffer) {
        fo_1[] fo_1Array = this.b_();
        for (int k = 0; k < fo_1Array.length; ++k) {
            fo_1 fo_12 = fo_1Array[k];
            fo_12.a(byteBuffer);
        }
    }

    public void b(ByteBuffer byteBuffer) {
        fo_1[] fo_1Array = this.b_();
        for (int k = 0; k < fo_1Array.length; ++k) {
            fo_1 fo_12 = fo_1Array[k];
            fo_12.a(byteBuffer, epj.k);
        }
    }

    public void c(ByteBuffer byteBuffer) {
        this.i.a(byteBuffer);
    }

    public void d(ByteBuffer byteBuffer) {
        this.i.a(byteBuffer, epj.k);
    }

    public void e(ByteBuffer byteBuffer) {
        this.d.a(byteBuffer);
        this.c.a(byteBuffer);
    }

    public void f(ByteBuffer byteBuffer) {
        this.d.a(byteBuffer, epj.k);
        this.c.a(byteBuffer, epj.k);
    }

    public int g() {
        fo_1[] fo_1Array = this.b_();
        int n = 0;
        for (int k = 0; k < fo_1Array.length; ++k) {
            fo_1 fo_12 = fo_1Array[k];
            n += fo_12.j();
        }
        return n;
    }

    static {
        l = new abm_1(new eLv());
    }
}

