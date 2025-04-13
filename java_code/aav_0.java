/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from aaV
 */
public final class aav_0
extends aat_0<aab> {
    public aav_0(String string) {
        super(string);
    }

    public final aab c() {
        return new aab();
    }

    @Override
    public void a(aab aab2, ByteBuffer byteBuffer) {
        aab2.b = byteBuffer.getFloat();
    }

    @Override
    public void a(gk_0 gk_02, String string) {
        gk_02.a(Float.parseFloat(string));
    }

    @Override
    public /* synthetic */ ZZ b() {
        return this.c();
    }
}

