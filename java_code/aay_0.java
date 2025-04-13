/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from aaY
 */
public final class aay_0
extends aat_0<aae> {
    public aay_0(String string) {
        super(string);
    }

    public aae c() {
        return new aae();
    }

    @Override
    public void a(aae aae2, ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        aae2.b = Cz.a(byArray);
    }

    @Override
    public void a(gk_0 gk_02, String string) {
        byte[] byArray = Cz.a(string);
        gk_02.a((byte)byArray.length);
        gk_02.a(byArray);
    }

    @Override
    public /* synthetic */ ZZ b() {
        return this.c();
    }
}

