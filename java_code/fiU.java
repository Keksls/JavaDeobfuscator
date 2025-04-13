/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class fiU {
    private final int a;
    private final List<Integer> b;
    private final List<Integer> c;

    public fiU(int n, List<Integer> list, List<Integer> list2) {
        this.a = n;
        this.b = list;
        this.c = list2;
    }

    public boolean a(int n) {
        return this.b.contains(n);
    }

    public List<Integer> a() {
        return this.c;
    }

    public boolean b(int n) {
        return this.c.contains(n);
    }

    public int b() {
        return this.a;
    }
}

