/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from HH
 */
class hh_1 {
    private final Map<String, he_1> a = new HashMap<String, he_1>();
    private final Map<String, hd_1> b = new HashMap<String, hd_1>();
    private final Map<String, hf_1> c = new HashMap<String, hf_1>();
    private final Map<String, hg_1> d = new HashMap<String, hg_1>();
    private final Map<String, hi_1> e = new HashMap<String, hi_1>();

    hh_1() {
    }

    void a(String string, he_1 he_12) {
        this.a.put(string, he_12);
    }

    public Map<String, he_1> a() {
        return Collections.unmodifiableMap(this.a);
    }

    void a(String string, hd_1 hd_12) {
        this.b.put(string, hd_12);
    }

    public Map<String, hd_1> b() {
        return Collections.unmodifiableMap(this.b);
    }

    void a(String string, hf_1 hf_12) {
        this.c.put(string, hf_12);
    }

    public Map<String, hf_1> c() {
        return Collections.unmodifiableMap(this.c);
    }

    void a(String string, hg_1 hg_12) {
        this.d.put(string, hg_12);
    }

    public Map<String, hg_1> d() {
        return Collections.unmodifiableMap(this.d);
    }

    void a(String string, hi_1 hi_12) {
        this.e.put(string, hi_12);
    }

    public Map<String, hi_1> e() {
        return Collections.unmodifiableMap(this.e);
    }

    public String toString() {
        return "Reports{m_gauges=" + this.a.size() + ", m_counters=" + this.b.size() + ", m_histograms=" + this.c.size() + ", m_meters=" + this.d.size() + ", m_timers=" + this.e.size() + "}";
    }
}

