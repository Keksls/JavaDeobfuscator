/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqY
 */
public class cqy_0
extends ps_0 {
    private boolean a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 12283;
    }

    public boolean b() {
        return this.a;
    }

    @Override
    public String toString() {
        return "ActorSpawnProtocolMessage{m_schedulingSpawn=" + this.a + "}";
    }
}

