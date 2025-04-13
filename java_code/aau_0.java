/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from aaU
 */
public final class aau_0
extends aat_0<aaa_0> {
    public aau_0(String string) {
        super(string);
    }

    public final aaa_0 c() {
        return new aaa_0();
    }

    @Override
    public final void a(aaa_0 aaa_02, ByteBuffer byteBuffer) {
        aaa_02.b = byteBuffer.get();
    }

    @Override
    public void a(gk_0 gk_02, String string) {
        gk_02.a(Byte.parseByte(string));
    }

    @Override
    public /* synthetic */ ZZ b() {
        return this.c();
    }
}

