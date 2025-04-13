/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class acP
extends add_0<acq_0> {
    private final acn c;

    public acP(@NotNull acn acn2) {
        super(new acQ());
        this.c = acn2;
    }

    @Override
    public final void a() {
        for (int k = 0; k < this.a.d(); ++k) {
            ((acq_0)this.a.h(k)).a(this.c);
        }
        super.a();
    }

    @Override
    protected void a(acq_0 acq_02) {
        acq_02.a(this.c);
    }
}

