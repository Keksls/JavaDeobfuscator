/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

/*
 * Renamed from Zr
 */
public class zr_0
implements zt_0 {
    private final acb_0 a;
    private final zf_0 b;
    private float c;
    private float d;
    private float e;
    private float f = -1.0f;
    private float g = -1.0f;
    private int h = -1;
    private int i = -1;

    public zr_0(acb_0 acb_02, zf_0 zf_02) {
        this.a = acb_02;
        this.b = zf_02;
    }

    private void a() {
        abY abY2 = this.a.b();
        this.e = abY2.g();
        int n = abY2.o();
        int n2 = abY2.p();
        int n3 = (int)((float)this.b.a() / this.e);
        int n4 = (int)((float)this.b.b() / this.e);
        this.c = n3 + n;
        this.d = n4 + n2;
    }

    @Override
    public void a(zo_0 zo_02, int n) {
        int n2 = zo_02.n();
        int n3 = zo_02.g();
        Entity3D entity3D = zo_02.o();
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)entity3D.b(0);
        int n4 = Math.min(250, n3 / 4);
        int n5 = n3 / 2;
        int n6 = gLGeometrySprite.q();
        int n7 = gLGeometrySprite.p();
        if (n2 > n5) {
            this.a();
            if (this.f == -1.0f) {
                this.f = zo_02.b();
            }
            if (this.g == -1.0f) {
                this.g = zo_02.c();
            }
            if (this.h == -1) {
                this.h = n7;
            }
            if (this.i == -1) {
                this.i = n6;
            }
            int n8 = n2 - n5;
            int n9 = n3 - n5;
            int n10 = Math.round(zo_0.c(n8, this.f, this.c - (zo_02.q() - (float)zo_02.b()), n9));
            int n11 = Math.round(zo_0.c(n8, this.g, this.d - (zo_02.r() - (float)zo_02.c()), n9));
            zo_02.a(n10);
            zo_02.b(n11);
            if (n7 > 0 && n6 > 0) {
                int n12 = Math.max(0, (int)((float)n7 - ((float)n7 - zo_0.c(n8, this.h, 0.0f, n3))));
                int n13 = Math.max(0, (int)((float)n6 - ((float)n6 - zo_0.c(n8, this.i, 0.0f, n3))));
                gLGeometrySprite.a(n12, n13);
            }
        } else if (n2 < n4) {
            float f2 = zo_0.b(n2, 0.0f, 1.0f, n4);
            gLGeometrySprite.a((int)(48.0f * f2), (int)(48.0f * f2));
            zo_02.b((int)zo_0.b(n2, 60.0f, 60.0f, n3));
            zo_02.a(-gLGeometrySprite.p() / 2);
        }
        zo_02.s();
        entity3D.a(1.0f, 1.0f, 1.0f, 1.0f);
    }
}

