/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bts
 */
class bts_0 {
    private final short a;
    private boolean b;
    private final String c;
    private final byte d;

    bts_0(short s2, String string, boolean bl, byte by) {
        this.a = s2;
        this.b = bl;
        this.c = string;
        this.d = by;
    }

    public short a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public byte d() {
        return this.d;
    }

    public String toString() {
        return "TutorialPart{m_id=" + this.a + ", m_activated=" + this.b + ", m_name='" + this.c + "', m_eventId=" + this.d + "}";
    }
}

