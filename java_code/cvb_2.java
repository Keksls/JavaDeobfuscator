/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvb
 */
public class cvb_2
extends ps_0 {
    private exh_2 a;
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = exh_2.a(byteBuffer.get());
        this.b = byteBuffer.get() == 1;
        return true;
    }

    public exh_2 b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    @Override
    public int a() {
        return 12344;
    }

    @Override
    public String toString() {
        return "EquipmentPositionLockedMessage{m_position=" + this.a + ", m_locked=" + this.b + "}";
    }
}

