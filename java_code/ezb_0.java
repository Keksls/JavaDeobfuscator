/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eZB
 */
public class ezb_0 {
    private ezc_0 a;
    private final eze_0 b;
    private final int c;
    private final boolean d;

    public ezb_0(ezc_0 ezc_02, eze_0 eze_02, int n, boolean bl) {
        this.a = ezc_02;
        this.b = eze_02;
        this.c = n;
        this.d = bl;
    }

    public ezb_0(ezc_0 ezc_02, eze_0 eze_02, int n) {
        this(ezc_02, eze_02, n, false);
    }

    public ezb_0(ezc_0 ezc_02, eze_0 eze_02, boolean bl) {
        this(ezc_02, eze_02, 0, bl);
    }

    public ezb_0(ezc_0 ezc_02, eze_0 eze_02) {
        this(ezc_02, eze_02, 0);
    }

    public void a(ezc_0 ezc_02) {
        this.a = ezc_02;
    }

    public ezc_0 a() {
        return this.a;
    }

    public eze_0 b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public ezb_0 e() {
        return new ezb_0(this.a, this.b, this.c, this.d);
    }

    public String toString() {
        return "ShardsOperation{m_type=" + this.a + ", m_concernedSlot=" + this.b + ", m_shardDefinitionId=" + this.c + ", m_hasShift=" + this.d + "}";
    }
}

