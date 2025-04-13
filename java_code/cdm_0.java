/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cDm
 */
abstract class cdm_0
extends Enum<cdm_0>
implements alg_1 {
    public static final /* enum */ cdm_0 a = new cDn("pak");
    public static final /* enum */ cdm_0 b = new cdo_0("jar");
    public static final /* enum */ cdm_0 c = new cDp("file");
    static final Logger d;
    private final String e;
    private static final /* synthetic */ cdm_0[] f;

    public static cdm_0[] values() {
        return (cdm_0[])f.clone();
    }

    public static cdm_0 valueOf(String string) {
        return Enum.valueOf(cdm_0.class, string);
    }

    cdm_0(String string2) {
        this.e = string2;
    }

    @Override
    public final void a() {
        this.a("MUSIC", "musicPath", cdl_0.a.b(), cdl_0.a.d());
        this.a("GUI_SFX", "guiSoundPath", cdl_0.e.c());
        this.a("AMB2D", "amb2DPath", cdl_0.b.c(), cdl_0.b.b(), cdl_0.b.d());
        this.a("FIGHT_SOUND", "fightSoundPath", cdl_0.d.c(), cdl_0.d.d());
        this.a("SFX_SOUND", "sfxSoundPath", cdl_0.g.c(), cdl_0.g.d());
        this.a("VOICES_SOUND", "voicesPath", cdl_0.f.c(), cdl_0.f.d());
        this.a("FOLEYS_SOUND", "foleysSoundPath", cdl_0.i.c(), cdl_0.i.d());
        this.a("PARTICLES_SOUND", "particlesSoundPath", cdl_0.h.c(), cdl_0.h.d());
    }

    private void a(String string, String string2, all_1 ... all_1Array) {
        try {
            String string3 = azs_0.a().a(string2);
            amf_1 amf_12 = this.a(string3);
            if (amf_12 == null) {
                return;
            }
            for (all_1 all_12 : all_1Array) {
                all_12.a(amf_12);
            }
        }
        catch (Exception exception) {
            d.error((Object)("impossible d'initialiser " + string), (Throwable)exception);
        }
    }

    protected abstract amf_1 a(String var1);

    public static cdm_0 b(String string) {
        for (cdm_0 cdm_02 : cdm_0.values()) {
            if (!cdm_02.e.equalsIgnoreCase(string)) continue;
            return cdm_02;
        }
        return null;
    }

    static {
        f = new cdm_0[]{a, b, c};
        d = Logger.getLogger(cdm_0.class);
    }
}

