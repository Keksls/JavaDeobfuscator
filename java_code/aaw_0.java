/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from aaW
 */
public final class aaw_0
extends aat_0<aac> {
    public aaw_0(String string) {
        super(string);
    }

    public final aac c() {
        return new aac();
    }

    @Override
    public final void a(aac aac2, ByteBuffer byteBuffer) {
        aac2.b = byteBuffer.getShort();
    }

    @Override
    public void a(gk_0 gk_02, String string) {
        gk_02.a(Short.parseShort(string));
    }

    @Override
    public /* synthetic */ ZZ b() {
        return this.c();
    }
}

