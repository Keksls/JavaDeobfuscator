/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from bsu
 */
public class bsu_1 {
    private static final bsu_1 a = new bsu_1();
    private final HashMap<Long, bsx_2> b = new HashMap();

    public static bsu_1 a() {
        return a;
    }

    public bsx_2 a(long l) {
        return this.b.get(l);
    }

    public void b(long l) {
        this.b.remove(l);
    }

    public void a(bsx_2 bsx_22) {
        this.b.put(bsx_22.q(), bsx_22);
    }
}

