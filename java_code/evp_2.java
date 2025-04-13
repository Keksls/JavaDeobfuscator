/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eVP
 */
public class evp_2
implements evn_2 {
    public static final abr_1<evn_2> a = new evq_2();
    private long b;
    private int c;
    private short d;
    private byte e;

    public evp_2(long l, int n, short s2) {
        this.b = l;
        this.c = n;
        this.d = s2;
        this.e = (byte)-1;
    }

    public evp_2(long l, int n, short s2, byte by) {
        this.b = l;
        this.c = n;
        this.d = s2;
        this.e = by;
    }

    evp_2() {
    }

    @Override
    public int a() {
        return 15;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putShort(this.d);
        byteBuffer.put(this.e);
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
    }

    @Override
    public evo_2 b() {
        return evo_2.a;
    }

    public long c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public short e() {
        return this.d;
    }

    public byte f() {
        return this.e;
    }

    public String toString() {
        return "InventoryAddItemAction{m_itemId=" + this.b + ", m_refId=" + this.c + ", m_quantity=" + this.d + ", m_destinationPosition=" + this.e + "}";
    }
}

