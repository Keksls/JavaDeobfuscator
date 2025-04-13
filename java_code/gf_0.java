/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from Gf
 */
public class gf_0<K> {
    private final ReentrantLock a = new ReentrantLock();
    private final Map<Integer, ExecutorService> b = new HashMap<Integer, ExecutorService>();
    private int c;
    private final ThreadFactory d;
    private final HashMap<ExecutorService, AtomicInteger> e = new HashMap();

    private gf_0(int n, ThreadFactory threadFactory) {
        this.c = n;
        this.d = threadFactory;
    }

    public static <K> gf_0<K> a(int n) {
        return gf_0.a(n, Executors.defaultThreadFactory());
    }

    public static <K> gf_0<K> a(int n, ThreadFactory threadFactory) {
        return new gf_0<K>(n, threadFactory);
    }

    public void a() {
        this.a.lock();
        try {
            for (ExecutorService executorService : this.b.values()) {
                executorService.shutdown();
            }
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<Runnable> b() {
        this.a.lock();
        try {
            ArrayList<Runnable> arrayList = new ArrayList<Runnable>();
            for (ExecutorService executorService : this.b.values()) {
                arrayList.addAll(executorService.shutdownNow());
            }
            ArrayList<Runnable> arrayList2 = arrayList;
            return arrayList2;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c() {
        this.a.lock();
        try {
            for (ExecutorService executorService : this.b.values()) {
                if (executorService.isShutdown()) continue;
                boolean bl = false;
                return bl;
            }
            boolean bl = true;
            return bl;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d() {
        this.a.lock();
        try {
            for (ExecutorService executorService : this.b.values()) {
                if (executorService.isTerminated()) continue;
                boolean bl = false;
                return bl;
            }
            boolean bl = true;
            return bl;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(long l, TimeUnit timeUnit) {
        long l2 = System.nanoTime();
        long l3 = timeUnit.toNanos(l);
        this.a.lock();
        try {
            for (ExecutorService executorService : this.b.values()) {
                if (!executorService.awaitTermination(l3, TimeUnit.NANOSECONDS)) {
                    boolean bl = false;
                    return bl;
                }
                l3 -= System.nanoTime() - l2;
            }
            boolean bl = true;
            return bl;
        }
        finally {
            this.a.unlock();
        }
    }

    public void a(K k, Runnable runnable) {
        this.b(k, runnable);
    }

    public <T> Future<T> a(K k, Callable<T> callable) {
        ExecutorService executorService = this.a(k);
        return this.a(executorService, callable);
    }

    public <T> Future<T> a(K k, Runnable runnable, T t) {
        ExecutorService executorService = this.a(k);
        return this.a(executorService, () -> {
            runnable.run();
            return t;
        });
    }

    public Future<?> b(K k, Runnable runnable) {
        ExecutorService executorService = this.a(k);
        return this.a(executorService, () -> {
            runnable.run();
            return null;
        });
    }

    private <T> Future<T> a(ExecutorService executorService, Callable<T> callable) {
        Future<Object> future = executorService.submit(() -> {
            AtomicInteger atomicInteger;
            Object v = callable.call();
            if (!this.e.containsKey(executorService)) {
                return v;
            }
            AtomicInteger atomicInteger2 = atomicInteger = this.e.get(executorService);
            synchronized (atomicInteger2) {
                atomicInteger.decrementAndGet();
            }
            return v;
        });
        this.a(executorService);
        return future;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(ExecutorService executorService) {
        HashMap<ExecutorService, AtomicInteger> hashMap = this.e;
        synchronized (hashMap) {
            AtomicInteger atomicInteger;
            AtomicInteger atomicInteger2 = atomicInteger = this.e.getOrDefault(executorService, new AtomicInteger());
            synchronized (atomicInteger2) {
                atomicInteger.incrementAndGet();
            }
            this.e.put(executorService, atomicInteger);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private ExecutorService a(K k) {
        this.a.lock();
        try {
            int n2 = k.hashCode() % this.c;
            ExecutorService executorService = this.b.computeIfAbsent(n2, n -> this.h());
            return executorService;
        }
        finally {
            this.a.unlock();
        }
    }

    private ExecutorService h() {
        return Executors.newSingleThreadExecutor(this.d);
    }

    public void b(int n) {
        if (n == this.c) {
            return;
        }
        this.a.lock();
        try {
            if (n < this.c) {
                List<Map.Entry> list = this.b.entrySet().stream().filter(entry -> (Integer)entry.getKey() >= n).collect(Collectors.toList());
                list.forEach(entry -> {
                    ((ExecutorService)entry.getValue()).shutdown();
                    this.b.remove(entry.getKey(), entry.getValue());
                });
            }
            this.c = n;
        }
        finally {
            this.a.unlock();
        }
    }

    public int e() {
        return this.c;
    }

    public int f() {
        this.a.lock();
        try {
            int n = this.b.size();
            return n;
        }
        finally {
            this.a.unlock();
        }
    }

    @NotNull
    public @Unmodifiable Map<ExecutorService, AtomicInteger> g() {
        return Collections.unmodifiableMap(this.e);
    }
}

