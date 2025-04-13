/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.inject.Injector
 *  javax.inject.Provider
 */
import com.google.common.base.Preconditions;
import com.google.inject.Injector;
import javax.inject.Provider;

public class Gy {
    private static final Gy a = new Gy();
    private Injector b;

    public static Gy a() {
        return a;
    }

    private Gy() {
    }

    public void a(Injector injector) {
        this.b = injector;
    }

    public boolean b() {
        return this.b != null;
    }

    public <T> T a(Class<T> clazz) {
        Preconditions.checkNotNull((Object)this.b, (Object)"Injector is not already configured");
        return (T)this.b.getInstance(clazz);
    }

    public <T> Provider<T> b(Class<T> clazz) {
        Preconditions.checkNotNull((Object)this.b, (Object)"Injector is not already configured");
        return this.b.getProvider(clazz);
    }
}

