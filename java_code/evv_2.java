/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eVV
 */
public class evv_2
implements evn_2 {
    public static final abr_1<evn_2> a = new evw_2();
    private long b;
    private byte c;

    public evv_2(long l, byte by) {
        this.b = l;
        this.c = by;
    }

    evv_2() {
    }

    @Override
    public int a() {
        return 9;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.b);
        byteBuffer.put(this.c);
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
    }

    @Override
    public evo_2 b() {
        return evo_2.c;
    }

    public long c() {
        return this.b;
    }

    public byte d() {
        return this.c;
    }

    public String toString() {
        return "InventoryMoveItemAction{m_itemId=" + this.b + ", m_destinationPosition=" + this.c + "}";
    }
}

