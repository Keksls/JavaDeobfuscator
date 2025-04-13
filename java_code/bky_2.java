/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from bky
 */
public class bky_2 {
    private final bka_2 a;
    private final int b;
    private final bkd_2[] c;

    public bky_2(bka_2 bka_22, int n, ArrayList<bkd_2> arrayList) {
        this.a = bka_22;
        this.b = n;
        this.c = new bkd_2[arrayList.size()];
        Iterator<bkd_2> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            bkd_2 bkd_22;
            this.c[bkd_22.b()] = bkd_22 = iterator.next();
        }
    }

    public bka_2 a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public bkd_2[] c() {
        return this.c;
    }
}

