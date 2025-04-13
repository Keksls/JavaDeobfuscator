/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eVX
 */
public class evx_2
implements evn_2 {
    public static final abr_1<evn_2> a = new evy_2();
    private long b;
    private int c;
    private short d;
    private long e;
    private byte f;

    public evx_2(long l, int n, short s2, long l2, byte by) {
        this.b = l;
        this.c = n;
        this.d = s2;
        this.e = l2;
        this.f = by;
    }

    evx_2() {
    }

    public long c() {
        return this.b;
    }

    public short d() {
        return this.d;
    }

    public long e() {
        return this.e;
    }

    public byte f() {
        return this.f;
    }

    @Override
    public int a() {
        return 23;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putShort(this.d);
        byteBuffer.putLong(this.e);
        byteBuffer.put(this.f);
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.get();
    }

    public int g() {
        return this.c;
    }

    @Override
    public evo_2 b() {
        return evo_2.b;
    }

    public String toString() {
        return "InventoryRemoveItemAction{m_itemId=" + this.b + ", m_refId=" + this.c + ", m_quantity=" + this.d + ", m_destinationId=" + this.e + ", m_destinationPosition=" + this.f + "}";
    }
}

