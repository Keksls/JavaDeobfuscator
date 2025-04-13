/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvI
 */
public class cvi_1
extends ps_0 {
    private int a = -1;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12049;
    }

    public int b() {
        return this.a;
    }

    @Override
    public String toString() {
        return "MimiSymbicResultMessage{, m_itemSkinId=" + this.a + "}";
    }
}

