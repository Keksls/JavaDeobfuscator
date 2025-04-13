/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fBl
 */
public abstract class fbl_2
extends fbm_2
implements fbu_2 {
    protected boolean e;

    @Override
    public boolean isDirty() {
        return this.e;
    }

    @Override
    public abstract fbs_1 getMesh();

    @Override
    public abstract Entity getEntity();

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        this.getMesh().a(dimension, insets, insets2, insets3);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.e = false;
    }
}

