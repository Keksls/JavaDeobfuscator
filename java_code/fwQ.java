/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

public class fwQ {
    private fwQ() {
    }

    private static int a(float[] fArray, azj_2 azj_22, float f2, float f3, ave_1 ave_12, boolean bl, Entity3D entity3D) {
        int n;
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.k.d();
        int n2 = fArray.length / 2;
        VertexBufferPCT vertexBufferPCT = VertexBufferPCT.d.b(n2);
        auf_2 auf_22 = auf_2.b;
        vertexBufferPCT.a(n2);
        vertexBufferPCT.b(fArray);
        int n3 = vertexBufferPCT.j();
        for (n = 0; n < n3; ++n) {
            vertexBufferPCT.a(n, azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        }
        gLGeometryMesh.a(ave_12, vertexBufferPCT, auf_22);
        gLGeometryMesh.b(f3);
        gLGeometryMesh.a(bl);
        n = entity3D.a(gLGeometryMesh);
        vertexBufferPCT.u();
        gLGeometryMesh.u();
        return n;
    }

    public static void a(int n, int n2, int n3, int n4, ayo_2 ayo_22, azj_2 azj_22, Entity3D entity3D) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        GeometrySprite geometrySprite = fwQ.a(n, n2, n3, n4, azj_22);
        ays_2 ays_22 = fwQ.a(ayo_22, geometrySprite);
        entity3D.a(geometrySprite, ays_22, null);
        geometrySprite.u();
    }

    public static void a(int n, int n2, int n3, int n4, ayo_2 ayo_22, azj_2 azj_22, EntitySprite entitySprite) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        GeometrySprite geometrySprite = fwQ.a(n, n2, n3, n4, azj_22);
        ays_2 ays_22 = fwQ.a(ayo_22, geometrySprite);
        entitySprite.a(ays_22);
        entitySprite.a(geometrySprite);
        geometrySprite.u();
    }

    public static void a(int n, int n2, ays_2 ays_22, azj_2 azj_22, EntitySprite entitySprite) {
        ayo_2 ayo_22 = new ayo_2(ays_22);
        GeometrySprite geometrySprite = fwQ.a(n, n2, ayo_22.e(), ayo_22.d(), azj_22);
        fwQ.a(ayo_22, geometrySprite);
        entitySprite.a(ays_22);
        entitySprite.a(geometrySprite);
        geometrySprite.u();
    }

    private static ays_2 a(ayo_2 ayo_22, GeometrySprite geometrySprite) {
        if (ayo_22 == null) {
            return null;
        }
        geometrySprite.a(ayo_22.k(), ayo_22.h(), ayo_22.j(), ayo_22.i(), ayo_22.n());
        return ayo_22.a();
    }

    public static GeometrySprite a(int n, int n2, int n3, int n4, azj_2 azj_22) {
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.j.d();
        geometrySprite.a((float)n2, (float)n, n3, n4);
        geometrySprite.a(azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        return geometrySprite;
    }
}

