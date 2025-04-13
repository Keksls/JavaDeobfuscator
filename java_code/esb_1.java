/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eSb
 */
public class esb_1
extends erz_1 {
    private final long c;

    public esb_1(String string, long l, long l2) {
        super(string, l);
        this.c = l2;
    }

    public long c() {
        return this.c;
    }

    public String toString() {
        return "GuildStorageHistoryMoneyEntry{m_memberName='" + this.a + "', m_date=" + this.b + ", m_amount=" + this.c + "}";
    }
}

