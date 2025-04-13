/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuU
 */
public class cuu_2
extends ps_0 {
    private int a;
    private int b;

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 13014;
    }

    @Override
    public String toString() {
        return "AccountInventoryChangeMessage{m_referenceId=" + this.a + ", m_quantity=" + this.b + "}";
    }
}

