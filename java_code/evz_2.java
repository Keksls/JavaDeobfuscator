/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eVZ
 */
public class evz_2
implements evn_2 {
    public static final abr_1<evn_2> a = new ewa_2();
    private long b;

    public evz_2(long l) {
        this.b = l;
    }

    evz_2() {
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
        return evo_2.e;
    }

    public String toString() {
        return "InventoryRemoveMoneyAction{m_kamas=" + this.b + "}";
    }
}

