/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csp
 */
public final class csp_0
extends ps_0 {
    private long a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        return false;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13230;
    }

    @Override
    public String toString() {
        return "AddItemToCompanionEquipmentResultMessage{m_itemUid=" + this.b + "}";
    }
}

