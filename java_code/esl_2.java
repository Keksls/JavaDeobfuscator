/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eSL
 */
public abstract class esl_2 {
    private long a;
    private boolean b;
    private long c;

    public abstract esn_2 a();

    public abstract void a(esd_2 var1);

    public abstract void a(ese_2 var1);

    public final byte[] g() {
        abx_2 abx_22 = new abx_2();
        this.a(abx_22);
        return abx_22.c();
    }

    protected void a(abx_2 abx_22) {
        abx_22.a(this.a);
        abx_22.a((byte)(this.b ? 1 : 0));
    }

    public final void b(ByteBuffer byteBuffer) {
        this.a(byteBuffer);
    }

    protected void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get() == 1;
    }

    public long h() {
        return this.a;
    }

    public void c(long l) {
        this.a = l;
    }

    public boolean i() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public long j() {
        return this.c;
    }

    public void d(long l) {
        this.c = l;
    }

    public String toString() {
        return "HavenWorldAction{m_actionUID=" + this.a + ", m_isAdmin=" + this.b + ", m_playerId=" + this.c + "}";
    }
}

