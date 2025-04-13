/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from VQ
 */
public class vq_0
extends vl_0 {
    private sr_0 a;
    private long b;

    @Override
    protected void b(We we) {
        we.a(this);
    }

    vq_0() {
    }

    public sr_0 g() {
        return this.a;
    }

    public long h() {
        return this.b;
    }

    void a(sr_0 sr_02) {
        this.a = sr_02;
    }

    void a(long l) {
        this.b = l;
    }

    @Override
    protected int c() {
        return 16;
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a.a_());
        byteBuffer.putLong(this.b);
    }

    @Override
    protected void a(vz_0 vz_02, ByteBuffer byteBuffer) {
        this.a = vz_02.a(byteBuffer.getLong());
        this.b = byteBuffer.getLong();
    }

    public vq_0(sr_0 sr_02, long l) {
        this();
        this.a = sr_02;
        this.b = l;
    }

    public static vq_0 a(sr_0 sr_02, long l) {
        return new vq_0(sr_02, l);
    }

    static vq_0 i() {
        return new vq_0();
    }

    @Override
    public long a() {
        return this.b;
    }

    public String toString() {
        return "EffectAreaActivationEvent{m_area=" + this.a + ", m_applicantId=" + this.b + "}";
    }
}

