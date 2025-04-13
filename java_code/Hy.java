/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Hy {
    private final LinkedList<Long> a = new LinkedList();
    private final long b;
    private final Supplier<Long> c;

    public Hy(int n, TimeUnit timeUnit) {
        this(n, timeUnit, System::currentTimeMillis);
    }

    public Hy(int n, TimeUnit timeUnit, Supplier<Long> supplier) {
        this.b = timeUnit.toMillis(n);
        this.c = supplier;
    }

    public int a() {
        return this.a(this.c.get());
    }

    public int a(long l) {
        this.b(l);
        this.a.offer(l);
        return this.a.size();
    }

    private void b(long l) {
        while (!this.a.isEmpty() && this.a.peek() + this.b < l) {
            this.a.poll();
        }
    }

    public int b() {
        return this.a.size();
    }

    public int c() {
        this.b(this.c.get());
        return this.a.size();
    }
}

