/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;

/*
 * Renamed from aio
 */
final class aio_0
extends aim {
    static final /* synthetic */ boolean d;

    @Override
    public void a(Entity3D entity3D, byte by, float f2, float f3, float f4, float f5) {
        if (!d && entity3D.V() != 1) {
            throw new AssertionError();
        }
        GeometryMesh geometryMesh = (GeometryMesh)entity3D.b(0);
        VertexBufferPCT vertexBufferPCT = geometryMesh.c();
        float f6 = Hw.e((int)(f4 * 2.0f));
        float f7 = Hw.e((int)(f5 * 2.0f));
        if (by != 0) {
            float f8 = f4 * 2.0f / f6;
            float f9 = f5 * 2.0f / f7;
            float f10 = 1.0f;
            aim.d[0] = -f3;
            aim.d[1] = -1.0f * f5 + ((by & 1) == 1 ? f2 : 0.0f);
            aim.d[2] = 0.0f;
            aim.d[3] = -1.0f * f5 + f3 * 0.5f + ((by & 2) == 2 ? f2 : 0.0f);
            aim.d[4] = f3;
            aim.d[5] = -1.0f * f5 + ((by & 4) == 4 ? f2 : 0.0f);
            aim.d[6] = 0.0f;
            aim.d[7] = -1.0f * f5 + -f3 * 0.5f + ((by & 8) == 8 ? f2 : 0.0f);
            vertexBufferPCT.b(aim.d);
            vertexBufferPCT.a(0, 0.5f * f8, 0.0f);
            vertexBufferPCT.a(1, 1.0f * f8, 0.5f * f9);
            vertexBufferPCT.a(2, 0.5f * f8, 1.0f * f9);
            vertexBufferPCT.a(3, 0.0f, 0.5f * f9);
        } else {
            aim.d[0] = -f4;
            aim.d[1] = f5;
            aim.d[2] = -f4;
            aim.d[3] = -f5;
            aim.d[4] = f4;
            aim.d[5] = -f5;
            aim.d[6] = f4;
            aim.d[7] = f5;
            vertexBufferPCT.b(aim.d);
        }
    }

    static {
        d = !aim.class.desiredAssertionStatus();
    }
}

