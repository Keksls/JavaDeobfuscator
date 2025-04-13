/*
 * Decompiled with CFR 0.152.
 */
import java.nio.Buffer;

/*
 * Renamed from aur
 */
public class aur_2
extends aup_2 {
    @Override
    public void a(aum_2 aum_22) {
        avx_2 avx_22 = auj_1.a.a();
        this.a.glDrawBuffer(1029);
        this.d();
        avx_22.i.a(5);
        auf_2 auf_22 = auf_2.a;
        int n = 0;
        long l = System.nanoTime();
        while (System.nanoTime() - l < 500000000L) {
            this.a.glVertexPointer(2, 5126, 0, (Buffer)this.h.b());
            this.a.glColorPointer(4, 5126, 0, (Buffer)this.h.c());
            this.a.glDrawElements(7, 4, 5123, (Buffer)auf_22.c());
            ++n;
        }
        float f2 = (float)n / 0.5f;
        b.info((Object)("colored quad draw/s ~= " + f2));
        aum_22.c(f2);
    }

    @Override
    public String c() {
        return "GL pixel fillrate";
    }
}

