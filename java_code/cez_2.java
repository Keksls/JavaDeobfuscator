/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cEZ
 */
public class cez_2 {
    public int a;
    public String b;

    public void a(@NotNull arf_1 arf_12) {
        this.a = arf_12.c();
        this.b = arf_12.e();
    }

    public void a(@NotNull gk_0 gk_02) {
        gk_02.a(this.a);
        gk_02.a(this.b);
    }

    public void b(@NotNull arf_1 arf_12) {
        this.a(arf_12);
    }

    public void b(@NotNull gk_0 gk_02) {
        this.a(gk_02);
    }

    public String toString() {
        return this.b + " (id=" + this.a + ")";
    }
}

