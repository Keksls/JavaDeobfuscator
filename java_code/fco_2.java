/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCO
 */
public class fco_2
extends fzs {
    private final String i;

    public fco_2(fug_0 fug_02, String string) {
        this.e = fug_02;
        this.i = string;
    }

    @Override
    public frd_0 f() {
        return frd_0.R;
    }

    @Override
    public String toString() {
        return String.format("%s{type=%s,target=%s,text=%s}", new Object[]{this.getClass(), this.f(), this.e(), this.j()});
    }

    public String j() {
        return this.i;
    }
}

