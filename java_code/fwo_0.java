/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;

/*
 * Renamed from fwO
 */
public class fwo_0
extends fwn_0 {
    @Override
    protected void a(VertexBufferPCT vertexBufferPCT, int n) {
        vertexBufferPCT.a(n);
        if (this.b != null) {
            boolean bl = false;
            for (int k = 0; k < n; ++k) {
                float f2 = 1.0f - Math.abs(((float)n / 2.0f - (float)k) / ((float)n / 2.0f));
                boolean bl2 = k % 4 < 2;
                bl = !bl;
                float f3 = bl2 ? this.b.i() : this.b.h();
                float f4 = bl ? this.b.k() : this.b.j();
                vertexBufferPCT.a(k, f3, f4);
                vertexBufferPCT.a(k, 1.0f, 1.0f, 1.0f, f2);
            }
        }
    }

    @Override
    public void b() {
        super.b();
        this.c(0.95f);
    }
}

