/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.cg.CGpass
 *  com.jogamp.opengl.cg.CgGL
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.jogamp.opengl.cg.CGpass;
import com.jogamp.opengl.cg.CgGL;

/*
 * Renamed from avu
 */
public class avu_2
extends auq_1 {
    private static CGpass a;
    private final CGpass b;

    public avu_2(CGpass cGpass) {
        this.b = cGpass;
    }

    @Override
    public final void a(aui_2 aui_22, Entity entity) {
        if (a != this.b) {
            this.a();
            CgGL.cgSetPassState((CGpass)this.b);
            a = this.b;
        }
        entity.a(aui_22);
    }

    @Override
    public final void a() {
        if (a == null) {
            return;
        }
        CgGL.cgResetPassState((CGpass)a);
        axr_2.a().e();
        a = null;
    }
}

