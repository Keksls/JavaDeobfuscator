/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.cg.CgGL
 */
import com.jogamp.opengl.cg.CgGL;

/*
 * Renamed from axE
 */
public abstract class axe_1
extends axg_1 {
    @Override
    public boolean b() {
        return CgGL.cgGLIsProfileSupported((int)this.e());
    }

    public abstract int e();
}

