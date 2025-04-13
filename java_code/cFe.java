/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class cFe
implements Runnable {
    private final int a;
    private final Map<Integer, Runnable> b = Collections.synchronizedMap(new HashMap());

    public cFe(int n) {
        this.a = n;
    }

    public void a(int n, Runnable runnable) {
        this.b.put(n, runnable);
        ado_1.a().b(this);
        ado_1.a().a(this, this.a, 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        Map<Integer, Runnable> map = this.b;
        synchronized (map) {
            for (Runnable runnable : this.b.values()) {
                runnable.run();
            }
            this.b.clear();
        }
    }
}

