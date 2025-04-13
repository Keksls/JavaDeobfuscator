/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from aaX
 */
public final class aax_0
extends aat_0<aad> {
    public aax_0(String string) {
        super(string);
    }

    public aad c() {
        return new aad();
    }

    @Override
    public void a(aad aad2, ByteBuffer byteBuffer) {
        aad2.b.a(byteBuffer.getFloat(), byteBuffer.getFloat(), byteBuffer.getFloat(), byteBuffer.getFloat());
        int n = byteBuffer.get() & 0xFF;
        aad2.b.k();
        for (int k = 0; k < n; ++k) {
            double d2 = byteBuffer.getFloat();
            double d3 = byteBuffer.getFloat();
            afu_2 afu_22 = new afu_2(d2, d3);
            aad2.b.a(afu_22);
            afu_22.b(byteBuffer.getFloat(), byteBuffer.getFloat());
            afu_22.c(byteBuffer.getFloat(), byteBuffer.getFloat());
        }
    }

    @Override
    public void a(gk_0 gk_02, String string) {
        afx_2 afx_22 = afz_2.a(string);
        int n = afx_22.j();
        gk_02.a((float)afx_22.d());
        gk_02.a((float)afx_22.f());
        gk_02.a((float)afx_22.e());
        gk_02.a((float)afx_22.g());
        gk_02.a((byte)n);
        for (int k = 0; k < n; ++k) {
            afu_2 afu_22 = afx_22.a(k);
            gk_02.a((float)afu_22.a());
            gk_02.a((float)afu_22.b());
            gk_02.a((float)afu_22.c());
            gk_02.a((float)afu_22.d());
            gk_02.a((float)afu_22.e());
            gk_02.a((float)afu_22.f());
        }
    }

    @Override
    public /* synthetic */ ZZ b() {
        return this.c();
    }
}

