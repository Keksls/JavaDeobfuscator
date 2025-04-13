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
 * Renamed from ns
 */
public class ns_0 {
    private final int a;
    private boolean b;
    private boolean c;
    private Long d;
    private Long e;

    public ns_0(int n, boolean bl, boolean bl2, Long l, Long l2) {
        this.a = n;
        this.b = bl;
        this.c = bl2;
        this.d = l;
        this.e = l2;
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public Long d() {
        return this.d;
    }

    public Long e() {
        return this.e;
    }

    public boolean f() {
        return this.e != null && this.e > 0L;
    }

    public boolean g() {
        return this.d != null && this.d > 0L;
    }

    @NotNull
    public static Function<ns_0, Integer> h() {
        return new nt_0();
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public void b(boolean bl) {
        this.c = bl;
    }

    public void a(Long l) {
        this.d = l;
    }

    public void b(Long l) {
        this.e = l;
    }

    public String toString() {
        return "AchievementData{m_id=" + this.a + ", m_active=" + this.b + ", m_complete=" + this.c + ", m_lastCompletedTime=" + this.d + ", m_startTime=" + this.e + "}";
    }
}

