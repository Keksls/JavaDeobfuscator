/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpA
 */
public class cpa_0
extends Pw {
    private final evn_2 a;

    public cpa_0(evn_2 evn_22) {
        this.a = evn_22;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1 + this.a.a());
        byteBuffer.put((byte)this.a.b().ordinal());
        this.a.a(byteBuffer);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13422;
    }
}

