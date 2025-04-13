/*
 * Decompiled with CFR 0.152.
 */
import java.sql.Timestamp;

/*
 * Renamed from emF
 */
public class emf_0 {
    private final int a;
    private final Timestamp b;
    private final Timestamp c;

    public emf_0(int n, Timestamp timestamp, Timestamp timestamp2) {
        this.a = n;
        this.b = timestamp;
        this.c = timestamp2;
    }

    public int a() {
        return this.a;
    }

    public Timestamp b() {
        return this.b;
    }

    public Timestamp c() {
        return this.c;
    }

    public String toString() {
        return "SubscriptionPeriod{m_subscriptionLevel=" + this.a + ", m_startDate=" + this.b + ", m_endDate=" + this.c + "}";
    }
}

