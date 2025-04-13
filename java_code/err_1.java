/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eRR
 */
public class err_1
extends Exception {
    private final erb_1 a;

    public err_1(String string, erb_1 erb_12) {
        super(string);
        this.a = erb_12;
    }

    public erb_1 a() {
        return this.a;
    }
}

