/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWN
 */
public class awn_0 {
    protected final String a;
    protected final String b;
    private final emS[] d;
    protected final String c;

    public awn_0(String string, String string2, emS[] emSArray, String string3) {
        this.a = string;
        this.b = string2;
        this.d = emSArray;
        this.c = string3;
    }

    protected void a(ani_2 ani_22, boolean bl) {
        ani_22.m();
        ani_22.i().a(aWM.b).a((CharSequence)this.a).a((CharSequence)(this.b.isEmpty() ? "" : " " + this.b)).j();
        ani_22.i().a(azf_2.q).m().a((CharSequence)("\t - " + this.c)).j();
        if (bl) {
            ani_22.i().a(azf_2.o).m().a((CharSequence)"\t - rights : ");
            for (emS emS2 : this.d) {
                ani_22.a((CharSequence)(aWM.a[emS2.a()] + " "));
            }
            ani_22.j();
        }
    }

    public String toString() {
        return "Command{m_name='" + this.a + "', m_parameters='" + this.b + "', m_description='" + this.c + "'}";
    }
}

