/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aIt
 */
public abstract class ait_1 {
    private final URL a;
    private final AtomicReference<aiv_1> b;
    private aiu_1 c = null;
    private air_1 d = ais_1.b;

    public ait_1(@NotNull URL uRL) {
        this.a = uRL;
        this.b = new AtomicReference<aiv_1>(aiv_1.a);
    }

    public void a(aiu_1 aiu_12) {
        this.c = aiu_12;
    }

    public void a(@NotNull air_1 air_12) {
        this.d = air_12;
        this.d.a(this);
    }

    public air_1 a() {
        return this.d;
    }

    public boolean b() {
        return this.d != null && this.d.a();
    }

    public aiv_1 c() {
        return this.b.get();
    }

    abstract OutputStream d();

    abstract boolean a(boolean var1);

    void a(aiv_1 aiv_12) {
        aiv_1 aiv_13 = this.b.getAndSet(aiv_12);
        if (this.c != null && aiv_13 != aiv_12) {
            this.c.a(this);
        }
    }

    URL e() {
        return this.a;
    }

    protected abstract String f();

    public String toString() {
        return "{" + this.getClass().getSimpleName() + " " + this.b + " remote:" + this.a + " local:" + this.f() + "}";
    }
}

