/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;

class abx
extends ats_2 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ abu b;

    abx(abu abu2, Anm anm, Runnable runnable) {
        this.b = abu2;
        this.a = runnable;
        super(anm);
    }

    @Override
    public void run() {
        this.b.aB.remove(this);
        this.a.run();
    }
}

