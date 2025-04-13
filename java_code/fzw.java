/*
 * Decompiled with CFR 0.152.
 */
public class fzw
extends RuntimeException
implements alc_2 {
    private static final String a = "unknown-method";
    private final String b;

    public fzw(String string) {
        this.b = string;
    }

    @Override
    public String[] c() {
        return new String[]{a, this.b};
    }
}

