/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * Renamed from fDQ
 */
public class fdq_2 {
    public static final fdq_2 a = new fdq_2();
    private final LinkedList<ParticleSystem> b = new LinkedList();
    private volatile boolean c = true;

    private fdq_2() {
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public boolean a() {
        return this.c;
    }

    public void a(ParticleSystem particleSystem) {
        this.b.add(particleSystem);
        aic_0.a.a(particleSystem);
    }

    public void a(int n) {
        if (!this.c) {
            return;
        }
        float f2 = (float)n / 1000.0f;
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ParticleSystem particleSystem = (ParticleSystem)iterator.next();
            if (particleSystem.aw() < 0) {
                aic_0.a.b(particleSystem);
                iterator.remove();
                continue;
            }
            particleSystem.a(f2);
        }
    }
}

