/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhV
 */
public class bhv_2
extends bik_2 {
    private final eos_1 t;
    private final String u;

    public bhv_2(int n, eos_1 eos_12, String string) {
        super(n);
        this.t = eos_12;
        this.u = string;
    }

    @Override
    protected boolean a() {
        return this.t == eos_1.c;
    }

    @Override
    protected boolean b() {
        return this.t == eos_1.b;
    }

    @Override
    public String c() {
        return this.u;
    }
}

