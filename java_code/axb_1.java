/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.openal.ALC10
 *  org.lwjgl.openal.ALCcontext
 *  org.lwjgl.openal.ALCdevice
 *  org.lwjgl.openal.EFX10
 */
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCcontext;
import org.lwjgl.openal.ALCdevice;
import org.lwjgl.openal.EFX10;

/*
 * Renamed from axB
 */
public class axb_1
extends axd_1 {
    private int[] b = new int[]{0};
    private int[] c = new int[]{0};

    @Override
    public boolean b() {
        if (!ALC10.alcIsExtensionPresent((ALCdevice)ALC10.alcGetContextsDevice((ALCcontext)ALC10.alcGetCurrentContext()), (String)"ALC_EXT_EFX")) {
            return false;
        }
        try {
            this.c[0] = EFX10.alGenAuxiliaryEffectSlots();
            axb_1 axb_12 = this;
            axb_12.a.f();
            this.b[0] = EFX10.alGenEffects();
            axb_1 axb_13 = this;
            axb_13.a.f();
        }
        catch (Exception exception) {
            return false;
        }
        return true;
    }

    @Override
    public void c() {
        if (this.c[0] != 0) {
            EFX10.alDeleteAuxiliaryEffectSlots((int)this.c[0]);
            axb_1 axb_12 = this;
            axb_12.a.f();
            this.c[0] = 0;
        }
        if (this.b[0] != 0) {
            EFX10.alDeleteEffects((int)this.b[0]);
            axb_1 axb_13 = this;
            axb_13.a.f();
            this.b[0] = 0;
        }
        this.b = null;
        this.c = null;
        super.c();
    }

    @Override
    public axx_2 d() {
        return axx_2.l;
    }
}

