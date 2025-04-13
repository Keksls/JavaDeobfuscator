/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCl
 */
public class fcl_1
extends fzs {
    private final String i;

    public fcl_1(fug_0 fug_02, String string) {
        this.e = fug_02;
        this.i = string;
    }

    @Override
    public frd_0 f() {
        return frd_0.S;
    }

    @Override
    public String toString() {
        return String.format("%s{type=%s,target=%s,oldText=%s}", new Object[]{this.getClass(), this.f(), this.e(), this.j()});
    }

    public String j() {
        return this.i;
    }
}

