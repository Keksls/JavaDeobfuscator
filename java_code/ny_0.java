/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;

/*
 * Renamed from ny
 */
public class ny_0 {
    private final int a;
    private final boolean b;

    public ny_0(int n, boolean bl) {
        this.a = n;
        this.b = bl;
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public static Function<ny_0, Integer> c() {
        return new nz();
    }

    public String toString() {
        return "ObjectiveData{m_id=" + this.a + ", m_complete=" + this.b + "}";
    }
}

