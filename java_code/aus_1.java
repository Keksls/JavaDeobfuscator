/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;

/*
 * Renamed from auS
 */
public abstract class aus_1
extends auf_1 {
    protected auq_1[] c;

    protected aus_1(String string) {
        super(string);
    }

    public final void a(aui_2 aui_22, Entity entity) {
        int n = this.c.length;
        for (int k = 0; k < n; ++k) {
            this.c[k].a(aui_22, entity);
        }
    }

    public final void a() {
        int n = this.c.length;
        for (int k = 0; k < n; ++k) {
            this.c[k].a();
        }
    }
}

