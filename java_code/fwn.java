/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public abstract class fwn<T, U> {
    protected T b;
    protected Consumer<T> c;

    public void b(T t) {
        this.b = t;
        this.b();
        if (this.c != null) {
            this.c.accept(this.b);
        }
    }

    public T c() {
        return this.b;
    }

    public void a(Consumer<T> consumer) {
        this.c = consumer;
    }

    protected void b() {
    }

    public abstract boolean a(U var1);

    public abstract void a(boolean var1);

    public abstract void a();
}

