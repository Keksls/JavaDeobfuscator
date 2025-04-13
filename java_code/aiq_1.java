/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aIq
 */
public class aiq_1 {
    private final ExecutorService a;

    public aiq_1(String string) {
        this(string, -1);
    }

    public aiq_1(String string, int n) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat(string + "-%d").build();
        this.a = n < 1 ? Executors.newCachedThreadPool(threadFactory) : (n == 1 ? Executors.newSingleThreadExecutor(threadFactory) : Executors.newFixedThreadPool(n, threadFactory));
    }

    public boolean a(long l) {
        try {
            return this.a.awaitTermination(l, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedException) {
            return true;
        }
    }

    public void a() {
        this.a.shutdown();
    }

    public void b() {
        this.a.shutdownNow();
    }

    public Future<ait_1> a(@NotNull ait_1 ait_12) {
        return this.a.submit(new aiw_1(ait_12));
    }

    public Future<ait_1> a(@NotNull ait_1 ait_12, @NotNull aiu_1 aiu_12) {
        ait_12.a(aiu_12);
        return this.a(ait_12);
    }
}

