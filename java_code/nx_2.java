/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Renamed from NX
 */
public final class nx_2 {
    private static final ExecutorService a = Executors.newSingleThreadExecutor(new ThreadFactoryBuilder().setNameFormat("Scoring").build());

    private nx_2() {
    }

    public static void a(oi_2 oi_22, long l, long l2, long l3, int n) {
    }

    public static void a(long l) {
    }
}

