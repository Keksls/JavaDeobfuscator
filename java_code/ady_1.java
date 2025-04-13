/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aDY
 */
class ady_1 {
    final int a;
    int b;
    final ArrayList<Runnable> c = new ArrayList();

    ady_1(int n) {
        this.a = n;
        this.b = 0;
    }

    boolean a(Runnable runnable) {
        return !this.c.contains(runnable);
    }

    ArrayList<Runnable> a() {
        return this.c;
    }

    void b(Runnable runnable) {
        if (!this.c.contains(runnable)) {
            this.c.add(runnable);
        }
    }
}

