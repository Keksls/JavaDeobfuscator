/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;

/*
 * Renamed from nu
 */
public class nu_0 {
    private final int a;

    public nu_0(int n) {
        this.a = n;
    }

    public int a() {
        return this.a;
    }

    public static Function<nu_0, Integer> b() {
        return new nv_0();
    }

    public String toString() {
        return "FollowData{m_achievementId=" + this.a + "}";
    }
}

