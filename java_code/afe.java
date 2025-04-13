/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class afe {
    public int a;
    public short b;
    public String c;
    public apc_2 d;

    public afe() {
    }

    public afe(int n, short s2, String string) {
        this.a = n;
        this.b = s2;
        this.c = string;
    }

    public void a(@NotNull arf_1 arf_12) {
        this.a = arf_12.c();
        this.b = arf_12.b();
        this.c = arf_12.e();
    }

    public void a(@NotNull gk_0 gk_02) {
        gk_02.a(this.a);
        gk_02.a(this.b);
        gk_02.a(this.c);
    }
}

