/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

/*
 * Renamed from eTc
 */
public class etc_1
extends esl_2 {
    private long a;
    private final aff_1 b = new aff_1();
    private byte[] c;
    private int d;

    etc_1() {
    }

    public etc_1(long l, aff_1 aff_12, byte[] byArray, int n) {
        this.a = l;
        this.b.g(aff_12);
        this.c = byArray;
        this.d = n;
    }

    @Override
    public esn_2 a() {
        return esn_2.g;
    }

    @Override
    protected void a(abx_2 abx_22) {
        super.a(abx_22);
        abx_22.a(this.a);
        abx_22.a(this.b.d());
        abx_22.a(this.b.e());
        abx_22.a(this.b.f());
        abx_22.a(this.c.length);
        abx_22.b(this.c);
        abx_22.a(this.d);
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        this.a = byteBuffer.getLong();
        this.b.c(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        this.c = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.c);
        this.d = byteBuffer.getInt();
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
        return this.a;
    }

    public byte[] c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public aff_1 e() {
        return this.b;
    }

    @Override
    public String toString() {
        return "InteractiveElementUpdate{m_data=" + Arrays.toString(this.c) + ", m_elementUid=" + this.a + ", m_position=" + this.b + "} " + super.toString();
    }
}

