/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from agO
 */
public enum ago_0 implements agm_0
{
    a("musicVolume", ags_0.a, ags_0.b),
    b("ambianceSoundsVolume", ags_0.a, ags_0.b),
    c("uiSoundsVolume", ags_0.a, ags_0.b),
    d("musicMute", ags_0.a, ags_0.b),
    e("ambianceSoundsMute", ags_0.a, ags_0.b),
    f("uiSoundsMute", ags_0.a, ags_0.b),
    g("musicContinuousMode", ags_0.a, ags_0.b);

    private final String h;
    private final ags_0[] i;

    private ago_0(String string2, ags_0 ... ags_0Array) {
        this.h = string2;
        this.i = ags_0Array;
    }

    @Override
    public String b() {
        return this.h;
    }

    @Override
    public List<ajb_1> a(agk_0<?, ?> agk_02) {
        ArrayList<ajb_1> arrayList = new ArrayList<ajb_1>();
        for (ags_0 ags_02 : this.i) {
            arrayList.add(agk_02.a(ags_02));
        }
        return arrayList;
    }

    @Override
    public List<ags_0> a() {
        return Arrays.asList(this.i);
    }
}

