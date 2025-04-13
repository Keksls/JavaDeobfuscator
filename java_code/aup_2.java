/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.jogamp.opengl.GL;
import org.apache.log4j.Logger;

/*
 * Renamed from aup
 */
public abstract class aup_2
extends auo_2 {
    protected static final Logger b = Logger.getLogger(aup_2.class);
    protected static final long c = 500000000L;
    protected static final float d = -512.0f;
    protected static final float e = -512.0f;
    protected static final float f = 1024.0f;
    protected static final float g = 1024.0f;
    protected VertexBufferPCT h;

    @Override
    public void a() {
        super.a();
        this.h = VertexBufferPCT.d.b(4);
        this.a(this.h);
    }

    @Override
    public void b() {
        this.h.u();
        super.b();
    }

    private void a(VertexBufferPCT vertexBufferPCT) {
        int n = 0;
        float[] fArray = new float[8];
        fArray[n++] = -512.0f;
        fArray[n++] = 512.0f;
        fArray[n++] = -512.0f;
        fArray[n++] = -512.0f;
        fArray[n++] = 512.0f;
        fArray[n++] = -512.0f;
        fArray[n++] = 512.0f;
        fArray[n++] = 512.0f;
        vertexBufferPCT.b(fArray);
        int n2 = 0;
        float[] fArray2 = new float[8];
        fArray2[n2++] = 0.0f;
        fArray2[n2++] = 0.0f;
        fArray2[n2++] = 0.0f;
        fArray2[n2++] = 1.0f;
        fArray2[n2++] = 1.0f;
        fArray2[n2++] = 1.0f;
        fArray2[n2++] = 1.0f;
        fArray2[n2++] = 0.0f;
        vertexBufferPCT.e(fArray2);
        float[] fArray3 = new float[16];
        for (int k = 0; k < 16; ++k) {
            fArray3[k] = Hw.d();
        }
        vertexBufferPCT.d(fArray3);
    }

    protected void d() {
        float f2 = 512.0f;
        float f3 = 512.0f;
        axr_2.a().a((GL)this.a, 0, 0, 1024, 1024);
        this.a.glOrtho(-512.0, 512.0, -512.0, 512.0, 0.0, 65535.0);
        axr_2.a().a(this.a, axp_2.a);
    }
}

