/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;

/*
 * Renamed from avM
 */
public class avm_1 {
    private int a;
    private final Particle[] b;
    private int c = 0;

    public avm_1(int n) {
        this.b = new Particle[n];
    }

    public final void a(Particle particle) {
        this.b[this.a++] = particle;
    }

    public final void a(int n) {
        this.b[n] = null;
        ++this.c;
    }

    public final Particle b(int n) {
        return this.b[n];
    }

    public final int a() {
        return this.a;
    }

    public final void b() {
        if (this.c == 0) {
            return;
        }
        int n = 1;
        block0: for (int k = 0; k < this.a - 1; ++k) {
            if (this.b[k] != null) {
                ++n;
                continue;
            }
            for (int i2 = n; i2 < this.a; ++i2) {
                if (this.b[i2] == null) continue;
                this.b[k] = this.b[i2];
                this.b[i2] = null;
                n = i2 + 1;
                continue block0;
            }
        }
        this.a -= this.c;
        this.c = 0;
    }

    public final void c() {
        this.a = 0;
        this.c = 0;
    }

    public final boolean d() {
        return this.a >= this.b.length;
    }
}

