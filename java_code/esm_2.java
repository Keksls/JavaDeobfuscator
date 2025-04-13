/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eSm
 */
public class esm_2 {
    private final long a;
    private final String b;
    private final long c;
    private int d;
    private boolean e;
    private boolean f;

    public esm_2(long l, String string, long l2, int n, boolean bl) {
        this(l, string, l2, n, false, bl);
    }

    public esm_2(long l, String string, long l2, int n, boolean bl, boolean bl2) {
        this.a = l;
        this.b = string;
        this.c = l2;
        this.d = n;
        this.e = bl;
        this.f = bl2;
    }

    public long a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public boolean d() {
        return this.e;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public static esm_2 a(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        if (l == 0L) {
            return null;
        }
        long l2 = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        String string = Cz.a(byArray);
        int n = byteBuffer.getInt();
        boolean bl = byteBuffer.get() == 1;
        boolean bl2 = byteBuffer.get() == 1;
        return new esm_2(l, string, l2, n, bl, bl2);
    }

    public static void a(esm_2 esm_22, abx_2 abx_22) {
        if (esm_22 == null) {
            abx_22.a(0L);
            return;
        }
        abx_22.a(esm_22.a());
        abx_22.a(esm_22.c());
        byte[] byArray = Cz.a(esm_22.b());
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        abx_22.a(esm_22.e());
        abx_22.a(esm_22.d() ? (byte)1 : 0);
        abx_22.a(esm_22.f() ? (byte)1 : 0);
    }

    public int e() {
        return this.d;
    }

    public void a(int n) {
        this.d = n;
    }

    public boolean f() {
        return this.f;
    }

    public void b(boolean bl) {
        this.f = bl;
    }

    public long g() {
        return this.a * -1L;
    }

    public String toString() {
        return "HavenWorldBasicInfo{m_guildId=" + this.a + ", m_guildName='" + this.b + "', m_guildBlazon=" + this.c + ", m_resources=" + this.d + ", m_open=" + this.e + ", m_guildOnly=" + this.f + "}";
    }
}

