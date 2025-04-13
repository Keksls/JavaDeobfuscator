/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.cg.CGpass
 *  com.jogamp.opengl.cg.CGtechnique
 *  com.jogamp.opengl.cg.CgGL
 */
import com.jogamp.opengl.cg.CGpass;
import com.jogamp.opengl.cg.CGtechnique;
import com.jogamp.opengl.cg.CgGL;

/*
 * Renamed from avv
 */
public class avv_2
extends aus_1 {
    public avv_2(CGtechnique cGtechnique) {
        super(CgGL.cgGetTechniqueName((CGtechnique)cGtechnique));
        this.c = new auq_1[avv_2.a(cGtechnique)];
        int n = 0;
        CGpass cGpass = CgGL.cgGetFirstPass((CGtechnique)cGtechnique);
        while (cGpass != null) {
            this.c[n++] = new avu_2(cGpass);
            cGpass = CgGL.cgGetNextPass((CGpass)cGpass);
        }
    }

    private static int a(CGtechnique cGtechnique) {
        int n = 0;
        CGpass cGpass = CgGL.cgGetFirstPass((CGtechnique)cGtechnique);
        while (cGpass != null) {
            ++n;
            cGpass = CgGL.cgGetNextPass((CGpass)cGpass);
        }
        return n;
    }
}

