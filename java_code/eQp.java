/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

final class eQp
implements erl_1 {
    private final ArrayList<erm_1> a = new ArrayList();
    private final long b;
    private long c;
    private long d;
    private int e;
    private String f;
    private long g;
    private boolean h;
    private byte i;
    private int j;
    private byte k;
    private short l;
    private long m;
    private List<Ow> n;
    private xz_0 o = xz_0.a;

    eQp(long l) {
        this.b = l;
    }

    @Override
    public long a() {
        return this.b;
    }

    @Override
    public long b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.e;
    }

    @Override
    public long d() {
        return this.d;
    }

    @Override
    public long e() {
        return this.g;
    }

    @Override
    public String f() {
        return this.f;
    }

    @Override
    public boolean g() {
        return this.h;
    }

    @Override
    public byte h() {
        return this.i;
    }

    @Override
    public byte i() {
        return this.k;
    }

    @Override
    public short j() {
        return this.l;
    }

    @Override
    public int k() {
        return this.j;
    }

    @Override
    public long l() {
        return this.m;
    }

    @Override
    public List<Ow> m() {
        return this.n;
    }

    @Override
    public byte n() {
        return Ow.a(this.n);
    }

    @Override
    public xz_0 o() {
        return this.o;
    }

    @Override
    public byte p() {
        if (this.o == null) {
            return (byte)xz_0.a.a();
        }
        return (byte)this.o.a();
    }

    void a(int n) {
        this.e = n;
        this.q();
    }

    void a(long l) {
        long l2 = this.d;
        this.d = l;
        this.e(l2);
    }

    void a(String string) {
        this.f = string;
        this.q();
    }

    void b(long l) {
        this.g = l;
        this.q();
    }

    void a(boolean bl) {
        this.h = bl;
        this.q();
    }

    void a(byte by) {
        this.i = by;
        this.q();
    }

    void b(byte by) {
        this.k = by;
        this.q();
    }

    void a(short s2) {
        this.l = s2;
        this.q();
    }

    void b(int n) {
        this.j = n;
        this.q();
    }

    void c(long l) {
        this.c = l;
        this.q();
    }

    public void d(long l) {
        this.m = l;
    }

    public void a(List<Ow> list) {
        this.n = list;
        this.q();
    }

    public void a(xz_0 xz_02) {
        this.o = xz_02;
        this.q();
    }

    private void q() {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            this.a.get(k).b(this);
        }
    }

    private void e(long l) {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            this.a.get(k).a(this, l);
        }
    }

    @Override
    public boolean a(erm_1 erm_12) {
        return !this.a.contains(erm_12) && this.a.add(erm_12);
    }

    @Override
    public boolean b(erm_1 erm_12) {
        return this.a.remove(erm_12);
    }

    public String toString() {
        return "GuildMemberModel{m_listeners=" + this.a + ", m_id=" + this.b + ", m_rank=" + this.d + ", m_guildPoints=" + this.e + ", m_name='" + this.f + "', m_xp=" + this.g + ", m_connected=" + this.h + ", m_smiley=" + this.i + ", m_nationId=" + this.j + ", m_sex=" + this.k + ", m_breedId=" + this.l + ", m_saveDate=" + this.m + ", m_languages=" + (this.n == null ? Character.valueOf('?') : (Serializable)((Object)this.n.stream().map(Ow::h).collect(Collectors.joining(";")))) + ", m_accountCommunity=" + (Serializable)(this.o == null ? Character.valueOf('?') : this.o.b()) + "}";
    }
}

