/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from boV
 */
public class bov_2
implements bos_2 {
    protected long a;
    private long b;
    private short c;
    private String d;

    @Override
    public erl_1 a(long l) {
        throw new UnsupportedOperationException("On n'est pas cens\u00e9 r\u00e9cup\u00e9rer des membres de guilde d'un remote");
    }

    @Override
    public ern_1 c(long l) {
        throw new UnsupportedOperationException("On n'est pas cens\u00e9 r\u00e9cup\u00e9rer des rangs de guilde d'un remote");
    }

    @Override
    public long c() {
        throw new UnsupportedOperationException("On n'est pas cens\u00e9 r\u00e9cup\u00e9rer le best rank d'un remote");
    }

    @Override
    public long d() {
        return this.a;
    }

    @Override
    public void b(long l) {
        this.a = l;
    }

    @Override
    public long b() {
        return this.b;
    }

    public void d(long l) {
        this.b = l;
    }

    @Override
    public String a() {
        return this.d;
    }

    @Override
    public void a(String string) {
        this.d = string;
    }

    public void a(short s2) {
        this.c = s2;
    }

    @Override
    public short g() {
        return this.c;
    }

    @Override
    public TIntHashSet e() {
        throw new UnsupportedOperationException("On n'est pas cens\u00e9 r\u00e9cup\u00e9rer les bonus d'un remote");
    }

    @Override
    public void j() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0;
        this.d = "";
    }

    public String toString() {
        return "GuildRemoteInformationHandler{m_guildId=" + this.a + ", m_blazon=" + this.b + ", m_level=" + this.c + ", m_name='" + this.d + "'}";
    }
}

