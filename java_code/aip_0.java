/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;

/*
 * Renamed from aip
 */
final class aip_0
extends aim {
    static final /* synthetic */ boolean d;

    @Override
    public void a(Entity3D entity3D, byte by, float f2, float f3, float f4, float f5) {
        if (!d && entity3D.V() != 1) {
            throw new AssertionError();
        }
        GeometryMesh geometryMesh = (GeometryMesh)entity3D.b(0);
        VertexBufferPCT vertexBufferPCT = geometryMesh.c();
        aim.d[0] = -f4;
        aim.d[1] = -f5;
        aim.d[2] = -f4;
        aim.d[3] = f5;
        aim.d[4] = f4;
        aim.d[5] = -f5;
        aim.d[6] = f4;
        aim.d[7] = f5;
        vertexBufferPCT.b(aim.d);
    }

    static {
        d = !aim.class.desiredAssertionStatus();
    }
}

