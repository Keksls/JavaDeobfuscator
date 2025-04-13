/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

/*
 * Renamed from Zq
 */
public class zq_0
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

    public zq_0(acb_0 acb_02, zf_0 zf_02) {
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
        int n2;
        int n3 = zo_02.n();
        int n4 = zo_02.g();
        Entity3D entity3D = zo_02.o();
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)entity3D.b(0);
        int n5 = n2 = n4 / 2;
        int n6 = n4 / 2;
        int n7 = gLGeometrySprite.q();
        int n8 = gLGeometrySprite.p();
        this.a();
        if (zo_02.q() != 0.0f || zo_02.r() != 0.0f) {
            if (this.f == -1.0f) {
                this.f = this.c - zo_02.q();
            }
            if (this.g == -1.0f) {
                this.g = this.d - zo_02.r();
            }
            zo_02.b((int)this.g);
            zo_02.a((int)this.f);
            zo_02.o().a(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (this.h == -1) {
            this.h = n8;
        }
        if (this.i == -1) {
            this.i = n7;
        }
        if (n3 > n5) {
            int n9 = n3 - n5;
            zo_02.b((int)zo_0.b(n9, 60.0f, 40.0f, n6));
            zo_02.a(-gLGeometrySprite.p() / 2);
            float f2 = (float)n6 * 0.8f;
            float f3 = Hw.b(zo_0.b(Math.min((float)n9, f2), 20.0f, -20.1f, f2), 0.0f, 1.0f);
            zo_02.o().a(1.0f, 1.0f, 1.0f, f3);
        } else {
            int n10 = Math.round(zo_0.b(n3, this.f, -this.f - (float)(n8 / 2), n2));
            int n11 = Math.round(zo_0.b(n3, this.g, -this.g + 60.0f, n2));
            zo_02.a(n10);
            zo_02.b(n11);
        }
        zo_02.s();
    }
}

