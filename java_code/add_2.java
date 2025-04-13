/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aDD
 */
public class add_2 {
    static final Logger b = Logger.getLogger(add_2.class);
    static final String a = "Worker";
    private static final add_2 c = new add_2();
    final Lock d = new ReentrantLock();
    final Condition e = this.d.newCondition();
    adf_2 f;
    private final adk_1 g = new adk_1();

    add_2() {
    }

    @NotNull
    Runnable a() {
        return this.g::run;
    }

    public static add_2 b() {
        return c;
    }

    public void c() {
        if (this.f != null && this.f.isAlive()) {
            return;
        }
        this.f = new adf_2(new ade_2(this, this.g), a);
        this.f.start();
    }

    public void d() {
        if (this.f == null) {
            return;
        }
        this.f.join();
    }

    public void e() {
        if (this.f == null) {
            return;
        }
        if (this.d.tryLock()) {
            this.e.signalAll();
            this.d.unlock();
        }
    }

    public void f() {
        if (this.f == null) {
            return;
        }
        this.f.interrupt();
        this.e();
    }

    public void g() {
        if (this.f == null) {
            return;
        }
        this.g.b();
        this.a(false);
    }

    protected boolean h() {
        return this.f != null && this.f.a();
    }

    public void a(boolean bl) {
        if (this.f == null) {
            return;
        }
        this.f.a(bl);
        this.e();
    }

    public void a(adt_1 adt_12) {
        if (adt_12 == null) {
            return;
        }
        adt_12.d(System.currentTimeMillis());
        this.g.a(adt_12);
        if (this.j()) {
            this.e();
        }
    }

    public int i() {
        return this.g.a();
    }

    public boolean j() {
        return this.f != null && this.f.a();
    }

    public String a(String string) {
        return this.g.a(string);
    }
}

