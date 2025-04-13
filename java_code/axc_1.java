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
 * Renamed from axC
 */
public class axc_1
extends axd_1 {
    private int[] b = new int[]{0};

    @Override
    public boolean b() {
        if (!ALC10.alcIsExtensionPresent((ALCdevice)ALC10.alcGetContextsDevice((ALCcontext)ALC10.alcGetCurrentContext()), (String)"ALC_EXT_EFX")) {
            return false;
        }
        try {
            this.b[0] = EFX10.alGenFilters();
            axc_1 axc_12 = this;
            axc_12.a.f();
            EFX10.alFilteri((int)this.b[0], (int)32769, (int)1);
            axc_1 axc_13 = this;
            axc_13.a.f();
        }
        catch (Exception exception) {
            ams_1.a().c(false);
            return false;
        }
        ams_1.a().c(true);
        return true;
    }

    @Override
    public void c() {
        if (this.b[0] != 0) {
            axc_1 axc_12 = this;
            axc_12.a.f();
            EFX10.alDeleteFilters((int)this.b[0]);
            axc_1 axc_13 = this;
            axc_13.a.f();
            this.b[0] = 0;
        }
        this.b = null;
        super.c();
    }

    @Override
    public axx_2 d() {
        return axx_2.m;
    }
}

