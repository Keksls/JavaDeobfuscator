/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eVR
 */
public class evr_2
implements evn_2 {
    public static final abr_1<evn_2> a = new evs_2();
    private long b;

    public evr_2(long l) {
        this.b = l;
    }

    evr_2() {
    }

    public long c() {
        return this.b;
    }

    @Override
    public int a() {
        return 8;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.b);
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
    }

    @Override
    public evo_2 b() {
        return evo_2.d;
    }

    public String toString() {
        return "InventoryAddMoneyAction{m_kamas=" + this.b + "}";
    }
}

