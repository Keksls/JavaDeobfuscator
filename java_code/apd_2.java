/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apd
 */
public class apd_2
extends aot_2 {
    private String a;

    @Override
    public aov_1 t_() {
        return aov_1.a;
    }

    public apd_2(String string) {
        this.a = string.replace('\"', ' ');
        this.a = this.a.trim().intern();
    }

    public String b() {
        return this.a;
    }

    @Override
    public Enum c() {
        return aoc_1.n;
    }
}

