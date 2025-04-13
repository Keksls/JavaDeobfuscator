/*
 * Decompiled with CFR 0.152.
 */
public class dlq
extends dlw {
    private final String a;

    public dlq(dly dly2, String string, String string2) {
        super(dly2, string);
        this.a = string2;
    }

    public dlq(dly dly2, String string, int n, String string2) {
        super(dly2, string, n);
        this.a = string2;
    }

    public dlq(dly dly2, String string, int n, int n2, String string2) {
        super(dly2, string, n, n2);
        this.a = string2;
    }

    public String a() {
        return this.a;
    }
}

