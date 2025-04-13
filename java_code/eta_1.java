/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

/*
 * Renamed from eTa
 */
public final class eta_1
extends esl_2 {
    private long a;
    private long b;
    private int c;
    private final aff_1 d = new aff_1();
    private long e;
    private byte[] f;
    private int g;

    eta_1() {
    }

    public eta_1(long l, long l2, int n, aff_1 aff_12, long l3, byte[] byArray, int n2) {
        this.a = l;
        this.b = l2;
        this.c = n;
        this.d.g(aff_12);
        this.e = l3;
        this.f = byArray;
        this.g = n2;
    }

    @Override
    public esn_2 a() {
        return esn_2.h;
    }

    @Override
    protected void a(abx_2 abx_22) {
        super.a(abx_22);
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.d.d());
        abx_22.a(this.d.e());
        abx_22.a(this.d.f());
        abx_22.a(this.e);
        abx_22.a(this.f.length);
        abx_22.b(this.f);
        abx_22.a(this.g);
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d.c(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        this.e = byteBuffer.getLong();
        this.f = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.f);
        this.g = byteBuffer.getInt();
    }

    @Override
    public void a(esd_2 esd_22) {
        esd_22.a(this);
    }

    @Override
    public void a(ese_2 ese_22) {
        ese_22.a(this);
    }

    public long b() {
        return -1L;
    }

    public long c() {
        return this.a;
    }

    public void a(long l) {
        this.a = l;
    }

    public long d() {
        return this.e;
    }

    public byte[] e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public int k() {
        return this.c;
    }

    public aff_1 l() {
        return this.d;
    }

    public long m() {
        return this.b;
    }

    @Override
    public String toString() {
        return "InteractiveElementCreate{m_data=" + Arrays.toString(this.f) + ", m_elementUid=" + this.a + ", m_interactiveElementId=" + this.b + ", m_templateId=" + this.c + ", m_position=" + this.d + ", m_ownerId=" + this.e + "} " + super.toString();
    }
}

