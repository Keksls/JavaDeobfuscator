/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class dfk
extends dfc {
    @NotNull
    private final String a;
    private final short b;
    private final int c;

    public dfk(@NotNull String string, short s2, int n, short s3) {
        super(s3);
        this.a = string;
        this.b = s2;
        this.c = n;
    }

    @NotNull
    public String k() {
        return this.a;
    }

    public short o() {
        return this.b;
    }

    public int p() {
        return this.c;
    }
}

