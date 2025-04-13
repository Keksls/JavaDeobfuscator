/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eJe
 */
public class eje_0
extends fo_1 {
    protected wf_1 d;
    final /* synthetic */ eJd e;

    protected eje_0(eJd eJd2) {
        this.e = eJd2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.d.a(byteBuffer);
        if (this.e.aN().g()) {
            abx_2 abx_22 = new abx_2();
            byte by = 0;
            fiz<fio_0> fiz2 = ((erd_2)this.e.w).t();
            for (fio_0 fio_02 : fiz2) {
                if (fio_02.c() == 0) continue;
                by = (byte)(by + 1);
                abx_22.a(fio_02.aT_());
                abx_22.a((int)fio_02.c());
            }
            byteBuffer.put(by);
            byteBuffer.put(abx_22.c());
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d = new wf_1();
        this.d.b(byteBuffer);
        this.e.aD();
        this.e.w.b(this.d);
        if (this.e.aN().g()) {
            int n2 = byteBuffer.get();
            fiz<fio_0> fiz2 = ((erd_2)this.e.w).t();
            for (int k = 0; k < n2; ++k) {
                fio_0 fio_02;
                int n3 = byteBuffer.getInt();
                int n4 = byteBuffer.getInt();
                if (fiz2 == null || (fio_02 = (fio_0)fiz2.c(n3)) == null) continue;
                fio_02.c((short)n4);
            }
        }
    }

    @Override
    public int j() {
        this.d = new wf_1();
        this.e.w.a(this.d);
        if (this.e.aN().g()) {
            int n = 0;
            fiz<fio_0> fiz2 = ((erd_2)this.e.w).t();
            for (fio_0 fio_02 : fiz2) {
                if (fio_02.c() == 0) continue;
                n = (byte)(n + 1);
            }
            return this.d.b() + 1 + n * 8;
        }
        return this.d.b();
    }
}

