/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * Renamed from aic
 */
public final class aic_0 {
    public static final aic_0 a = new aic_0();
    private boolean f;
    JFrame g;
    aib_0 h;
    final ArrayList<ParticleSystem> b = new ArrayList();
    final ArrayList<avk_2> c = new ArrayList();
    int d;
    int e;

    private aic_0() {
    }

    public void a() {
        if (this.f) {
            return;
        }
        SwingUtilities.invokeLater(new aid_0(this));
        this.f = true;
    }

    public void a(ParticleSystem particleSystem) {
        if (!this.f) {
            return;
        }
        this.b.add(particleSystem);
        if (this.b.size() > this.d) {
            this.d = this.b.size();
        }
        if (this.h != null) {
            this.h.a(this.b, this.c);
            this.h.b().updateUI();
        }
    }

    public void b(ParticleSystem particleSystem) {
        if (!this.f) {
            return;
        }
        this.b.remove(particleSystem);
        if (this.h != null) {
            this.h.a(this.b, this.c);
            this.h.b().updateUI();
        }
    }

    public void a(avk_2 avk_22) {
        if (!this.f) {
            return;
        }
        this.c.add(avk_22);
        if (this.c.size() > this.e) {
            this.e = this.c.size();
        }
        if (this.h != null) {
            this.h.a(this.b, this.c);
            this.h.b().updateUI();
        }
    }

    public void b(avk_2 avk_22) {
        if (!this.f) {
            return;
        }
        this.c.remove(avk_22);
        if (this.h != null) {
            this.h.a(this.b, this.c);
            this.h.b().updateUI();
        }
    }
}

