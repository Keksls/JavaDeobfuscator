/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQo
 */
public class eqo_0 {
    private long a;
    private long b;
    private long c;
    private int d;
    private String e;
    private long f;
    private boolean g;
    private byte h;
    private byte i;
    private short j;
    private int k;
    private long l;

    public eqo_0 a(long l) {
        this.a = l;
        return this;
    }

    public eqo_0 a(int n) {
        this.d = n;
        return this;
    }

    public eqo_0 b(long l) {
        this.b = l;
        return this;
    }

    public eqo_0 c(long l) {
        this.c = l;
        return this;
    }

    public eqo_0 a(String string) {
        this.e = string;
        return this;
    }

    public eqo_0 d(long l) {
        this.f = l;
        return this;
    }

    public eqo_0 a(boolean bl) {
        this.g = bl;
        return this;
    }

    public eqo_0 a(byte by) {
        this.h = by;
        return this;
    }

    public eqo_0 b(byte by) {
        this.i = by;
        return this;
    }

    public eqo_0 a(short s2) {
        this.j = s2;
        return this;
    }

    public eqo_0 b(int n) {
        this.k = n;
        return this;
    }

    public eqo_0 e(long l) {
        this.l = l;
        return this;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.c;
    }

    public String c() {
        return this.e;
    }

    public erl_1 d() {
        eQp eQp2 = new eQp(this.a);
        eQp2.a(this.c);
        eQp2.a(this.e);
        eQp2.a(this.d);
        eQp2.b(this.f);
        eQp2.a(this.g);
        eQp2.a(this.h);
        eQp2.b(this.i);
        eQp2.a(this.j);
        eQp2.b(this.k);
        eQp2.c(this.b);
        eQp2.d(this.l);
        return eQp2;
    }

    public String toString() {
        return "GuildMemberBuilder{m_id=" + this.a + ", m_rankId=" + this.c + ", m_guildPoints=" + this.d + ", m_name='" + this.e + "', m_xp=" + this.f + ", m_connected=" + this.g + ", m_smiley=" + this.h + ", m_sex=" + this.i + ", m_breedId=" + this.j + ", m_nationId=" + this.k + ", m_saveDate=" + this.l + "}";
    }
}

