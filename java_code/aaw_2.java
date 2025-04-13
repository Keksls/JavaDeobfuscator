/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;

/*
 * Renamed from aAW
 */
public class aaw_2
extends aav_2 {
    private static final Logger c = Logger.getLogger(aaw_2.class);
    protected afq_1 a;
    protected static final AtomicInteger b = new AtomicInteger(-1);

    public aaw_2() {
        this.a(false);
        this.a(b.getAndDecrement());
    }

    public void d() {
    }

    public void e() {
        c.info((Object)"FrameworkEntity::onReConnect()");
    }

    public void f() {
    }

    public void a(afq_1 afq_12) {
        this.a = afq_12;
    }

    public afq_1 g() {
        return this.a;
    }

    public synchronized void h() {
        if (this.a != null) {
            this.a.a();
        }
    }

    public synchronized boolean i() {
        return this.a != null && this.a.b();
    }

    public <OutputMessage extends adt_1> void c(OutputMessage OutputMessage) {
        this.a(OutputMessage, false);
    }

    public synchronized <OutputMessage extends adt_1> void a(OutputMessage OutputMessage, boolean bl) {
        try {
            this.a.a(OutputMessage);
        }
        catch (RuntimeException runtimeException) {
            c.error((Object)("Exception pushing message " + OutputMessage.getClass().getSimpleName()), (Throwable)runtimeException);
        }
    }
}

