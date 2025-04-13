/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ahE
 */
public class ahe_0
implements ahh_0,
ain_0 {
    private abu a;
    private final float b;
    private final int c;

    public ahe_0(@NotNull abu abu2, float f2, int n) {
        this.a = abu2;
        this.b = f2;
        this.c = n;
    }

    @Override
    public void b(float f2, float f3) {
        this.a.b(f2, f3);
    }

    @Override
    public void b(float f2, float f3, float f4) {
        this.a.b(f2, f3, f4);
    }

    @Override
    public float aj() {
        return this.a.aj();
    }

    @Override
    public float J() {
        return this.a.J();
    }

    @Override
    public float K() {
        return this.a.K();
    }

    @Override
    public float L() {
        return this.a.L() + this.b();
    }

    @Override
    public int G() {
        return this.a.G();
    }

    @Override
    public int H() {
        return this.a.H();
    }

    @Override
    public short I() {
        return (short)((float)this.a.I() + this.b());
    }

    public ahh_0 a() {
        return this.a;
    }

    public void a(@NotNull abu abu2) {
        this.a = abu2;
    }

    @Override
    public boolean at() {
        return this.a.at();
    }

    @Override
    public void a(FreeParticleSystem freeParticleSystem) {
        this.a.a(freeParticleSystem);
    }

    @Override
    public void b(FreeParticleSystem freeParticleSystem) {
        this.a.b(freeParticleSystem);
    }

    @Override
    public void aB() {
    }

    private float b() {
        return (float)this.a.ag() * this.b + (float)this.c;
    }
}

