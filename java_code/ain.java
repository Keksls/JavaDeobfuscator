/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;

final class ain
extends aim {
    static final /* synthetic */ boolean d;

    @Override
    public void a(Entity3D entity3D, byte by, float f2, float f3, float f4, float f5) {
        if (!d && entity3D.V() != 1) {
            throw new AssertionError();
        }
        GeometryMesh geometryMesh = (GeometryMesh)entity3D.b(0);
        VertexBufferPCT vertexBufferPCT = geometryMesh.c();
        aim.d[0] = -f3;
        aim.d[1] = (by & 1) == 1 ? f2 : 0.0f;
        aim.d[2] = 0.0f;
        aim.d[3] = f3 * 0.5f + ((by & 2) == 2 ? f2 : 0.0f);
        aim.d[4] = f3;
        aim.d[5] = (by & 4) == 4 ? f2 : 0.0f;
        aim.d[6] = 0.0f;
        aim.d[7] = -f3 * 0.5f + ((by & 8) == 8 ? f2 : 0.0f);
        vertexBufferPCT.b(aim.d);
    }

    static {
        d = !aim.class.desiredAssertionStatus();
    }
}

