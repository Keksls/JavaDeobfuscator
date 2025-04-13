/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from cUP
 */
public class cup_0 {
    private static final cup_0 a = new cup_0();
    private final Set<Short> b = new HashSet<Short>();

    public static cup_0 a() {
        return a;
    }

    private void b() {
        this.b.add((short)17949);
        this.b.add((short)16751);
        this.b.add((short)16942);
        this.b.add((short)19313);
        this.b.add((short)19312);
        this.b.add((short)19941);
    }

    public boolean a(int n) {
        if (this.b.isEmpty()) {
            this.b();
        }
        return this.b.contains((short)n);
    }
}

