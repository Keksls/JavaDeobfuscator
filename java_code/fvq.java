/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 */
import com.jogamp.opengl.GL;

class fvq
implements fyY {
    final /* synthetic */ fvp a;

    fvq(fvp fvp2) {
        this.a = fvp2;
    }

    @Override
    public void a(aui_2 aui_22, fdn_2 fdn_22) {
        if (!this.a.isInitialized()) {
            return;
        }
        this.a.getVideoTextureProducer().a((GL)aui_22.e());
    }
}

