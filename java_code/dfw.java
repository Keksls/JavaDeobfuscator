/*
 * Decompiled with CFR 0.152.
 */
public class dfw
extends dfc {
    private String a;
    private aUu b;

    public dfw(short s2) {
        super(s2);
    }

    public dfw(short s2, String string) {
        super(s2);
        this.a = string;
    }

    public dfw(short s2, String string, aUu aUu2) {
        super(s2);
        this.a = string;
        this.b = aUu2;
    }

    public String k() {
        return this.a;
    }

    public void b(String string) {
        this.a = string;
    }

    public aUu o() {
        return this.b;
    }

    public void a(aUu aUu2) {
        this.b = aUu2;
    }
}

