/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.base.Function;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from nw
 */
public class nw_0 {
    private final int a;
    private final long b;

    public nw_0(int n, long l) {
        this.a = n;
        this.b = l;
    }

    public int a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    @NotNull
    public static Function<nw_0, Integer> c() {
        return new nx_0();
    }

    public String toString() {
        return "HistoryData{m_achievementId=" + this.a + ", m_unlockTime=" + this.b + "}";
    }
}

