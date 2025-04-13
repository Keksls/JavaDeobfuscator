/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
 * Renamed from ezj
 */
public class ezj_2 {
    private final Map<Integer, Short> a = new HashMap<Integer, Short>();

    public short a(int n, short s2) {
        short s3 = (short)(this.a.getOrDefault(n, (short)0) + s2);
        this.a.put(n, s3);
        return s3;
    }

    public short b(int n, short s2) {
        short s3 = this.a.get(n);
        short s4 = (short)Math.max(s3 - s2, 0);
        this.a.put(n, s4);
        return s4;
    }

    public void a(Integer n, Short s2) {
        this.a.put(n, s2);
    }

    public Map<Integer, Short> a() {
        return this.a;
    }

    public short a(int n) {
        return this.a.getOrDefault(n, (short)0);
    }

    public void a(BiConsumer<Integer, Short> biConsumer) {
        this.a.forEach(biConsumer);
    }

    public void b() {
        this.a.clear();
    }

    public boolean a(ezj_2 ezj_22) {
        if (this.a.size() != ezj_22.a.size()) {
            return true;
        }
        for (int n : this.a.keySet()) {
            if (ezj_22.a(n) == this.a.get(n).shortValue()) continue;
            return true;
        }
        return false;
    }

    public void b(ezj_2 ezj_22) {
        ezj_22.a(this.a());
    }

    private void a(Map<Integer, Short> map) {
        this.a.clear();
        this.a.putAll(map);
    }

    public String toString() {
        return "AptitudeCategoryPoints{m_pointsByCategory=" + this.a + "}";
    }
}

