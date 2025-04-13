/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

/*
 * Renamed from aus
 */
public class aus_2
extends aup_2 {
    private avz_2 i;

    @Override
    public void a() {
        super.a();
        String string = auc_1.a().c() + "textures/cloud.tga";
        this.i = new avz_2((long)auc_1.d(string), string, false);
    }

    @Override
    public void a(aum_2 aum_22) {
        avx_2 avx_22 = auj_1.a.a();
        this.a.glDrawBuffer(1029);
        this.d();
        GL2 gL2 = avx_22.e();
        this.i.a(gL2);
        avx_22.i.a(9);
        auf_2 auf_22 = auf_2.a;
        int n = 0;
        long l = System.nanoTime();
        while (System.nanoTime() - l < 500000000L) {
            this.a.glVertexPointer(2, 5126, 0, (Buffer)this.h.b());
            this.a.glTexCoordPointer(2, 5126, 0, (Buffer)this.h.d());
            this.a.glDrawElements(7, 4, 5123, (Buffer)auf_22.c());
            ++n;
        }
        float f2 = (float)n / 0.5f;
        b.info((Object)("textured quad draw/s ~= " + f2));
        aum_22.d(f2);
    }

    @Override
    public void b() {
        avx_2 avx_22 = auj_1.a.a();
        GL2 gL2 = avx_22.e();
        this.i.d((GL)gL2);
        this.i.u();
        super.b();
    }

    @Override
    public String c() {
        return "GL texture fillrate";
    }
}

