/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public enum faL {
    a(tc_0.a, 6),
    b(tc_0.b, 2),
    c(tc_0.c, 3),
    d(tc_0.d, 4),
    e(tc_0.e, 5),
    f(faL.e.j + 1, 1),
    g(faL.f.j + 1, 0);

    public static final List<faL> h;
    public static final int i;
    private final int j;
    private final tc_0 k;
    private final int l;

    private faL(int n2, int n3) {
        this.j = n2;
        this.k = null;
        this.l = n3;
    }

    private faL(tc_0 tc_02, int n2) {
        this.j = tc_02.a();
        this.k = tc_02;
        this.l = n2;
    }

    @NotNull
    public static faL a(int n) {
        for (faL faL2 : faL.values()) {
            if (faL2.j != n) continue;
            return faL2;
        }
        return a;
    }

    @NotNull
    public static List<faL> a(@NotNull List<Integer> list) {
        ArrayList<faL> arrayList = new ArrayList<faL>();
        for (Integer n : list) {
            arrayList.add(faL.a(n));
        }
        return arrayList;
    }

    public int a() {
        return this.j;
    }

    public tc_0 b() {
        return this.k;
    }

    public int c() {
        return this.l;
    }

    static {
        h = List.of(b, c, d, e);
        i = faL.values().length;
    }
}

