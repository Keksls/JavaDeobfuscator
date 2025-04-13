/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
 * Renamed from FQ
 */
public class fq_0 {
    public static final float[] a = new float[]{0.1f, 0.1f, 0.1f};
    private static final int c = 1;
    private static final int d = 2;
    private int e;
    private final HashMap<Integer, Byte> f = new HashMap(1, 1.0f);
    private float[] g = a;

    public boolean a() {
        return (this.e & 1) != 0;
    }

    public boolean b() {
        return (this.e & 2) == 2;
    }

    public int a(String string) {
        Byte by = Optional.ofNullable(this.f.get(string.hashCode())).orElse((byte)0);
        return by + -1;
    }

    public void a(Map<String, Byte> map) {
        this.e |= 1;
        for (Map.Entry<String, Byte> entry : map.entrySet()) {
            this.f.put(entry.getKey().hashCode(), entry.getValue());
        }
    }

    public float[] c() {
        return this.g;
    }

    public void a(float[] fArray) {
        assert (this.g == a);
        if (!Arrays.equals(fArray, a)) {
            this.e |= 2;
            this.g = fArray;
        }
    }

    public int d() {
        return this.e;
    }

    public void a(int n) {
        this.e = n;
    }

    public HashMap<Integer, Byte> e() {
        return this.f;
    }

    public float[] f() {
        return this.g;
    }

    public void b(float[] fArray) {
        this.g = fArray;
    }
}

