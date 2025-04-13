/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eSa
 */
public class esa_1
extends erz_1 {
    private final le_0 c;
    private final short d;

    public esa_1(String string, long l, le_0 le_02, short s2) {
        super(string, l);
        this.c = le_02;
        this.d = s2;
    }

    public le_0 c() {
        return this.c;
    }

    public short d() {
        return this.d;
    }

    public String toString() {
        return "GuildStorageHistoryItemEntry{m_item=" + this.c + "}";
    }
}

