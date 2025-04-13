/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;

/*
 * Renamed from atS
 */
public abstract class ats_2
implements Runnable {
    private final Anm a;

    protected ats_2(Anm anm) {
        this.a = anm;
        anm.a(this);
    }

    public final void a() {
        this.a.b(this);
    }
}

